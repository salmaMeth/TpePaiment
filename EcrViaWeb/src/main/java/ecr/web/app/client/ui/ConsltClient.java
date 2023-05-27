package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;

import ecr.web.app.shared.dto.ClientDTO;

public class ConsltClient extends Composite  {
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	Range range;
	List<ClientDTO> sub;
	AsyncDataProvider<ClientDTO> DataProvider;
	@UiField CellTable <ClientDTO> cellTable;
	private static ConsltClientUiBinder uiBinder = GWT
			.create(ConsltClientUiBinder.class);
    private final ClientServiceAsync _service = GWT.create(ClientService.class);
	interface ConsltClientUiBinder extends UiBinder<Widget, ConsltClient> {
	}

	public ConsltClient() {
		initWidget(uiBinder.createAndBindUi(this));
		AdminSession.lbl_notif.setText("");
		bind();
	}

	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent arg0) {
				if (sub != null) {
					String searchKey = searchBox.getText();
					List<ClientDTO> filtredList = new ArrayList<ClientDTO>();
					for (ClientDTO user_defDTO : sub) {
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
		TextColumn<ClientDTO> txtCol_CODE = new TextColumn<ClientDTO>() {
			@Override
			public String getValue(ClientDTO object) {
				return String.valueOf("CLT"+object.getId()) ;
			}
		};cellTable.addColumn(txtCol_CODE, "CODE");
		cellTable.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);

	

	final Column<ClientDTO, String> txtCol_adress = new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getAdresse();
			}
		};
		txtCol_adress.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setAdresse(arg2);
				
			}
		});		cellTable.addColumn(txtCol_adress, "ADRESS");
		cellTable.setColumnWidth(txtCol_adress, 2.0, Unit.PCT);


		
		
final Column<ClientDTO, String> txtCol_firstname = new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getName();
			}
		};
		txtCol_firstname.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setName(arg2);
				
			}
		});	cellTable.addColumn(txtCol_firstname,"FIRST NAME");
		cellTable.setColumnWidth(txtCol_firstname, 20.0, Unit.PCT);

		
final Column<ClientDTO, String> txtCol_lastname = new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getName2();
			}
		};
		txtCol_lastname.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setName2(arg2);
				
			}
		});	cellTable.addColumn(txtCol_lastname, "LAST NAME");
		cellTable.setColumnWidth(txtCol_lastname, 20.0, Unit.PCT);



final Column<ClientDTO, String> txtCol_Profession = new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getProfession();
			}
		};
		txtCol_Profession.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setProfession(arg2);
				
			}
		});	cellTable.addColumn(txtCol_Profession, "Profession ");
		cellTable.setColumnWidth(txtCol_Profession, 20.0, Unit.PCT);

	


final Column<ClientDTO, String> txtCol_tel= new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getTel1();
			}
		};
		txtCol_tel.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setTel1(arg2);
				
			}
		});	cellTable.addColumn(txtCol_tel, "Phone Num");
		
		cellTable.setColumnWidth(txtCol_tel, 20.0, Unit.PCT);

final Column<ClientDTO, String> txtCol_ipdef2= new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return String.valueOf( arg0.getLoyality());
			}
		};
		txtCol_ipdef2.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setLoyality(Long.valueOf(arg2));
				
			}
		});	cellTable.addColumn(txtCol_ipdef2, "Loyality");
		cellTable.setColumnWidth(txtCol_ipdef2, 20.0, Unit.PCT);

		
final Column<ClientDTO, String> txtCol_Continent= new Column<ClientDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(ClientDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getContinent();
			}
		};
		txtCol_Continent.setFieldUpdater(new FieldUpdater<ClientDTO, String>() {

			public void update(int arg0, ClientDTO arg1, String arg2) {
				arg1.setAdresse(arg2);
				
			}
		});	cellTable.addColumn(txtCol_Continent, "Continent");
		
		cellTable.setColumnWidth(txtCol_Continent, 20.0, Unit.PCT);

		
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

		Column<ClientDTO, String> delete = new Column<ClientDTO, String>(
				deleteButton) {
			@Override
			public String getValue(ClientDTO c) {
				return "Delete";

			}
		};

		delete.setFieldUpdater(new FieldUpdater<ClientDTO, String>()

		{
			public void update(int index, final ClientDTO client, String value) {
				_service.deleteRow(client.getId(), new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
					
						MerchantSession.lbl_notif.setText("fail to  delete client");


					}

					public void onSuccess(Void arg0) {
						MerchantSession.lbl_notif.setText("Client is deleted with susess ");

						for ( ClientDTO  dto: sub) {
							if(client.getId() == dto.getId()){
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

		cellTable.addColumn(delete, "Delete");
		 cellTable.setColumnWidth(delete, 10.0, Unit.PCT);

		Column<ClientDTO, String> update = new Column<ClientDTO, String>(
				updateButton) {
			@Override
			public String getValue(ClientDTO c) {
				return "Update";

			}};

		update.setFieldUpdater(new FieldUpdater<ClientDTO, String>()

		{
			public void update(int index, ClientDTO user, String value) {
				_service.updateRow(	user, new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						
						MerchantSession.lbl_notif.setText("Fail to update client ");


					}

					public void onSuccess(Void arg0) {
					
						MerchantSession.lbl_notif.setText("Client is updated with susess ");
	
					}

				});
			}});
		cellTable.addColumn(update, "Update");
		cellTable.setColumnWidth(update, 10.0, Unit.PCT);
		simple_pdt.setDisplay(cellTable);
		addtable();
	}

	public void addtable() {
		DataProvider = new AsyncDataProvider<ClientDTO>() {

			@Override
			protected void onRangeChanged(HasData<ClientDTO> display) {
				range = display.getVisibleRange();
				_service.selectAllRows(new AsyncCallback<List<ClientDTO>>() {

					public void onFailure(Throwable caught) {
						
						MerchantSession.lbl_notif.setText("fail ");

					}

					public void onSuccess(List<ClientDTO> result) {
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

		DataProvider.addDataDisplay(cellTable);

	}

	

}