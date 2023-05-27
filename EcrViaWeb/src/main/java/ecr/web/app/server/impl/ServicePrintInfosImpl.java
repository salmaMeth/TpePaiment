package ecr.web.app.server.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.co.ingenico.ecr.ECRException;
import uk.co.ingenico.ecr.ECRFactory;
import uk.co.ingenico.ecr.PrintReq;
import uk.co.ingenico.ecr.PrintResp;
import uk.co.ingenico.ecr.Terminal;

import com.google.common.net.InetAddresses;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.ServicePrintInfos;
import ecr.web.app.shared.EcrUtils.ErespStatus;
import ecr.web.app.shared.TerminalIpAdr;

@Service("printinfos")
public class ServicePrintInfosImpl extends RemoteServiceServlet implements ServicePrintInfos {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory.getLogger(ServicePrintInfosImpl.class);

	 Terminal terminal;
		PrintReq req;
		PrintResp resp;

		ErespStatus requestOutput;
	public void printInfos(String termIpAdr,String data) {
		// TODO Auto-generated method stub
		terminal = ECRFactory.getTerminal(InetAddresses.forString(termIpAdr));
		req = new PrintReq();
		req.setPrintBuffer(data);
		requestOutput = ErespStatus.OK;
		
		try {
			resp = terminal.executeCommand(req);
			}
			catch (InterruptedException e1) 
			{
				log.warn("Interrupted", e1);
			} 
			catch (ECRException e)
			{
				requestOutput = ErespStatus.getErespStatus(e);
				
			}		

	}

}