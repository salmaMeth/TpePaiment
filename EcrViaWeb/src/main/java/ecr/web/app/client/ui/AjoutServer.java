package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ListBox;

public class AjoutServer extends Composite {

	private static User_ServerUiBinder uiBinder = GWT
			.create(User_ServerUiBinder.class);
	@UiField ListBox cmb_defaultip;
	@UiField ListBox cmd_ipsec1;
	@UiField ListBox cmd_ipsec2;
	@UiField ListBox cmd_ipsec3;

	interface User_ServerUiBinder extends UiBinder<Widget, AjoutServer> {
	}

	public AjoutServer() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
