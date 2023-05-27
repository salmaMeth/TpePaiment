package ecr.web.app.client.ui;



import java.util.List;

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
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.DiscountService;
import ecr.web.app.client.services.DiscountServiceAsync;
import ecr.web.app.client.services.ProductsService;
import ecr.web.app.client.services.ProductsServiceAsync;
import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.shared.dto.DiscountsDTO;
import ecr.web.app.shared.dto.ProductsDTO;
import ecr.web.app.shared.dto.RangesDTO;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.event.logical.shared.AttachEvent;


@RemoteServiceRelativePath("springGwtServices/uploadproduct")

public class AjoutPts extends Composite  {
private final ProductsServiceAsync _service = GWT.create(ProductsService.class);

	private static AjoutPtsUiBinder uiBinder = GWT
	.create(AjoutPtsUiBinder.class);
	@UiField TextBox txt_NomPts;
	@UiField TextBox txt_DesPts;
	@UiField TextBox txt_CodePts;
	@UiField TextBox txt_vende;
	@UiField ListBox cm_TVA;
	@UiField TextBox txt_StokPts;
	@UiField TextBox txt_PtsFidalit;
	@UiField ListBox cmb_Remise;
	@UiField ListBox cmb_etat,cmd_provider;
	@UiField ListBox cmb_rayonpts;
	@UiField Button btn_savePts;
	@UiField Button btn_resetPts,bnt_Upload;
	@UiField TextBox txt_fours;
	@UiField HTMLPanel panel_ajoutpdt;
	@UiField TextBox txt_achat;
	@UiField FormPanel pan_form;
	@UiField FileUpload uploadFormElement;
    private static final String UPLOAD_ACTION_URL =GWT.getModuleBaseURL()+"uploadproduct";

	  private final RangesServiceAsync _service_range = GWT.create(RangesService.class);
	  private final DiscountServiceAsync service_discounts = GWT.create( DiscountService.class);

	interface AjoutPtsUiBinder extends UiBinder<Widget, AjoutPts> {
	}

	public AjoutPts() {
		initWidget(uiBinder.createAndBindUi(this));
		pan_form.setAction(UPLOAD_ACTION_URL);
		 
        // Because we're going to add a FileUpload widget, we'll need to set the
	        // form to use the POST method, and multipart MIME encoding.
	pan_form.setEncoding(FormPanel.ENCODING_MULTIPART);
	pan_form.setMethod(FormPanel.METHOD_POST);

	uploadFormElement.setName("uploadFormElement");
	btn_resetPts.setStyleName("btn btn-danger");
	bnt_Upload.setStyleName("btn btn-info");
	btn_savePts.setStyleName("btn btn-primary");

	}

	@UiHandler("btn_savePts")
	void onBtn_savePtsClick(ClickEvent event) {
		int _remise =cmb_Remise.getSelectedIndex();
		int _TVA =cm_TVA.getSelectedIndex();
		int _etat =cmb_etat.getSelectedIndex();
		int _rayon =cmb_rayonpts.getSelectedIndex();
		final ProductsDTO _produits= new ProductsDTO();
		_produits.setBarcode(Long.valueOf(txt_CodePts.getText()));
		_produits.setDescreption(txt_DesPts.getText());
		_produits.setName(txt_NomPts.getText());
		_produits.setBuy(txt_vende.getText());
		_produits.setSale(txt_achat.getText());
		_produits.setId_tva(cm_TVA.getItemText(_TVA));
		_produits.setQt_stock(txt_StokPts.getText());
		_produits.setLoyality(Long.valueOf(txt_PtsFidalit.getText()));
		_produits.setId_discount(cmb_Remise.getItemText(_remise));
		_produits.setState( cmb_etat.getItemText(_etat));
		_produits.set_range(cmb_rayonpts.getItemText(_rayon));
		_produits.setImage("ImgProducts/"+uploadFormElement.getFilename().trim());

		
		_service.insertRow(_produits, new AsyncCallback<Void>() {
		
		
			public void onFailure(Throwable caught) {
				MerchantSession.lbl_notif.setText("Failed");

			}

			public void onSuccess(Void result) {
			
			MerchantSession.lbl_notif.setText("Product is added with susess");

						}
		});
	    txt_NomPts.setText("");
		 txt_DesPts.setText("");
		 txt_CodePts.setText("");
	     txt_vende.setText("");
	     txt_fours.setText("");
	     txt_StokPts.setText("");
		 txt_PtsFidalit.setText("");
		 cmb_rayonpts.setSelectedIndex(0);
		 cmb_etat.setSelectedIndex(0);
		 cm_TVA.setSelectedIndex(0);
		 cmb_Remise.setSelectedIndex(0);
		 txt_achat.setText("");
	}
			
	

	@UiHandler("btn_resetPts")
	void onBtn_resetPtsClick(ClickEvent event) {
	txt_NomPts.setText("");
	 txt_DesPts.setText("");
	 txt_CodePts.setText("");
     txt_vende.setText("");
     txt_fours.setText("");
     txt_StokPts.setText("");
	 txt_PtsFidalit.setText("");
	
	     cmb_rayonpts.setSelectedIndex(0);
		 cmb_etat.setSelectedIndex(0);
		 cm_TVA.setSelectedIndex(0);
		 cmb_Remise.setSelectedIndex(0);
		 txt_achat.setText("");
	
	}
	@UiHandler("panel_ajoutpdt")
	void onPanel_ajoutpdtAttachOrDetach(AttachEvent event) {
		_service_range.selectAllRows(new AsyncCallback<List<RangesDTO>>() {

			public void onFailure(Throwable caught) {
						}

			public void onSuccess(List<RangesDTO> result) {
					for (int i=0; i < result.size() ; i++) {
						cmb_rayonpts.addItem(result.get(i).getCode());
									}
								}
		});

		service_discounts.selectAllRows(new AsyncCallback<List<DiscountsDTO>>() {

			public void onFailure(Throwable caught) {
						}

			public void onSuccess(List<DiscountsDTO> result) {
			for (int i=0; i < result.size() ; i++) {
			
				cmb_Remise.addItem(String.valueOf(result.get(i).getId_discount()));
									}
								}
		});
		
	}
	@UiHandler("bnt_Upload")
	void onBnt_UploadClick(ClickEvent event) {
		pan_form.submit();	
	}
	@UiHandler("pan_form")
	void onPan_formSubmitComplete(SubmitCompleteEvent event) {
			MerchantSession.lbl_notif.setText(event.getResults());

		 
	}
}
