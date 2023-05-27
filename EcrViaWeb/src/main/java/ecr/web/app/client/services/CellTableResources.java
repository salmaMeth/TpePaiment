package ecr.web.app.client.services;

import com.google.gwt.user.cellview.client.CellTable;

public interface CellTableResources extends CellTable.Resources {
 
	
@Source(value = { CellTable.Style.DEFAULT_CSS, 
"CellTable.css" }) 
CellTable.Style cellTableStyle(); 
} 