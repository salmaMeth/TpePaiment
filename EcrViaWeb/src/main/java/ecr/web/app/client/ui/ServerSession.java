package ecr.web.app.client.ui;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.dom.client.ClickEvent;

import ecr.web.app.client.MainModule;
import ecr.web.app.client.services.MyStyle;
import ecr.web.app.client.services.TooltipListener;

public class ServerSession extends Composite {

	private static DemarrerUiBinder uiBinder = GWT
			.create(DemarrerUiBinder.class);
	 @UiField
	  public static Label username;
	 @UiField
	  public static Image  imageuser;
	 @UiField
	    public static Button  logoutaction;

	 @UiField
	public static 	HTMLPanel zone_menu;
	 @UiField
	public HTMLPanel panel01;
		HTMLPanel zone;
		 @UiField
			public static ListBox cmd_ipterminal;
		 @UiField
			public static Button btn_status;
		 @UiField
			public static Button bnt_esc;
		 
		 @UiField
			public static Button btn_payer;
		 @UiField
			public static Button  btn_print;
		 @UiField
			public static Button  btn_ecpese;	 
		 @UiField
			public static Button  btn_client;
		 @UiField
			public static Label  lbl_shift;
		 @UiField
			public static Label  lbl_idcash,editprofile,viewprofile;
		 @UiField
		 public static Label lbl_output;
		 @UiField 
		 public static Label lbl_state;
		 @UiField
		 static Label lbl_unkuser;
		 @UiField
		 public static Label lbl_notif;
		 @UiField
			MyStyle style;
		 @UiField
		 public static Label lbl_time;
		 @UiField
		 public static Label lbl_clock;
		 
	
	interface DemarrerUiBinder extends UiBinder<Widget, ServerSession> {
	}

	@SuppressWarnings("deprecation")
	public ServerSession()  {
		initWidget(uiBinder.createAndBindUi(this));
		
		serverMenu menu= new serverMenu(panel01);
		zone_menu.add(menu);
		lbl_idcash.setText(Authentification.idcach);
	
	
		Timer t = new Timer() {
	        int count = 0; //60 seconds
	      public void run() {
	    	  lbl_time.setText("opened since: " + Integer.toString(count) + "s.");
	        count++;
	      if(count==216000) {
		    	  lbl_time.setText("opened since: " + Integer.toString(1) + "h."+Integer.toString(988888888-216000) + "h.");
	            //this.cancel(); //cancel the timer -- important!
	        }
	      }
	    };

	    // Schedule the timer to run once every second, 1000 ms.
	    t.scheduleRepeating(1000); //
	    
	    lbl_clock.setText(new Date().toGMTString()) ;
	    
	    
	    
	    
	}
	@UiHandler("panel01")
	void onPanel01AttachOrDetach(AttachEvent event) {
		
		
	}
	@UiHandler("logoutaction")
	void onLogoutactionClick(ClickEvent event) {
		MainModule.panel_auto.clear();
		Authentification auto=new Authentification();
	    auto.setHeight("40px");
		MainModule.panel_auto.add(auto);
	    
	}
	   
  /*  private static native void bind()-{
	$(function  showHideMenu()
	{
	if($('#menu').css('display') == 'none')
	{
	$('#menu').css('display', 'block');
	}
	else
	{
	$('#menu').css('display', 'none');
	}
	});
    }-;*/  
    @UiHandler("lienhome")
    void onMyScriptedAnchor1Click(ClickEvent event) {
	    MainModule.panel_auto.clear();
		Authentification auto=new Authentification();
	    auto.setHeight("40px");
		MainModule.panel_auto.add(auto);
    }
    
}