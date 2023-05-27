package ecr.web.app.client.ui;



import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.ShiftService;
import ecr.web.app.client.services.ShiftServiceAsync;
import ecr.web.app.shared.dto.ShiftDTO;




public class serverMenu extends Composite {

HTMLPanel container=null ;
private static MenuUiBinder uiBinder = 
GWT.create(MenuUiBinder.class);
 @UiField
public static Label  lbl_shift;
private final ShiftServiceAsync _serviceshift = GWT.create(ShiftService.class);

	interface MenuUiBinder extends UiBinder<Widget, serverMenu> {
		
	}

	public serverMenu(HTMLPanel panel)  {
	
		initWidget(uiBinder.createAndBindUi(this));
		container=panel;

		CachRegisterServer  Big = new CachRegisterServer();
		container.clear();
		container.add(Big);

    	_serviceshift.getShiftbyCaisse(Long.valueOf(Authentification.idcach.trim()), (new AsyncCallback<List<ShiftDTO>>()
				
				{

		public void onFailure(Throwable arg0) {
			
		}

		public void onSuccess(final List<ShiftDTO> shift) {
					if (shift.isEmpty())
						{
						serverMenu.lbl_shift.setText("1");
						ServerSession.lbl_shift.setText("1");

						
						}
					else{
	        serverMenu.lbl_shift.setText(String.valueOf(Long.valueOf(shift.get( shift.size()-1).getNum_shift())+1));
	       ServerSession.lbl_shift.setText(String.valueOf(Long.valueOf(shift.get( shift.size()-1).getNum_shift())+1));
					}
				
			}} ));
		
	//	lbl_connect.setText(new Date().toGMTString());
    	ServerSession.viewprofile.addClickHandler( new ClickHandler()
	    { 
	        public void onClick( ClickEvent event ) { 
	        	container.clear();
	    		container.add(new ViewProfil(Authentification.adressemail));
	        	
	        	
	        	
	        }});
    	ServerSession.editprofile.addClickHandler( new ClickHandler()
	    { 
	        public void onClick( ClickEvent event ) { 
	        	container.clear();
	    		container.add(new EditProfil(Authentification.adressemail));
	        	
	        	
	        	
	        }});
		
}

	public serverMenu()  {
		initWidget(uiBinder.createAndBindUi(this));
		
}

	@UiHandler("lbl_Start")
	void onLbl_StartClick(ClickEvent event)  {
		CachRegisterServer  Big = new CachRegisterServer();
		container.clear();
		container.add(Big);
				
	}
	@UiHandler("lbl_Histo")
	void onLbl_HistoClick(ClickEvent event) {
		Historique  Hts = new Historique();
		container.clear();
		container.add(Hts);
	}
	@UiHandler("lbl_Caisse")
	void onLbl_CaisseClick(ClickEvent event) {
		container.clear();
		container.add(new GestionCaisse());

	}
	@UiHandler("lbl_Config")
	void onLbl_ConfigClick(ClickEvent event) {
		ConsultClientServ  Cts = new ConsultClientServ();
		container.clear();
		container.add(Cts);
	}


}
