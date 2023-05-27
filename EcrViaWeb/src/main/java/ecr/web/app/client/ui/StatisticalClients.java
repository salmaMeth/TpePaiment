package ecr.web.app.client.ui;

import java.util.List;

import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.LabelItem;
import org.moxieapps.gwt.highcharts.client.Point;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.Style;
import org.moxieapps.gwt.highcharts.client.ToolTip;
import org.moxieapps.gwt.highcharts.client.ToolTipData;
import org.moxieapps.gwt.highcharts.client.ToolTipFormatter;
import org.moxieapps.gwt.highcharts.client.labels.DataLabels;
import org.moxieapps.gwt.highcharts.client.plotOptions.PiePlotOptions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.CellTableResources;
import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.shared.dto.ClientDTO;

public class StatisticalClients extends Composite {
	 private final ClientServiceAsync _service1 = GWT
				.create(ClientService.class);
		private final static CellTable.Resources CELL_RESOURCES = GWT.create(CellTableResources.class);
		 long sommeacer1=0;
		@UiField
	public  Chart usagePie;
	 CellTable<Datatable> tab_infos=new CellTable<Datatable>(5, CELL_RESOURCES );

	
	private static StatisticalClinetsUiBinder uiBinder = GWT
			.create(StatisticalClinetsUiBinder.class);

	interface StatisticalClinetsUiBinder extends
			UiBinder<Widget, StatisticalClients> {
	}

	public StatisticalClients() {
		initWidget(uiBinder.createAndBindUi(this));
		
		usagePie.setChartTitleText("Combination chart") ; 
      
         
      
        

		usagePie.getXAxis()  
        .setCategories(" American", "European", "Asian", "African","Australia"); 

	  
		
		Series series = usagePie.createSeries()  .setType(Series.Type.COLUMN) ;
		usagePie.addSeries(series); 
		Series series1 = usagePie.createSeries() .setType(Series.Type.COLUMN) ; 
		usagePie.addSeries(series1); 
		Series series2 = usagePie.createSeries() .setType(Series.Type.COLUMN) ; 
		usagePie.addSeries(series2);
		Series series3 = usagePie.createSeries() .setType(Series.Type.COLUMN) ;  
		usagePie.addSeries(series3);
		Series series4 = usagePie.createSeries() .setType(Series.Type.COLUMN) ; 
		usagePie.addSeries(series4);	
		
		
		
		
		
	 
		
		


		  
				   getDataFromServer(usagePie, series, series1, series2, series3, series4);
				   
		}

	public void getDataFromServer(final Chart chart,final Series series,  final Series series1,final Series series2
			,final Series series3,final Series series4) {
		
		

				// TODO Auto-generated method stub
			
					_service1.getClientBySalary("American", new AsyncCallback<List<ClientDTO>>(){

						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							AdminSession.lbl_notif.setText("Fail to get from databases");
	
						}

						public void onSuccess(List<ClientDTO> result) {
							// TODO Auto-generated method stub
							for(int i=0;i<result.size();i++){
							if(result.get(i).getContinent().equals("European")){
							series.setPoints(new Number[] {result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality()});
					       	series1.setPoints(new Number[] {result.get(1).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality()});
					       	series2.setPoints(new Number[] {result.get(2).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality()});
					       	series3.setPoints(new Number[] {result.get(3).getLoyality() ,result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality()});
					       	series4.setPoints(new Number[] {result.get(4).getLoyality() ,result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality(),result.get(0).getLoyality()});
							}
							}
							
						}});}}
									

								
							

	

	  




	

