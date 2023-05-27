package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.ProviderService;
import ecr.web.app.client.services.ProviderServiceAsync;
import ecr.web.app.shared.dto.ProviderDTO;

public class AjoutProvider extends Composite {
	@UiField TextBox txt_Name;
	@UiField TextBox txt_SecName;
	@UiField TextBox txt_phone1;
	@UiField TextBox txt_phone2;
	@UiField TextBox txt_Mail;
	@UiField TextBox txt_Adresse;
	@UiField TextBox txt_codepos;
	@UiField TextBox txt_property;
	@UiField Button bnt_Ajoutprovider;
	@UiField Button bnt_Reset;
	

	private final ProviderServiceAsync _service = GWT.create(ProviderService.class);
	private static AjoutProviderUiBinder uiBinder = GWT
			.create(AjoutProviderUiBinder.class);

	interface AjoutProviderUiBinder extends UiBinder<Widget, AjoutProvider> {
	}

	public AjoutProvider() {
		initWidget(uiBinder.createAndBindUi(this));
		bnt_Reset.setStyleName("btn btn-danger");
		bnt_Ajoutprovider.setStyleName("btn btn-primary");
		
	}

	@UiHandler("bnt_Ajoutprovider")
	void onBnt_AjoutProviderClick(ClickEvent event) {
		final ProviderDTO ObjdefDTO = new ProviderDTO();
    	ObjdefDTO.setAdresse(txt_Adresse.getText());
    	ObjdefDTO.setCodepos(txt_codepos.getText());
    	ObjdefDTO.setName(txt_Name.getText());
    	ObjdefDTO.setName2(txt_SecName.getText());
    	ObjdefDTO.setTel1(txt_phone2.getText());
    	ObjdefDTO.setTel2(txt_phone1.getText());
    	ObjdefDTO.setMail(txt_Mail.getText());
    	ObjdefDTO.setProperty(txt_property.getText());
    	
				 
				_service.insertRow(ObjdefDTO, new AsyncCallback<Void>() {
						public void onFailure(Throwable caught) {
								MerchantSession.lbl_notif.setText("Failed");
						}

							public void onSuccess(Void result) {
						
							MerchantSession.lbl_notif.setText("Provider is added with susess");
						
						

						    	txt_Mail.setText("");
						    	txt_Adresse.setText("");
						    	txt_codepos.setText("");
						    	txt_property.setText("");
						    	txt_Name.setText("");
						    	txt_SecName.setText("");
						    	txt_phone2.getText();
						    	txt_phone1.setText("");
								
								
							
						

						}
					});
		
	}
	@UiHandler("bnt_Reset")
	void onBnt_cancelClientClick(ClickEvent event) {

		txt_Mail.setText("");
    	txt_Adresse.setText("");
    	txt_codepos.setText("");
    	txt_property.setText("");
    	txt_Name.setText("");
    	txt_SecName.setText("");
    	txt_phone2.getText();
    	txt_phone1.setText("");
		
		
	}
}