package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface AdressMailServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.AdressMailService
     */
    void insertRow( ecr.web.app.shared.dto.AdressMailDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.AdressMailService
     */
    void updateRow( ecr.web.app.shared.dto.AdressMailDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.AdressMailService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.AdressMailService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.AdressMailDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.AdressMailService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.AdressMailDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static AdressMailServiceAsync instance;

        public static final AdressMailServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (AdressMailServiceAsync) GWT.create( AdressMailService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
