package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.UsersDTO;

public class RangesServer extends Composite  {
	

	private static RangesServerUiBinder uiBinder = GWT
			.create(RangesServerUiBinder.class);
	@UiField HTMLPanel Container;
	@UiField
	static CellTable<RangesDTO> Tab_Rayon;
	@UiField
	  SimplePager page_rayon;
	@UiField
	 TextBox searchBox;
	static Range range;
	static List<RangesDTO> sub;
	
	static AsyncDataProvider<RangesDTO> DataProvider;
	   private final static RangesServiceAsync _service = GWT.create(RangesService.class);
	   static int start;
	interface RangesServerUiBinder extends UiBinder<Widget, RangesServer> {
	}

	public RangesServer() {
		initWidget(uiBinder.createAndBindUi(this));
		 bind() ;
	}

	@UiHandler("Container")
	void onContainerAttachOrDetach(AttachEvent event) {
		TextColumn<RangesDTO> txtCol_CODE = new TextColumn<RangesDTO>() {
			@Override
			public String getValue(RangesDTO object) {
				return String.valueOf(object.getCode()) ;
			}
		};Tab_Rayon.addColumn(txtCol_CODE, "CODE");

			TextColumn<RangesDTO> txtCol_DERCP = new TextColumn<RangesDTO>() {
			@Override
			public String getValue(RangesDTO object) {
				return object.getDescription();
			}
		};Tab_Rayon.addColumn(txtCol_DERCP, "DESCREPTION");
		TextColumn<RangesDTO> txtCol_name1 = new TextColumn<RangesDTO>() {
			@Override
			public String getValue(RangesDTO object) {
				return object.getName();
			}
		};	Tab_Rayon.addColumn(txtCol_name1, "NAME");
			
		page_rayon.setDisplay(Tab_Rayon);
		addtable();
	}
	public static void addtable()
	{		
  DataProvider = new AsyncDataProvider<RangesDTO>() {

		@Override
		protected void onRangeChanged(HasData<RangesDTO> display) {
			range = display.getVisibleRange();
			_service.selectAllRows(new AsyncCallback<List<RangesDTO>>() {

				public void onFailure(Throwable caught) {
						MerchantSession.lbl_notif.setText("fail");
				}

				public void onSuccess(List<RangesDTO> result) {
					if (result != null && !result.isEmpty()) {
						 start = range.getStart();
						int end = start + range.getLength();
						end = end >= result.size() ? result.size(): end;
					    sub = result.subList(start,end);
						
						updateRowData(start, sub);
					} 
						else {
							MerchantSession.lbl_notif.setText("No Obj_defs stored in the database.");
					}
					updateRowCount(result.size(), true);
				}
			});

		}
	};

	DataProvider.addDataDisplay(Tab_Rayon);
}
	private void bind() {
		searchBox.addKeyUpHandler(new KeyUpHandler() {
			
			public void onKeyUp(KeyUpEvent arg0) {
				if(sub != null){
					String searchKey = searchBox.getText();
					List<RangesDTO> filtredList = new ArrayList<RangesDTO>();
					for (RangesDTO rangeDTO : sub) {
						if(rangeDTO.getCode().toUpperCase().contains(searchKey.toUpperCase())){
							filtredList.add(rangeDTO);
						}
					}
					DataProvider.updateRowData(0, filtredList);
					DataProvider.updateRowCount(filtredList.size(), true);
					
				}
				
			}
		});
		
	}		
	}
