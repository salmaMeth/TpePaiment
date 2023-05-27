package ecr.web.app.client.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import uk.co.ingenico.ecr.TerminalState;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.LinkElement;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.StyleElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ClientServiceAsync;
import ecr.web.app.client.services.GetStatusService;
import ecr.web.app.client.services.GetStatusServiceAsync;
import ecr.web.app.client.services.HistoricService;
import ecr.web.app.client.services.HistoricServiceAsync;
import ecr.web.app.client.services.MyStyle;
import ecr.web.app.client.services.OptionService;
import ecr.web.app.client.services.OptionServiceAsync;
import ecr.web.app.client.services.ProductsService;
import ecr.web.app.client.services.ProductsServiceAsync;
import ecr.web.app.client.services.RangesService;
import ecr.web.app.client.services.RangesServiceAsync;
import ecr.web.app.client.services.StartTxnService;
import ecr.web.app.client.services.StartTxnServiceAsync;
import ecr.web.app.client.services.TooltipListener;
import ecr.web.app.client.services.TxnResponseService;
import ecr.web.app.client.services.TxnResponseServiceAsync;
import ecr.web.app.shared.EcrUtils;
import ecr.web.app.shared.TerminalIpAdr;
import ecr.web.app.shared.TransactionDataIn;
import ecr.web.app.shared.EcrUtils.ErespStatus;
import ecr.web.app.shared.dto.HistoricDTO;
import ecr.web.app.shared.dto.OptionDTO;
import ecr.web.app.shared.dto.ProductsDTO;
import ecr.web.app.shared.dto.RangesDTO;
import ecr.web.app.shared.dto.TxnResponseDTO;
import com.google.gwt.user.client.ui.ScrollPanel;

public class CachRegisterServer extends Composite {

	private static DemarrerUiBinder uiBinder = GWT
			.create(DemarrerUiBinder.class);
	@UiField
	HTMLPanel panel;
	@UiField
	VerticalPanel vp_RayonPanel;

	@UiField
	MyStyle style;

	@UiField
	VerticalPanel vp_ProduitPanel;
	@UiField
	VerticalPanel vpNumber;
	@UiField
	HorizontalPanel hpZero;
	@UiField
	HorizontalPanel hpOperation;
	@UiField
	static TextArea txt_ticket;



	
	@UiField
	static TextArea txt_header;
	
	@UiField
	public static TextArea txt_number;
	@UiField ScrollPanel scrolpanel;
	@UiField ScrollPanel scrolrayon;

	
	static long idmerchant;
	//Unknow user;
	TerminalIpAdr termIpAdr;
	String txt_cMessageNumber, txt_cReference;
	public static long _somme_totlal = 0;
	long _sommeloyality = 0;
	public static String Num_bun=" ";
	private final RangesServiceAsync _service = GWT
			.create(RangesService.class);
	private final ProductsServiceAsync produitService = GWT
			.create(ProductsService.class);
	private final TxnResponseServiceAsync _servicesave = GWT
			.create(TxnResponseService.class);
	private final StartTxnServiceAsync servicetran = GWT
			.create(StartTxnService.class);
	private final OptionServiceAsync _serviceoption = GWT
			.create(OptionService.class);

	private final HistoricServiceAsync _servicehistoric = GWT
			.create(HistoricService.class);
	private final GetStatusServiceAsync _servicestatues = GWT
			.create(GetStatusService.class);
	private final ClientServiceAsync serviceClient = 
			 GWT.create(ClientService.class);
	static String  header;
	static String footer;
	public static long idtarans;
	Timer timer;
	public static ArrayList<ProductsDTO> product
	= new ArrayList<ProductsDTO>();
	public static long _fond_totla=0;
    public static boolean USE_TIMER = true;
    public static int TIMER_DELAY = 1;
    public static ArrayList<String> printlist
	= new ArrayList<String>();
    String elementlistprint ="";
	interface DemarrerUiBinder extends UiBinder<Widget, CachRegisterServer> {
	}

