package ecr.web.app.server;

import java.io.Serializable;

import org.eclipse.swt.widgets.Label;

public class LabelSwt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Label label;

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
public LabelSwt(){}
	
}
