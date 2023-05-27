package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface RangesServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RangesService
     */
    void insertRow( ecr.web.app.shared.dto.RangesDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RangesService
     */
    void updateRow( ecr.web.app.shared.dto.RangesDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RangesService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RangesService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.RangesDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.RangesService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.RangesDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static RangesServiceAsync instance;

        public static final RangesServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (RangesServiceAsync) GWT.create( RangesService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
