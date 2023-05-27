package ecr.web.app.client.ui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

@SuppressWarnings("deprecation")
class MyDialog extends DialogBox implements ClickListener {
	  public MyDialog() {
	    setText("Sample DialogBox");

	    Button closeButton = new Button("Close", this);
	    HTML msg = new HTML("<center>A standard dialog box component.</center>",true);

	    DockPanel dock = new DockPanel();
	    dock.setSpacing(4);

	    dock.add(closeButton, DockPanel.SOUTH);
	    dock.add(msg, DockPanel.NORTH);
	    dock.add(new Image("images/add.jpg"), DockPanel.CENTER);

	    dock.setCellHorizontalAlignment(closeButton, DockPanel.ALIGN_RIGHT);
	    dock.setWidth("100%");
	    setWidget(dock);
	  }

	  public void onClick(Widget sender) {
	    hide();
	  }
	}