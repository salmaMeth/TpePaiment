package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ProviderServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProviderService
     */
    void insertRow( ecr.web.app.shared.dto.ProviderDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProviderService
     */
    void updateRow( ecr.web.app.shared.dto.ProviderDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProviderService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProviderService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.ProviderDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProviderService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.ProviderDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static ProviderServiceAsync instance;

        public static final ProviderServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (ProviderServiceAsync) GWT.create( ProviderService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
