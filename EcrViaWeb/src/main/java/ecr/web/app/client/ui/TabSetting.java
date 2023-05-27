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


	public class TabSetting extends Composite {
		@UiField
		HTMLPanel tabpanel;
		@UiField
		Button btn_addtva;
		@UiField
		Button btn_options;
		@UiField
		Button btn_discounts;
		@UiField
		Button btn_mail;
		
		private static TabSettingUiBinder uiBinder = GWT
				.create(TabSettingUiBinder.class);

		interface TabSettingUiBinder extends UiBinder<Widget, TabSetting> {
		}
		public TabSetting() {
			initWidget(uiBinder.createAndBindUi(this));
			btn_discounts.setStyleName("btn");
			btn_addtva.setStyleName("btn");
			btn_options.setStyleName("btn");
			btn_mail.setStyleName("btn");

			tabpanel.add(new OptionGen());
		}
		@UiHandler("btn_addtva")
		void onBtn_tvaClick(ClickEvent event) {
			tabpanel.clear();
			tabpanel.add(new ConsultTVA() );
		}
		@UiHandler("btn_options")
		void onBtn_optionClick(ClickEvent event) {
			tabpanel.clear();
			tabpanel.add(new OptionGen());
		}
		@UiHandler("btn_discounts")
		void onBtn_discountClick(ClickEvent event) {
			tabpanel.clear();
			tabpanel.add(new ConsultDiscount() );
		}
		@UiHandler("btn_mail")
		void onBtn_mailClick(ClickEvent event) {
			tabpanel.clear();
			tabpanel.add(new AdressMailSetting() );

			
		}
	}

