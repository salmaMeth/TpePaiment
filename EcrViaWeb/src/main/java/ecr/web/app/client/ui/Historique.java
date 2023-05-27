package ecr.web.app.client.ui;



import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;

import ecr.web.app.client.services.TableRes;
import ecr.web.app.client.services.TxnResponseService;
import ecr.web.app.client.services.TxnResponseServiceAsync;
import ecr.web.app.shared.dto.TxnResponseDTO;
import ecr.web.app.shared.dto.UsersDTO;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;


public class Historique extends Composite  {

	private  HistoriqueUiBinder uiBinder = GWT
			.create(HistoriqueUiBinder.class);

	@UiField
		 CellTable<TxnResponseDTO> cellTable;
		public static long somme=0;
		public static TxnResponseDTO respdto;
	@UiField SimplePager pager;
	@UiField HTMLPanel Container;
	 Range range;
	public   static List<TxnResponseDTO> sub;
	private  AsyncDataProvider<TxnResponseDTO> DataProvider;
	private final  TxnResponseServiceAsync service = GWT
			.create(TxnResponseService.class);

	interface HistoriqueUiBinder extends UiBinder<Widget, Historique> {
	}
	 	public Historique() {
		initWidget(uiBinder.createAndBindUi(this));
		applyDataRowStyles();
		
	}
		@UiHandler("Container")
		void onContainerAttachOrDetach(AttachEvent event) {
	 	TextColumn<TxnResponseDTO> txtCol_idtran = new TextColumn<TxnResponseDTO>() {
			public String getValue(TxnResponseDTO object) {
				return object.getId().toString();
			}
		};
		cellTable.setWidth("100%", true);

		cellTable.addColumn(txtCol_idtran, "Id Transaction");
		
		cellTable.setColumnWidth(txtCol_idtran, 13.0, Unit.PCT);

			TextColumn<TxnResponseDTO> txtCol_type = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_TranTyp().toString();
			}
		};
		cellTable.addColumn(txtCol_type, "Type");
		TextColumn<TxnResponseDTO> txtCol_Total = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_TotalAmount();
			}
		};cellTable.addColumn(txtCol_Total, "Total");
		TextColumn<TxnResponseDTO> txtCol_auth = new TextColumn<TxnResponseDTO>() {
		@Override
		public String getValue(TxnResponseDTO object) {
			return object.getTxt_TranSta();
		}
	};
	cellTable.addColumn(txtCol_auth, "Status");
		
		TextColumn<TxnResponseDTO> txtCol_cardname = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_CardName();
			}
		};
		cellTable.addColumn(txtCol_cardname, "Card Name");
		cellTable.setColumnWidth(txtCol_cardname, 13.0, Unit.PCT);

		TextColumn<TxnResponseDTO> Pan = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_Pan();
			}
		};
		
		cellTable.addColumn(Pan, "Pan Number");
		cellTable.setColumnWidth(Pan,20.0, Unit.PCT );
	
		TextColumn<TxnResponseDTO> txtCol_date = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_DateTxn();
			}
		};	cellTable.addColumn(txtCol_date, "Date");
		cellTable.setColumnWidth(txtCol_date, 13.0, Unit.PCT);
		TextColumn<TxnResponseDTO> TerminalID = new TextColumn<TxnResponseDTO>() {
			@Override
			public String getValue(TxnResponseDTO object) {
				return object.getTxt_TerminalID();
			}
		};	cellTable.addColumn(TerminalID, "TerminaliD");
		cellTable.setColumnWidth(TerminalID, 13.0, Unit.PCT);
		ButtonCell updateButton = new ButtonCell() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image deleteImg = new Image("images/details.png");
				deleteImg.setPixelSize(20, 20);
				sb.appendHtmlConstant(deleteImg.toString());
				
			}
		};		
	    Column <TxnResponseDTO,String> Details= new Column <TxnResponseDTO,String>(updateButton)
	    {
	        @Override
	        public String getValue(TxnResponseDTO c) 
	        {
	            return "Details";
	            
	        }
	    };
		cellTable.setColumnWidth(Details,10.0, Unit.PCT );
	    Details.setFieldUpdater(new FieldUpdater<TxnResponseDTO,String>()
	  
	    	    {
	    	        public void update(int index, TxnResponseDTO resp,String value) 
	    	        {
	    	        	respdto=resp;
	          	   
	    	        	DialogBox dlg = new ProductsRefonds();
                         dlg.setPopupPosition(120, 60);
                         dlg.show();
                     
	    	        } });	

	    
	    
	    
	   
	    cellTable.addColumn(Details, "Details");
	    cellTable.redraw();
	    pager.setDisplay(cellTable);
		addtable();
	}
	public  void addtable(){
		DataProvider = new AsyncDataProvider<TxnResponseDTO>() {

			@Override
			protected void onRangeChanged(HasData<TxnResponseDTO> display) {
				range = display.getVisibleRange();
				service.selectAllRows(new AsyncCallback<List<TxnResponseDTO>>() {


					public void onFailure(Throwable caught) {
							MerchantSession.lbl_notif.setText("fail");
					}

					public void onSuccess(List<TxnResponseDTO> result) {
						if (result != null && !result.isEmpty()) {
							int start = range.getStart();
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

		DataProvider.addDataDisplay(cellTable);
	

	}
	  private void applyDataRowStyles() {
			    
		    for (int row = 1; row < cellTable.getRowCount(); ++row) {
		      if ((row % 2) != 0) {
		    	  cellTable.addStyleName("FlexTable-OddRow");
		    	  		    	 
		      }
		      else {
		    	  cellTable.addStyleName("FlexTable-OddRow");
 
		      }
		    }}
}
