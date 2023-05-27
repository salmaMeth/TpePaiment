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
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.CashService;
import ecr.web.app.client.services.CashServiceAsync;
import ecr.web.app.client.services.TVAService;
import ecr.web.app.client.services.TVAServiceAsync;
import ecr.web.app.shared.dto.TVADTO;
import ecr.web.app.shared.dto.TVADTO;
import ecr.web.app.shared.dto.TxnResponseDTO;

public class ConsultTVA extends Composite  {
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	Range range;
	List<TVADTO> sub;
	AsyncDataProvider<TVADTO> DataProvider;
	@UiField CellTable <TVADTO> cellTable;
    private final TVAServiceAsync _service = GWT.create(TVAService.class);

	private static ConsultTVAUiBinder uiBinder = GWT
			.create(ConsultTVAUiBinder.class);

	interface ConsultTVAUiBinder extends UiBinder<Widget, ConsultTVA> {
	}

	public ConsultTVA() {
		initWidget(uiBinder.createAndBindUi(this));
	
	bind();
	}

	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent arg0) {
				if (sub != null) {
					String searchKey = searchBox.getText();
					List<TVADTO> filtredList = new ArrayList<TVADTO>();
					for (TVADTO TVA : sub) {
						if (String.valueOf(TVA.getId_tva()).toUpperCase()
								.contains(searchKey.toUpperCase())) {
							filtredList.add(TVA);
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
		TextColumn<TVADTO> txtCol_CODE = new TextColumn<TVADTO>() {
			@Override
			public String getValue(TVADTO object) {
				return String.valueOf("TVA"+object.getId_tva()) ;
			}
		};cellTable.addColumn(txtCol_CODE, "CODE");
		cellTable.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);



	
		
	final Column<TVADTO, String> txtColname = new Column<TVADTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(TVADTO arg0) {
				// TODO Auto-generated method stub
				return String.valueOf(arg0.getLibelle());
			}
		};
		txtColname.setFieldUpdater(new FieldUpdater<TVADTO, String>() {

			public void update(int arg0, TVADTO arg1, String arg2) {
				arg1.setLibelle(String.valueOf(arg2));
				
			}
		});	cellTable.addColumn(txtColname,"Descreption");
		cellTable.setColumnWidth(txtColname, 20.0, Unit.PCT);
	final Column<TVADTO, String> txtColamount = new Column<TVADTO, String>(new TextInputCell()) {
			
			@Override
			public String getValue(TVADTO arg0) {
				// TODO Auto-generated method stub
				return String.valueOf(arg0.getAmount());
			}
		};
		txtColamount.setFieldUpdater(new FieldUpdater<TVADTO, String>() {

			public void update(int arg0, TVADTO arg1, String arg2) {
				arg1.setAmount(Long.valueOf(arg2));
			
				
			}
		});		cellTable.addColumn(txtColamount, "Amount");
		cellTable.setColumnWidth(txtColamount, 20.0, Unit.PCT);
	
		ButtonCell addButton = new ButtonCell() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image addImg = new Image("images/add.png");
				addImg.setPixelSize(20, 20);
				sb.appendHtmlConstant(addImg.toString());
				
			}
		};		
	    Column <TVADTO,String> addtva= new Column <TVADTO,String>(addButton)
	    {
	        @Override
	        public String getValue(TVADTO c) 
	        {
	            return "Add TVA";
	            
	        }
	    };

		addtva.setFieldUpdater(new FieldUpdater<TVADTO,String>()
	  
	    	    {
	    	        public void update(int index, TVADTO resp,String value) 
	    	        {
	          	   
	    	        	DialogBox dlg = new AjoutTVA();
	    	        	dlg.center();
                        dlg.show();
                     
	    	        } });	

		cellTable.addColumn(addtva, "Add New");
		 cellTable.setColumnWidth(addtva, 10.0, Unit.PCT);
		
		
		
		
		
		
		

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

		Column<TVADTO, String> delete = new Column<TVADTO, String>(
				deleteButton) {
			@Override
			public String getValue(TVADTO c) {
				return "Delete";

			}
		};

		delete.setFieldUpdater(new FieldUpdater<TVADTO, String>()

		{
			public void update(int index, final TVADTO tva, String value) {
				_service.deleteRow(tva.getId_tva(), new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("Fail to delete the TVA");
					}

					public void onSuccess(Void arg0) {
						MerchantSession.lbl_notif.setText(" The TVA is deleted with success");

						for ( TVADTO  dto: sub) {
							if(tva.getId_tva() == dto.getId_tva()){
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

		Column<TVADTO, String> update = new Column<TVADTO, String>(
				updateButton) {
			@Override
			public String getValue(TVADTO c) {
				return "Update";

			}};

		update.setFieldUpdater(new FieldUpdater<TVADTO, String>()

		{
			public void update(int index, TVADTO tva, String value) {
				_service.updateRow(	tva, new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("fail");
						MerchantSession.lbl_notif.setText("Fail to update the TVA");

					}

					public void onSuccess(Void arg0) {
						MerchantSession.lbl_notif.setText("Success to update the TVA");

					}

				});
			}});
		cellTable.addColumn(update, "Update");
		cellTable.setColumnWidth(update, 10.0, Unit.PCT);
		simple_pdt.setDisplay(cellTable);
		addtable();
	}

	public void addtable() {
		DataProvider = new AsyncDataProvider<TVADTO>() {

			@Override
			protected void onRangeChanged(HasData<TVADTO> display) {
				range = display.getVisibleRange();
				_service.selectAllRows(new AsyncCallback<List<TVADTO>>() {

					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("fail");
					}

					public void onSuccess(List<TVADTO> result) {
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

