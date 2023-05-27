package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ProductsServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void insertRow( ecr.web.app.shared.dto.ProductsDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void updateRow( ecr.web.app.shared.dto.ProductsDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.ProductsDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.ProductsDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void getProduitByRayon( java.lang.String rayonId, AsyncCallback<java.util.List<ecr.web.app.shared.dto.ProductsDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.ProductsService
     */
    void getProduitBydiscounts( java.lang.String Iddicsount, AsyncCallback<java.util.List<ecr.web.app.shared.dto.ProductsDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static ProductsServiceAsync instance;

        public static final ProductsServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (ProductsServiceAsync) GWT.create( ProductsService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
