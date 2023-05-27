package ecr.web.app.client.services;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
@RemoteServiceRelativePath("springGwtServices/Statusservice")

public interface GetStatusService extends RemoteService {
	public String getTerminalState(String termIpAdr);
	  public String getstatus() throws Exception;


}