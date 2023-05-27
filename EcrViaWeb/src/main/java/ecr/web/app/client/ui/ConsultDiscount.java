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

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;


import ecr.web.app.client.services.DiscountService;
import ecr.web.app.client.services.DiscountServiceAsync;
import ecr.web.app.shared.dto.DiscountsDTO;


public class ConsultDiscount extends Composite  {
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	Range range;
	List<DiscountsDTO> sub;
	public static String id_dicsount;
	AsyncDataProvider<DiscountsDTO> DataProvider;
	@UiField CellTable <DiscountsDTO> cellTable;
	
    private final DiscountServiceAsync _service = GWT.create(DiscountService.class);

	private static ConsultDiscountUiBinder uiBinder = GWT
			.create(ConsultDiscountUiBinder.class);

	interface ConsultDiscountUiBinder extends UiBinder<Widget, ConsultDiscount> {
	}

	public ConsultDiscount() {
		initWidget(uiBinder.createAndBindUi(this));
	
	bind();
	}

	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent arg0) {
				if (sub != null) {
					String searchKey = searchBox.getText();
					List<DiscountsDTO> filtredList = new ArrayList<DiscountsDTO>();
					for (DiscountsDTO Discount : sub) {
						if (String.valueOf(Discount.getId_discount()).toUpperCase()
								.contains(searchKey.toUpperCase())) {
							filtredList.add(Discount);
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
		TextColumn<DiscountsDTO> txtCol_CODE = new TextColumn<DiscountsDTO>() {
			@Override
			public String getValue(DiscountsDTO object) {
				return String.valueOf("Discount"+object.getId_discount()) ;
			}
		};cellTable.addColumn(txtCol_CODE, "CODE");
		cellTable.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);
		TextColumn<DiscountsDTO> txtCol_des = new TextColumn<DiscountsDTO>() {
			@Override
			public String getValue(DiscountsDTO object) {
				
				return String.valueOf(object.getLibelle()) ;
			}
		};cellTable.addColumn(txtCol_des, "Descreption");
		cellTable.setColumnWidth(txtCol_des, 20.0, Unit.PCT);
		TextColumn<DiscountsDTO> txtCol_amount = new TextColumn<DiscountsDTO>() {
			@Override
			public String getValue(DiscountsDTO object) {
				return String.valueOf(object.getAmount()) ;
			}
		};cellTable.addColumn(txtCol_amount, "Amount");
		cellTable.setColumnWidth(txtCol_amount, 20.0, Unit.PCT);


	
		ButtonCell addButton = new ButtonCell() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image addImg = new Image("images/details.png");
				addImg.setPixelSize(20, 20);
				sb.appendHtmlConstant(addImg.toString());
				
			}
		};		
	    Column <DiscountsDTO,String> addDiscount= new Column <DiscountsDTO,String>(addButton)
	    {
	        @Override
	        public String getValue(DiscountsDTO c) 
	        {
	            return "Discount products";
	            
	        }
	    };

		addDiscount.setFieldUpdater(new FieldUpdater<DiscountsDTO,String>()
	  
	    	    {
	    	        public void update(int index, DiscountsDTO resp,String value) 
	    	        {
	    	        	id_dicsount=String.valueOf(resp.getId_discount());
	    	        	DialogBox dlg = new DiscountProducts();
	    	        	dlg.setPopupPosition(150,150);
	    	      
                        dlg.show();
                     
	    	        } });	

		cellTable.addColumn(addDiscount, "Discount products");
		 cellTable.setColumnWidth(addDiscount, 10.0, Unit.PCT);
		
		   simple_pdt.setDisplay(cellTable);
			addtable();
		}

		public void addtable() {
			DataProvider = new AsyncDataProvider<DiscountsDTO>() {

				@Override
				protected void onRangeChanged(HasData<DiscountsDTO> display) {
					range = display.getVisibleRange();
					_service.selectAllRows(new AsyncCallback<List<DiscountsDTO>>() {

						public void onFailure(Throwable caught) {
							MerchantSession.lbl_notif.setText("fail");
						}

						public void onSuccess(List<DiscountsDTO> result) {
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

