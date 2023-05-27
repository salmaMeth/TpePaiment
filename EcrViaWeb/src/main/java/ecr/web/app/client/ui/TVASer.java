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
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.event.logical.shared.AttachEvent;

public class TVASer extends Composite {

	private static TVASerUiBinder uiBinder = GWT.create(TVASerUiBinder.class);
	@UiField HTMLPanel container;
	@UiField HTMLPanel panel;

	interface TVASerUiBinder extends UiBinder<Widget, TVASer> {
	}

	public TVASer() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("panel")
	void onPanelAttachOrDetach(AttachEvent event) {
		AjoutTVA  Tts = new AjoutTVA();
		
		panel.add(Tts);
	}
}
