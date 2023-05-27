package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface DiscountServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.DiscountService
     */
    void insertRow( ecr.web.app.shared.dto.DiscountsDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.DiscountService
     */
    void updateRow( ecr.web.app.shared.dto.DiscountsDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.DiscountService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.DiscountService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.DiscountsDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.DiscountService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.DiscountsDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static DiscountServiceAsync instance;

        public static final DiscountServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (DiscountServiceAsync) GWT.create( DiscountService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
