package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class SuppRede extends Composite {

	private static SuppRedeUiBinder uiBinder = GWT
			.create(SuppRedeUiBinder.class);

	interface SuppRedeUiBinder extends UiBinder<Widget, SuppRede> {
	}

	public SuppRede() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
