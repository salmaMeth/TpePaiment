package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.TxnResponseDTO;

@RemoteServiceRelativePath("springGwtServices/transactionout")
public interface TxnResponseService extends RemoteService{
	 public void insertRow(TxnResponseDTO _Obj_defDTO) throws Exception;
	  public void updateRow(TxnResponseDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public TxnResponseDTO selectRow(long id);
	  public List<TxnResponseDTO> selectAllRows();}