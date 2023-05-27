package ecr.web.app.client.ui;

import java.sql.Date;
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
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.CashService;
import ecr.web.app.client.services.CashServiceAsync;
import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.shared.dto.CashDTO;

public class ConsultRegister extends Composite {
	@UiField TextBox searchBox;
	@UiField SimplePager simple_pdt;
	Range range;
	List<CashDTO> sub;
	AsyncDataProvider<CashDTO> DataProvider;
	@UiField CellTable <CashDTO> cellTable;
	private static ConsultRegisterUiBinder uiBinder = GWT
			.create(ConsultRegisterUiBinder.class);
    private final CashServiceAsync _service = GWT.create(CashService.class);

	interface ConsultRegisterUiBinder extends UiBinder<Widget, ConsultRegister> {
	}

	public ConsultRegister() {
		initWidget(uiBinder.createAndBindUi(this));
	
	bind();
}

private void bind() {
	searchBox.addKeyUpHandler(new KeyUpHandler() {

		public void onKeyUp(KeyUpEvent arg0) {
			if (sub != null) {
				String searchKey = searchBox.getText();
				List<CashDTO> filtredList = new ArrayList<CashDTO>();
				for (CashDTO cash : sub) {
					if (String.valueOf(cash.getId_caisse()).toUpperCase()
							.contains(searchKey.toUpperCase())) {
						filtredList.add(cash);
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
	TextColumn<CashDTO> txtCol_CODE = new TextColumn<CashDTO>() {
		@Override
		public String getValue(CashDTO object) {
			return String.valueOf("CACH"+object.getId_caisse()) ;
		}
	};cellTable.addColumn(txtCol_CODE, "CODE");
	cellTable.setColumnWidth(txtCol_CODE, 20.0, Unit.PCT);



final Column<CashDTO, String> txtCol_total = new Column<CashDTO, String>(new TextInputCell()) {
		
		@Override
		public String getValue(CashDTO arg0) {
			// TODO Auto-generated method stub
			return String.valueOf(arg0.getAmount());
		}
	};
	txtCol_total.setFieldUpdater(new FieldUpdater<CashDTO, String>() {

		public void update(int arg0, CashDTO arg1, String arg2) {
			arg1.setAmount(Long.valueOf(arg2));
		
			
		}
	});		cellTable.addColumn(txtCol_total, "Total");
	cellTable.setColumnWidth(txtCol_total, 20.0, Unit.PCT);


	
	
final Column<CashDTO, String> txtCol_firstname = new Column<CashDTO, String>(new TextInputCell()) {
		
		@Override
		public String getValue(CashDTO arg0) {
			// TODO Auto-generated method stub
			return String.valueOf(arg0.getDate());
		}
	};
	txtCol_firstname.setFieldUpdater(new FieldUpdater<CashDTO, String>() {

		public void update(int arg0, CashDTO arg1, String arg2) {
			arg1.setDate(Date.valueOf(arg2));
			
		}
	});	cellTable.addColumn(txtCol_firstname,"closing date");
	cellTable.setColumnWidth(txtCol_firstname, 20.0, Unit.PCT);

	
	
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

	Column<CashDTO, String> delete = new Column<CashDTO, String>(
			deleteButton) {
		@Override
		public String getValue(CashDTO c) {
			return "Delete";

		}
	};

	delete.setFieldUpdater(new FieldUpdater<CashDTO, String>()

	{
		public void update(int index, final CashDTO cash, String value) {
			_service.deleteRow(cash.getId_cash(), new AsyncCallback<Void>() {

				public void onFailure(Throwable caught) {
					MerchantSession.lbl_notif.setText("Fail to delete the cash register");
				}

				public void onSuccess(Void arg0) {
					MerchantSession.lbl_notif.setText(" The cash register id deleted with success");

					for ( CashDTO  dto: sub) {
						if(cash.getId_cash() == dto.getId_cash()){
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

	Column<CashDTO, String> update = new Column<CashDTO, String>(
			updateButton) {
		@Override
		public String getValue(CashDTO c) {
			return "Update";

		}};

	update.setFieldUpdater(new FieldUpdater<CashDTO, String>()

	{
		public void update(int index, CashDTO user, String value) {
			_service.updateRow(	user, new AsyncCallback<Void>() {

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

public void addtable() {
	DataProvider = new AsyncDataProvider<CashDTO>() {

		@Override
		protected void onRangeChanged(HasData<CashDTO> display) {
			range = display.getVisibleRange();
			_service.distinctRegister	(new AsyncCallback<List<CashDTO>>() {

				public void onFailure(Throwable caught) {
					MerchantSession.lbl_notif.setText("fail");
				}

				public void onSuccess(List<CashDTO> result) {
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

	