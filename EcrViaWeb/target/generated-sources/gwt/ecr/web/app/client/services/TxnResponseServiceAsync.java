package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface TxnResponseServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TxnResponseService
     */
    void insertRow( ecr.web.app.shared.dto.TxnResponseDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TxnResponseService
     */
    void updateRow( ecr.web.app.shared.dto.TxnResponseDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TxnResponseService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TxnResponseService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.TxnResponseDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TxnResponseService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.TxnResponseDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static TxnResponseServiceAsync instance;

        public static final TxnResponseServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (TxnResponseServiceAsync) GWT.create( TxnResponseService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
