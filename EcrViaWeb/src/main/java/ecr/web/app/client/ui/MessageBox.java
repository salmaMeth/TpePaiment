package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class MessageBox extends DialogBox {
	@UiField
	public 	Button bnt_ok;
	@UiField
	public 	Label  lbl_infos;
	
	private static MessageBoxUiBinder uiBinder = GWT
			.create(MessageBoxUiBinder.class);

	interface MessageBoxUiBinder extends UiBinder<Widget, MessageBox> {
	}

	public MessageBox(String infos ) {
		setWidget(uiBinder.createAndBindUi(this));
		bnt_ok.setStyleName("btn btn-primary");
		lbl_infos.setText(infos);

			}

	@UiHandler("bnt_ok")
	void onBnt_okClick(ClickEvent event) {
		this.hide();
		Authentification.textBox_2.setFocus(true);
	}
	@UiHandler("bnt_ok")
	void onTextBox_2KeyPress(KeyPressEvent event) {
	
	  if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER){
		  
			this.hide();

				 
		 }
	
		
	   }
}
