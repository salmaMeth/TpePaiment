package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import com.google.gwt.user.client.ui.TextBox;


import ecr.web.app.client.services.MyStyle;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;

import ecr.web.app.shared.dto.UsersDTO;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.event.dom.client.ChangeEvent;

public class ConsltUser extends Composite {

	private UserAdminUiBinder uiBinder = GWT
			.create(UserAdminUiBinder.class);
	@UiField
	HTMLPanel Container;
	@UiField
	SimplePager simp_user_pager;
	@UiField
	TextBox searchBox;
	@UiField
	 CellTable<UsersDTO> tab_cell;
	@UiField ListBox cmd_role;
	Range range;
	private List<UsersDTO> sub;
	@UiField
	MyStyle style;
	private final UsersServiceAsync _service = GWT
			.create(UsersService.class);
	private AsyncDataProvider<UsersDTO> DataProvider;

	interface UserAdminUiBinder extends UiBinder<Widget, ConsltUser> {
	}

	public ConsltUser() {
		initWidget(uiBinder.createAndBindUi(this));

		bind();
	}

	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent arg0) {
				if (sub != null) {
					String searchKey = searchBox.getText();
					List<UsersDTO> filtredList = new ArrayList<UsersDTO>();
					for (UsersDTO user_defDTO : sub) {
						if (String.valueOf(user_defDTO.getId()).toUpperCase()
								.contains(searchKey.toUpperCase())) {
							filtredList.add(user_defDTO);
						}
					}
					DataProvider.updateRowData(0, filtredList);
					DataProvider.updateRowCount(filtredList.size(), true);

				}

			}
		});

	}

	@UiHandler("Container")
	void onContainerAttachOrDetach(AttachEvent event) {
	   	tab_cell.setWidth("100%", true);

		TextColumn<UsersDTO> txtCol_CODE = new TextColumn<UsersDTO>() {
			@Override
			public String getValue(UsersDTO object) {
				return String.valueOf("USER"+object.getId()) ;
			}
		};tab_cell.addColumn(txtCol_CODE, "CODE");
		tab_cell.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);

		final Column<UsersDTO, String> txtCol_login = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getLogin();
			}
		};
		txtCol_login.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setLogin(arg2);
							
			}
		});tab_cell.addColumn(txtCol_login, "LOGIN");

		tab_cell.setColumnWidth(txtCol_login, 2.0, Unit.PCT);


	final Column<UsersDTO, String> txtCol_password = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getPassword();
			}
		};
		txtCol_password.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setPassword(arg2);
				
			}
		});		tab_cell.addColumn(txtCol_password, "PASSWORD");
		tab_cell.setColumnWidth(txtCol_password, 20.0, Unit.PCT);

/*	final Column<UsersDTO, String> txtCol_adress = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getAdresse();
			}
		};
		txtCol_adress.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setAdresse(arg2);
				
			}
		});		tab_cell.addColumn(txtCol_adress, "ADRESS");
		tab_cell.setColumnWidth(txtCol_adress, 2.0, Unit.PCT);*/

		final Column<UsersDTO, String> txtCol_role = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getRole();
			}
		};
		txtCol_role.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setRole(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_role,"ROLE");
		tab_cell.setColumnWidth(txtCol_role, 2.0, Unit.PCT);
		tab_cell.setStylePrimaryName(style.style());
		
		
		
final Column<UsersDTO, String> txtCol_firstname = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getName();
			}
		};
		txtCol_firstname.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setName(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_firstname,"FIRST NAME");
		tab_cell.setColumnWidth(txtCol_firstname, 20.0, Unit.PCT);

		
final Column<UsersDTO, String> txtCol_lastname = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getName2();
			}
		};
		txtCol_lastname.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setName2(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_lastname, "LAST NAME");
		tab_cell.setColumnWidth(txtCol_lastname, 20.0, Unit.PCT);



final Column<UsersDTO, String> txtCol_ipdef = new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getIpadess();
			}
		};
		txtCol_ipdef.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setIpadess(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_ipdef, "DEFAULT IP ");
		tab_cell.setColumnWidth(txtCol_ipdef, 20.0, Unit.PCT);

	


final Column<UsersDTO, String> txtCol_ipdef1= new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getIpadess1();
			}
		};
		txtCol_ipdef1.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setIpadess1(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_ipdef1, "IP ADRESS1");
		
		tab_cell.setColumnWidth(txtCol_ipdef1, 20.0, Unit.PCT);

final Column<UsersDTO, String> txtCol_ipdef2= new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getIpadess2();
			}
		};
		txtCol_ipdef2.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setIpadess2(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_ipdef2, "IP ADRESS2");
		tab_cell.setColumnWidth(txtCol_ipdef2, 20.0, Unit.PCT);

		