	public CachRegisterServer()  {
		initWidget(uiBinder.createAndBindUi(this));

			txt_ticket.getElement().setAttribute("maxlength", "25");
			txt_header.setVisible(false);
			ServerSession.btn_ecpese.setEnabled(true);
			ServerSession.btn_payer.setEnabled(false);
			Num_bun =" ";
			ServerSession.lbl_unkuser.setText("Unknow user");
			_serviceoption.selectAllRows(new AsyncCallback<List<OptionDTO>>() {

				public void onFailure(Throwable arg0) {
					// TODO Auto-generated method stub
				}

				public void onSuccess(List<OptionDTO> option) {
					// TODO Auto-generated method stub
					header=option.get(0).getEntete();
					footer=option.get(0).getPied();
					txt_ticket.setText("=========================\n"+header+"=========================\n");
					ServerSession.lbl_unkuser.setText("Unknow user");

								}
			});
			ServerSession.cmd_ipterminal.clear();
			ServerSession.cmd_ipterminal.addItem(Authentification.adressip);
			ServerSession.cmd_ipterminal.addItem(Authentification.adressip1);
			ServerSession.cmd_ipterminal.addItem(Authentification.adressip2);
			ServerSession.cmd_ipterminal.addItem(Authentification.adressip3);
			
			ServerSession.bnt_esc.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
					ServerSession.lbl_notif.setText("");

					txt_ticket.setText("=========================\n"+header+"=========================\n");
					txt_header.setText("");
					_somme_totlal = 0;
					ServerSession.btn_ecpese.setEnabled(true);
					_sommeloyality=0;
					ServerSession.lbl_unkuser.setText("Unknow user");

					product.clear();
					 Num_bun=" ";
				 printlist.clear();

				}
			});
	
			ServerSession.btn_status.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
				 	_servicestatues.getTerminalState(ServerSession.cmd_ipterminal.getItemText(ServerSession.cmd_ipterminal.getSelectedIndex()),
				 			new AsyncCallback<String>() {
				    	
						public void onSuccess(String result) {
							ServerSession.btn_payer.setEnabled(true);
							ServerSession.lbl_output.setText(result);
							_servicestatues.getstatus(new AsyncCallback<String>() {

								public void onFailure(Throwable arg0) {

								}

								public void onSuccess(String result) {

									_servicestatues.getstatus(new AsyncCallback<String>() {

										public void onFailure(Throwable arg0) {

										}

										public void onSuccess(String status) {

											displayTerminalStatus(status);
										}

									});		
								
								}

							});	
							
							
							
						}
						public void onFailure(Throwable caught) {
							ServerSession.btn_payer.setEnabled(false);
							
						}
					
					});
					}
			});
	
		
			       ServerSession.btn_payer.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
				
						if (txt_header.getText().isEmpty()) {
							ServerSession.lbl_notif.setText("No current command");
							ServerSession.lbl_notif.setStyleName(style.ERROR());
						} else {
							ServerSession.btn_ecpese.setEnabled(false);
							final TransactionDataIn data = new TransactionDataIn(6,_somme_totlal, 7);
							timer =new Timer() {
								
								@Override
								public void run() {
									
								  	_servicestatues.getTerminalState(ServerSession.cmd_ipterminal.getItemText(ServerSession.cmd_ipterminal.getSelectedIndex()),new AsyncCallback<String>() {
								    	
										public void onSuccess(String result) {
											ServerSession.lbl_output.setText(result);	

											_servicestatues.getstatus(new AsyncCallback<String>() {

												public void onFailure(Throwable arg0) {

												}

												public void onSuccess(String status) {

													displayTerminalStatus(status);
												}

											});		
										
										}
										public void onFailure(Throwable caught) {
											//Window.alert("fail");
											
										}

										
									});
									
								}
							};

									  timer.schedule(1000);
									  timer.scheduleRepeating(500);	
							
										
							servicetran.Startransaction(ServerSession.cmd_ipterminal.getItemText(ServerSession.cmd_ipterminal.getSelectedIndex()), data,new AsyncCallback<TxnResponseDTO>() {
										public void onFailure(Throwable caught) {
											ServerSession.lbl_notif.setText("Transaction fail");
											ServerSession.lbl_notif.setStyleName(style.ERROR());

										}

										@SuppressWarnings("unused")
										public void onSuccess(final TxnResponseDTO respInfos) {
											timer.run();
											timer.cancel();
											ServerSession.lbl_notif.setText("Payment in progress");
											ServerSession.lbl_notif.setStyleName(style.success());
				
											if (respInfos != null) {
												_servicesave.insertRow(respInfos,new AsyncCallback<Void>() {

															public void onFailure(Throwable caught) {

																ServerSession.lbl_notif.setText("Fail");
																ServerSession.lbl_notif.setStyleName(style.ERROR());
																

															}

															public void onSuccess(Void result) {

													ServerSession.lbl_notif.setText("Success Transaction");
													HistoricProduct();

													ServerSession.btn_ecpese.setEnabled(true);
													txt_ticket.setText("===========================\n"+header+"===========================\n");
													txt_header.setText("");
													_somme_totlal = 0;
													if(ServerSession.lbl_unkuser.getText().contains("Loyalty points"))
														
													{	ServerSession.lbl_notif.setText("Success Transaction");
														AlertClient.Newclient.setLoyality(AlertClient.Newclient.getLoyality()+_sommeloyality);
														serviceClient.updateRow(AlertClient.Newclient, new AsyncCallback<Void>() {
															
															public void onFailure(Throwable caught) {}

															public void onSuccess(Void result) { }
															
															});
																
															}
													_sommeloyality=0;
													

											}});
											} else {
												ServerSession.lbl_notif.setText("RespInfos transaction null ");

											}
											_servicesave.selectAllRows(new AsyncCallback<List<TxnResponseDTO>>() {
												public void onFailure(Throwable arg0) {
													// TODO Auto-generated method stub
													
												}
											
												public void onSuccess(List<TxnResponseDTO> response) {
														
										for (int i =0;i < product.size();i++)	
										{
											HistoricDTO Historic = new HistoricDTO();
											Historic.setProductid(product.get(i).getId_product());
											Historic.setIdtransaction(response.get( response.size()-1).getId());
											_servicehistoric.insertRow(Historic,new AsyncCallback<Void>() {

												public void onFailure(Throwable caught) {}

												public void onSuccess(Void result) {
													product.clear();

												}});}}});}});}}});
			
			ServerSession.btn_print.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
			
						DialogBox dlg = new Print(txt_ticket.getText());
			       // dlg.setPopupPosition(400, 100);
			        dlg.show();
			        dlg.center();
						}
			});
			ServerSession.btn_client.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
			
					DialogBox dlg = new AlertClient();
					dlg.center();

				}
			});
			ServerSession.btn_ecpese.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent arg0) {
				
			
					if (txt_header.getText().isEmpty()) {
								ServerSession.lbl_notif.setText("No current command");
								ServerSession.lbl_notif.setStyleName(style.ERROR());
							} else {
								ServerSession.btn_payer.setEnabled(false);
								if(ServerSession.lbl_unkuser.getText().contains("Loyalty points"))
									
								{
									AlertClient.Newclient.setLoyality(AlertClient.Newclient.getLoyality()+_sommeloyality);
									serviceClient.updateRow(AlertClient.Newclient, new AsyncCallback<Void>() {
										
										public void onFailure(Throwable caught) {
										}
										public void onSuccess(Void result) {
								
										}
										});
											
										}
								_sommeloyality=0;
								_fond_totla+=_somme_totlal;
					     		 HistoricProduct();
									ServerSession.lbl_notif.setText("command");

							}

				}
			});	
			
			
			
			
			
	}

	@SuppressWarnings("deprecation")
	public void addButtons(final List<RangesDTO> result) {

		vp_RayonPanel.clear();
		scrolrayon.setSize("245px", "310px");
		int width = vp_RayonPanel.getElement().getClientWidth();
		int buttonSize = 56;
		int space = 10;

		int rowCapacity = width / (buttonSize + space);
		HorizontalPanel hProduitPanel = new HorizontalPanel();
		int buttonCounter = 0;
		for (int i = 0; i < result.size(); i++) {
			// Image image = new Image(result.get(i).getImage().trim());
			// SafeHtmlBuilder builder = new SafeHtmlBuilder();
			// builder.appendHtmlConstant(image.toString());
			String html = "<div><center><img src = '"
					+ result.get(i).getImage().trim()
					+ "' height = '53px' width = '55px'></img></center><label><b><font color='blue'>"
					+ result.get(i).getName().substring(0, 8)
					+ "</b></font></label></br></div>";
			Button b = new Button();
			b.setHTML(html);
			bindButton(b, result.get(i));
			addproduct(result.get(i));

			b.setWidth("65px");
			b.setHeight("63px");

			b.getElement().getStyle().setMarginLeft(space, Unit.PX);
			b.getElement().getStyle().setMarginBottom(13, Unit.PX);
			hProduitPanel.add(b);
			b.addMouseListener(new TooltipListener(result.get(i)
					.getDescription(), 5000, style.style()));

			buttonCounter++;
			if (buttonCounter == rowCapacity) {
				buttonCounter = 0;
				vp_RayonPanel.add(hProduitPanel);
				hProduitPanel = new HorizontalPanel();

			}

		}
		
		vp_RayonPanel.add(hProduitPanel);

	}

	private void addproduct(RangesDTO rangesDTO) {
		produitService.getProduitByRayon(rangesDTO.getCode(),
				new AsyncCallback<List<ProductsDTO>>() {

					public void onSuccess(List<ProductsDTO> result) {
						// TODO Auto-generated method stub
						addProduits(result);
					}

					public void onFailure(Throwable arg0) {
						// TODO Auto-generated method stub

					}
				});

	}

	@SuppressWarnings("deprecation")
	public void addProduits(final List<ProductsDTO> result) {

		vp_ProduitPanel.clear();
		scrolpanel.setSize("245px", "310px");
		int width = vp_ProduitPanel.getElement().getClientWidth();
		int buttonSize = 56;
		int space = 14;
		int rowCapacity = width / (buttonSize + space);
		HorizontalPanel hPPanel = new HorizontalPanel();
		int buttonCounter = 0;
		for (int i = 0; i < result.size(); i++) {
			// Image image = new Image(result.get(i).getNom());
			// SafeHtmlBuilder builder = new SafeHtmlBuilder();
			// builder.appendHtmlConstant(image.toString());
			Button b = new Button(result.get(i).getName());
			String html = "<div><center><img src = '"
					+ result.get(i).getImage().trim()
					+ "' height = '51px' width = '65px'></img></center><label><b>"
					+ result.get(i).getName().substring(0, 7)
					+ "</b></font></label></br></div>";
			b.setHTML(html);
			b.addMouseListener(new TooltipListener(result.get(i)
					.getDescreption(), 5000, style.style()));

			bindTiket(b, result.get(i));
			b.setWidth("65px");
			b.setHeight("63px");
			b.getElement().getStyle().setMarginLeft(space, Unit.PX);
			b.getElement().getStyle().setMarginBottom(13, Unit.PX);
			hPPanel.add(b);
			buttonCounter++;
			if (buttonCounter == rowCapacity) {
				buttonCounter = 0;
				vp_ProduitPanel.add(hPPanel);

				

				hPPanel = new HorizontalPanel();

			}

		}
		vp_ProduitPanel.add(hPPanel);

	}

	public void addNumber() {

		vpNumber.clear();

		int width = vpNumber.getElement().getClientWidth();
		int buttonSize = 56;
		int space = 10;
		int rowCapacity = width / (buttonSize + space);
		HorizontalPanel hPPanel = new HorizontalPanel();
		int buttonCounter = 0;

		for (int i = 9; i >= 0; i--) {
			Button b = new Button(String.valueOf(i));
			getNumber(b);
			b.setWidth("65px");
			b.setHeight("51px");
			b.getElement().getStyle().setMarginLeft(space, Unit.PX);
			b.getElement().getStyle().setMarginBottom(13, Unit.PX);
			b.setStyleName("btn btn-inverse");

			hPPanel.add(b);
			buttonCounter++;
			if (buttonCounter == rowCapacity) {
				buttonCounter = 0;

				vpNumber.add(hPPanel);
				hPPanel = new HorizontalPanel();

			}
		}
		vpNumber.add(hPPanel);

	}

	private void getNumber(final Button b) {

		b.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent arg0) {
				Num_bun += b.getText();
						}
		});

	}

	public void bindTiket(final Button b, final ProductsDTO produit_defDTO) {
		b.addClickHandler(new ClickHandler() {
			@SuppressWarnings("deprecation")
			public void onClick(ClickEvent arg0) {

				/* ###########control maxLength textera########### */
			
				Date date = new Date();
				int counter = new Integer(produit_defDTO.getName().length()).intValue();
				long _somme =0;
				int charsRemaining = counter-7;
				//Window.alert(String.valueOf(charsRemaining));

			
					if (Num_bun ==" ")
				{  
						
						_somme = Long.parseLong(produit_defDTO.getBuy());
						produit_defDTO.setPrice(_somme);
					   	produit_defDTO.setQuantity(1);
						product.add(produit_defDTO);
    					if (compte_ligne(txt_ticket.getText()) == false) {
						if (charsRemaining <= 0) {
							txt_header.setText(txt_header.getText()+1+" "+
						"X"+" " + produit_defDTO.getName().substring(0, 5)+"             "+
							 _somme +"\n");
							elementlistprint=1+" "+"X"+" " + produit_defDTO.getName().substring(0, 5)+"           "+_somme;
							printlist.add(elementlistprint);
						} else {
							txt_header.setText(txt_header.getText()+1+" "
						+"X"+" "  + produit_defDTO.getName().substring(0, 5)
									+ "               " + _somme + "\n");
							elementlistprint=1+" "+"X"+" "  + produit_defDTO.getName().substring(0, 5)+ "                    " + _somme;
							printlist.add(elementlistprint);
						}
						}
    				
	
				}
				else 
				{		

     				_somme = Long.valueOf(Num_bun.trim())* Long.parseLong(produit_defDTO.getBuy());
     				produit_defDTO.setPrice(_somme);
					produit_defDTO.setQuantity(Long.valueOf(Num_bun.trim()));
					product.add(produit_defDTO);
						if (compte_ligne(txt_ticket.getText()) == false) {
							if (charsRemaining <= 0) {
								txt_header.setVisible(false);
								txt_header.setText(txt_header.getText()
								 +Long.valueOf(Num_bun.trim())+" "+"X"+" "+produit_defDTO.getName()+"              "+
								 _somme +"\n");
								elementlistprint=Long.valueOf(Num_bun.trim())+" "+"X"+" "+produit_defDTO.getName()+"         "+
										 _somme ;
								printlist.add(elementlistprint);
								Num_bun=" ";
							
							} 
							 else {
								txt_header.setVisible(false);
								txt_header.setText(txt_header.getText()+Long.valueOf(Num_bun.trim())+
								" "+"X"+" " + produit_defDTO.getName().substring(0, 5)
										+ "              " + _somme + "\n");
								elementlistprint=Long.valueOf(Num_bun.trim())+
										" "+"X"+" " + produit_defDTO.getName().substring(0, 5)
												+ "          " + _somme;
										printlist.add(elementlistprint);
								Num_bun=" ";
						

							}
						
						}
						
						Num_bun =" ";
					
				}
			

				_somme_totlal = _somme_totlal + _somme;
				_sommeloyality=_sommeloyality+Long.valueOf(produit_defDTO.getLoyality());

				txt_ticket.setText("=========================\n"+header+"=========================\n"
						+ "\n"
						+ txt_header.getText()
						+ "\n                           ------------\nTOTAL          "
						+ "        "+_somme_totlal
						+ "\n     "
						+ "                      ------------\n"
					
						+ "  "+DateTimeFormat.getMediumDateTimeFormat().format(date)+
					    "\n\n"+"------------------------------------------------"+footer);
			ServerSession.lbl_notif.setStyleName(style.success());
				ServerSession.lbl_notif.setText("Command in progress");


			}});
		
	}

	private void bindButton(Button b, final RangesDTO rayon_defDTO) {
		b.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent arg0) {
				produitService.getProduitByRayon(rayon_defDTO.getCode(),
						new AsyncCallback<List<ProductsDTO>>() {

							public void onSuccess(List<ProductsDTO> result) {
								// TODO Auto-generated method stub
								addProduits(result);
							}

							public void onFailure(Throwable arg0) {
								// TODO Auto-generated method stub

							}
						});
			}});

	}



	@UiHandler("panel")
	void onPanelAttachOrDetach(AttachEvent event) {
		addNumber();
		_service.selectAllRows(new AsyncCallback<List<RangesDTO>>() {

			public void onSuccess(List<RangesDTO> arg0) {

				addButtons(arg0);
				addproduct(arg0.get(0));
			}

			public void onFailure(Throwable arg0) {
				// TODO Auto-generated method stub

			}
		});
	}





	/* ###########Nombre des lignes########### */
	public boolean compte_ligne(String texte) {
		boolean status = false;
		int nbligne_max = 500;// nombre max de ligne souhaité
		String nl = "\n";// correspond au caractère retour chariot
		int nbligne = texte.split(nl).length;
		if (nbligne >= nbligne_max) {
			ServerSession.lbl_notif.setText("You can not write more "+ nbligne_max + " lines");
			status = true;
		}

		return status;
	}


	
	public void displayTerminalStatus(String status) {
		if (status.trim().equals("UNKNOWN"))

		{
			ServerSession.lbl_state.setStyleName(style.UNKNOWN());
		}

		else if (status.trim().equals("IDLE"))

		{
			ServerSession.lbl_state.setStyleName(style.IDLE());
		} else if (status.trim().equals("BUSY"))

		{
			ServerSession.lbl_state.setStyleName(style.BUSY());
					} else if (status.trim().equals("CARD_INSERT"))

		{
			ServerSession.lbl_state.setStyleName(style.CARD_INSERT());
		} else if (status.trim().equals("PIN_VERIFY"))

		{
			ServerSession.lbl_state.setStyleName(style.PIN_VERIFY());
		} else if (status.trim().equals("AUTHORISING"))

		{
			ServerSession.lbl_state.setStyleName(style.AUTHORISING());
		} else if (status.trim().equals("COMPLETION")) {
			ServerSession.lbl_state.setStyleName(style.COMPLETION());
		} else {
			ServerSession.lbl_state.setStyleName(style.CANCELLED());
		}
		ServerSession.lbl_state.setText(status);
	}
