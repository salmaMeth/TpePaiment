package ecr.web.app.client.services;

import com.google.gwt.user.cellview.client.CellTable;

public interface TableRes extends CellTable.Resources
{
 
@Source({CellTable.Style.DEFAULT_CSS  ," "})
TableStyle  celltablestyle();
interface TableStyle extends CellTable.Style{}

}