final Column<UsersDTO, String> txtCol_ipdef3= new Column<UsersDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(UsersDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getIpadess3();
			}
		};
		txtCol_ipdef3.setFieldUpdater(new FieldUpdater<UsersDTO, String>() {

			public void update(int arg0, UsersDTO arg1, String arg2) {
				arg1.setIpadess3(arg2);
				
			}
		});	tab_cell.addColumn(txtCol_ipdef3, "IP ADRESS3");
		
		tab_cell.setColumnWidth(txtCol_ipdef3, 20.0, Unit.PCT);

		
		ButtonCell deleteButton = new ButtonCell() {
		@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image deleteImg = new Image("images/delete.png");
				deleteImg.setPixelSize(30, 30);
				sb.appendHtmlConstant(deleteImg.toString());
			}
		};
		ButtonCell updateButton = new ButtonCell() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image deleteImg = new Image("images/update1.png");
				deleteImg.setPixelSize(30, 30);
				sb.appendHtmlConstant(deleteImg.toString());
			}
		};

		Column<UsersDTO, String> delete = new Column<UsersDTO, String>(
				deleteButton) {
			@Override
			public String getValue(UsersDTO c) {
				return "Delete";

			}
		};

		delete.setFieldUpdater(new FieldUpdater<UsersDTO, String>()

		{
			public void update(int index, final UsersDTO user, String value) {
				_service.deleteRow(user.getId(), new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText(" fail to delete User ");


					}

					public void onSuccess(Void arg0) {
						MerchantSession.lbl_notif.setText("User is deleted with susess ");

						
						for ( UsersDTO  dto: sub) {
							if(user.getId() == dto.getId()){
								sub.remove(dto);
								break;
							}
						}
						DataProvider.updateRowData(0, sub);

						DataProvider.updateRowCount(sub.size(), true);
						
					}

				});
			}
		});

		tab_cell.addColumn(delete, "Delete");
		 tab_cell.setColumnWidth(delete, 10.0, Unit.PCT);

		Column<UsersDTO, String> update = new Column<UsersDTO, String>(
				updateButton) {
			@Override
			public String getValue(UsersDTO c) {
				return "Update";

			}};

		update.setFieldUpdater(new FieldUpdater<UsersDTO, String>()

		{
			public void update(int index, UsersDTO user, String value) {
				_service.updateRow(	user, new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("User is updated with susess ");

					}

					public void onSuccess(Void arg0) {
						MerchantSession.lbl_notif.setText("User is updated with susess ");
						
					}

				});
			}});
		tab_cell.addColumn(update, "Update");
		tab_cell.setColumnWidth(update, 10.0, Unit.PCT);
		simp_user_pager.setDisplay(tab_cell);
		addtable();
	}

	public void addtable() {
		DataProvider = new AsyncDataProvider<UsersDTO>() {

			@Override
			protected void onRangeChanged(HasData<UsersDTO> display) {
				range = display.getVisibleRange();
				_service.selectAllRows(new AsyncCallback<List<UsersDTO>>() {

					public void onFailure(Throwable caught) {
									MerchantSession.lbl_notif.setText("fail");
					}

					public void onSuccess(List<UsersDTO> result) {
						if (result != null && !result.isEmpty()) {
							int start = range.getStart();
							int end = start + range.getLength();
							end = end >= result.size() ? result.size() : end;
							sub = result.subList(start, end);

							updateRowData(start, sub);
						} else {
						
							MerchantSession.lbl_notif.setText("No Obj_defs stored in the database.");
						}
						updateRowCount(result.size(), true);
					}
				});

			}
		};

		DataProvider.addDataDisplay(tab_cell);

	}

/*	@UiHandler("panel")
	void onPanelAttachOrDetach(AttachEvent event) {
		AjoutUser _User = new AjoutUser();
		panel.add(_User);
	}

	@UiHandler("disclosurePanel")
	void onDisclosurePanelAttachOrDetach(AttachEvent event) {
		disclosurePanel.setOpen(false);
	}*/
	
	@UiHandler("cmd_role")
	void onCmd_roleChange(ChangeEvent event) {
		int index=cmd_role.getSelectedIndex();
		if (sub != null) {
			String searchKey = cmd_role.getItemText(index);
			List<UsersDTO> filtredList = new ArrayList<UsersDTO>();
			for (UsersDTO user_defDTO : sub) {
				if (user_defDTO.getRole().toUpperCase()
						.contains(searchKey.toUpperCase())) {
					filtredList.add(user_defDTO);
				}
			}
			DataProvider.updateRowData(0, filtredList);
			DataProvider.updateRowCount(filtredList.size(), true);

		}
		
	}
}