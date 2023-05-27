package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class MerhantMenu extends Composite  {

	private static MerhantMenuUiBinder uiBinder = GWT
			.create(MerhantMenuUiBinder.class);
	HTMLPanel container=null ;

	interface MerhantMenuUiBinder extends UiBinder<Widget, MerhantMenu> {
	}

	public MerhantMenu(HTMLPanel panel) {
		TabUsers  tabuser = new TabUsers();
		panel.clear();
		panel.add(tabuser);
		container=panel;
		MerchantSession.viewprofile.addClickHandler( new ClickHandler()
	    { 
	        public void onClick( ClickEvent event ) { 
	        	container.clear();
	    		container.add(new ViewProfil(Authentification.adressemail));
	        	
	        	
	        	
	        }});
		MerchantSession.editprofile.addClickHandler( new ClickHandler()
	    { 
	        public void onClick( ClickEvent event ) { 
	        	container.clear();
	    		container.add(new EditProfil(Authentification.adressemail));
	        	
	        	
	        	
	        }});
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	@UiHandler("lbl_Produit")
	void onLbl_ProduitClick(ClickEvent event) {
	    
		container.clear();
		container.add(new TabProducts());
	}
	@UiHandler("lbl_Compte")
	void onLbl_CompteClick(ClickEvent event) {
		container.clear();
		container.add(new TabUsers());
		
	}
	@UiHandler("lbl_Caisse")
	void onLbl_CaisseClick(ClickEvent event) {
		container.clear();
		container.add(new TabCach());
	}
	@UiHandler("lbl_clts")
	void onLbl_cltsClick(ClickEvent event) {
	    
		container.clear();
		container.add(new TabClients());
	}
	@UiHandler("lbl_rayon")
	void onLbl_rayonClick(ClickEvent event) {
   
		container.clear();
		container.add(new TabRange());	
	}
	@UiHandler("lbl_Four")
	void onLbl_FourClick(ClickEvent event) {
    
		container.clear();
		container.add(new TabProvider());
	}
	@UiHandler("lbl_Param")
	void onLbl_ParamClick(ClickEvent event) {
   
		container.clear();
		container.add(new TabSetting());
		
	}
	@UiHandler("lbl_terminal")
	void onLbl_terminalClick(ClickEvent event) {
				container.clear();
				container.add(new TabTerminal());

				
	}

}
