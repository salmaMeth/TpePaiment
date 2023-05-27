package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.ProviderDTO;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("springGwtServices/providerdefService")
public interface ProviderService extends RemoteService {
  public void insertRow(ProviderDTO _Obj_defDTO) throws Exception;
  public void updateRow(ProviderDTO _Obj_defDTO) throws Exception;
  public void deleteRow(long id) throws Exception;
  public ProviderDTO selectRow(long id);
  public List<ProviderDTO> selectAllRows();

}
