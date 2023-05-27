package ecr.web.app.client.ui;


import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.LabelElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.AdressMailDTO;
import ecr.web.app.shared.dto.UsersDTO;

public class UserProfile extends DialogBox {

	private static UserProfileUiBinder uiBinder = GWT
			.create(UserProfileUiBinder.class);
	 @UiField
	  public  Image  img_profile;
	 @UiField
	  public  TextBox  txt_LastName; 
	 @UiField
	  public  TextBox  txt_FirstName; 
	 @UiField
	  public  TextBox  txt_Password; 
	 @UiField
	  public  TextBox  txt_Username; 
	 @UiField
	  public  TextBox  txt_Phone; 
	 @UiField
	  public  TextBox  txt_Birthday;
	 @UiField
	  public  TextBox  txt_Email;
	 @UiField
	  public  TextBox  txt_Interest;
	 @UiField
	  public  TextBox  txt_Adresse;
	 @UiField
	  public  TextBox  txt_PostCode;
	 @UiField
	 public  TextBox txt_ipadess;
	 @UiField
	 public  TextBox txt_ipadess1;
	 @UiField
	 public  TextBox txt_ipadess2;
	 @UiField
	 public  TextBox txt_ipadess3;
	 @UiField
	 public  Label txt_role;
	 @UiField
	  public  Button  btn_Close;
	 @UiField
	 public  Label txt_titleRole;
	 @UiField
	 public  LabelElement lbl_defaultip;
	
	 @UiField
	 public  LabelElement lbl_ip2;
	 @UiField
	 public  LabelElement lbl_ip3;
	 @UiField LabelElement lbl_ip1;
	 @UiField HTMLPanel panel;
	 private final UsersServiceAsync _service = GWT
				.create(UsersService.class);
	interface UserProfileUiBinder extends UiBinder<Widget, UserProfile> {
	}

	public UserProfile(AdressMailDTO resp) {
		setWidget(uiBinder.createAndBindUi(this));
		btn_Close.setStyleName("btn btn-semi-round btn-danger");
		txt_LastName.setEnabled(false);
		txt_FirstName.setEnabled(false);
		txt_Password.setEnabled(false); 
		txt_Username.setEnabled(false); 
		txt_Phone.setEnabled(false); 
		txt_Birthday.setEnabled(false);
		txt_Email.setEnabled(false);
		txt_Interest.setEnabled(false);
		txt_Adresse.setEnabled(false);
		txt_PostCode.setEnabled(false);
		txt_ipadess.setEnabled(false);
		txt_ipadess1.setEnabled(false);
		txt_ipadess2.setEnabled(false);
		txt_ipadess3.setEnabled(false);
		//input-append date 
		_service.selectRowbymail(resp.getAdressmail(),new AsyncCallback<UsersDTO>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				AdminSession.lbl_notif.setText("Fail to get from databases");

			}

			@SuppressWarnings("deprecation")
			public void onSuccess(UsersDTO user) {
				// TODO Auto-generated method stub
				 //TODO Auto-generated method stub
				txt_LastName.setText(user.getName());
				txt_FirstName.setText(user.getName2());
				txt_Password.setText(user.getPassword());
				txt_Username.setText(user.getLogin());
				txt_Phone.setText(user.getTel1());
				txt_Birthday.setText(user.getDatenais().getDay()+"/"+user.getDatenais().getMonth()+"/"+user.getDatenais().getYear());
				txt_Email.setText(user.getMail());
				txt_Interest.setText(user.getInterest());
				txt_Adresse.setText(user.getAdresse());
				img_profile.setUrl(user.getImage().trim());
				txt_PostCode.setText(user.getCodepos());
				txt_ipadess.setText(user.getIpadess());
				txt_ipadess1.setText(user.getIpadess1());
				txt_ipadess2.setText(user.getIpadess2());
				txt_ipadess3.setText(user.getIpadess3());
				txt_titleRole.setText("Role: "+user.getRole());
				txt_role.setText(getRole(user.getRole()));
			}

			private String getRole(String role) {
				// TODO Auto-generated method stub
				if(role.equals("Server"))
				{
					return "Server: Any player who uses our application to make financial transactions";}
				else if(role.equals("Admin"))
				{
					return "Administrator: This is the top player in the application has the right to do all the operations (addition , modification, deletion and consultation)";}
				else{
					return "Merchant: Acts as a store manager . It is located below the Administrator in terms of number of access rights.";
			}}});
		
	
		
		
		
		
		
	}
	@UiHandler("btn_Close")
	void onBn_addCloseClick(ClickEvent event) {
	
		this.hide();
	}	
	

}


