package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.CashDTO;
import ecr.web.app.shared.dto.RetournDataDTO;
@RemoteServiceRelativePath("springGwtServices/CashService")

public interface CashService extends RemoteService {
	  public void insertRow(CashDTO _Obj_defDTO) throws Exception;
	  public void updateRow(CashDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public CashDTO selectRow(long id)throws Exception;
	  public List<CashDTO> selectAllRows()throws Exception;
		public List<CashDTO> getCaissebycode(long code)throws Exception;
		public List<CashDTO> distinct()throws Exception;
		public Long  GetAvg(long id_caisse)throws Exception;
		public List<?>  distinctCach()throws Exception;
		public List<CashDTO> distinctRegister() throws Exception ;

		
}
