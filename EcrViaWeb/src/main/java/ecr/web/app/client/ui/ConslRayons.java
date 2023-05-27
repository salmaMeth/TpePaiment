package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.UsersDTO;

public class ConslRayons extends Composite {

	private  Consl_RayonsUiBinder uiBinder = GWT
			.create(Consl_RayonsUiBinder.class);
	@UiField HTMLPanel Container;
	@UiField
	  CellTable<RangesDTO> Tab_Rayon;
	@UiField
	  SimplePager page_rayon;
	@UiField
	 TextBox searchBox;
	 Range range;
	  List<RangesDTO> sub;
	
	 AsyncDataProvider<RangesDTO> DataProvider;
	   private final  RangesServiceAsync _service = GWT.create(RangesService.class);
	    int start;
	interface Consl_RayonsUiBinder extends UiBinder<Widget, ConslRayons> {
	}

	public ConslRayons() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
		}
		@UiHandler("Container")
		void onContainerAttachOrDetach(AttachEvent event) {

			TextColumn<RangesDTO> txtCol_CODE = new TextColumn<RangesDTO>() {
				@Override
				public String getValue(RangesDTO object) {
					return String.valueOf(object.getCode()) ;
				}
			};Tab_Rayon.addColumn(txtCol_CODE, "CODE");
			   Tab_Rayon.setColumnWidth(txtCol_CODE, 30.0, Unit.PCT);
				TextColumn<RangesDTO> txtCol_des = new TextColumn<RangesDTO>() {
					@Override
					public String getValue(RangesDTO object) {
						return object.getDescription() ;
					}
				};Tab_Rayon.addColumn(txtCol_des, "Description");
				   Tab_Rayon.setColumnWidth(txtCol_des, 80.0, Unit.PCT);

					
				final Column<RangesDTO, String> txtCol_name = new Column<RangesDTO, String>(new TextInputCell()) {
					
					@Override
					public String getValue(RangesDTO arg0) {
						// TODO Auto-generated method stub
						return arg0.getName();
					}
				};
				txtCol_name.setFieldUpdater(new FieldUpdater<RangesDTO, String>() {

					public void update(int arg0, RangesDTO arg1, String arg2) {
						arg1.setName(arg2);
									
					}
				});Tab_Rayon.addColumn(txtCol_name, "Name");
				   Tab_Rayon.setColumnWidth(txtCol_name, 30.0, Unit.PCT);  
				   
				   
								
					   ButtonCell deleteButton = new ButtonCell() {
							@Override
							public void render(com.google.gwt.cell.client.Cell.Context context,
									SafeHtml data, SafeHtmlBuilder sb) {
								// TODO Auto-generated method stub
								
								Image deleteImg = new Image("images/delete.png");
							
								deleteImg.setPixelSize(30, 30);
								sb.appendHtmlConstant(deleteImg.toString());
							}
						};
						ButtonCell updateButton = new ButtonCell() {
							@Override
							public void render(com.google.gwt.cell.client.Cell.Context context,
									SafeHtml data, SafeHtmlBuilder sb) {
								// TODO Auto-generated method stub
								Image deleteImg = new Image("images/update1.png");
								deleteImg.setPixelSize(30, 30);
								sb.appendHtmlConstant(deleteImg.toString());
							}
						};

						Column<RangesDTO, String> delete = new Column<RangesDTO, String>(
								deleteButton) {
							@Override
							public String getValue(RangesDTO c) {
								return "Delete";

							}
						};

						delete.setFieldUpdater(new FieldUpdater<RangesDTO, String>()

						{
							public void update(int index, final RangesDTO range, String value) {
								_service.deleteRow(range.getId_range(), new AsyncCallback<Void>() {

									public void onFailure(Throwable caught) {
										MerchantSession.lbl_notif.setText("fail");

									}

									public void onSuccess(Void arg0) {
										MerchantSession.lbl_notif.setText("Success");
										for ( RangesDTO  dto: sub) {
											if(range.getId_range() == dto.getId_range()){
												sub.remove(dto);
												break;
											}
										}
										DataProvider.updateRowData(0, sub);

										DataProvider.updateRowCount(sub.size(), true);
										
									}

								});
							}
						});

						Tab_Rayon.addColumn(delete, "Delete");
						Tab_Rayon.setColumnWidth(delete, 10.0, Unit.PCT);

						Column<RangesDTO, String> update = new Column<RangesDTO, String>(
								updateButton) {
							@Override
							public String getValue(RangesDTO c) {
								return "Update";

							}};

						update.setFieldUpdater(new FieldUpdater<RangesDTO, String>()

						{
							public void update(int index, RangesDTO terminal, String value) {
								_service.updateRow(	terminal, new AsyncCallback<Void>() {

									public void onFailure(Throwable caught) {
										MerchantSession.lbl_notif.setText("fail");

									}

									public void onSuccess(Void arg0) {
										MerchantSession.lbl_notif.setText("Success");
										
									}

								});
							}});
						Tab_Rayon.addColumn(update, "Update");
						Tab_Rayon.setColumnWidth(update, 10.0, Unit.PCT);
				
						page_rayon.setDisplay(Tab_Rayon);
			addtable();
		}
		public void addtable()
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
						for (RangesDTO RangesDTO : sub) {
							if(RangesDTO.getCode().toUpperCase().contains(searchKey.toUpperCase())){
								filtredList.add(RangesDTO);
							}
						}
						DataProvider.updateRowData(0, filtredList);
						DataProvider.updateRowCount(filtredList.size(), true);
						
					}
					
				}
			});
			
		}		
		}
