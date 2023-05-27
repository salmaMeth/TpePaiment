package ecr.web.app.client.ui;




import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

import ecr.web.app.client.services.TerminalService;
import ecr.web.app.client.services.TerminalServiceAsync;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.FileDTO;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.TerminalDTO;
import ecr.web.app.shared.dto.UsersDTO;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.event.dom.client.ChangeEvent;

public class AjoutUser extends Composite {
    private static final String UPLOAD_ACTION_URL =GWT.getModuleBaseURL()+"uploaduser";

	private static AjoutUserUiBinder uiBinder = GWT
			.create(AjoutUserUiBinder.class);
	@UiField Button bn_Ajout_User;
	@UiField TextBox txt_MP;
	@UiField TextBox txt_login ;
	@UiField ListBox comb_role;
	@UiField TextBox txt_name;
	@UiField TextBox txt_secname;
	@UiField TextBox txt_tel1;
	@UiField TextBox txt_Interest;
	@UiField DateBox date_nais;
	@UiField TextBox txt_adresse;
	@UiField TextBox txt_codepost;
	@UiField TextBox txt_Email;

	@UiField Button btn_annuler,bnt_Upload;
	@UiField ListBox cmd_defaultip;
	@UiField HTMLPanel panel_ajoutuser;
	@UiField FormPanel pan_form;
	@UiField FileUpload uploadFormElement;
	@UiField ListBox cmd_ipsec1;
	@UiField ListBox cmb_ipsec2;
	@UiField ListBox cmb_ipsec3;
	@UiField ListBox cmb_idcash;
	private final UsersServiceAsync _service = GWT.create(UsersService.class);
	private final TerminalServiceAsync _serviceterminal = GWT.create(TerminalService.class);

	interface AjoutUserUiBinder extends UiBinder<Widget, AjoutUser> {
	}

