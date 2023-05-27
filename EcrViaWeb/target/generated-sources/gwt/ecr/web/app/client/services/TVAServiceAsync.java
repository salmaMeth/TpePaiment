package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface TVAServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TVAService
     */
    void insertRow( ecr.web.app.shared.dto.TVADTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TVAService
     */
    void updateRow( ecr.web.app.shared.dto.TVADTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TVAService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TVAService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.TVADTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TVAService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.TVADTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static TVAServiceAsync instance;

        public static final TVAServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (TVAServiceAsync) GWT.create( TVAService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
