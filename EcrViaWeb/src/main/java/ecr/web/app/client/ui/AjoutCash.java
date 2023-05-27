package ecr.web.app.client.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.CashService;
import ecr.web.app.client.services.CashServiceAsync;
import ecr.web.app.shared.dto.CashDTO;


public class AjoutCash extends Composite {
	@UiField TextBox txt_total;
	@UiField TextBox txt_idcach;
	@UiField Button bn_Ajout_cach,btn_annuler;
	  private final CashServiceAsync service_cash = GWT.create(CashService.class);

	private static AjoutCashUiBinder uiBinder = GWT
			.create(AjoutCashUiBinder.class);

	interface AjoutCashUiBinder extends UiBinder<Widget, AjoutCash> {
	}

	public AjoutCash() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_annuler.setStyleName("btn btn-danger");
	    bn_Ajout_cach.setStyleName("btn btn-primary");
	    txt_total.setText("0");
	    txt_total.setEnabled(false);

	}

	@UiHandler("bn_Ajout_cach")
	void onBtn_savePtsClick(ClickEvent event) {
	
		final CashDTO cash= new CashDTO();
		cash.setAmount(Long.valueOf(txt_total.getText()));
		cash.setId_caisse(Long.valueOf(txt_idcach.getText()));

		
		service_cash.insertRow(cash, new AsyncCallback<Void>() {
		
		
			public void onFailure(Throwable caught) {
				MerchantSession.lbl_notif.setText("Failed");

		

			}

			public void onSuccess(Void result) {
				MerchantSession.lbl_notif.setText("This cash register is added with susess");

			
						}
		});
		txt_idcach.setText("");
	


	}
			
	

	@UiHandler("btn_annuler")
	void onBtn_resetPtsClick(ClickEvent event) {
		txt_idcach.setText("");
	
	}


}




