package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.ProductsDTO;
import ecr.web.app.shared.dto.UsersDTO;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("springGwtServices/User_defService")
public interface UsersService extends RemoteService {
  public void insertRow(UsersDTO _Obj_defDTO) throws Exception;
  public void updateRow(UsersDTO _Obj_defDTO) throws Exception;
  public void deleteRow(long id) throws Exception;
  public UsersDTO selectRow(long id)throws Exception;
  public UsersDTO selectRowbymail(String  mail)throws Exception;
  public List<UsersDTO> selectAllRows()throws Exception;
  public UsersDTO  getUserByIDPASS(String login,String password)throws Exception;
  public void  deleteuser(Long id)throws Exception;

}
