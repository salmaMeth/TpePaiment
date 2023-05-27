package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class CachRegisterServer_DemarrerUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.CachRegisterServer>, ecr.web.app.client.ui.CachRegisterServer.DemarrerUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<iframe id='__printingFrame' style='width:0;height:0;border:0'></iframe> <span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.CachRegisterServer owner) {


    return new Widgets(owner).get_panel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.CachRegisterServer owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onPanelAttachOrDetach(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.CachRegisterServer owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.CachRegisterServer_DemarrerUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      owner.style = style;

      return style;
    }

    /**
     * Getter for panel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel() {
      return build_panel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      panel.setHeight("");
      panel.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord9 = UiBinderUtil.attachToDom(panel.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord9.detach();
      panel.addAndReplaceElement(get_f_HorizontalPanel1(), get_domId0Element().get());

      owner.panel = panel;

      return panel;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel1.add(get_txt_header());
      f_HorizontalPanel1.add(get_txt_number());
      f_HorizontalPanel1.add(get_vpNumber());
      f_HorizontalPanel1.add(get_scrolpanel());
      f_HorizontalPanel1.add(get_scrolrayon());
      f_HorizontalPanel1.add(get_f_VerticalPanel7());
      f_HorizontalPanel1.setHeight("453px");
      f_HorizontalPanel1.setWidth("900");


      return f_HorizontalPanel1;
    }

    /**
     * Getter for txt_header called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_header() {
      return build_txt_header();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_header() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_header = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_header.setHeight("0px");
      txt_header.setWidth("0px");


      owner.txt_header = txt_header;

      return txt_header;
    }

    /**
     * Getter for txt_number called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_number() {
      return build_txt_number();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_number() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_number = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_number.setHeight("0px");
      txt_number.setWidth("0px");


      owner.txt_number = txt_number;

      return txt_number;
    }

    /**
     * Getter for vpNumber called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_vpNumber() {
      return build_vpNumber();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_vpNumber() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel vpNumber = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      vpNumber.add(get_hpZero());
      vpNumber.add(get_hpOperation());
      vpNumber.setWidth("215px");


      owner.vpNumber = vpNumber;

      return vpNumber;
    }

    /**
     * Getter for hpZero called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_hpZero() {
      return build_hpZero();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_hpZero() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel hpZero = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      hpZero.add(get_textButton());
      hpZero.add(get_f_TextButton2());
      hpZero.add(get_f_TextButton3());
      hpZero.setHeight("58px");
      hpZero.setWidth("212px");


      owner.hpZero = hpZero;

      return hpZero;
    }

    /**
     * Getter for textButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_textButton() {
      return build_textButton();
    }
    private com.google.gwt.widget.client.TextButton build_textButton() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton textButton = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      textButton.setText("0");
      textButton.setHeight("51px");
      textButton.setWidth("65px");


      return textButton;
    }

    /**
     * Getter for f_TextButton2 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_f_TextButton2() {
      return build_f_TextButton2();
    }
    private com.google.gwt.widget.client.TextButton build_f_TextButton2() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton f_TextButton2 = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      f_TextButton2.setText("00");
      f_TextButton2.setHeight("51px");
      f_TextButton2.setWidth("65px");


      return f_TextButton2;
    }

    /**
     * Getter for f_TextButton3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_f_TextButton3() {
      return build_f_TextButton3();
    }
    private com.google.gwt.widget.client.TextButton build_f_TextButton3() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton f_TextButton3 = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      f_TextButton3.setText("000");
      f_TextButton3.setHeight("51px");
      f_TextButton3.setWidth("65px");


      return f_TextButton3;
    }

    /**
     * Getter for hpOperation called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_hpOperation() {
      return build_hpOperation();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_hpOperation() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel hpOperation = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      hpOperation.add(get_f_TextButton4());
      hpOperation.add(get_f_TextButton5());
      hpOperation.add(get_f_TextButton6());
      hpOperation.setHeight("58px");
      hpOperation.setWidth("212px");


      owner.hpOperation = hpOperation;

      return hpOperation;
    }

    /**
     * Getter for f_TextButton4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_f_TextButton4() {
      return build_f_TextButton4();
    }
    private com.google.gwt.widget.client.TextButton build_f_TextButton4() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton f_TextButton4 = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      f_TextButton4.setText("+");
      f_TextButton4.setHeight("51px");
      f_TextButton4.setWidth("65px");


      return f_TextButton4;
    }

    /**
     * Getter for f_TextButton5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_f_TextButton5() {
      return build_f_TextButton5();
    }
    private com.google.gwt.widget.client.TextButton build_f_TextButton5() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton f_TextButton5 = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      f_TextButton5.setText(".");
      f_TextButton5.setHeight("51px");
      f_TextButton5.setWidth("65px");


      return f_TextButton5;
    }

    /**
     * Getter for f_TextButton6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.widget.client.TextButton get_f_TextButton6() {
      return build_f_TextButton6();
    }
    private com.google.gwt.widget.client.TextButton build_f_TextButton6() {
      // Creation section.
      final com.google.gwt.widget.client.TextButton f_TextButton6 = (com.google.gwt.widget.client.TextButton) GWT.create(com.google.gwt.widget.client.TextButton.class);
      // Setup section.
      f_TextButton6.setText("X");
      f_TextButton6.setHeight("51px");
      f_TextButton6.setWidth("65px");


      return f_TextButton6;
    }

    /**
     * Getter for scrolpanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_scrolpanel() {
      return build_scrolpanel();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_scrolpanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel scrolpanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      scrolpanel.add(get_vp_ProduitPanel());
      scrolpanel.setHeight("319px");
      scrolpanel.setWidth("253px");


      owner.scrolpanel = scrolpanel;

      return scrolpanel;
    }

    /**
     * Getter for vp_ProduitPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_vp_ProduitPanel() {
      return build_vp_ProduitPanel();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_vp_ProduitPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel vp_ProduitPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      vp_ProduitPanel.setHeight("319px");
      vp_ProduitPanel.setWidth("253px");


      owner.vp_ProduitPanel = vp_ProduitPanel;

      return vp_ProduitPanel;
    }

    /**
     * Getter for scrolrayon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_scrolrayon() {
      return build_scrolrayon();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_scrolrayon() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel scrolrayon = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      scrolrayon.add(get_vp_RayonPanel());
      scrolrayon.setWidth("248px");


      owner.scrolrayon = scrolrayon;

      return scrolrayon;
    }

    /**
     * Getter for vp_RayonPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_vp_RayonPanel() {
      return build_vp_RayonPanel();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_vp_RayonPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel vp_RayonPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      vp_RayonPanel.setWidth("253px");


      owner.vp_RayonPanel = vp_RayonPanel;

      return vp_RayonPanel;
    }

    /**
     * Getter for f_VerticalPanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel7() {
      return build_f_VerticalPanel7();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel7 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel7.add(get_txt_ticket());
      f_VerticalPanel7.setHeight("380px");


      return f_VerticalPanel7;
    }

    /**
     * Getter for txt_ticket called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_ticket() {
      return build_txt_ticket();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_ticket() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_ticket = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_ticket.setStyleName("" + get_style().text() + "");
      txt_ticket.setAlignment(com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment.LEFT);
      txt_ticket.setHeight("327px");
      txt_ticket.setReadOnly(true);
      txt_ticket.setCharacterWidth(25);
      txt_ticket.setWidth("217px");


      owner.txt_ticket = txt_ticket;

      return txt_ticket;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
