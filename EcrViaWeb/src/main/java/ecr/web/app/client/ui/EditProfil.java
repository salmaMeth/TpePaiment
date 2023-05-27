package ecr.web.app.client.ui;

import java.sql.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.LabelElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.UsersDTO;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.dom.client.ChangeEvent;

public class EditProfil extends Composite {
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
	 public  LabelElement lbl_defaultip;
	
	 @UiField
	 public  LabelElement lbl_ip2;
	 @UiField
	 public  LabelElement lbl_ip3;
	 @UiField LabelElement lbl_ip1;
	 @UiField HTMLPanel panel;
	 @UiField
	 public  Button  btn_update_User,btn_annuler;
	 @UiField
	 ListBox cmb_role;
	 static String resps;
		static UsersDTO users = new UsersDTO();

	private static EditProfilUiBinder uiBinder = GWT
			.create(EditProfilUiBinder.class);
	 private final UsersServiceAsync _service = GWT
				.create(UsersService.class);
	interface EditProfilUiBinder extends UiBinder<Widget, EditProfil> {
	}

	public EditProfil(String resp) {
		initWidget(uiBinder.createAndBindUi(this));
		resps=resp;
		btn_update_User.setStyleName("btn btn-primary");
		btn_annuler.setStyleName("btn btn-danger");

		//input-append date 
		_service.selectRowbymail(resp,new AsyncCallback<UsersDTO>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				AdminSession.lbl_notif.setText("Fail to get from databases");

			}

			@SuppressWarnings("deprecation")
			public void onSuccess(UsersDTO user) {
				// TODO Auto-generated method stub
				 //TODO Auto-generated method stub
				users=user;
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
				cmb_role.setSelectedIndex(getIndexRole(user.getRole()));
				txt_role.setText(getRole(cmb_role.getValue(cmb_role.getSelectedIndex())).toString());

			}

			private String getRole(String role) {
				// TODO Auto-generated method stub
				if(role.equals("Server"))
				{
					return "Server: Any player who uses our application to make financial transactions";}
				else if(role.equals("Admin"))
				{txt_ipadess.setVisible(false);
				txt_ipadess1.setVisible(false);
				txt_ipadess2.setVisible(false);
				txt_ipadess3.setVisible(false);
					return "Administrator: This is the top player in the application has the right to do all the operations (addition , modification, deletion and consultation)";}
				else{txt_ipadess.setVisible(false);
				txt_ipadess1.setVisible(false);
				txt_ipadess2.setVisible(false);
				txt_ipadess3.setVisible(false);
					return "Merchant: Acts as a store manager . It is located below the Administrator in terms of number of access rights.";
			}}
		
		private int getIndexRole(String role) {
			// TODO Auto-generated method stub
			if(role.equals("Server"))
			{
				return 3;}
			else if(role.equals("Admin"))
			{
				return 1;}
			else if(role.equals("Merchant"))
			{
				return 2;}
			else{
				return 0;
		}}});
		
		
		
		
		
	}	@UiHandler("btn_update_User")
	void onBtn_update_UserClick(ClickEvent event) {

		users.setName(txt_FirstName.getText());
		users.setName2(txt_LastName.getText());
		users.setPassword(txt_Password.getText());
		users.setAdresse(txt_Adresse.getText());

		users.setLogin(txt_Username.getText());
		users.setCodepos(txt_PostCode.getText());
		users.setTel1(txt_Phone.getText());

		Window.alert(users.getAdresse());

		users.setMail(txt_Email.getText());
		users.setInterest(txt_Interest.getText());
	    users.setIpadess(txt_ipadess.getText());
	    users.setIpadess1(txt_ipadess1.getText());
		users.setIpadess2(txt_ipadess2.getText());
		users.setIpadess3(txt_ipadess3.getText());
	    users.setRole(cmb_role.getItemText(cmb_role.getSelectedIndex()));
		_service.updateRow(users ,new AsyncCallback<Void>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				AdminSession.lbl_notif.setText("Fail to update from databases");

			}

			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				AdminSession.lbl_notif.setText("Success to update from databases");

			}});
		
		
	}
	@UiHandler("btn_annuler")
	void onBtn_annulerClick(ClickEvent event) {
		_service.selectRowbymail(resps,new AsyncCallback<UsersDTO>() {

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
				txt_role.setText(getRole(cmb_role.getItemText(cmb_role.getItemCount())));

				cmb_role.setItemSelected(getIndexRole(user.getRole()), true);
			}

			private String getRole(String role) {
				// TODO Auto-generated method stub
				if(role.equals("Server"))
				{
					return "Server: Any player who uses our application to make financial transactions";}
				else if(role.equals("Admin"))
				{txt_ipadess.setVisible(false);
				txt_ipadess1.setEnabled(false);
				txt_ipadess2.setEnabled(false);
				txt_ipadess3.setEnabled(false);
					return "Administrator: This is the top player in the application has the right to do all the operations (addition , modification, deletion and consultation)";}
				else{
				txt_ipadess.setVisible(false);
				txt_ipadess1.setEnabled(false);
				txt_ipadess2.setEnabled(false);
				txt_ipadess3.setEnabled(false);
					return "Merchant: Acts as a store manager . It is located below the Administrator in terms of number of access rights.";
			}}
		
		private int getIndexRole(String role) {
			// TODO Auto-generated method stub
			if(role.equals("Server"))
			{
				return 3;}
			else if(role.equals("Admin"))
			{
				return 1;}
			else if(role.equals("Merchant"))
			{
				return 2;}
			else{
				return 0;
		}}});

	}

	private String getRole(String role) {
		// TODO Auto-generated method stub
		if(role.equals("Server"))
		{
			return "Server: Any player who uses our application to make financial transactions";}
		else if(role.equals("Admin"))
		{txt_ipadess.setVisible(false);
		txt_ipadess1.setVisible(false);
		txt_ipadess2.setVisible(false);
		txt_ipadess3.setVisible(false);
			return "Administrator: This is the top player in the application has the right to do all the operations (addition , modification, deletion and consultation)";}
		else{txt_ipadess.setVisible(false);
		txt_ipadess1.setVisible(false);
		txt_ipadess2.setVisible(false);
		txt_ipadess3.setVisible(false);
			return "Merchant: Acts as a store manager . It is located below the Administrator in terms of number of access rights.";
	}}
	
	@UiHandler("cmb_role")
	void onCmb_roleChange(ChangeEvent event) {
		txt_role.setText(getRole(cmb_role.getItemText(cmb_role.getSelectedIndex())));

	}
	@UiHandler("cmb_role")
	void onCmb_roleAttachOrDetach(AttachEvent event) {
		txt_role.setText(getRole(cmb_role.getItemText(cmb_role.getSelectedIndex())));

	}
}