package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.MainModule;

public class MerchantSession extends Composite {

	private static MerchantSessionUiBinder uiBinder = GWT
			.create(MerchantSessionUiBinder.class);
	 @UiField
	  public static Label username,lbl_notif,editprofile,viewprofile;;
	 @UiField
	  public static Image  imageuser;
	 @UiField
	    public static Button  logoutaction;

	 @UiField
	public static 	HTMLPanel zone_menu;
	 @UiField
	public HTMLPanel panel01;
		HTMLPanel zone;
	interface MerchantSessionUiBinder extends UiBinder<Widget, MerchantSession> {
	}

	public MerchantSession() {
		initWidget(uiBinder.createAndBindUi(this));
		MerhantMenu menu= new MerhantMenu(panel01);
		zone_menu.add(menu);
		}
	@UiHandler("logoutaction")
	void onLogoutactionClick(ClickEvent event) {
		MainModule.panel_auto.clear();
		Authentification auto=new Authentification();
	    auto.setHeight("40px");
		MainModule.panel_auto.add(auto);
	    
	}
	 @UiHandler("lienhome")
	    void onMyScriptedAnchor1Click(ClickEvent event) {
		    MainModule.panel_auto.clear();
			Authentification auto=new Authentification();
		    auto.setHeight("40px");
			MainModule.panel_auto.add(auto);
	    }
	
}
