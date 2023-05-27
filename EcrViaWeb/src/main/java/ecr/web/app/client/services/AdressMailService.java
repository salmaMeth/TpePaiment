package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.AdressMailDTO;


@RemoteServiceRelativePath("springGwtServices/AdressMailService")

public interface AdressMailService extends RemoteService {
	  public void insertRow(AdressMailDTO _Obj_defDTO) throws Exception;
	  public void updateRow(AdressMailDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public AdressMailDTO selectRow(long id)throws Exception;
	  public List<AdressMailDTO> selectAllRows()throws Exception;
	
}