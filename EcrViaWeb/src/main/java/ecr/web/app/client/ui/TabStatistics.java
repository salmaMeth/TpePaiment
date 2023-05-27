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

public class TabStatistics extends Composite  {

	@UiField
	HTMLPanel tabpanel;
	@UiField
	Button btn_salestab;
	@UiField
	Button btn_productstab;
	@UiField
	Button btn_clinettab;
	
	
	private static TabStatisticsUiBinder uiBinder = GWT
			.create(TabStatisticsUiBinder.class);

	interface TabStatisticsUiBinder extends UiBinder<Widget, TabStatistics> {
	}

	public TabStatistics() {
		initWidget(uiBinder.createAndBindUi(this));
	   tabpanel.add(new StatisticsProducts());
	   btn_salestab.setStyleName("btn");
	   btn_productstab.setStyleName("btn");
	   btn_clinettab.setStyleName("btn");
}
	@UiHandler("btn_salestab")
	void onBtn_addtabClick(ClickEvent event) {
		tabpanel.clear();
		tabpanel.add(new StatisticsProducts() );
	}
	@UiHandler("btn_productstab")
	void onBtn_usertabClick(ClickEvent event) {
		tabpanel.clear();
	tabpanel.add(new CachRegisterStatistics());
	}
	@UiHandler("btn_clinettab")
	void onBtn_clienttabClick(ClickEvent event) {
		tabpanel.clear();
	tabpanel.add(new StatisticalClients());
	}
}
