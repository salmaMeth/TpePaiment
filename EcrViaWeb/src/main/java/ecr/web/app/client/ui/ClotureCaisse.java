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

public class ClotureCaisse extends Composite {

	private static ComptesUiBinder uiBinder = GWT.create(ComptesUiBinder.class);

	interface ComptesUiBinder extends UiBinder<Widget, ClotureCaisse> {
	}

	public ClotureCaisse() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
}
