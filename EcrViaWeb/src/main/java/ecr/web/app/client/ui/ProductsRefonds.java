package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.SelectionModel;

import ecr.web.app.client.services.HistoricService;
import ecr.web.app.client.services.HistoricServiceAsync;
import ecr.web.app.client.services.RefondsService;
import ecr.web.app.client.services.RefondsServiceAsync;
import ecr.web.app.client.services.TxnResponseService;
import ecr.web.app.client.services.TxnResponseServiceAsync;

import ecr.web.app.shared.TerminalIpAdr;
import ecr.web.app.shared.TransactionDataIn;
import ecr.web.app.shared.dto.HistoricDTO;
import ecr.web.app.shared.dto.TerminalDTO;
import ecr.web.app.shared.dto.TxnResponseDTO;
public class ProductsRefonds extends DialogBox {

	private static ProductsRefondsUiBinder uiBinder = GWT
			.create(ProductsRefondsUiBinder.class);
	  @UiField
	  SimplePager simple_pdt;
	  /**
	   * The pager used to change the range of data.
	   */
	  @UiField
	    TextBox  txt_search;
		 Range range;
		private  AsyncDataProvider<HistoricDTO> DataProvider;
		private  List<HistoricDTO> sub;
	    private final HistoricServiceAsync _service 
	    = GWT.create(HistoricService.class);
		private final  TxnResponseServiceAsync serviceTxt = GWT
				.create(TxnResponseService.class);
		private final  RefondsServiceAsync servicerefounds = GWT
				.create(RefondsService.class);
long Somme_Ref=0;

		@UiField HTMLPanel
		container;
		@UiField Button 
		btn_canncel;
		@UiField Button 
		btn_ok;
		@UiField
		public  CellTable<HistoricDTO> tab_cell;
		private List<HistoricDTO> selectedDtos = new ArrayList<HistoricDTO>();
		final SelectionModel<HistoricDTO> selectionModel = new MultiSelectionModel<HistoricDTO>();	
		TxnResponseDTO response =new TxnResponseDTO();
		TerminalIpAdr termIpAdr;
	interface ProductsRefondsUiBinder extends UiBinder<Widget, ProductsRefonds> {
	}

	public ProductsRefonds() {
        setWidget(uiBinder.createAndBindUi(this));
        btn_ok.setStyleName("btn btn-primary");
		btn_canncel.setStyleName("btn btn-danger");
	}
	@UiHandler("container")
	void onContainerAttachOrDetach(AttachEvent event) 
	{
		
		  Column<HistoricDTO, Boolean> checkColumn = new Column<HistoricDTO, Boolean>(
			        new CheckboxCell(true, false)) {
			      @Override
			      public Boolean getValue(HistoricDTO object) {
			    	  
			    	  		    	  
			        return selectionModel.isSelected(object);
			      }
			     
			    };
			    tab_cell.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
			    tab_cell.setColumnWidth(checkColumn, 40, Unit.PX);
			    
			    
			    checkColumn.setFieldUpdater(new FieldUpdater<HistoricDTO, Boolean>() {
					
					public void update(int arg0, HistoricDTO arg1, Boolean arg2) {
						if(arg2){
							selectedDtos.add(arg1);
						}else{
							selectedDtos.remove(arg1);
						}
						
					}
				});
		TextColumn<HistoricDTO> txtCol_id = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return "PRO"+object.getProductid();
		}
	};
	tab_cell.addColumn(txtCol_id, "Code");

		TextColumn<HistoricDTO> txtCol_name = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return object.getName().toString();
		}
	};
	tab_cell.addColumn(txtCol_name, "NAME");
	TextColumn<HistoricDTO> txtCol_des = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return object.getDescreption();
		}
	};tab_cell.addColumn(txtCol_des, "DESCREPTION");
	
	TextColumn<HistoricDTO> txtCol_Sale = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return object.getSale();
		}
	};tab_cell.addColumn(txtCol_Sale, "Price");
	TextColumn<HistoricDTO> txtCol_Loyality = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return String.valueOf(object.getLoyality());
		}
	};	tab_cell.addColumn(txtCol_Loyality, "Loyality");
	
	TextColumn<HistoricDTO> txtCol_Quantity = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return String.valueOf(object.getQuantity());
		}
	};	tab_cell.addColumn(txtCol_Quantity, "Quantity");
	TextColumn<HistoricDTO> txtCol_Price = new TextColumn<HistoricDTO>() {
		@Override
		public String getValue(HistoricDTO object) {
			return String.valueOf(object.getPrice());
		}
	};	tab_cell.addColumn(txtCol_Price, "Total");
    simple_pdt.setDisplay(tab_cell);
	addtable();

	}
		public  void addtable(){
		DataProvider = new AsyncDataProvider<HistoricDTO>() {

			@Override
			protected void onRangeChanged(HasData<HistoricDTO> display) {
				range = display.getVisibleRange();
				_service.getProdByTran(Historique.respdto.getId(),new AsyncCallback<List<HistoricDTO>>() {
		


					public void onFailure(Throwable caught) {
							MerchantSession.lbl_notif.setText("fail");
					}

					public void onSuccess(List<HistoricDTO> result) {
						if (result != null && !result.isEmpty()) {
							int start = range.getStart();
							int end = start + range.getLength();
							end = end >= result.size() ? result.size(): end;
							sub = result;
							
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

		DataProvider.addDataDisplay(tab_cell);
	

	}
	
	@UiHandler("btn_ok")
	void onBtn_okClick(ClickEvent event) {
	for (int i=0;i<selectedDtos.size();i++)
	{
		 Somme_Ref+=selectedDtos.get(i).getPrice();
		
	};
	final long NewTotal=Long.valueOf(Long.valueOf(Historique.respdto.getTxt_TotalAmount())-Long.valueOf(Somme_Ref));
	TransactionDataIn data = new TransactionDataIn(6,NewTotal, 7);

	servicerefounds.Refondtransaction(ServerSession.cmd_ipterminal.getItemText(ServerSession.cmd_ipterminal.getSelectedIndex()) , data,new AsyncCallback<TxnResponseDTO>() {

		public void onFailure(Throwable arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onSuccess(TxnResponseDTO arg0) {
			
			Historique.respdto.setTxt_TotalAmount(String.valueOf(NewTotal));
			serviceTxt.updateRow(Historique.respdto, new AsyncCallback<Void>() {

				public void onFailure(Throwable arg0) {
					// TODO Auto-generated method stub
					ServerSession.lbl_notif.setText("Fail to  refonds ");
	
				}

				public void onSuccess(Void arg0) {
					// TODO Auto-generated method stub
					
					ServerSession.lbl_notif.setText("Success refonds ");
					
				
				
				}});	
		}
	

		
	});

	
	
	
	
	
	
	
	
	

	}
	@UiHandler("btn_canncel")
	public void onBtn_canncelClick(ClickEvent event) { /*onSelectAllClicked(ClickEvent e) {*/	
		
				 hide();
			/*  for (HistoricDTO row : ( this.provider).getList()) {
		        row.setChecked(((CheckBox)e.getSource()).getValue());
		    }*/
		
					for (HistoricDTO dto : sub) {
			
				 tab_cell.setSelectionModel(selectionModel);
				selectionModel.setSelected(dto, true);
	}
	}	
}