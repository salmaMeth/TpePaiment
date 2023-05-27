package ecr.web.app.client.ui;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.VerticalPanel;

import ecr.web.app.client.services.OptionService;
import ecr.web.app.client.services.OptionServiceAsync;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.OptionDTO;
import ecr.web.app.shared.dto.TerminalDTO;
import ecr.web.app.shared.dto.UsersDTO;
import com.google.gwt.user.client.ui.TextBox;

public class OptionGen extends Composite  {
	CellList<UsersDTO> personList;
	 MyCellRenderer myCellRenderer;
	private static OptionGenUiBinder uiBinder = GWT
	.create(OptionGenUiBinder.class);
	@UiField VerticalPanel vp1;
	@UiField Button btn_save ,bnt_Upload;
	@UiField Button btn_cancel;
	@UiField TextBox txt_name;
	@UiField  TextBox txt_mail,txt_passwordmail;

	@UiField
	static TextArea txt_entete;
	@UiField TextArea txt_pied;

	OptionDTO option = new OptionDTO();

	private final OptionServiceAsync _serviceoption = GWT.create(OptionService.class);

	interface OptionGenUiBinder extends UiBinder<Widget, OptionGen> {
	}

	@SuppressWarnings("unchecked")
	public OptionGen() {
		initWidget(uiBinder.createAndBindUi(this));

		_serviceoption.selectAllRows(new AsyncCallback<List<OptionDTO>>(){ 
				public void onFailure(Throwable caught) {
										
				}

				public void onSuccess(List<OptionDTO> option) {
					for(int i=0; i<option.size();i++){
               	    txt_entete.setText(option.get(i).getEntete());
               		txt_pied.setText(option.get(i).getPied());
               		txt_name.setText(option.get(i).getName());
               		txt_mail.setText(option.get(i).getMail());
               		txt_passwordmail.setText(option.get(i).getPasswordmail());
				}}});
		btn_cancel.setStyleName("btn btn-danger");
		bnt_Upload.setStyleName("btn btn-info");
		btn_save.setStyleName("btn btn-primary");
	
	}
	
	@UiHandler("btn_save")
	void onBtn_saveClick(ClickEvent event) {
		option.setEntete(txt_entete.getText());
		option.setPied(txt_pied.getText());
		option.setName(txt_name.getText());
		option.setMail(txt_mail.getText());
		option.setPasswordmail(txt_passwordmail.getText());


		_serviceoption.selectAllRows(new AsyncCallback<List<OptionDTO>>(){ 
				public void onFailure(Throwable caught) {
					_serviceoption.insertRow(option, new AsyncCallback<Void>() {
						
						public void onFailure(Throwable caught) {
							AdminSession.lbl_notif.setText("fail");
											}

						public void onSuccess(Void option) {
							AdminSession.lbl_notif.setText("Success");							
						}
					});
		}
				
                 public void onSuccess(List<OptionDTO> option) {
                	 for(int i=0; i<option.size();i++){
                		 option.get(i).setEntete(txt_entete.getText());
                		 option.get(i).setPied(txt_pied.getText());
                		 option.get(i).setName(txt_name.getText());
                	     option.get(i).setMail(txt_mail.getText());
                		 option.get(i).setPasswordmail(txt_passwordmail.getText());

                		_serviceoption.updateRow(option.get(i),new AsyncCallback<Void>() {
                	    						
    						public void onFailure(Throwable caught) {
    							AdminSession.lbl_notif.setText("fail");
    						
    									}

    						public void onSuccess(Void option) {
    							AdminSession.lbl_notif.setText("Success");
    						}
    					});	 
                	 }
				}
});

		
	}
	@UiHandler("btn_cancel")
	void onBtn_cancelClick(ClickEvent event) {
		txt_entete.setText("");
		txt_pied.setText("");
	    txt_name.setText("");
	    txt_mail.setText("");
	    txt_passwordmail.setText("");
	    _serviceoption.selectAllRows(new AsyncCallback<List<OptionDTO>>(){ 
			public void onFailure(Throwable caught) {
									
			}

			public void onSuccess(List<OptionDTO> option) {
				for(int i=0; i<option.size();i++){
           	    txt_entete.setText(option.get(i).getEntete());
           		txt_pied.setText(option.get(i).getPied());
           		txt_name.setText(option.get(i).getName());
           		txt_mail.setText(option.get(i).getMail());
           		txt_passwordmail.setText(option.get(i).getPasswordmail());

			}}});}
	}

