package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface HistoricServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void insertRow( ecr.web.app.shared.dto.HistoricDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void updateRow( ecr.web.app.shared.dto.HistoricDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.HistoricDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.HistoricDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void getProdByTran( long tranId, AsyncCallback<java.util.List<ecr.web.app.shared.dto.HistoricDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.HistoricService
     */
    void getProByRange( java.lang.String code_range, AsyncCallback<java.util.List<ecr.web.app.shared.dto.HistoricDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static HistoricServiceAsync instance;

        public static final HistoricServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (HistoricServiceAsync) GWT.create( HistoricService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
