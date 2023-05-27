package ecr.web.app.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface TerminalServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TerminalService
     */
    void insertRow( ecr.web.app.shared.dto.TerminalDTO _TerminalDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TerminalService
     */
    void updateRow( ecr.web.app.shared.dto.TerminalDTO _TerminalDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TerminalService
     */
    void deleteRow( long id, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TerminalService
     */
    void selectRow( long id, AsyncCallback<ecr.web.app.shared.dto.TerminalDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see ecr.web.app.client.services.TerminalService
     */
    void selectAllRows( AsyncCallback<java.util.List<ecr.web.app.shared.dto.TerminalDTO>> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static TerminalServiceAsync instance;

        public static final TerminalServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (TerminalServiceAsync) GWT.create( TerminalService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
