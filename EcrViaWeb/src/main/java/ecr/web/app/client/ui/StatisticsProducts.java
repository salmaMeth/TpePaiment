package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.moxieapps.gwt.highcharts.client.AxisTitle;
import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Credits;
import org.moxieapps.gwt.highcharts.client.Legend;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.ToolTip;
import org.moxieapps.gwt.highcharts.client.ToolTipData;
import org.moxieapps.gwt.highcharts.client.ToolTipFormatter;
import org.moxieapps.gwt.highcharts.client.labels.DataLabels;
import org.moxieapps.gwt.highcharts.client.plotOptions.BarPlotOptions;

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

import ecr.web.app.client.services.CellTableResources;
import ecr.web.app.client.services.HistoricService;
import ecr.web.app.client.services.HistoricServiceAsync;
import ecr.web.app.shared.dto.HistoricDTO;

public class StatisticsProducts extends Composite  {

	private static StatisticsProductsUiBinder uiBinder = GWT
			.create(StatisticsProductsUiBinder.class);
	private final static CellTable.Resources CELL_RESOURCES = GWT.create(CellTableResources.class);
	 List<Datatable> Datatables;
	 List<maxdata> ourValues = new ArrayList<maxdata>();
	 List<maxdata> ourValues1 = new ArrayList<maxdata>();
	 List<maxdata> ourValues2 = new ArrayList<maxdata>();
	 List<maxdata> ourValues3 = new ArrayList<maxdata>();
	 List<maxdata> ourValues4 = new ArrayList<maxdata>();

	long sommeacer1,sommeacer11,
	 sommeasus1,sommeasus11,
	 sommehp1,sommehp11,
     sommelenovo1,sommelenovo11,
     sommedell1,sommedell11,
	 sommeacer2,sommeacer22,
	 sommeasus2,sommeasus22,
	 sommehp2,sommehp22,
	 sommelenovo2,sommelenovo22,
	 sommedell2,sommedell22,
	 sommeacer3,sommeacer33,
	 sommeasus3,sommeasus33,
	 sommehp3,sommehp33,
	 sommelenovo3,sommelenovo33,
	 sommedell3,sommedell33,
	 sommeacer4,sommeacer44,
	 sommeasus4,sommeasus44,
	 sommehp4,sommehp44,
	 sommelenovo4,sommelenovo44,
	 sommedell4,sommedell44,
	 sommeacer5,sommeacer55,
	 sommeasus5,sommeasus55,
	 sommehp5,sommehp55,
	 sommelenovo5,sommelenovo55,
	 sommedell5,sommedell55= 0;



	 private final HistoricServiceAsync _service1 = GWT
				.create(HistoricService.class);
	
	@UiField
	public  Chart usagePie;

	@UiField
	 CellTable<Datatable> tab_infos=new CellTable<Datatable>(5, CELL_RESOURCES );

	

	interface StatisticsProductsUiBinder extends
			UiBinder<Widget, StatisticsProducts> {
	}

	public StatisticsProducts() {
		initWidget(uiBinder.createAndBindUi(this));

		usagePie.setType(Series.Type.BAR)  
        .setChartTitleText("Historic Sales By Brand")  
        .setBarPlotOptions(new BarPlotOptions()  
            .setDataLabels(new DataLabels()  
                .setEnabled(true)  
            )  
        )  
  .setLegend(new Legend()  
                .setBackgroundColor("#FFFFFF")  
                .setReversed(true)  
            )   
        .setCredits(new Credits()  
            .setEnabled(false)  
        )  
        .setToolTip(new ToolTip()  
            .setFormatter(new ToolTipFormatter() {  
                public String format(ToolTipData toolTipData) {  
                    return toolTipData.getSeriesName() + ": " + toolTipData.getYAsLong() +" units";  
                }  
            })  
        );
		 
				      
				      
		    
		usagePie.getXAxis()  
      .setCategories(" Desktops", "Laptops", "Boards", " Network Cards ", "Tablets");  

		usagePie.getYAxis()  
         .setAxisTitle(new AxisTitle()  
             .setText("units")  
             .setAlign(AxisTitle.Align.HIGH)  
         );    
		
		Series series = usagePie.createSeries().setName("Dell");
		usagePie.addSeries(series); 
		
		Series series1 = usagePie.createSeries().setName("Acer");  
		usagePie.addSeries(series1); 
		Series series2 = usagePie.createSeries().setName("Asus");  
		usagePie.addSeries(series2);
		Series series3 = usagePie.createSeries().setName("HP");  
		usagePie.addSeries(series3);
		Series series4 = usagePie.createSeries().setName("Lenovo");  
		usagePie.addSeries(series4);

		  
				   getDataFromServer(usagePie, series, series1, series2, series3, series4);
				   getTable();
				   
		}

