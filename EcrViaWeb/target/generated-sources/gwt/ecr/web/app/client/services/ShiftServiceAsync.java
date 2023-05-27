package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ShiftServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void insertRow( ecr.web.app.shared.dto.ShiftDTO _ShiftDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void updateRow( ecr.web.app.shared.dto.ShiftDTO _ShiftDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.ShiftDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.ShiftDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ShiftService
     */
    void getShiftbyCaisse( long id_caisse, AsyncCallback<java.util.List<ecr.web.app.shared.dto.ShiftDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static ShiftServiceAsync instance;

        public static final ShiftServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (ShiftServiceAsync) GWT.create( ShiftService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
