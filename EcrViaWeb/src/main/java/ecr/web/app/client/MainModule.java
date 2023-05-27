package ecr.web.app.client ;





import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import ecr.web.app.client.ui.Authentification;





/**
 * Entry point.
 */
public class MainModule implements EntryPoint {
	Authentification auto=new Authentification();
	public static HTMLPanel panel_auto = new HTMLPanel("");
	public static HTMLPanel container = new HTMLPanel("");
	public static VerticalPanel verticalPanel = new VerticalPanel();
  public void onModuleLoad() {
	  

		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("100%", "100%");
		
		rootPanel.add(verticalPanel, 0, 0);
		verticalPanel.setSize("1165px", "380px");
	
		
		verticalPanel.add(panel_auto);
		  panel_auto.add(auto);
	      auto.setHeight("379px");

		 
	
	      
  }

}
  
  
 


