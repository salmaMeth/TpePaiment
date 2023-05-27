package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.HistoricDTO;



@RemoteServiceRelativePath("springGwtServices/HistoricService")

public interface HistoricService extends RemoteService {
	  public void insertRow(HistoricDTO _Obj_defDTO) throws Exception;
	  public void updateRow(HistoricDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public HistoricDTO selectRow(long id);
	  public List<HistoricDTO> selectAllRows();
	  public List<HistoricDTO> getProdByTran(long tranId);
	  public List<HistoricDTO> getProByRange(String code_range);

}