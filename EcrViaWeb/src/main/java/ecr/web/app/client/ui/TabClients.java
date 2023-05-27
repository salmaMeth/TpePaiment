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
import com.google.gwt.user.client.ui.Widget;

public class TabClients extends Composite  {
	
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button btn_clienttab;
	private static TabClientsUiBinder uiBinder = GWT
			.create(TabClientsUiBinder.class);

	interface TabClientsUiBinder extends UiBinder<Widget, TabClients> {
	}

	public TabClients() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_addtab.setStyleName("btn");
		btn_clienttab.setStyleName("btn");
		
		tabpanel.add(new ConsltClient());
	}
	@UiHandler("btn_addtab")
	void onBtn_addtabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new AjoutClient() );
	}
	@UiHandler("btn_clienttab")
	void onBtn_clientabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new ConsltClient());
	}
	
}
