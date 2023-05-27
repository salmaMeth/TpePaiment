package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ClientServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void insertRow( ecr.web.app.shared.dto.ClientDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void updateRow( ecr.web.app.shared.dto.ClientDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.ClientDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.ClientDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void getClientById( long idcard, AsyncCallback<ecr.web.app.shared.dto.ClientDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ClientService
     */
    void getClientBySalary( java.lang.String continent, AsyncCallback<java.util.List<ecr.web.app.shared.dto.ClientDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static ClientServiceAsync instance;

        public static final ClientServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (ClientServiceAsync) GWT.create( ClientService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
