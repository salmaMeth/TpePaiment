package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface StartTxnServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.StartTxnService
     */
    void Startransaction( java.lang.String termIpAdr, ecr.web.app.shared.TransactionDataIn data, AsyncCallback<ecr.web.app.shared.dto.TxnResponseDTO> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static StartTxnServiceAsync instance;

        public static final StartTxnServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (StartTxnServiceAsync) GWT.create( StartTxnService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
