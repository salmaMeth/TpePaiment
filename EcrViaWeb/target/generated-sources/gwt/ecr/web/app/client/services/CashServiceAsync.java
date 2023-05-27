package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface CashServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void insertRow( ecr.web.app.shared.dto.CashDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void updateRow( ecr.web.app.shared.dto.CashDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.CashDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.CashDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void getCaissebycode( long code, AsyncCallback<java.util.List<ecr.web.app.shared.dto.CashDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void distinct( AsyncCallback<java.util.List<ecr.web.app.shared.dto.CashDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void GetAvg( long id_caisse, AsyncCallback<java.lang.Long> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void distinctCach( AsyncCallback<java.util.List<?>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.CashService
     */
    void distinctRegister( AsyncCallback<java.util.List<ecr.web.app.shared.dto.CashDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static CashServiceAsync instance;

        public static final CashServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (CashServiceAsync) GWT.create( CashService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
