package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.event.dom.client.ChangeEvent;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.server.impl.UploadUser;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.FileDTO;
import ecr.web.app.shared.dto.UsersDTO;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
@RemoteServiceRelativePath("springGwtServices/uploadclients")

public class AjoutClient extends Composite {
     private static final String UPLOAD_ACTION_URL =GWT.getModuleBaseURL()+"uploadclients";

	private static ClientsUiBinder uiBinder = GWT.create(ClientsUiBinder.class);
	@UiField TextBox txt_Name;
	@UiField TextBox txt_SecName;
	@UiField TextBox txt_phone1;
	@UiField TextBox txt_phone2;
	@UiField DateBox Date_nais;
	@UiField TextBox txt_SituationFa;
	@UiField TextBox txt_Profession;
	@UiField TextBox txt_Adresse;
	@UiField TextBox txt_City;

	
	@UiField TextBox txt_codepos;
	@UiField TextBox txt_Pointfidal;
	@UiField ListBox comb_continent;
	@UiField RadioButton radio_Homme;
	@UiField RadioButton radio_Femme;
	@UiField Button bnt_AjoutClient;
	@UiField Button bnt_Imprimer;
	@UiField Button bnt_Reset;
	@UiField Button bnt_Upload;
	@UiField FormPanel pan_form;
	@UiField FileUpload uploadFormElement;
	@UiField TextBox txt_cardid;
	private final ClientServiceAsync _service = GWT.create(ClientService.class);

	interface ClientsUiBinder extends UiBinder<Widget, AjoutClient> {
	}

	public AjoutClient() {
		initWidget(uiBinder.createAndBindUi(this));
		AdminSession.lbl_notif.setText("");

		pan_form.setAction(UPLOAD_ACTION_URL);
		 
	        // Because we're going to add a FileUpload widget, we'll need to set the
		        // form to use the POST method, and multipart MIME encoding.
		pan_form.setEncoding(FormPanel.ENCODING_MULTIPART);
		pan_form.setMethod(FormPanel.METHOD_POST);

		uploadFormElement.setName("uploadFormElement");
			
		bnt_Reset.setStyleName("btn btn-danger");
		bnt_Upload.setStyleName("btn btn-info");
		bnt_AjoutClient.setStyleName("btn btn-primary");
		bnt_Imprimer.setStyleName(" btn btn-warning");
			}

	@UiHandler("bnt_Upload")
	void onBnt_UploadClick(ClickEvent event) {
		pan_form.submit();

	}
	
/*  	@UiHandler("pan_form")
	void onPan_formSubmitComplete(SubmitCompleteEvent event) {
		 Window.alert(event.getResults());
			 //pan_form.clear();
			Image image = new Image(GWT.getHostPageBaseURL()+uploadFormElement.getFilename());
			image.setSize("130px", "130px");
			 SafeHtmlBuilder builder = new SafeHtmlBuilder();
		      builder.appendHtmlConstant(image.toString());
		      vp.add(image);
		   
		 	     	}*/
  	
	@UiHandler("bnt_AjoutClient")
	void onBnt_AjoutClientClick(ClickEvent event) {
		final ClientDTO ObjdefDTO = new ClientDTO();
    	ObjdefDTO.setCardid(Long.valueOf(txt_cardid.getText()));
    	ObjdefDTO.setAdresse(txt_Adresse.getText());
    	ObjdefDTO.setCodepos(txt_codepos.getText());
    	ObjdefDTO.setImage("ImgClients/"+uploadFormElement.getFilename().trim());
    	ObjdefDTO.setLoyality(Long.valueOf(txt_Pointfidal.getText()));
    	ObjdefDTO.setName(txt_Name.getText());
    	ObjdefDTO.setName2(txt_SecName.getText());
    	ObjdefDTO.setTel1(txt_phone2.getText());
    	ObjdefDTO.setTel2(txt_phone1.getText());
    	ObjdefDTO.setCity(txt_City.getText());
    	ObjdefDTO.setDatenais(Date_nais.getValue());
    	ObjdefDTO.setCity(txt_City.getText());
    	ObjdefDTO.setProfession(txt_Profession.getText());
    	ObjdefDTO.setSituationFa(txt_SituationFa.getText());
    	ObjdefDTO.setSexe(getSexe(radio_Homme,radio_Femme));

    	ObjdefDTO.setContinent(comb_continent.getItemText(comb_continent.getSelectedIndex()).trim());
				 
				_service.insertRow(ObjdefDTO, new AsyncCallback<Void>() {
						public void onFailure(Throwable caught) {
							AdminSession.lbl_notif.setText("Failed");
						}

							public void onSuccess(Void result) {
						
								AdminSession.lbl_notif.setText("Client is added with susess");
					
					    	txt_cardid.setText("");
					    	txt_Adresse.setText("");
					    	txt_codepos.setText("");
					    	txt_Pointfidal.setText("");
					    	txt_Name.setText("");
					    	txt_SecName.setText("");
					    	txt_phone2.getText();
					    	txt_phone1.setText("");
					    	txt_City.setText("");
					    	comb_continent.setItemSelected(0, true);
					    	txt_Profession.setText("");
					    	txt_SituationFa.setText("");
						}
					});
		
	}
	@UiHandler("bnt_Reset")
	void onBnt_cancelClientClick(ClickEvent event) {

		txt_cardid.setText("");
    	txt_Adresse.setText("");
    	txt_codepos.setText("");
    	txt_Name.setText("");
    	txt_SecName.setText("");
    	txt_phone2.getText();
    	txt_phone1.setText("");
    	txt_Profession.setText("");
    	txt_SituationFa.setText("");
    	txt_City.setText("");
    	comb_continent.setItemSelected(0, true);
		AdminSession.lbl_notif.setText("");

		
	}
	public String getSexe(RadioButton Homme,RadioButton femme)
	{if (Homme.getValue())
		return Homme.getText().trim();
	else
	return femme.getText().trim();
		
		
		
		
	}
}