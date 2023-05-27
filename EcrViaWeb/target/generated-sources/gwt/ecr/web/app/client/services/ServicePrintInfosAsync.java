package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ServicePrintInfosAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ServicePrintInfos
     */
    void printInfos( java.lang.String termIpAdr, java.lang.String data, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static ServicePrintInfosAsync instance;

        public static final ServicePrintInfosAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (ServicePrintInfosAsync) GWT.create( ServicePrintInfos.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
