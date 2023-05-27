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

public class TabTerminal extends Composite {
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button btn_termtab;
	private static TabTerminalUiBinder uiBinder = GWT
			.create(TabTerminalUiBinder.class);

	interface TabTerminalUiBinder extends UiBinder<Widget, TabTerminal> {
	}

	public TabTerminal() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_addtab.setStyleName("btn");
		btn_termtab.setStyleName("btn");
		tabpanel.add(new ConslTerminal());
	}
	@UiHandler("btn_addtab")
	void onBtn_addtabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new AjouTerminal() );
	}
	@UiHandler("btn_termtab")
	void onBtn_termitabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new ConslTerminal());
	}
	
}
