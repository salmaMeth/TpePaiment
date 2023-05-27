package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ecr.web.app.shared.dto.ShiftDTO;
@RemoteServiceRelativePath("springGwtServices/ShiftService")

public interface ShiftService extends RemoteService {
	  public void insertRow(ShiftDTO _ShiftDTO) throws Exception;
	  public void updateRow(ShiftDTO _ShiftDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public ShiftDTO selectRow(long id);
	  public List<ShiftDTO> selectAllRows();
	  public List<ShiftDTO> getShiftbyCaisse(long id_caisse);
}
