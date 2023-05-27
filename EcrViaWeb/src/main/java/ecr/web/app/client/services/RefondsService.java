package ecr.web.app.client.services;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.TerminalIpAdr;
import ecr.web.app.shared.TransactionDataIn;
import ecr.web.app.shared.dto.TxnResponseDTO;

@RemoteServiceRelativePath("springGwtServices/Refondtransaction")
public interface RefondsService extends RemoteService {
public TxnResponseDTO Refondtransaction(String termIpAdr,TransactionDataIn data);


}
