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

public class AjoutCash_AjoutCashUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutCash>, ecr.web.app.client.ui.AjoutCash.AjoutCashUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutCash owner) {


    return new Widgets(owner).get_panel_ajoutuser();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutCash owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_savePtsClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_resetPtsClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutCash owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel6();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutCash_AjoutCashUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for panel_ajoutuser called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel_ajoutuser() {
      return build_panel_ajoutuser();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel_ajoutuser() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel_ajoutuser = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord29 = UiBinderUtil.attachToDom(panel_ajoutuser.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord29.detach();
      panel_ajoutuser.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

      return panel_ajoutuser;
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
     * Getter for horizontalPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_horizontalPanel() {
      return build_horizontalPanel();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_horizontalPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel horizontalPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      horizontalPanel.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      horizontalPanel.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      horizontalPanel.add(get_f_VerticalPanel1());
      horizontalPanel.add(get_f_DisclosurePanel6());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel6(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      horizontalPanel.setHeight("148px");
      horizontalPanel.setWidth("641px");


      return horizontalPanel;
    }

    /**
     * Getter for f_VerticalPanel1 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel1() {
      return build_f_VerticalPanel1();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel1.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.add(get_f_HorizontalPanel4());
      f_VerticalPanel1.setHeight("121px");
      f_VerticalPanel1.setWidth("358px");


      return f_VerticalPanel1;
    }

    /**
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.add(get_txt_idcach());
      f_HorizontalPanel2.setHeight("31px");
      f_HorizontalPanel2.setWidth("337px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Id Cach");
      f_Label3.setWidth("140px");


      return f_Label3;
    }

    /**
     * Getter for txt_idcach called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_idcach() {
      return build_txt_idcach();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_idcach() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_idcach = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_idcach = txt_idcach;

      return txt_idcach;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.add(get_txt_total());
      f_HorizontalPanel4.setHeight("31px");
      f_HorizontalPanel4.setWidth("337px");


      return f_HorizontalPanel4;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("Total");
      f_Label5.setWidth("140px");


      return f_Label5;
    }

    /**
     * Getter for txt_total called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_total() {
      return build_txt_total();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_total() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_total = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_total = txt_total;

      return txt_total;
    }

    /**
     * Getter for f_DisclosurePanel6 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel6;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel6() {
      return f_DisclosurePanel6;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel6() {
      // Creation section.
      f_DisclosurePanel6 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel6.add(get_f_VerticalPanel7());
      f_DisclosurePanel6.setOpen(true);
      f_DisclosurePanel6.setHeight("116px");


      return f_DisclosurePanel6;
    }

    /**
     * Getter for f_VerticalPanel7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel7() {
      return build_f_VerticalPanel7();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel7 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel7.add(get_bn_Ajout_cach());
      f_VerticalPanel7.add(get_btn_annuler());
      f_VerticalPanel7.setHeight("100px");
      f_VerticalPanel7.setWidth("132px");


      return f_VerticalPanel7;
    }

    /**
     * Getter for bn_Ajout_cach called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bn_Ajout_cach() {
      return build_bn_Ajout_cach();
    }
    private com.google.gwt.user.client.ui.Button build_bn_Ajout_cach() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bn_Ajout_cach = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bn_Ajout_cach.setText("Add Cach");
      bn_Ajout_cach.setHeight("33px");
      bn_Ajout_cach.setWidth("173px");
      bn_Ajout_cach.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.bn_Ajout_cach = bn_Ajout_cach;

      return bn_Ajout_cach;
    }

    /**
     * Getter for btn_annuler called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_annuler() {
      return build_btn_annuler();
    }
    private com.google.gwt.user.client.ui.Button build_btn_annuler() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_annuler = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_annuler.setText("Cancel");
      btn_annuler.setHeight("33px");
      btn_annuler.setWidth("173px");
      btn_annuler.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_annuler = btn_annuler;

      return btn_annuler;
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
