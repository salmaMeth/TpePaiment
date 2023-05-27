package ecr.web.app.client.ui;

import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import ecr.web.app.client.services.UsersService;
import ecr.web.app.client.services.UsersServiceAsync;
import ecr.web.app.shared.dto.UsersDTO;

public class MyCellRenderer extends AbstractCell<UsersDTO> {
    // This can be compared to UiBinder --> here where all magic is done
    public interface Renderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String name, String image);
 
        void onBrowserEvent(MyCellRenderer o, NativeEvent e, Element p, UsersDTO n);
    }
	   private final static UsersServiceAsync _service = GWT.create(UsersService.class);

    private final Renderer uiRenderer;
 
    public MyCellRenderer(final Renderer uiRenderer) {
        super(BrowserEvents.CLICK);
        this.uiRenderer = uiRenderer;
    	_service.selectAllRows(new AsyncCallback<List<UsersDTO>>() {


			public void onFailure(Throwable caught) {
					Window.alert("fail");
			}

			public void onSuccess(List<UsersDTO> result) {
				for (int i=0;i<result.size();i++)
				{
					UsersDTO user =new UsersDTO();
					
				}

								}
			
		});
    }
 
    public void onBrowserEvent(Context context, Element parent, UsersDTO value, 
            NativeEvent event, ValueUpdater<UsersDTO> valueUpdater) {
        uiRenderer.onBrowserEvent(this, event, parent, value);
    }
 
 
 
    @UiHandler({"remove"})
    void onRemovePersonClicked(ClickEvent event, Element parent, UsersDTO value) {
        Window.alert("Do you want to remove : " + value.getLogin());
    }
 
    @UiHandler({"update"})
    void onUpdatePersonClicked(ClickEvent event, Element parent, UsersDTO value) {
        //Maybe use the ActionCell.Delegate to process the action elsewhere...
        Window.alert("Do you want to update : " + value.getLogin());
    }

	public void render(Context context, UsersDTO value, SafeHtmlBuilder safeHtmlBuilder) {
        // All data extraction, transformation should be done in here
        String name = value.getRole() + value.getLogin();
        String image = value.getImage();
 
        // We directly the uiRenderer and we pass the HtmlBuilder
        uiRenderer.render(safeHtmlBuilder, name, image);
    }


 
}   