	public void getDataFromServer(final Chart chart,final Series series,  final Series series1,final Series series2
			,final Series series3,final Series series4) {

								
						_service1.selectAllRows(new AsyncCallback<List<HistoricDTO>>(){

							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								AdminSession.lbl_notif.setText("Fail to get from databases");
					
							}

							public void onSuccess(List<HistoricDTO> result) {
								// TODO Auto-generated method stub
									for (int i = 0; i < result.size(); i++) {
                                        if(result.get(i).getCode_range().contains("264")){
										if(result.get(i).getMarque().equals("Acer")){
																				
									   sommeacer1 +=result.get(i).getQuantity();}
										if(result.get(i).getMarque().equals("Asus")){
											
											   sommeasus1 +=result.get(i).getQuantity();}
										if(result.get(i).getMarque().equals("HP")){
											
											   sommehp1 +=result.get(i).getQuantity();}		
										
										if(result.get(i).getMarque().equals("Lenovo")){
											
											   sommelenovo1 +=result.get(i).getQuantity();}
										
										if(result.get(i).getMarque().equals("Dell")){
											
											   sommedell1 +=result.get(i).getQuantity();}		
                                        }
						             if(result.get(i).getCode_range().contains("265")){
											if(result.get(i).getMarque().equals("Acer")){
																					
												sommeacer2 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("Asus")){
												
												sommeasus2 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("HP")){
												
												sommehp2 +=result.get(i).getQuantity();}		
											
											if(result.get(i).getMarque().equals("Lenovo")){
												
												sommelenovo2 +=result.get(i).getQuantity();}
											
											if(result.get(i).getMarque().equals("Dell")){
												
												sommedell2 +=result.get(i).getQuantity();}		
	                                        }
						             if(result.get(i).getCode_range().contains("267")){
											if(result.get(i).getMarque().equals("Acer")){
																					
												sommeacer3 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("Asus")){
												
												sommeasus3 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("HP")){
												
												sommehp3 +=result.get(i).getQuantity();}		
											
											if(result.get(i).getMarque().equals("Lenovo")){
												
												sommelenovo3 +=result.get(i).getQuantity();}
											
											if(result.get(i).getMarque().equals("Dell")){
												
												sommedell3 +=result.get(i).getQuantity();}		
	                                        }  
						             if(result.get(i).getCode_range().contains("268")){
											if(result.get(i).getMarque().equals("Acer")){
																					
												sommeacer4 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("Asus")){
												
												sommeasus4 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("HP")){
												
												sommehp4 +=result.get(i).getQuantity();}		
											
											if(result.get(i).getMarque().equals("Lenovo")){
												
												sommelenovo4 +=result.get(i).getQuantity();}
											
											if(result.get(i).getMarque().equals("Dell")){
												
												sommedell4 +=result.get(i).getQuantity();}		
	                                        }
									
						             if(result.get(i).getCode_range().contains("269")){
											if(result.get(i).getMarque().equals("Acer")){
																					
												sommeacer5 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("Asus")){
												
												sommeasus5 +=result.get(i).getQuantity();}
											if(result.get(i).getMarque().equals("HP")){
												
												sommehp5 +=result.get(i).getQuantity();}		
											
											if(result.get(i).getMarque().equals("Lenovo")){
												
												sommelenovo5 +=result.get(i).getQuantity();}
											
											if(result.get(i).getMarque().equals("Dell")){
												
												sommedell5 +=result.get(i).getQuantity();}		
	                                        }
									
									
									}							
								


									series.setPoints(new Number[] {sommedell1,sommedell2,sommedell3,sommedell4,sommedell5 });
							       	series1.setPoints(new Number[] {sommeacer1,sommeacer2,sommeacer3,sommeacer4,sommeacer5 });
							       	series2.setPoints(new Number[] {sommeasus1,sommeasus2,sommeasus3,sommeasus4,sommeasus5 });
							       	series3.setPoints(new Number[] {sommehp1,sommehp2,sommehp3,sommehp4,sommehp5 });
							       	series4.setPoints(new Number[] {sommelenovo1,sommelenovo2,sommelenovo3,sommelenovo4,sommelenovo5 });
							       	
							chart.redraw();
							}

				
				});
	
	} 
	
	public void getTable()
	{ 
		

		_service1.selectAllRows( new AsyncCallback<List<HistoricDTO>>(){

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			public void onSuccess(List<HistoricDTO> result) {
				// TODO Auto-generated method stub
				for (int i = 0; i < result.size(); i++) {
		            if(result.get(i).getCode_range().contains("264")){
												if(result.get(i).getMarque().equals("Acer")){
																						
											   sommeacer11 +=result.get(i).getQuantity();}
												if(result.get(i).getMarque().equals("Asus")){
													
													   sommeasus11 +=result.get(i).getQuantity();}
												if(result.get(i).getMarque().equals("HP")){
													
													   sommehp11 +=result.get(i).getQuantity();}		
												
												if(result.get(i).getMarque().equals("Lenovo")){
													
													   sommelenovo11 +=result.get(i).getQuantity();}
												
												if(result.get(i).getMarque().equals("Dell")){
													
													   sommedell11 +=result.get(i).getQuantity();}		
		                                        }
								             if(result.get(i).getCode_range().contains("265")){
													if(result.get(i).getMarque().equals("Acer")){
																							
														sommeacer22 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("Asus")){
														
														sommeasus22 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("HP")){
														
														sommehp22 +=result.get(i).getQuantity();}		
													
													if(result.get(i).getMarque().equals("Lenovo")){
														
														sommelenovo22 +=result.get(i).getQuantity();}
													
													if(result.get(i).getMarque().equals("Dell")){
														
														sommedell22 +=result.get(i).getQuantity();}		
			                                        }
								             if(result.get(i).getCode_range().contains("267")){
													if(result.get(i).getMarque().equals("Acer")){
																							
														sommeacer33 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("Asus")){
														
														sommeasus33 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("HP")){
														
														sommehp33 +=result.get(i).getQuantity();}		
													
													if(result.get(i).getMarque().equals("Lenovo")){
														
														sommelenovo33 +=result.get(i).getQuantity();}
													
													if(result.get(i).getMarque().equals("Dell")){
														
														sommedell33 +=result.get(i).getQuantity();}		
			                                        }  
								             if(result.get(i).getCode_range().contains("268")){
													if(result.get(i).getMarque().equals("Acer")){
																							
														sommeacer44 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("Asus")){
														
														sommeasus44 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("HP")){
														
														sommehp44 +=result.get(i).getQuantity();}		
													
													if(result.get(i).getMarque().equals("Lenovo")){
														
														sommelenovo44 +=result.get(i).getQuantity();}
													
													if(result.get(i).getMarque().equals("Dell")){
														
														sommedell44 +=result.get(i).getQuantity();}		
			                                        }
											
								             if(result.get(i).getCode_range().contains("269")){
													if(result.get(i).getMarque().equals("Acer")){
																							
														sommeacer55 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("Asus")){
														
														sommeasus55 +=result.get(i).getQuantity();}
													if(result.get(i).getMarque().equals("HP")){
														
														sommehp55 +=result.get(i).getQuantity();}		
													
													if(result.get(i).getMarque().equals("Lenovo")){
														
														sommelenovo55 +=result.get(i).getQuantity();}
													
													if(result.get(i).getMarque().equals("Dell")){
														
														sommedell55 +=result.get(i).getQuantity();}		
			                                        }
						
}
			
			     ourValues.add(new maxdata("Acer",sommeacer11));
			     ourValues.add(new maxdata("HP",sommehp11));
			     ourValues.add(new maxdata("Asus",sommeasus11));
			     ourValues.add(new maxdata("Lenovo",sommelenovo11));
			     ourValues.add(new maxdata("Dell",sommedell11));
			     
			
			     ourValues1.add(new maxdata("Acer",sommeacer22));
			     ourValues1.add(new maxdata("HP",sommehp22));
			     ourValues1.add(new maxdata("Lenovo",sommelenovo22));
			     ourValues1.add(new maxdata("Dell",sommedell22));
			     ourValues1.add(new maxdata("Dell",sommedell22));
			     
			  
			     ourValues2.add(new maxdata("Acer",sommeacer33));
			     ourValues2.add(new maxdata("HP",sommehp33));
			     ourValues2.add(new maxdata("Asus",sommeasus33));
			     ourValues2.add(new maxdata("Lenovo",sommelenovo33));
			     ourValues2.add(new maxdata("Dell",sommedell33));
			     
			    
			     ourValues3.add(new maxdata("Acer",sommeacer44));
			     ourValues3.add(new maxdata("HP",sommehp44));
			     ourValues3.add(new maxdata("Asus",sommeasus44));
			     ourValues3.add(new maxdata("Lenovo",sommelenovo44));
			     ourValues3.add(new maxdata("Dell",sommedell44));
			     
			     ourValues4.add(new maxdata("Acer",sommeacer55));
			     ourValues4.add(new maxdata("HP",sommehp55));
			     ourValues4.add(new maxdata("Asus",sommeasus55));
			     ourValues4.add(new maxdata("Lenovo",sommelenovo55));
			     ourValues4.add(new maxdata("Dell",sommedell55));
			     
		         Datatables = Arrays.asList(
					      new Datatable("Desktops",getmax(ourValues).maxbrand,getmax(ourValues).maxunits), 
					      new Datatable("Laptops", getmax(ourValues1).maxbrand,getmax(ourValues1).maxunits), 
					      new Datatable("Boards", getmax(ourValues2).maxbrand,getmax(ourValues2).maxunits), 
					      new Datatable("Network Cards",getmax(ourValues3).maxbrand,getmax(ourValues3).maxunits),  
					      new Datatable("Tablets",getmax(ourValues4).maxbrand,getmax(ourValues4).maxunits));
				 TextColumn<Datatable> categoryColumn = new TextColumn<Datatable>() {
				      
				      public String getValue(Datatable object) {
				        return object.category;
				      }
				    };
				    tab_infos .addColumn(categoryColumn, "Category");
					 TextColumn<Datatable> brandColumn = new TextColumn<Datatable>() {
					      
					      public String getValue(Datatable object) {
					        return object.brand;
					      }
					    };
					    tab_infos .addColumn(brandColumn, "Brand");   
				    
						 TextColumn<Datatable> unitsColumn = new TextColumn<Datatable>() {
						      
						      public String getValue(Datatable object) {
						        return String.valueOf(object.units);
						      }
						    };
						    tab_infos .addColumn(unitsColumn, "Units");
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
				
			}
			
			private maxdata getmax(List<maxdata> ourValues) {
				// TODO Auto-generated method stub
		          maxdata max = ourValues.get(0);

				for (int i =0; i < ourValues.size(); i++) {
					   
					    if(ourValues.get(i).maxunits >max.maxunits){
		            	max=ourValues.get(i);
		            }
		            }
				
				return max;
			}});
	}
	
	
	private static class Datatable {
	    private final String category;
	    private final String brand;
	    private final long units;
	

	    public Datatable(String category, String brand, long units) {
	      this.category = category;
	      this.brand = brand;
	      this.units = units;
	    }
	  }
	private static class maxdata {
	    private long  maxunits;
	    private final String maxbrand;
	  

	    public maxdata(String maxbrand, long maxunits) {
	      this.maxunits = maxunits;
	      this.maxbrand = maxbrand;
	    }
	  }


}