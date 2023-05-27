package ecr.web.app.client.ui;


import java.util.ArrayList;
import java.util.List;

import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Legend;
import org.moxieapps.gwt.highcharts.client.Point;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.ToolTip;
import org.moxieapps.gwt.highcharts.client.ToolTipData;
import org.moxieapps.gwt.highcharts.client.ToolTipFormatter;
import org.moxieapps.gwt.highcharts.client.labels.DataLabelsData;
import org.moxieapps.gwt.highcharts.client.labels.DataLabelsFormatter;
import org.moxieapps.gwt.highcharts.client.labels.PieDataLabels;
import org.moxieapps.gwt.highcharts.client.plotOptions.PiePlotOptions;
import org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;

import ecr.web.app.client.services.CashService;
import ecr.web.app.client.services.CashServiceAsync;
import ecr.web.app.client.services.CellTableResources;

public class CachRegisterStatistics extends Composite  {

	private static CachRegisterStatisticsUiBinder uiBinder = GWT
			.create(CachRegisterStatisticsUiBinder.class);

	interface CachRegisterStatisticsUiBinder extends
			UiBinder<Widget, CachRegisterStatistics> {
	}

	private final static CellTable.Resources CELL_RESOURCES = GWT.create(CellTableResources.class);
	protected static Object result1 = null;
	protected static Datatable data = null;
	static ArrayList<Datatable>  Datatables = new ArrayList<Datatable>();

	 private final CashServiceAsync _service1 = GWT
				.create(CashService.class);
	
	@UiField
	public  Chart usagePie;

	@UiField
	 CellTable<Datatable> tab_infos=new CellTable<Datatable>(5, CELL_RESOURCES );

	


	public CachRegisterStatistics() {
		initWidget(uiBinder.createAndBindUi(this));

	   
		usagePie.setType(Series.Type.PIE)  
        .setChartTitleText("Classification of cash Register store")  
        .setPlotBackgroundColor((String) null)  
        .setPlotBorderWidth(null)  
        .setPlotShadow(false)  
         .setPiePlotOptions(new PiePlotOptions()  
            .setAllowPointSelect(true)  
            
            .setCursor(PlotOptions.Cursor.POINTER)  
            .setPieDataLabels(new PieDataLabels()  
                .setConnectorColor("#000000")  
                .setEnabled(true)  
                .setColor("#000000")  
                .setFormatter(new DataLabelsFormatter() {  
                    public String format(DataLabelsData dataLabelsData) {  
                        return "<b>" + dataLabelsData.getPointName() + "</b>: " + dataLabelsData.getYAsDouble() + " %";  
                    } 
                    
                    
                    
                    
                })  
            )  
        )  
        .setLegend(new Legend()  
            .setLayout(Legend.Layout.VERTICAL)  
            .setAlign(Legend.Align.RIGHT)  
            .setVerticalAlign(Legend.VerticalAlign.TOP)  
            .setX(-100)  
            .setY(100)  
            .setFloating(true)  
            .setBorderWidth(1)  
            .setBackgroundColor("#FFFFFF")  
            .setShadow(true)  
            
        ) 
        
        .setToolTip(new ToolTip()  
            .setFormatter(new ToolTipFormatter() {  
                public String format(ToolTipData toolTipData) {  
                    return "<b>" + toolTipData.getPointName() + "</b>: " + toolTipData.getYAsDouble() + " %";  
                }  
            })  
        );  
		
		
		Series series = usagePie.createSeries();
		usagePie.addSeries(series); 
	

		  
				   getDataFromServer(usagePie, series);
				   getTable();

		}



	public void getDataFromServer(final Chart chart,final Series series) {

		_service1.distinctCach(new AsyncCallback<java.util.List<?>>(){

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				AdminSession.lbl_notif.setText("Fail to get data from databases");
			}

			public void onSuccess(final List<?> result) {
            for(  int i=0;i<result.size();i++){
		    	 final String cachnumber=	 result.get(i).toString();
		     _service1.GetAvg(Long.valueOf(result.get(i).toString()),new AsyncCallback<java.lang.Long>() {
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
					AdminSession.lbl_notif.setText("Fail to get percentage amount data from databases");
			
					}

					public void onSuccess(Long result1) {
						

						series.addPoint(new Point("Cach"+cachnumber,result1).setSliced(true)  
			                      .setSelected(true), false, false, false);
			            
				chart.redraw();
}}); } }});}


					

							
							
							
	
	
	public void getTable()
	{ 
		_service1.distinctCach(new AsyncCallback<java.util.List<?>>(){

		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			AdminSession.lbl_notif.setText("Fail to get percentage amount data from databases");

		}

		public void onSuccess(List<?> result) {
			// TODO Auto-generated method stub
            for(  int i=0;i<result.size();i++){
   	    	 final String cachnumber=	 result.get(i).toString();

			     _service1.GetAvg(Long.valueOf(result.get(i).toString()),new AsyncCallback<java.lang.Long>() {

					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}

					public void onSuccess(Long result) {
						// TODO Auto-generated method stub
					   
					
     			    	 Datatables.add(new Datatable(cachnumber, result.toString())); 
					    	
					}
			     });	
			   
	

		}
            
           final List<Datatable>  Trietables = TrieTable(Datatables);

			 TextColumn<Datatable> categoryColumn = new TextColumn<Datatable>() {
			      
			      public String getValue(Datatable object) {
			        return object.Id_Cach;
			      }
			    };
			    tab_infos .addColumn(categoryColumn, "Id Cach");
				 TextColumn<Datatable> brandColumn = new TextColumn<Datatable>() {
				      
				      public String getValue(Datatable object) {
				        return object.Percentage;
				      }
				    };
				    tab_infos .addColumn(brandColumn, "Percentage");   
			    
			
					    AsyncDataProvider<Datatable> provider = new AsyncDataProvider<Datatable>() {
					        @Override
					        protected void onRangeChanged(HasData<Datatable> display) {
					          int start = display.getVisibleRange().getStart();
					          int end = start + display.getVisibleRange().getLength();
					          end = end >= Datatables.size() ? Datatables.size() : end;
					          List<Datatable> sub = Datatables.subList(start, end);
					          updateRowData(start, sub);
					        }
					      };
					      provider.addDataDisplay(tab_infos);
					      provider.updateRowCount(Datatables.size(), true);

					      SimplePager pager = new SimplePager();
					      pager.setDisplay(tab_infos);
		
		
		}});

	
	
	
	
	
	}
		

	private List<Datatable> TrieTable(List<Datatable> ourValues) {
		// TODO Auto-generated method stub
		 ArrayList<Datatable>  Trietable = new ArrayList<Datatable>();

		 Datatable max = ourValues.get(0);
		
		for (int i =0; i < ourValues.size(); i++) {
			   
			    if(Long.valueOf(ourValues.get(i).Percentage) <Long.valueOf(max.Percentage)){
			    	Trietable.add(ourValues.get(i));
            	    
            }
			    else{
			    	Trietable.add(max);
			    }
            }
		return Trietable;
		
	}
			    
		        
		
			
	}
	
	
	class Datatable {
	    final String Id_Cach;
	    final String Percentage;
	

	    public Datatable(String Id_Cach, String Percentage) {
	      this.Id_Cach = Id_Cach;
	      this.Percentage = Percentage;
	    }
	  }



	