package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.OptionDTO;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("springGwtServices/OptionService")
public interface OptionService extends RemoteService {
  public void insertRow(OptionDTO _Obj_defDTO) throws Exception;
  public void updateRow(OptionDTO _Obj_defDTO) throws Exception;
  public void deleteRow(long id) throws Exception;
  public OptionDTO selectRow(long id)throws Exception;
  public List<OptionDTO> selectAllRows()throws Exception;
  public void  deleteOption()throws Exception;

}
