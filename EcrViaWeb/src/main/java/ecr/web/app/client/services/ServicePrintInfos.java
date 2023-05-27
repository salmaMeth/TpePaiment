package ecr.web.app.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.TerminalIpAdr;
@RemoteServiceRelativePath("springGwtServices/printinfos")
public interface ServicePrintInfos extends RemoteService{
	public void  printInfos(String termIpAdr,String data);
}
