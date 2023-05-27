package ecr.web.app.client.ui;

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

import ecr.web.app.client.services.TerminalService;
import ecr.web.app.client.services.TerminalServiceAsync;
import ecr.web.app.shared.dto.TerminalDTO;

public class AjouTerminal extends Composite {

	private static AjouTerminalUiBinder uiBinder = GWT
			.create(AjouTerminalUiBinder.class);
	@UiField TextBox txt_ip;
	@UiField TextBox txt_brande;
	@UiField TextBox txt_refernece;
	@UiField Button bn_addterminal;
	@UiField Button btn_cancel;
	private final TerminalServiceAsync _service = GWT.create(TerminalService.class);

	interface AjouTerminalUiBinder extends UiBinder<Widget, AjouTerminal> {
	}

	public AjouTerminal() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_cancel.setStyleName("btn btn-danger");
		bn_addterminal.setStyleName("btn btn-primary");
		
	}

	
	@UiHandler("bn_addterminal")
	void onBn_addterminalClick(ClickEvent event) {
		final TerminalDTO _TerminalDTO = new TerminalDTO();
		_TerminalDTO.setAdressip(txt_ip.getText());
		_TerminalDTO.setReference(txt_refernece.getText());
		_TerminalDTO.setBrande(txt_brande.getText());
		_service.insertRow(_TerminalDTO, new AsyncCallback<Void>(){
	
			public void onFailure(Throwable arg0) {
				
				MerchantSession.lbl_notif.setText("Failed to add Terminal");

				
			}
			
			public void onSuccess(Void arg0) {
			
				MerchantSession.lbl_notif.setText("Terminal  is successfully added");
			 						
				}
			});
		txt_ip.setText(" ");
		txt_refernece.setText(" ");
		txt_brande.setText(" ");
						
	}
	@UiHandler("btn_cancel")
	void onBtn_cancelClick(ClickEvent event) {
		txt_ip.setText(" ");
		txt_refernece.setText(" ");
		txt_brande.setText(" ");
	}
}
