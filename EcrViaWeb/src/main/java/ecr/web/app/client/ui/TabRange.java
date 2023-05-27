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

public class TabRange extends Composite {
	
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button btn_rangetab;
	private static TabRangeUiBinder uiBinder = GWT
			.create(TabRangeUiBinder.class);

	interface TabRangeUiBinder extends UiBinder<Widget, TabRange> {
	}

	public TabRange() {
		initWidget(uiBinder.createAndBindUi(this));
		btn_addtab.setStyleName("btn");
		btn_rangetab.setStyleName("btn");
	    tabpanel.add(new ConslRayons());
}
@UiHandler("btn_addtab")
void onBtn_addtabClick(ClickEvent event) {
	tabpanel.clear();
	tabpanel.add(new AjoutRayon());
}
@UiHandler("btn_rangetab")
void onBtn_rangetabClick(ClickEvent event) {
	tabpanel.clear();
	tabpanel.add(new ConslRayons());
}

}

