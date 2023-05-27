package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import ecr.web.app.client.services.TerminalService;
import ecr.web.app.client.services.TerminalServiceAsync;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.TerminalDTO;
import ecr.web.app.shared.dto.TerminalDTO;


public class ConslTerminal extends Composite {

	private ConslTerminalUiBinder uiBinder = GWT
			.create(ConslTerminalUiBinder.class);
	
	
	@UiField 
	SimplePager page_terminal;
	@UiField 
    TextBox searchBox;
	@UiField
	CellTable<TerminalDTO> tab_termenal;
	List<TerminalDTO> sub;
	Range range;
	int start;
	AsyncDataProvider<TerminalDTO> DataProvider;
	private final TerminalServiceAsync _service = GWT.create(TerminalService.class);
	  
	interface ConslTerminalUiBinder extends UiBinder<Widget, ConslTerminal> {
	}

	public ConslTerminal() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}
	@UiHandler("Container")
	void onContainerAttachOrDetach(AttachEvent event) {

		TextColumn<TerminalDTO> txtCol_CODE = new TextColumn<TerminalDTO>() {
			@Override
			public String getValue(TerminalDTO object) {
				return String.valueOf(object.getCode()) ;
			}
		};tab_termenal.addColumn(txtCol_CODE, "CODE");
		   tab_termenal.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);

	final Column<TerminalDTO, String> txtCol_ip = new Column<TerminalDTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(TerminalDTO arg0) {
				// TODO Auto-generated method stub
				return arg0.getAdressip();
			}
		};
		txtCol_ip.setFieldUpdater(new FieldUpdater<TerminalDTO, String>() {

			public void update(int arg0, TerminalDTO arg1, String arg2) {
				arg1.setAdressip(arg2);
							
			}
		});tab_termenal.addColumn(txtCol_ip, "AdressIp");
		   tab_termenal.setColumnWidth(txtCol_ip, 30.0, Unit.PCT);
		
			final Column<TerminalDTO, String> txtCol_DERCP = new Column<TerminalDTO, String>(new TextInputCell()) {
				
				@Override
				public String getValue(TerminalDTO arg0) {
					// TODO Auto-generated method stub
					return arg0.getReference();
				}
			};
			txtCol_ip.setFieldUpdater(new FieldUpdater<TerminalDTO, String>() {

				public void update(int arg0, TerminalDTO arg1, String arg2) {
					arg1.setReference(arg2);
								
				}
			});tab_termenal.addColumn(txtCol_DERCP, "REFERENCE");
			   tab_termenal.setColumnWidth(txtCol_DERCP, 30.0, Unit.PCT);  
		   
			   final Column<TerminalDTO, String> txtCol_BRANDE = new Column<TerminalDTO, String>(new TextInputCell()) {
					
					@Override
					public String getValue(TerminalDTO arg0) {
						// TODO Auto-generated method stub
						return arg0.getBrande();
					}
				};
				txtCol_ip.setFieldUpdater(new FieldUpdater<TerminalDTO, String>() {

					public void update(int arg0, TerminalDTO arg1, String arg2) {
						arg1.setBrande(arg2);
									
					}
				});tab_termenal.addColumn(txtCol_BRANDE, "BRANDE");
				   tab_termenal.setColumnWidth(txtCol_BRANDE, 30.0, Unit.PCT); 
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

					Column<TerminalDTO, String> delete = new Column<TerminalDTO, String>(
							deleteButton) {
						@Override
						public String getValue(TerminalDTO c) {
							return "Delete";

						}
					};

					delete.setFieldUpdater(new FieldUpdater<TerminalDTO, String>()

					{
						public void update(int index, final TerminalDTO user, String value) {
							_service.deleteRow(user.getId(), new AsyncCallback<Void>() {

								public void onFailure(Throwable caught) {
									MerchantSession.lbl_notif.setText("fail");

								}

								public void onSuccess(Void arg0) {
									MerchantSession.lbl_notif.setText("Success");
									for ( TerminalDTO  dto: sub) {
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

					tab_termenal.addColumn(delete, "Delete");
					tab_termenal.setColumnWidth(delete, 10.0, Unit.PCT);

					Column<TerminalDTO, String> update = new Column<TerminalDTO, String>(
							updateButton) {
						@Override
						public String getValue(TerminalDTO c) {
							return "Update";

						}};

					update.setFieldUpdater(new FieldUpdater<TerminalDTO, String>()

					{
						public void update(int index, TerminalDTO terminal, String value) {
							_service.updateRow(	terminal, new AsyncCallback<Void>() {

								public void onFailure(Throwable caught) {
									MerchantSession.lbl_notif.setText("fail");

								}

								public void onSuccess(Void arg0) {
									MerchantSession.lbl_notif.setText("Success");
									
								}

							});
						}});
					tab_termenal.addColumn(update, "Update");
					tab_termenal.setColumnWidth(update, 10.0, Unit.PCT);
			
		page_terminal.setDisplay(tab_termenal);
		addtable();
	}
	public void addtable()
	{		
  DataProvider = new AsyncDataProvider<TerminalDTO>() {

		@Override
		protected void onRangeChanged(HasData<TerminalDTO> display) {
			range = display.getVisibleRange();
			_service.selectAllRows(new AsyncCallback<List<TerminalDTO>>() {

				public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("fail");
				}

				public void onSuccess(List<TerminalDTO> result) {
					if (result != null && !result.isEmpty()) {
						 start = range.getStart();
						int end = start + range.getLength();
						end = end >= result.size() ? result.size(): end;
					    sub = result.subList(start,end);
						
						updateRowData(start, sub);
					} 
						else {
							MerchantSession.lbl_notif.setText("No Obj_defs stored in the database.");
					}
					updateRowCount(result.size(), true);
				}
			});

		}
	};

	DataProvider.addDataDisplay(tab_termenal);
}
	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {
			
			public void onKeyUp(KeyUpEvent arg0) {
				if(sub != null){
					String searchKey = searchBox.getText();
					List<TerminalDTO> filtredList = new ArrayList<TerminalDTO>();
					for (TerminalDTO rangeDTO : sub) {
						if(rangeDTO.getCode().toUpperCase().contains(searchKey.toUpperCase())){
							filtredList.add(rangeDTO);
						}
					}
					DataProvider.updateRowData(0, filtredList);
					DataProvider.updateRowCount(filtredList.size(), true);
					
				}
				
			}
		});
		
	}		
	}
