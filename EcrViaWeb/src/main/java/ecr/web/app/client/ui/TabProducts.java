package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class TabProducts extends Composite {
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button btn_productab;
	private static TabProductsUiBinder uiBinder = GWT
			.create(TabProductsUiBinder.class);

	interface TabProductsUiBinder extends UiBinder<Widget, TabProducts> {
	}

	public TabProducts() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_addtab.setStyleName("btn");
		btn_productab.setStyleName("btn");
		tabpanel.add(new ConsultProduct());
	}
	@UiHandler("btn_addtab")
	void onBtn_addtabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new AjoutPts() );
	}
	@UiHandler("btn_productab")
	void onBtn_usertabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new ConsultProduct());
	}
	
}
