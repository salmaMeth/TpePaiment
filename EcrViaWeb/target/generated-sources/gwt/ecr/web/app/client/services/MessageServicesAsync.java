package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface MessageServicesAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.MessageServices
     */
    void sendMail( java.lang.String text, java.lang.String mailFrom, java.lang.String mailTo, java.lang.String subject, java.lang.String Username, java.lang.String Password, AsyncCallback<java.lang.String> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static MessageServicesAsync instance;

        public static final MessageServicesAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (MessageServicesAsync) GWT.create( MessageServices.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
