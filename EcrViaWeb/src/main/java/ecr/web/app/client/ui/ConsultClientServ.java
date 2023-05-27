package ecr.web.app.client.ui;

	import java.util.ArrayList;
import java.util.List;

	import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.client.services.ProductsService;
import ecr.web.app.client.services.ProductsServiceAsync;
import ecr.web.app.shared.dto.ClientDTO;


import com.google.gwt.user.client.ui.TextBox;

	public class ConsultClientServ extends Composite  {
		@UiField static CellTable <ClientDTO> cell_produit;
		@UiField HTMLPanel container;
	
	
		@UiField SimplePager simple_pdt;
		@UiField TextBox searchBox;
		static Range range;
		static List<ClientDTO> sub;
		static AsyncDataProvider<ClientDTO> DataProvider;
	    private final static ClientServiceAsync _service = GWT.create(ClientService.class);
		private static ArticleUiBinder uiBinder = GWT.create(ArticleUiBinder.class);

		interface ArticleUiBinder extends UiBinder<Widget, ConsultClientServ> {
		}

		public ConsultClientServ() {
			initWidget(uiBinder.createAndBindUi(this));
			bind();
		}


	
		
	
	
		public void bind() {
			searchBox.addKeyUpHandler(new KeyUpHandler() {
				
				public void onKeyUp(KeyUpEvent arg0) {
					if(sub != null){
						String searchKey = searchBox.getText();
						List<ClientDTO> filtredList = new ArrayList<ClientDTO>();
						for (ClientDTO productDTO : sub) {
							if(productDTO.getId().toString().toUpperCase().contains(searchKey.toUpperCase())){
								filtredList.add(productDTO);
							}
						}
						DataProvider.updateRowData(0, filtredList);
						DataProvider.updateRowCount(filtredList.size(), true);
						
					}
					
				}
			});
			
		}
	
		@UiHandler("container")
		void onContainerAttachOrDetach(AttachEvent event) {
			TextColumn<ClientDTO> txtCol_code = new TextColumn<ClientDTO>() {
				@Override
				public String getValue(ClientDTO object) {
					return String.valueOf(object.getId());
				}
			};
	cell_produit.addColumn(txtCol_code, "CODE");

	TextColumn<ClientDTO> txtCol_desc= new TextColumn<ClientDTO>() {
		@Override
		public String getValue(ClientDTO object) {
			return object.getName();
		}
	};
	cell_produit.addColumn(txtCol_desc, "Name");
	TextColumn<ClientDTO> txtCol_Rayon= new TextColumn<ClientDTO>() {
		@Override
		public String getValue(ClientDTO object) {
			return object.getName2();
		}
	};
	cell_produit.addColumn(txtCol_Rayon, "Name2");
	TextColumn<ClientDTO> txtCol_prix= new TextColumn<ClientDTO>() {
		@Override
		public String getValue(ClientDTO object) {
			return object.getAdresse();
		}
	};
	cell_produit.addColumn(txtCol_prix, "Adress");
	TextColumn<ClientDTO> txtCol_Purchasing= new TextColumn<ClientDTO>() {
		@Override
		public String getValue(ClientDTO object) {
			return String.valueOf(object.getLoyality());
		}
	};
	cell_produit.addColumn(txtCol_Purchasing, "Loyality");	
	simple_pdt.setDisplay(cell_produit);
	addtable();}
	public static void addtable(){
			 DataProvider = new AsyncDataProvider<ClientDTO>() {

				@Override
				protected void onRangeChanged(HasData<ClientDTO> display) {
					range = display.getVisibleRange();
					_service.selectAllRows(new AsyncCallback<List<ClientDTO>>() {

						public void onFailure(Throwable caught) {
								MerchantSession.lbl_notif.setText("fail");
						}

						public void onSuccess(List<ClientDTO> result) {
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

			DataProvider.addDataDisplay(cell_produit);
		}

		}


