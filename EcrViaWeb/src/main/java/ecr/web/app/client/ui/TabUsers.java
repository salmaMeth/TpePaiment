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

public class TabUsers extends Composite {
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button btn_usertab;
	private static TabUsersUiBinder uiBinder = GWT
			.create(TabUsersUiBinder.class);
	interface TabUsersUiBinder extends UiBinder<Widget, TabUsers> {
		
	}

	public TabUsers() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_addtab.setStyleName("btn");
		btn_usertab.setStyleName("btn");
		tabpanel.add(new ConsltUser());
	}
	@UiHandler("btn_addtab")
	void onBtn_addtabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new AjoutUser() );
	}
	@UiHandler("btn_usertab")
	void onBtn_usertabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new ConsltUser());
	}
	
}
