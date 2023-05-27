package  ecr.web.app.client.ui;

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
import com.google.gwt.user.cellview.client.CellTable;

public class Actions extends Composite  {

	private static ActionsUiBinder uiBinder = GWT.create(ActionsUiBinder.class);
	@UiField(provided=true) CellTable<Object> cellTable = new CellTable<Object>();

	interface ActionsUiBinder extends UiBinder<Widget, Actions> {
	}

	public Actions() {
		initWidget(uiBinder.createAndBindUi(this));
	}



}
