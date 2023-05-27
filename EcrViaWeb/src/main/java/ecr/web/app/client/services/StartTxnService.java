package ecr.web.app.client.services;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.TerminalIpAdr;
import ecr.web.app.shared.TransactionDataIn;
import ecr.web.app.shared.dto.TxnResponseDTO;

@RemoteServiceRelativePath("springGwtServices/startransaction")
public interface StartTxnService extends RemoteService {
public TxnResponseDTO Startransaction(String termIpAdr,TransactionDataIn data);
	

}
