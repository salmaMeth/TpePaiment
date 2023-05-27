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
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.ProductsService;
import ecr.web.app.client.services.ProductsServiceAsync;
import ecr.web.app.shared.dto.ProductsDTO;
import ecr.web.app.shared.dto.UsersDTO;


public class ConsultProduct extends Composite 
{
	private ProduitsUiBinder uiBinder = GWT
			.create(ProduitsUiBinder.class);
	@UiField HTMLPanel container;
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	Range range;
	List<ProductsDTO> sub;
	AsyncDataProvider<ProductsDTO> DataProvider;
	@UiField CellTable <ProductsDTO> cellTable;

    private final ProductsServiceAsync _service = GWT.create(ProductsService.class);
	interface ProduitsUiBinder extends UiBinder<Widget, ConsultProduct> {
	}

	public ConsultProduct() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}

	public void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {
			
			public void onKeyUp(KeyUpEvent arg0) {
				if(sub != null){
					String searchKey = searchBox.getText();
					List<ProductsDTO> filtredList = new ArrayList<ProductsDTO>();
					for (ProductsDTO productDTO : sub) {
						if(productDTO.getCode().toUpperCase().contains(searchKey.toUpperCase())){
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
				return String.valueOf(object.getCode());
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
final Column<ProductsDTO, String> txtCol_Name = new Column<ProductsDTO, String>(new TextInputCell()) {
	
	@Override
	public String getValue(ProductsDTO arg0) {
		// TODO Auto-generated method stub
		return arg0.getName();
	}
};
txtCol_Name.setFieldUpdater(new FieldUpdater<ProductsDTO, String>() {

	public void update(int arg0, ProductsDTO arg1, String arg2) {
		arg1.setName(arg2);
					
	}
});cellTable.addColumn(txtCol_Name, "Name");

final Column<ProductsDTO, String> txtCol_stocks = new Column<ProductsDTO, String>(new TextInputCell()) {
	
	@Override
	public String getValue(ProductsDTO arg0) {
		// TODO Auto-generated method stub
		return arg0.getQt_stock();
	}
};
txtCol_stocks.setFieldUpdater(new FieldUpdater<ProductsDTO, String>() {

	public void update(int arg0, ProductsDTO arg1, String arg2) {
		arg1.setQt_stock(arg2);
					
	}
});cellTable.addColumn(txtCol_stocks, "Qt_stock");



final Column<ProductsDTO, String> txtCol_Rayon = new Column<ProductsDTO, String>(new TextInputCell()) {
	
	@Override
	public String getValue(ProductsDTO arg0) {
		// TODO Auto-generated method stub
		return arg0.get_range();
	}
};
txtCol_Rayon.setFieldUpdater(new FieldUpdater<ProductsDTO, String>() {

	public void update(int arg0, ProductsDTO arg1, String arg2) {
		arg1.set_range(arg2);
					
	}
});cellTable.addColumn(txtCol_Rayon, "Rayon");



final Column<ProductsDTO, String> txtCol_prix = new Column<ProductsDTO, String>(new TextInputCell()) {
	
	@Override
	public String getValue(ProductsDTO arg0) {
		// TODO Auto-generated method stub
		return arg0.getBuy();
	}
};
txtCol_prix.setFieldUpdater(new FieldUpdater<ProductsDTO, String>() {

	public void update(int arg0, ProductsDTO arg1, String arg2) {
		arg1.setBuy(arg2);
					
	}
});cellTable.addColumn(txtCol_prix, "SellingPX");
cellTable.setColumnWidth(txtCol_prix, 50.0, Unit.PCT);

final Column<ProductsDTO, String> txtCol_Purchasing = new Column<ProductsDTO, String>(new TextInputCell()) {
	
	@Override
	public String getValue(ProductsDTO arg0) {
		// TODO Auto-generated method stub
		return arg0.getSale();
	}
};
txtCol_Purchasing.setFieldUpdater(new FieldUpdater<ProductsDTO, String>() {

	public void update(int arg0, ProductsDTO arg1, String arg2) {
		arg1.setSale(arg2);
					
	}
});cellTable.addColumn(txtCol_Purchasing, "PurchasingPX");
cellTable.setColumnWidth(txtCol_Purchasing, 50.0, Unit.PCT);
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

	Column<ProductsDTO, String> delete = new Column<ProductsDTO, String>(
			deleteButton) {
		@Override
		public String getValue(ProductsDTO c) {
			return "Delete";

		}
	};

	delete.setFieldUpdater(new FieldUpdater<ProductsDTO, String>()

	{
		public void update(int index, final ProductsDTO product, String value) {
			_service.deleteRow(product.getId_product(), new AsyncCallback<Void>() {

				public void onFailure(Throwable caught) {
					MerchantSession.lbl_notif.setText("fail");

				}

				public void onSuccess(Void arg0) {
					MerchantSession.lbl_notif.setText("Success");
					for ( ProductsDTO  dto: sub) {
						if(product.getId_product() == dto.getId_product()){
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

	Column<ProductsDTO, String> update = new Column<ProductsDTO, String>(
			updateButton) {
		@Override
		public String getValue(ProductsDTO c) {
			return "Update";

		}};

	update.setFieldUpdater(new FieldUpdater<ProductsDTO, String>()

	{
		public void update(int index, ProductsDTO product, String value) {
			_service.updateRow(	product, new AsyncCallback<Void>() {

				public void onFailure(Throwable caught) {
					MerchantSession.lbl_notif.setText("fail");

				}

				public void onSuccess(Void arg0) {
					MerchantSession.lbl_notif.setText("Success");
					
				}

			});
		}});
	cellTable.addColumn(update, "Update");
	cellTable.setColumnWidth(update, 10.0, Unit.PCT);
	simple_pdt.setDisplay(cellTable);
	addtable();
}

public void addtable(){
		 DataProvider = new AsyncDataProvider<ProductsDTO>() {

			@Override
			protected void onRangeChanged(HasData<ProductsDTO> display) {
				range = display.getVisibleRange();
				_service.selectAllRows(new AsyncCallback<List<ProductsDTO>>() {

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

	}


