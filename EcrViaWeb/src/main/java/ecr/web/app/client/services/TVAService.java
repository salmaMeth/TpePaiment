package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.TVADTO;
@RemoteServiceRelativePath("springGwtServices/TVAService")

public interface TVAService extends RemoteService {
	  public void insertRow(TVADTO _Obj_defDTO) throws Exception;
	  public void updateRow(TVADTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public TVADTO selectRow(long id)throws Exception;
	  public List<TVADTO> selectAllRows()throws Exception;

}
