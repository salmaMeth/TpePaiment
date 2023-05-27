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

import ecr.web.app.shared.dto.AdressMailDTO;

public class AdminMenu extends Composite  {

	private static MerhantMenuUiBinder uiBinder = GWT
			.create(MerhantMenuUiBinder.class);
	HTMLPanel container=null ;

	interface MerhantMenuUiBinder extends UiBinder<Widget, AdminMenu> {
	}

	public AdminMenu(HTMLPanel panel) {
		panel.clear();
		panel.add(new TabGestionCash() );
		container=panel;
		AdminSession.viewprofile.addClickHandler( new ClickHandler()
	    { 
	        public void onClick( ClickEvent event ) { 
	        	container.clear();
	    		container.add(new ViewProfil(Authentification.adressemail));
	        	
	        	
	        	
	        }});
		AdminSession.editprofile.addClickHandler( new ClickHandler()
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
		container.add(new TabGestionCash());
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
	@UiHandler("lbl_statis")
	void onLbl_statiClick(ClickEvent event) {
		container.clear();
		container.add(new TabStatistics());	

	}
	@UiHandler("lbl_discounts")
	void onLbl_discountsClick(ClickEvent event) {
		container.clear();
	}
	
}
