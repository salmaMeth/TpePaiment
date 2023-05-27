package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;

public class RenduEsp  extends DialogBox {

	private static RenduEspUiBinder uiBinder = GWT
			.create(RenduEspUiBinder.class);

	interface RenduEspUiBinder extends UiBinder<Widget, RenduEsp> {
	}

	public RenduEsp() {
		setWidget(uiBinder.createAndBindUi(this));
	}

}
