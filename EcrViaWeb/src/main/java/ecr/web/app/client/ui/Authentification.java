package ecr.web.app.client.ui;



import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.MainModule;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.UsersDTO;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Authentification extends Composite  {
		private static AuthentificationUiBinder uiBinder = GWT
			.create(AuthentificationUiBinder.class);
	@UiField
	public Button bnt_login;
	@UiField Button btn_cancel;
	@UiField
	public ListBox cmd_listbox;
	@UiField
	public static TextBox textBox_2;

	
public static String adressip,adressip1,adressip2,adressip3,idcach,adressemail;
private final static UsersServiceAsync _service = GWT.create(UsersService.class);
	interface AuthentificationUiBinder extends
			UiBinder<Widget, Authentification> {
			}
	public Authentification()  {
		initWidget(uiBinder.createAndBindUi(this));
	
		_service.selectAllRows(new AsyncCallback<List<UsersDTO>>() {


			public void onFailure(Throwable caught) {
					DialogBox dlg = new MessageBox("fail");
					dlg.setPopupPosition(405, 318);
					dlg.show();
			}

			public void onSuccess(List<UsersDTO> result) {
				for (int i=0; i < result.size() ; i++) {
					cmd_listbox.addItem(result.get(i).getRole().toString()+" "+result.get(i).getLogin().toString());
								}
			}
		});
		showPrompt();
		}

private void Login(){
	int index =cmd_listbox.getSelectedIndex();
	String Login=cmd_listbox.getItemText(index);
	String espaces = " ";
	_service.getUserByIDPASS(Login.substring(Login.indexOf(espaces),Login.length()).trim(), textBox_2.getText(),new AsyncCallback<UsersDTO>() {
	
		public void onFailure(Throwable caught) {
			DialogBox dlg = new MessageBox("Failed to Authentification");
			dlg.setPopupPosition(405, 318);
			dlg.show();
			textBox_2.setText("");
		
		}

			public void onSuccess(UsersDTO user) {
				   adressip=user.getIpadess();
			       adressip1=user.getIpadess1();
			       adressip2=user.getIpadess2();
			       adressip3=user.getIpadess3();
			       idcach=String.valueOf(user.getIdcash());
				   adressemail=user.getMail();

			      if (user.getRole().equals("Server"))  
			      {	MainModule.panel_auto.clear();
			      MainModule.panel_auto.setHeight("60px");
			      ServerSession stat = new ServerSession();

			       MainModule.panel_auto.add(stat);
			       ServerSession.username.setText(user.getRole()+" "+user.getName());
			  	      
			       ServerSession.imageuser.setUrl(user.getImage().trim());
			       ServerSession.imageuser.setSize("50px", "50px");
			 	   } 	 
			      
			      else if (user.getRole().equals("Merchant")) {
			    	  
			    	  MainModule.panel_auto.clear();
				      MainModule.panel_auto.setHeight("60px");
				      MerchantSession Menu_merchant =new MerchantSession();
				      MainModule.panel_auto.add(Menu_merchant);
				      MerchantSession.username.setText(user.getRole()+" "+user.getName());
			  	      
				      MerchantSession.imageuser.setUrl(user.getImage().trim());
				      MerchantSession.imageuser.setSize("50px", "50px"); 

							    	  			    	  
			    	  						}
			      else if (user.getRole().equals("Admin")) {
						
			     	  MainModule.panel_auto.clear();
				      MainModule.panel_auto.setHeight("60px");
				      AdminSession Menu_admin =new AdminSession();
				      MainModule.panel_auto.add(Menu_admin);
				      AdminSession.username.setText(user.getRole()+" "+user.getName());

				      AdminSession.imageuser.setUrl(user.getImage().trim());
				      AdminSession.imageuser.setSize("50px", "50px");
					      
			      }
			      
			
		}
			
	});
	
	
}
	
	@UiHandler("bnt_login")
	void onBnt_loginClick(ClickEvent event) {
		Login();
	}
	@UiHandler("btn_cancel")
	void onBtn_cancelClick(ClickEvent event) {
		textBox_2.setText("");
        textBox_2.setFocus(true);
		cmd_listbox.setSelectedIndex(0);
		}

	@UiHandler("textBox_2")
	void onTextBox_2KeyPress(KeyPressEvent event) {
		 if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_TAB)
	        {  hidePrompt();
	        textBox_2.setFocus(true);
}
	        else if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER){
			 Login();
				 
		 }
	
		
	   }
	 public void showPrompt()
	    {
		 textBox_2.addStyleName("style.prompt");
	     textBox_2.setText("please enter your password");
	    }
	 
	    public void hidePrompt()
	    {
	    	textBox_2.setText(null);
	    	textBox_2.removeStyleName("prompt");
			textBox_2.setFocus(true);

	    }
	@UiHandler("textBox_2")
	void onTextBox_2MouseDown(MouseDownEvent event) {
		hidePrompt();
		textBox_2.setFocus(true);

	}
	 @UiHandler("lien")
	    void onMyScriptedAnchorClick(ClickEvent event) {
			DialogBox dlg = new GetPassword();
			dlg.setPopupPosition(450, 285);
			dlg.show();
			//dlg.center();
	    }
	 @UiHandler("lienhome")
	    void onMyScriptedAnchor1Click(ClickEvent event) {
		    MainModule.panel_auto.clear();
			Authentification auto=new Authentification();
		    auto.setHeight("40px");
			MainModule.panel_auto.add(auto);
	    }
	 @UiHandler("lienreply")
	    void onMyScriptedAnchor2Click(ClickEvent event) {
			hidePrompt();
			textBox_2.setFocus(true);
	    }
	 
	 }

	
	

