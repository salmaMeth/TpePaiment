package ecr.web.app.client.ui;

import java.util.List;
import java.util.Properties;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.AdressMailService;
import ecr.web.app.client.services.AdressMailServiceAsync;
import ecr.web.app.client.services.MessageServices;
import ecr.web.app.client.services.MessageServicesAsync;
import ecr.web.app.client.services.OptionService;
import ecr.web.app.client.services.OptionServiceAsync;
import ecr.web.app.shared.dto.AdressMailDTO;
import ecr.web.app.shared.dto.OptionDTO;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AdressMailSetting extends Composite {
	@UiField SimplePager simple_pdt;
	Range range;
	List<AdressMailDTO> sub;
	public static String id_dicsount;
	AsyncDataProvider<AdressMailDTO> DataProvider;
	@UiField CellTable <AdressMailDTO> cellTable;
	static String mail,password;
    private final AdressMailServiceAsync _service = 
    		GWT.create(AdressMailService.class);
    private final MessageServicesAsync _service1 =
            GWT.create(MessageServices.class);
	private final OptionServiceAsync _serviceoption = GWT.create(OptionService.class);

	private static AdressMailSettingUiBinder uiBinder = GWT
			.create(AdressMailSettingUiBinder.class);

	interface AdressMailSettingUiBinder extends
			UiBinder<Widget, AdressMailSetting> {
	}

	public AdressMailSetting() {
		initWidget(uiBinder.createAndBindUi(this));
		_serviceoption.selectAllRows(new AsyncCallback<List<OptionDTO>>(){ 
			public void onFailure(Throwable caught) {
									
			}

			public void onSuccess(List<OptionDTO> option) {
				for(int i=0; i<option.size();i++){
           	
           		mail = option.get(i).getMail();
           		password=option.get(i).getPasswordmail();
			}}});
		
		
	}



	@UiHandler("Container")
	void onContainerAttachOrDetach(AttachEvent event) {
		TextColumn<AdressMailDTO> txtCol_Mail = new TextColumn<AdressMailDTO>() {
			@Override
			public String getValue(AdressMailDTO object) {
				return String.valueOf(object.getAdressmail()) ;
			}
		};cellTable.addColumn(txtCol_Mail, "Email Adress");
		cellTable.setColumnWidth(txtCol_Mail, 20.0, Unit.PCT);
	

	
		ButtonCell addButton = new ButtonCell() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					SafeHtml data, SafeHtmlBuilder sb) {
				// TODO Auto-generated method stub
				Image addImg = new Image("images/details.png");
				addImg.setPixelSize(30,30);
				sb.appendHtmlConstant(addImg.toString());
				
			}
		};		
	    Column <AdressMailDTO,String> addMessage= new Column <AdressMailDTO,String>(addButton)
	    {
	        @Override
	        public String getValue(AdressMailDTO c) 
	        {
	            return "Descreption User";
	            
	        }
	    };

	    addMessage.setFieldUpdater(new FieldUpdater<AdressMailDTO,String>()
	  
	    	    {
	    	        public void update(int index, AdressMailDTO resp,String value) 
	    	        {

	    	        	DialogBox dlg = new UserProfile(resp);
	    	        	dlg.setPopupPosition(300,176);
	    	                              dlg.show();
                     
	    	        } });	

		cellTable.addColumn(addMessage, "Descreption User");
		cellTable.setColumnWidth(addMessage, 10.0, Unit.PCT);
		
		 ButtonCell SendMessage = new ButtonCell() {
				@Override
				public void render(com.google.gwt.cell.client.Cell.Context context,
						SafeHtml data, SafeHtmlBuilder sb) {
					// TODO Auto-generated method stub
					Image addImg = new Image("images/message.png");
					addImg.setPixelSize(40, 30);
					sb.appendHtmlConstant(addImg.toString());
					
				}
			};		
		    Column <AdressMailDTO,String> SendMail= new Column <AdressMailDTO,String>(SendMessage)
		    {
		        @Override
		        public String getValue(AdressMailDTO c) 
		        {
		            return "Send Message";
		            
		        }
		    };

		    SendMail.setFieldUpdater(new FieldUpdater<AdressMailDTO,String>()
		  
		    	    {
		    	        public void update(int index, AdressMailDTO resp,String value) 
		    	        {
		    	        	
		    	        	
		    	        	
		    	        	
		    	        	
		    	        	_service1.sendMail("Your Password is:070304",mail, resp.getAdressmail(), "Ecr:Get Your Password", mail,password, new AsyncCallback<java.lang.String> (){

								public void onFailure(Throwable caught) {
									// TODO Auto-generated method stub
									
								}

								public void onSuccess(String result) {
									// TODO Auto-generated method stub
									AdminSession.lbl_notif.setText("");
									if(result.equals("null"))
									{AdminSession.lbl_notif.setText("Your email is sent");}
									else{
										AdminSession.lbl_notif.setText(result);}
									
								}
		    	        
		    	        	});
		    	        
		    	        
		    	        } });	

			cellTable.addColumn(SendMail, "Send Message");
			 cellTable.setColumnWidth(SendMail, 10.0, Unit.PCT);
			
		 
		   simple_pdt.setDisplay(cellTable);
			addtable();
		}

		public void addtable() {
			DataProvider = new AsyncDataProvider<AdressMailDTO>() {

				@Override
				protected void onRangeChanged(HasData<AdressMailDTO> display) {
					range = display.getVisibleRange();
					_service.selectAllRows(new AsyncCallback<List<AdressMailDTO>>() {

						public void onFailure(Throwable caught) {
							MerchantSession.lbl_notif.setText("fail");
						}

						public void onSuccess(List<AdressMailDTO> result) {
							if (result != null && !result.isEmpty()) {
								int start = range.getStart();
								int end = start + range.getLength();
								end = end >= result.size() ? result.size() : end;
								sub = result.subList(start, end);

								updateRowData(start, sub);
							} else {
								MerchantSession.lbl_notif.setText("No Obj_defs stored in the database.");
							}
							updateRowCount(result.size(), true);
						}
					});

				}
			};

			DataProvider.addDataDisplay(cellTable);

		}
		

		}