	public AjoutUser() {
		initWidget(uiBinder.createAndBindUi(this));
		date_nais.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("yyyy-MMM-dd")));
		pan_form.setAction(UPLOAD_ACTION_URL);
		 
        // Because we're going to add a FileUpload widget, we'll need to set the
	        // form to use the POST method, and multipart MIME encoding.
	pan_form.setEncoding(FormPanel.ENCODING_MULTIPART);
	pan_form.setMethod(FormPanel.METHOD_POST);

	uploadFormElement.setName("uploadFormElement");
	btn_annuler.setStyleName("btn btn-danger");
	bnt_Upload.setStyleName("btn btn-info");
	bn_Ajout_User.setStyleName("btn btn-primary");
	date_nais.setStyleName("input-append date");

	}

	@UiHandler("bn_Ajout_User")
	void onBn_Ajout_UserClick(ClickEvent event) {
		    int indexadress =cmd_defaultip.getSelectedIndex();
			int indexrole =comb_role.getSelectedIndex();	
		    int indexadress1 =cmd_ipsec1.getSelectedIndex();
		    int indexadress2 =cmb_ipsec2.getSelectedIndex();
		    int indexadress3 =cmb_ipsec3.getSelectedIndex();
		    int indexcash =cmb_idcash.getSelectedIndex();

			final UsersDTO _Obj_defDTO = new UsersDTO(null,txt_login.getText(),txt_MP.getText(),
			 comb_role.getItemText(indexrole),
			 cmd_defaultip.getItemText(indexadress),
			 txt_name.getText(),
			 txt_secname.getText(),
		     txt_tel1.getText(),
		     Long.valueOf(cmb_idcash.getItemText(indexcash)),
		     cmd_ipsec1.getItemText(indexadress1), 
             cmb_ipsec2.getItemText(indexadress2), 
		     cmb_ipsec3.getItemText(indexadress3), 
		     txt_Interest.getText(),
		     date_nais.getValue(),
			 txt_adresse.getValue(),
			 txt_codepost.getText(),"ImgUsers/"+uploadFormElement.getFilename().trim(), txt_Email.getText().trim());
			_service.insertRow(_Obj_defDTO, new AsyncCallback<Void>() {
					public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("Failed to Authentification");

					}

						public void onSuccess(Void result) {
							MerchantSession.lbl_notif.setText("User is added with susess");
						
					}
				});
			     txt_login.setText("");
				 txt_MP.setText("");
			   	 comb_role.setSelectedIndex(0);
				 txt_name.setText("");
				 txt_secname.setText("");
			     txt_tel1.setText("");
			     txt_Interest.setText("");
				 date_nais.setValue(null);
				 txt_adresse.setText("");
				 txt_codepost.setText("");
				 txt_Email.setText("");
			
	}
	@UiHandler("btn_annuler")
	void onBtn_annulerClick(ClickEvent event) {
		   txt_login.setText("");
			 txt_MP.setText("");
		   	 comb_role.setSelectedIndex(0);
			 txt_name.setText("");
			 txt_secname.setText("");
		     txt_tel1.setText("");
		     txt_Interest.setText("");
			 date_nais.setValue(null);
			 txt_adresse.setText("");
			 txt_codepost.setText("");
			 txt_Email.setText("");

	}
	
	
	@UiHandler("panel_ajoutuser")
	void onPanel_ajoutuserAttachOrDetach(AttachEvent event) {
		_serviceterminal.selectAllRows(new AsyncCallback<List<TerminalDTO>>() {

			public void onFailure(Throwable caught) {
						}

			public void onSuccess(List<TerminalDTO> result) {
					for (int i=1; i < result.size() ; i++) {
						cmd_defaultip.addItem(result.get(i).getAdressip());
						cmd_ipsec1.addItem(result.get(i).getAdressip());
						cmb_ipsec2.addItem(result.get(i).getAdressip());
						cmb_ipsec3.addItem(result.get(i).getAdressip());
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

		 //pan_form.clear();
			//Image image = new Image("ImgRanges/"+uploadFormElement.getFilename().trim());
			//image.setSize("130px", "130px");
			/* SafeHtmlBuilder builder = new SafeHtmlBuilder();
		      builder.appendHtmlConstant(image.toString())*/;
		     // vp.add(image);
		
	}
	@UiHandler("comb_role")
	void onComb_roleChange(ChangeEvent event) {
		if(comb_role.getItemText(comb_role.getSelectedIndex()).equals("Admin"))
		{
			cmd_defaultip.setEnabled(false);
			cmd_ipsec1.setEnabled(false);
			cmb_ipsec2.setEnabled(false);
			cmb_ipsec3.setEnabled(false);
		}
		else if(comb_role.getItemText(comb_role.getSelectedIndex()).equals("Merchant"))
		{
			cmd_defaultip.setEnabled(false);
			cmd_ipsec1.setEnabled(false);
			cmb_ipsec2.setEnabled(false);
			cmb_ipsec3.setEnabled(false);
		}
		else{
			cmd_defaultip.setEnabled(true);
			cmd_ipsec1.setEnabled(true);
			cmb_ipsec2.setEnabled(true);
			cmb_ipsec3.setEnabled(true);
		}
	}
	@UiHandler("comb_role")
	void onComb_roleAttachOrDetach(AttachEvent event) {
		if(comb_role.getItemText(1).equals("Admin"))
		{
			cmd_defaultip.setEnabled(false);
			cmd_ipsec1.setEnabled(false);
			cmb_ipsec2.setEnabled(false);
			cmb_ipsec3.setEnabled(false);
		}
		else if(comb_role.getItemText(1).equals("Merchant"))
		{
			cmd_defaultip.setEnabled(false);
			cmd_ipsec1.setEnabled(false);
			cmb_ipsec2.setEnabled(false);
			cmb_ipsec3.setEnabled(false);
		}
		else{
			cmd_defaultip.setEnabled(true);
			cmd_ipsec1.setEnabled(true);
			cmb_ipsec2.setEnabled(true);
			cmb_ipsec3.setEnabled(true);
		}
	}
}
