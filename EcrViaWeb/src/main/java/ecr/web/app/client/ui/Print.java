package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import ecr.web.app.client.services.ServicePrintInfos;
import ecr.web.app.client.services.ServicePrintInfosAsync;
public class Print extends DialogBox {
	private final ServicePrintInfosAsync serviceprintinfo = 
			GWT.create(ServicePrintInfos.class);
	private static PrintUiBinder uiBinder = GWT.create(PrintUiBinder.class);
	@UiField
	RadioButton radio_terminal;
	
	
	@UiField
	Button btn_cancel;
	@UiField
	Button btn_ok;
		private String content1=""; 
		private String Header=	"============="+
				"<p style='text-align:center'>"+			
				CachRegisterServer.header +"</p>"+ "=============";
		
		
		
		
		private String content;
	interface PrintUiBinder extends UiBinder<Widget, Print> {
	}

	public Print(String content) {
		
		setWidget(uiBinder.createAndBindUi(this));
		for (int i=0;i<CachRegisterServer.printlist.size();i++)
		{
						content1+=CachRegisterServer.printlist.get(i)+"<br>";
		}
		CachRegisterServer.printlist.clear();
    	this.content = content;
		btn_ok.setStyleName("btn btn-primary");
		btn_cancel.setStyleName("btn btn-danger");
		
	}

	@SuppressWarnings("deprecation")
	@UiHandler("btn_ok")
	void onBtn_okClick(ClickEvent event) {
		if (radio_terminal.isChecked()) {
			String ToPrint = Header+"\n"+content1+"\n <b> TOTAL :</b>"+
					"        "+CachRegisterServer._somme_totlal  +"\n---------------------------------------"+
					"<p style='text-align:center'>"+CachRegisterServer.footer+"</p> \n";
			

		serviceprintinfo.printInfos(ServerSession.cmd_ipterminal.getItemText(ServerSession.cmd_ipterminal.getSelectedIndex()),ToPrint, new AsyncCallback<Void>() {
				
				public void onSuccess(Void result) {
					// TODO Auto-generated method stub
					
				}
				
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
		} else {
			
			
			//Window.alert(content1);
			/*content1=Begin.printlist.get(1)+"<br>";
			String content2 = Begin.printlist.get(2);
			*/
			//String htmlcode = "<form> <input type='button' onclick='window.print()'> <img src='images/Print.png'/>     </form>";


			String htmlcode = "<form><input type='button' value='Print this page' onClick='window.print()'> </form> ";
			
			//htmlcode += "<script>function jsCode(){ var printWin; printWin.document.write("+panelToPrint1+"); printWin.document.close();   printWin.focus();   printWin.print();   printWin.close();}</script>";
			HTMLPanel panelToPrint = new HTMLPanel(Header+"<small><br>"+content1+"<br><b> TOTAL :</b>"+
					"        "+CachRegisterServer._somme_totlal  +"<br>-------------------------------------------"+
					"<p style='text-align:center'>"+CachRegisterServer.footer+"</p><p style='text-align:center'>You don't have the right to change any product after 3 days </small></p><br>"+htmlcode);
			
		
			panelToPrint.setPixelSize(167, 20);
			openPrintWindow(panelToPrint.toString());
					}
	}

	@UiHandler("btn_cancel")
	void onBtn_canncelClick(ClickEvent event) {
		hide();
	}

	native void openPrintWindow(String contents ) /*-{
													var printWindow = window.open("", "PrintWin");
													if (printWindow && printWindow.top) {
													printWindow.document.write(contents);
													
													} else {
													alert("The print feature works by opening a popup window, but our popup window was blocked by your browser.  If you can disable the blocker temporarily, you'll be able to print here.  Sorry!");
													}
													}-*/;
	

	
	
	
	
	
}

//printWindow.print();
//printWindow.close();
