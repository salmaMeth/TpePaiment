package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface RefondsServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RefondsService
     */
    void Refondtransaction( java.lang.String termIpAdr, ecr.web.app.shared.TransactionDataIn data, AsyncCallback<ecr.web.app.shared.dto.TxnResponseDTO> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static RefondsServiceAsync instance;

        public static final RefondsServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (RefondsServiceAsync) GWT.create( RefondsService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
