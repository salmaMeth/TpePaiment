package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface UsersServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void insertRow( ecr.web.app.shared.dto.UsersDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void updateRow( ecr.web.app.shared.dto.UsersDTO _Obj_defDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.UsersDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void selectRowbymail( java.lang.String mail, AsyncCallback<ecr.web.app.shared.dto.UsersDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.UsersDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void getUserByIDPASS( java.lang.String login, java.lang.String password, AsyncCallback<ecr.web.app.shared.dto.UsersDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.UsersService
     */
    void deleteuser( java.lang.Long id, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static UsersServiceAsync instance;

        public static final UsersServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (UsersServiceAsync) GWT.create( UsersService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
