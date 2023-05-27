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
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.HTML;

public class ReduServ extends Composite  {

	private static ReduServUiBinder uiBinder = GWT
			.create(ReduServUiBinder.class);
	@UiField HTMLPanel panel;
	
	interface ReduServUiBinder extends UiBinder<Widget, ReduServ> {
	}

	public ReduServ() {
		initWidget(uiBinder.createAndBindUi(this));

}

	@UiHandler("disclosurePanel")
	void onDisclosurePanelAttachOrDetach(AttachEvent event) {
		AjoutRedu redu =new AjoutRedu();
		panel.add(redu);
	}
}
