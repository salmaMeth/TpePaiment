package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.DiscountsDTO;
@RemoteServiceRelativePath("springGwtServices/DiscountsService")

public interface DiscountService extends RemoteService {
	  public void insertRow(DiscountsDTO _Obj_defDTO) throws Exception;
	  public void updateRow(DiscountsDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public DiscountsDTO selectRow(long id)throws Exception;
	  public List<DiscountsDTO> selectAllRows()throws Exception;

}