void HistoricProduct()
{
	_servicesave.selectAllRows(new AsyncCallback<List<TxnResponseDTO>>() {
		public void onFailure(Throwable arg0) {
			// TODO Auto-generated method stub
			
		}
	
		public void onSuccess(List<TxnResponseDTO> reponse) {
				
for (int i =0;i < product.size();i++)	
{
	HistoricDTO Historic = new HistoricDTO();
	Historic.setProductid(product.get(i).getId_product());
	Historic.setName(product.get(i).getName());
	Historic.setDescreption(product.get(i).getDescreption());
	
	Historic.setPrice(product.get(i).getPrice());
	Historic.setQuantity(product.get(i).getQuantity());
	Historic.setSale(product.get(i).getSale());
	Historic.setLoyality(product.get(i).getLoyality());
	Historic.setIdtransaction(reponse.get( reponse.size()-1).getId());
	_servicehistoric.insertRow(Historic,new AsyncCallback<Void>() {

		public void onFailure(Throwable caught) {}

		public void onSuccess(Void result) {
			product.clear();
			

}});}}});}


/**
        * Prints the passed widget.
        * 
        * @param widget
        */
public void printWidget(Widget widget)
{
	String printHTML = "<html>" + txt_ticket + "<body>" + txt_ticket.getElement().getInnerHTML()
			+ "</body></html>";
	   ecr.web.app.client.services.Print.it(printHTML);
}
}
