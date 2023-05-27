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

public class AjoutRedu extends Composite{

	private static AjoutReduUiBinder uiBinder = GWT
			.create(AjoutReduUiBinder.class);
	
	interface AjoutReduUiBinder extends UiBinder<Widget, AjoutRedu> {
	}

	public AjoutRedu() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
