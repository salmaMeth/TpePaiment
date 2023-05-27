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
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.shared.dto.RangesDTO;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;

@RemoteServiceRelativePath("springGwtServices/uploadrange")

public class AjoutRayon extends Composite  {
    private static final String UPLOAD_ACTION_URL =GWT.getModuleBaseURL()+"uploadrange";

	private static AjoutRayonUiBinder uiBinder = GWT
			.create(AjoutRayonUiBinder.class);
	@UiField TextBox txt_Nom;
	@UiField Button btn_Ajout_Rayo;
	@UiField Button btn_Reset,bnt_Upload;
	@UiField TextArea txt_desp;
	@UiField FormPanel pan_form;
	@UiField FileUpload uploadFormElement;
	private final RangesServiceAsync _service = GWT.create(RangesService.class);

	interface AjoutRayonUiBinder extends UiBinder<Widget, AjoutRayon> {
	}

	public AjoutRayon() {
		initWidget(uiBinder.createAndBindUi(this));
		pan_form.setAction(UPLOAD_ACTION_URL);
		 
        // Because we're going to add a FileUpload widget, we'll need to set the
	        // form to use the POST method, and multipart MIME encoding.
	pan_form.setEncoding(FormPanel.ENCODING_MULTIPART);
	pan_form.setMethod(FormPanel.METHOD_POST);

	uploadFormElement.setName("uploadFormElement");
	btn_Reset.setStyleName("btn btn-danger");
	bnt_Upload.setStyleName("btn btn-info");
	btn_Ajout_Rayo.setStyleName("btn btn-primary");
	}

	
	@UiHandler("btn_Ajout_Rayo")
	void onBtn_Ajout_RayoClick(ClickEvent event) {
		
		final RangesDTO _Rayon_DTO = new RangesDTO();
		_Rayon_DTO.setDescription(txt_desp.getText());
		_Rayon_DTO.setName(txt_Nom.getText());
		_Rayon_DTO.setImage("ImgRanges/"+uploadFormElement.getFilename().trim());

		_service.insertRow(_Rayon_DTO, new AsyncCallback<Void>(){

			public void onFailure(Throwable arg0) {
					MerchantSession.lbl_notif.setText("Failed to add departement");

				
			}

		
		
			public void onSuccess(Void arg0) {
				MerchantSession.lbl_notif.setText("departement  is successfully added ");

				 						
				}
			});
		txt_Nom.setText(" ");
		txt_desp.setText(" ");
		
		
		
		}
		
	
	@UiHandler("btn_Reset")
	void onBtn_ResetClick(ClickEvent event) {
		txt_Nom.setText(" ");
		txt_desp.setText(" ");
	}
/*	@UiHandler("panel_Range")
	void onPanel_RangeAttachOrDetach(AttachEvent event) {
		_service.selectAllRows(new AsyncCallback<List<RangesDTO>>() {

			public void onFailure(Throwable caught) {
					MerchantSession.lbl_notif.setText("fail");
			}

			public void onSuccess(List<RangesDTO> result) {
				
				if (result != null && !result.isEmpty()) {
	long code= result.get(result.size()-1).getId_range()+1;
		txt_CodeRy.setText("RAN"+code);
								
					
					
				} 
					
				
							}
		});
	}*/
	@UiHandler("bnt_Upload")
	void onBnt_UploadClick(ClickEvent event) {
		pan_form.submit();	
	}
	@UiHandler("pan_form")
	void onPan_formSubmitComplete(SubmitCompleteEvent event) {
		 Window.alert(event.getResults());
	}
}
