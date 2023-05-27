package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ecr.web.app.shared.dto.ClientDTO;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("springGwtServices/ClientdefService")
public interface ClientService extends RemoteService {
  public void insertRow(ClientDTO _Obj_defDTO) throws Exception;
  public void updateRow(ClientDTO _Obj_defDTO) throws Exception;
  public void deleteRow(long id) throws Exception;
  public ClientDTO selectRow(long id)throws Exception;
  public List<ClientDTO> selectAllRows()throws Exception;
  public ClientDTO  getClientById(long idcard)throws Exception;
  public List<ClientDTO> getClientBySalary(String continent)throws Exception;
}
