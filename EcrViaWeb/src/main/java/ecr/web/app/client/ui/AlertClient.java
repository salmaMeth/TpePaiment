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
import ecr.web.app.shared.dto.ClientDTO;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AlertClient extends DialogBox {
	private final ClientServiceAsync serviceClient = 
			 GWT.create(ClientService.class);
	private static final Binder binder = GWT.create(Binder.class);
    interface Binder extends UiBinder<Widget, AlertClient> {
    }
    public AlertClient() {
        setWidget(binder.createAndBindUi(this));
        showPrompt();
        btn_search.setStyleName("btn btn-primary");
		btn_canncel.setStyleName("btn btn-danger");
    }
    @UiField
	  MyStyle style;
	@UiField 
	Button btn_search;
	@UiField 
	Button btn_canncel;
	@UiField 
	TextBox txt_search;
	@UiField Image image;
	 long entier;
		public static ClientDTO	Newclient;
	 
	@UiHandler("btn_search")
	void onBtn_searchClick(ClickEvent event) {
		
		getcard();
		
	}
void getcard(){
	try {
	    entier = Long.parseLong(txt_search.getText());
	    serviceClient.getClientById(entier,(new AsyncCallback<ClientDTO>() {
			
			public void onSuccess(ClientDTO client) {
				
					//Start.txt_ticket.setText(String.valueOf(arg0.getCardid()));
				image.setUrl("");

				image.setUrl(client.getImage().trim());
     		     image.setSize("70px", "50px");
			     
				ServerSession.lbl_unkuser.setText(client.getName()+" "+"Loyalty points:"+" "+client.getLoyality());
				ServerSession.lbl_unkuser.setStyleName(style.success());
				txt_search.setText("");
				ServerSession.lbl_notif.setText("");
				Newclient=client;

			}

			public void onFailure(Throwable arg0) {
				// TODO Auto-generated method stub
				image.setUrl("");

				 ServerSession.lbl_unkuser.setText("Unknow client");
				ServerSession.lbl_unkuser.setStyleName(style.ERROR());
				txt_search.setText("");
				}
			}));
	} catch (NumberFormatException nfe) {
		image.setUrl("");

		ServerSession.lbl_notif.setText("Please enter a valid card number");
		ServerSession.lbl_notif.setStyleName(style.ERROR());
		txt_search.setText("");
	}
	
	
}
	@UiHandler("btn_canncel")
	void onBtn_canncelClick(ClickEvent event) {
	    hide();
	}
	 public void showPrompt()
	    {
		 txt_search.addStyleName("style.prompt");
		 txt_search.setText("please enter IDCard client");
	    }
	 
	    public void hidePrompt()
	    {		

	    	txt_search.setText(null);
	    	txt_search.removeStyleName("prompt");
	    }
	@UiHandler("txt_search")
	void onTextBox_2MouseDown(MouseDownEvent event) {
		hidePrompt();
	}
	@UiHandler("txt_search")
	void onTextBox_2KeyPress(KeyPressEvent event) {
		 if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_TAB)
	        {  hidePrompt();}
	        else if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER){
	        //	if(txt_search.getText().||txt_search.getText().isEmpty())
	        	getcard();
				 
		 }
	
		
	   }
	
	
}