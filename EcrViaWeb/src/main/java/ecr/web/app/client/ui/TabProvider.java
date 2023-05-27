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

public class TabProvider extends Composite  {
	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_addtab;
	@UiField
	Button 	btn_provitab;
	private static TabProviderUiBinder uiBinder = GWT
			.create(TabProviderUiBinder.class);

	interface TabProviderUiBinder extends UiBinder<Widget, TabProvider> {
	}

	public TabProvider() {
		initWidget(uiBinder.createAndBindUi(this));
	

	btn_addtab.setStyleName("btn");
	btn_provitab.setStyleName("btn");
	tabpanel.add(new ConsultProvider());
}
@UiHandler("btn_addtab")
void onBtn_addtabClick(ClickEvent event) {
	tabpanel.clear();
	tabpanel.add(new AjoutProvider() );
}
@UiHandler("btn_provitab")
void onBtn_providertabClick(ClickEvent event) {
	tabpanel.clear();
	tabpanel.add(new ConsultProvider());
}

}
