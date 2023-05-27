package ecr.web.app.client.ui;


import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
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
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.client.services.MyStyle;
import ecr.web.app.client.services.ProductsService;
import ecr.web.app.client.services.ProductsServiceAsync;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.ProductsDTO;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

public class DiscountProducts extends DialogBox {
	
	private static final Binder binder = GWT.create(Binder.class);
    interface Binder extends UiBinder<Widget, DiscountProducts> {
    }
	@UiField HTMLPanel container;
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	@UiField Button btn_Reset;
	Range range;
	List<ProductsDTO> sub;
	AsyncDataProvider<ProductsDTO> DataProvider;
	@UiField CellTable <ProductsDTO> cellTable;

    private final ProductsServiceAsync _service = GWT.create(ProductsService.class);
    public DiscountProducts() {
        setWidget(binder.createAndBindUi(this));
        bind();
        btn_Reset.setStyleName("btn btn-danger");
	}

	public void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {
			
			public void onKeyUp(KeyUpEvent arg0) {
				if(sub != null){
					String searchKey = searchBox.getText();
					List<ProductsDTO> filtredList = new ArrayList<ProductsDTO>();
					for (ProductsDTO productDTO : sub) {
						if(String.valueOf(productDTO.getId_product()).toUpperCase().contains(searchKey.toUpperCase())){
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
		TextColumn<ProductsDTO> txtCol_code = new TextColumn<ProductsDTO>() {
			@Override
			public String getValue(ProductsDTO object) {
				return String.valueOf("PRO"+object.getId_product());
			}
		};
		cellTable.addColumn(txtCol_code, "CODE");
		cellTable.setColumnWidth(txtCol_code, 20.0, Unit.PCT);

TextColumn<ProductsDTO> txtCol_desc= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getDescreption();
	}
};
cellTable.addColumn(txtCol_desc, "DESCREPTION");
cellTable.setColumnWidth(txtCol_desc, 100.0, Unit.PCT);
TextColumn<ProductsDTO> txtCol_Name= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getName();
	}
};
cellTable.addColumn(txtCol_Name, "Name");
TextColumn<ProductsDTO> Qt_stock= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getQt_stock();
	}
};
cellTable.addColumn(Qt_stock, "Qt_stock");
TextColumn<ProductsDTO> txtCol_Rayon= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getQt_stock();
	}
};
cellTable.addColumn(txtCol_Rayon, "Rayon");
TextColumn<ProductsDTO> txtCol_prix= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getBuy();
	}
};
cellTable.addColumn(txtCol_prix, "SellingPX");

cellTable.setColumnWidth(txtCol_prix, 50.0, Unit.PCT);
TextColumn<ProductsDTO> txtCol_Purchasing= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getSale();
	}
};
cellTable.addColumn(txtCol_Purchasing, "PurchasingPX");

TextColumn<ProductsDTO> txtColstate= new TextColumn<ProductsDTO>() {
	@Override
	public String getValue(ProductsDTO object) {
		return object.getSale();
	}
};
cellTable.addColumn(txtColstate, "Status");
	
	simple_pdt.setDisplay(cellTable);
	addtable();
}

public void addtable(){
		 DataProvider = new AsyncDataProvider<ProductsDTO>() {

			@Override
			protected void onRangeChanged(HasData<ProductsDTO> display) {
				range = display.getVisibleRange();
				_service.getProduitBydiscounts(ConsultDiscount.id_dicsount,	new AsyncCallback<List<ProductsDTO>>() {
				
					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("fail");
					}

					public void onSuccess(List<ProductsDTO> result) {
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
@UiHandler("btn_Reset")
void onBtn_annulerClick(ClickEvent event) {
	 this.hide();
}
	}


