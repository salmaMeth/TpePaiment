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
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.AdressMailService;
import ecr.web.app.client.services.AdressMailServiceAsync;
import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.shared.dto.AdressMailDTO;
import ecr.web.app.shared.dto.ProductsDTO;

public class GetPassword extends DialogBox {

	@UiField
	public 	Button bnt_send;
	@UiField
	public Button bnt_cancle;
	@UiField
	public TextBox txt_mail;

	@UiField
	public Label  lbl_error;
	
	
	  private final AdressMailServiceAsync ServiceAdressMail = GWT.create(AdressMailService.class);

	private static GetPasswordUiBinder uiBinder = GWT
			.create(GetPasswordUiBinder.class);

	interface GetPasswordUiBinder extends UiBinder<Widget, GetPassword> {
	}

	public GetPassword() {
		setWidget(uiBinder.createAndBindUi(this));
		bnt_send.setStyleName("btn btn-primary");
		bnt_cancle.setStyleName("btn btn-danger");
		showPrompt();

	}

	@UiHandler("bnt_send")
	void onBnt_sendClick(ClickEvent event) {
		getmail();
 	   txt_mail.setFocus(true);

	}	
	@UiHandler("bnt_cancle")
	void onBnt_cancelClick(ClickEvent event) {
this.hide();
}
	 
	public static boolean isValid(String email)
	{
		if(email.trim().length()>0 )
			return email.matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$");
		return false;
			}
	@UiHandler("txt_mail")
	void onTextBox_2KeyPress(KeyPressEvent event) {
		 if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_TAB)
	        {  hidePrompt();
	    	   txt_mail.setFocus(true);
	        }
	        else if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER){
	        	getmail();

		 }
	
		
	   }
	 public void showPrompt()
	    {
		 txt_mail.addStyleName("style.prompt");
		 txt_mail.setText("please enter your adress mail");
	    }
	 
	    public void hidePrompt()
	    {
	    	txt_mail.setText(null);
	    	txt_mail.removeStyleName("prompt");
	    	txt_mail.setFocus(true);

	    }
	@UiHandler("txt_mail")
	void onTextBox_2MouseDown(MouseDownEvent event) {
		hidePrompt();

	}
	public void getmail(){
		String  MailAdress  =txt_mail.getText();
		final AdressMailDTO AdressMail= new AdressMailDTO();
		AdressMail.setAdressmail(MailAdress.trim());
		if (isValid(MailAdress))
		{
		ServiceAdressMail.insertRow(AdressMail,new AsyncCallback<Void>() {
				
			public void onFailure(Throwable caught) {
					
			
			}

			public void onSuccess(Void result) {
			
		    	txt_mail.setFocus(true);

				hidePrompt();
				lbl_error.setText("");
						}
		});
		}
			
		
		else{
			if(MailAdress.isEmpty())
			{lbl_error.setText("");
			hidePrompt();
				lbl_error.setText("Please enter your Adress mail");
		    	txt_mail.setFocus(true);

			}
			else{
				hidePrompt();
				lbl_error.setText("");
		    	txt_mail.setFocus(true);

			lbl_error.setText("Please verify your Adress mail");
			}
		}
	}
}
