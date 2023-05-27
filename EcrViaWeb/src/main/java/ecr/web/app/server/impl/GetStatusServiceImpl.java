package ecr.web.app.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.co.ingenico.ecr.ECRException;
import uk.co.ingenico.ecr.ECRFactory;
import uk.co.ingenico.ecr.GetTerminalStateReq;
import uk.co.ingenico.ecr.GetTerminalStateResp;
import uk.co.ingenico.ecr.Terminal;

import com.google.common.net.InetAddresses;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.GetStatusService;
import ecr.web.app.client.services.MyStyle;
import ecr.web.app.shared.EcrUtils.ErespStatus;
import ecr.web.app.shared.TerminalIpAdr;

@Service("Statusservice")


public class GetStatusServiceImpl extends RemoteServiceServlet implements GetStatusService 
{	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private static Logger log = LoggerFactory.getLogger(GetStatusServiceImpl.class);

	 Terminal terminal;
	 GetTerminalStateReq req;
	GetTerminalStateResp resp;
	volatile  int periodicDelay = 25  * 1000;
	 ErespStatus requestOutput;
	String status;
	  MyStyle style;
	  public String getTerminalState(String termIpAdr) {
	     	terminal = ECRFactory.getTerminal(InetAddresses.forString(termIpAdr));
			req = new GetTerminalStateReq();
			requestOutput = ErespStatus.OK;
			 return  createTermState();
						
}
public  String getstatus()throws Exception {
	
	return status;
	}

public  String createTermState()
{     
	
	        	try 
				{
					resp = terminal.executeCommand(req);
				} 
				catch (InterruptedException e1) 
				{
					requestOutput = ErespStatus.UNABLE_TO_CONNECT;
					log.warn("Interrupted", e1);
				} 
				catch (ECRException e)
				{
					requestOutput = ErespStatus.getErespStatus(e);
					
				}
		            
		                	if(requestOutput == ErespStatus.OK)
		                	{
		                		status =resp.getTerminalState().toString();			                			
		                	}
		                
		          			                 

						return requestOutput.toString();
      	}
}
