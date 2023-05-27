package ecr.web.app.client.ui;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.client.services.MyStyle;
import ecr.web.app.client.services.TVAService;
import ecr.web.app.client.services.TVAServiceAsync;
import ecr.web.app.shared.dto.CashDTO;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.TVADTO;

public class AjoutTVA extends DialogBox {
	  private final TVAServiceAsync service = GWT.create(TVAService.class);
		@UiField TextBox txt_descreption;
		@UiField TextBox txt_amount;
		@UiField Button bn_Ajoutva,btn_annuler,bnt_exit;
	private static final Binder binder = GWT.create(Binder.class);
    interface Binder extends UiBinder<Widget, AjoutTVA> {
    }
    public AjoutTVA() {
        setWidget(binder.createAndBindUi(this));
        btn_annuler.setStyleName("btn btn-warning");
        bn_Ajoutva.setStyleName("btn btn-primary");
        bnt_exit.setStyleName("  btn btn-danger");

	 	}

	@UiHandler("bn_Ajoutva")
	void onBtn_savePtsClick(ClickEvent event) {
	
		final TVADTO TVA= new TVADTO();
		TVA.setAmount(Long.valueOf(txt_amount.getText()));
		TVA.setLibelle(txt_descreption.getText());

		
		service.insertRow(TVA, new AsyncCallback<Void>() {
		
		
			public void onFailure(Throwable caught) {
				MerchantSession.lbl_notif.setText("Failed");

		

			}

			public void onSuccess(Void result) {
				MerchantSession.lbl_notif.setText("This tva is added with susess");

			
						}
		});
		txt_descreption.setText("");
		txt_amount.setText("");



	}
			
	

	@UiHandler("btn_annuler")
	void onBtn_resetPtsClick(ClickEvent event) {
		txt_descreption.setText("");
		txt_amount.setText("");

	}
	@UiHandler("bnt_exit")
	void onBtn_exitClick(ClickEvent event) {
	    this.hide();

	}

}




