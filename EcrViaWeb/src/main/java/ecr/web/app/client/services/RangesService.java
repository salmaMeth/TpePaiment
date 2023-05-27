package ecr.web.app.client.services;

import java.util.List;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.RangesDTO;

@RemoteServiceRelativePath("springGwtServices/Rayon_defService")
public interface RangesService extends RemoteService{
	 public void insertRow(RangesDTO _Obj_defDTO) throws Exception;
	  public void updateRow(RangesDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public RangesDTO selectRow(long id);
	  public List<RangesDTO> selectAllRows();

}
