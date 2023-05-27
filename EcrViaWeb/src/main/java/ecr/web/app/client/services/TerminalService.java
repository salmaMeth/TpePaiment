package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.TerminalDTO;


@RemoteServiceRelativePath("springGwtServices/TerminalService")
public interface TerminalService extends RemoteService{
	
	public void insertRow(TerminalDTO _TerminalDTO) throws Exception;
	  public void updateRow(TerminalDTO _TerminalDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public TerminalDTO selectRow(long id);
	  public List<TerminalDTO> selectAllRows();


	
}
