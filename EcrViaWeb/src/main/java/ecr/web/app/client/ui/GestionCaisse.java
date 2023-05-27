package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.event.logical.shared.AttachEvent;

public class GestionCaisse extends Composite  {

	private static UserServUiBinder uiBinder = GWT
			.create(UserServUiBinder.class);
	@UiField HTMLPanel container;
	@UiField DisclosurePanel disclosurePanel;
	@UiField HTMLPanel panel;

	interface UserServUiBinder extends UiBinder<Widget, GestionCaisse> {
	}

	public GestionCaisse() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	@UiHandler("disclosurePanel")
	void onDisclosurePanelAttachOrDetach(AttachEvent event) {
		ClotureCaisse caisse=new ClotureCaisse();
		panel.add(caisse);
	}
	
}
