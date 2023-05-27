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

public class AjoutPts_AjoutPtsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutPts>, ecr.web.app.client.ui.AjoutPts.AjoutPtsUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<i class='icon-upload-alt'></i> Upload")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutPts owner) {


    return new Widgets(owner).get_panel_ajoutpdt();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutPts owner;


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

    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onPanel_ajoutpdtAttachOrDetach(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_UploadClick(event);
      }
    };

    final com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler() {
      public void onSubmitComplete(com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent event) {
        owner.onPan_formSubmitComplete(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutPts owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel31();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutPts_AjoutPtsUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for panel_ajoutpdt called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel_ajoutpdt() {
      return build_panel_ajoutpdt();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel_ajoutpdt() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel_ajoutpdt = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      panel_ajoutpdt.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord38 = UiBinderUtil.attachToDom(panel_ajoutpdt.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord38.detach();
      panel_ajoutpdt.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

      owner.panel_ajoutpdt = panel_ajoutpdt;

      return panel_ajoutpdt;
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
      horizontalPanel.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      horizontalPanel.add(get_f_VerticalPanel1());
      horizontalPanel.add(get_f_VerticalPanel18());
      horizontalPanel.add(get_f_DisclosurePanel31());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel31(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      horizontalPanel.setHeight("340px");
      horizontalPanel.setWidth("971px");


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
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.add(get_f_HorizontalPanel4());
      f_VerticalPanel1.add(get_f_HorizontalPanel6());
      f_VerticalPanel1.add(get_f_HorizontalPanel8());
      f_VerticalPanel1.add(get_f_HorizontalPanel10());
      f_VerticalPanel1.add(get_f_HorizontalPanel12());
      f_VerticalPanel1.add(get_f_HorizontalPanel14());
      f_VerticalPanel1.add(get_f_HorizontalPanel16());
      f_VerticalPanel1.setHeight("319px");
      f_VerticalPanel1.setWidth("341px");


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
      f_HorizontalPanel2.add(get_txt_NomPts());
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
      f_Label3.setText("Name");
      f_Label3.setWidth("140px");


      return f_Label3;
    }

    /**
     * Getter for txt_NomPts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_NomPts() {
      return build_txt_NomPts();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_NomPts() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_NomPts = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_NomPts = txt_NomPts;

      return txt_NomPts;
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
      f_HorizontalPanel4.add(get_txt_DesPts());
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
      f_Label5.setText("Description");
      f_Label5.setWidth("140px");


      return f_Label5;
    }

    /**
     * Getter for txt_DesPts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_DesPts() {
      return build_txt_DesPts();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_DesPts() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_DesPts = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_DesPts = txt_DesPts;

      return txt_DesPts;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.add(get_txt_CodePts());
      f_HorizontalPanel6.setHeight("31px");
      f_HorizontalPanel6.setWidth("337px");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setText("Product bar code");
      f_Label7.setWidth("140px");


      return f_Label7;
    }

    /**
     * Getter for txt_CodePts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_CodePts() {
      return build_txt_CodePts();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_CodePts() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_CodePts = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_CodePts = txt_CodePts;

      return txt_CodePts;
    }

    /**
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.add(get_f_Label9());
      f_HorizontalPanel8.add(get_txt_vende());
      f_HorizontalPanel8.setHeight("31px");
      f_HorizontalPanel8.setWidth("337px");


      return f_HorizontalPanel8;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label9.setText("Purchasing price");
      f_Label9.setWidth("140px");


      return f_Label9;
    }

    /**
     * Getter for txt_vende called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_vende() {
      return build_txt_vende();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_vende() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_vende = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_vende = txt_vende;

      return txt_vende;
    }

    /**
     * Getter for f_HorizontalPanel10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel10() {
      return build_f_HorizontalPanel10();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel10 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel10.add(get_f_Label11());
      f_HorizontalPanel10.add(get_txt_achat());
      f_HorizontalPanel10.setHeight("31px");
      f_HorizontalPanel10.setWidth("337px");


      return f_HorizontalPanel10;
    }

    /**
     * Getter for f_Label11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label11() {
      return build_f_Label11();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label11() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label11.setText("Selling price");
      f_Label11.setWidth("140px");


      return f_Label11;
    }

    /**
     * Getter for txt_achat called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_achat() {
      return build_txt_achat();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_achat() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_achat = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_achat = txt_achat;

      return txt_achat;
    }

    /**
     * Getter for f_HorizontalPanel12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel12() {
      return build_f_HorizontalPanel12();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel12 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel12.add(get_f_Label13());
      f_HorizontalPanel12.add(get_cm_TVA());
      f_HorizontalPanel12.setHeight("31px");
      f_HorizontalPanel12.setWidth("337px");


      return f_HorizontalPanel12;
    }

    /**
     * Getter for f_Label13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label13() {
      return build_f_Label13();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label13() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label13.setText("TVA");
      f_Label13.setWidth("140px");


      return f_Label13;
    }

    /**
     * Getter for cm_TVA called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cm_TVA() {
      return build_cm_TVA();
    }
    private com.google.gwt.user.client.ui.ListBox build_cm_TVA() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cm_TVA = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cm_TVA.addItem("", "1");
      cm_TVA.addItem("30", "2");
      cm_TVA.addItem("20", "3");
      cm_TVA.addItem("40", "4");


      owner.cm_TVA = cm_TVA;

      return cm_TVA;
    }

    /**
     * Getter for f_HorizontalPanel14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel14() {
      return build_f_HorizontalPanel14();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel14 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel14.add(get_f_Label15());
      f_HorizontalPanel14.add(get_txt_StokPts());
      f_HorizontalPanel14.setHeight("31px");
      f_HorizontalPanel14.setWidth("337px");


      return f_HorizontalPanel14;
    }

    /**
     * Getter for f_Label15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label15() {
      return build_f_Label15();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label15() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label15.setText("Stock");
      f_Label15.setWidth("140px");


      return f_Label15;
    }

    /**
     * Getter for txt_StokPts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_StokPts() {
      return build_txt_StokPts();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_StokPts() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_StokPts = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_StokPts = txt_StokPts;

      return txt_StokPts;
    }

    /**
     * Getter for f_HorizontalPanel16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel16() {
      return build_f_HorizontalPanel16();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel16 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel16.add(get_f_Label17());
      f_HorizontalPanel16.add(get_txt_PtsFidalit());
      f_HorizontalPanel16.setHeight("31px");
      f_HorizontalPanel16.setWidth("337px");


      return f_HorizontalPanel16;
    }

    /**
     * Getter for f_Label17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label17() {
      return build_f_Label17();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label17() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label17.setText("Loyality point");
      f_Label17.setWidth("140px");


      return f_Label17;
    }

    /**
     * Getter for txt_PtsFidalit called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_PtsFidalit() {
      return build_txt_PtsFidalit();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_PtsFidalit() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_PtsFidalit = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_PtsFidalit = txt_PtsFidalit;

      return txt_PtsFidalit;
    }

    /**
     * Getter for f_VerticalPanel18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel18() {
      return build_f_VerticalPanel18();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel18() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel18 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel18.add(get_f_HorizontalPanel19());
      f_VerticalPanel18.add(get_f_HorizontalPanel21());
      f_VerticalPanel18.add(get_f_HorizontalPanel23());
      f_VerticalPanel18.add(get_f_HorizontalPanel25());
      f_VerticalPanel18.add(get_f_HorizontalPanel27());
      f_VerticalPanel18.add(get_f_HorizontalPanel29());
      f_VerticalPanel18.setHeight("319px");
      f_VerticalPanel18.setWidth("341px");


      return f_VerticalPanel18;
    }

    /**
     * Getter for f_HorizontalPanel19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel19() {
      return build_f_HorizontalPanel19();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel19 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel19.add(get_f_Label20());
      f_HorizontalPanel19.add(get_cmb_Remise());
      f_HorizontalPanel19.setHeight("31px");
      f_HorizontalPanel19.setWidth("337px");


      return f_HorizontalPanel19;
    }

    /**
     * Getter for f_Label20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label20() {
      return build_f_Label20();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label20.setText("Discount");
      f_Label20.setWidth("140px");


      return f_Label20;
    }

    /**
     * Getter for cmb_Remise called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_Remise() {
      return build_cmb_Remise();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_Remise() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_Remise = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmb_Remise.addItem("", "1");
      cmb_Remise.addItem("50%", "2");
      cmb_Remise.addItem("60%", "3");
      cmb_Remise.addItem("80%", "4");


      owner.cmb_Remise = cmb_Remise;

      return cmb_Remise;
    }

    /**
     * Getter for f_HorizontalPanel21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel21() {
      return build_f_HorizontalPanel21();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel21 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel21.add(get_f_Label22());
      f_HorizontalPanel21.add(get_txt_fours());
      f_HorizontalPanel21.setHeight("31px");
      f_HorizontalPanel21.setWidth("337px");


      return f_HorizontalPanel21;
    }

    /**
     * Getter for f_Label22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label22() {
      return build_f_Label22();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label22() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label22 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label22.setText("Supplier code");
      f_Label22.setWidth("140px");


      return f_Label22;
    }

    /**
     * Getter for txt_fours called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_fours() {
      return build_txt_fours();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_fours() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_fours = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_fours = txt_fours;

      return txt_fours;
    }

    /**
     * Getter for f_HorizontalPanel23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel23() {
      return build_f_HorizontalPanel23();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel23() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel23 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel23.add(get_f_Label24());
      f_HorizontalPanel23.add(get_cmb_etat());
      f_HorizontalPanel23.setHeight("31px");
      f_HorizontalPanel23.setWidth("337px");


      return f_HorizontalPanel23;
    }

    /**
     * Getter for f_Label24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label24() {
      return build_f_Label24();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label24() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label24 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label24.setText("State");
      f_Label24.setWidth("140px");


      return f_Label24;
    }

    /**
     * Getter for cmb_etat called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_etat() {
      return build_cmb_etat();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_etat() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_etat = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmb_etat.addItem("", "1");
      cmb_etat.addItem("en stok", "2");
      cmb_etat.addItem("en rupture", "3");


      owner.cmb_etat = cmb_etat;

      return cmb_etat;
    }

    /**
     * Getter for f_HorizontalPanel25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel25() {
      return build_f_HorizontalPanel25();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel25() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel25 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel25.add(get_f_Label26());
      f_HorizontalPanel25.add(get_cmb_rayonpts());
      f_HorizontalPanel25.setHeight("31px");
      f_HorizontalPanel25.setWidth("337px");


      return f_HorizontalPanel25;
    }

    /**
     * Getter for f_Label26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label26() {
      return build_f_Label26();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label26() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label26 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label26.setText("Range");
      f_Label26.setWidth("140px");


      return f_Label26;
    }

    /**
     * Getter for cmb_rayonpts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_rayonpts() {
      return build_cmb_rayonpts();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_rayonpts() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_rayonpts = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      owner.cmb_rayonpts = cmb_rayonpts;

      return cmb_rayonpts;
    }

    /**
     * Getter for f_HorizontalPanel27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel27() {
      return build_f_HorizontalPanel27();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel27() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel27 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel27.add(get_f_Label28());
      f_HorizontalPanel27.add(get_cmd_provider());
      f_HorizontalPanel27.setHeight("31px");
      f_HorizontalPanel27.setWidth("337px");


      return f_HorizontalPanel27;
    }

    /**
     * Getter for f_Label28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label28() {
      return build_f_Label28();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label28() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label28 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label28.setText("Provider id");
      f_Label28.setWidth("140px");


      return f_Label28;
    }

    /**
     * Getter for cmd_provider called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmd_provider() {
      return build_cmd_provider();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_provider() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmd_provider = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmd_provider.addItem("", "1");
      cmd_provider.addItem("1", "2");


      owner.cmd_provider = cmd_provider;

      return cmd_provider;
    }

    /**
     * Getter for f_HorizontalPanel29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel29() {
      return build_f_HorizontalPanel29();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel29() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel29 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel29.add(get_pan_form());
      f_HorizontalPanel29.setHeight("31px");
      f_HorizontalPanel29.setWidth("337px");


      return f_HorizontalPanel29;
    }

    /**
     * Getter for pan_form called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.FormPanel get_pan_form() {
      return build_pan_form();
    }
    private com.google.gwt.user.client.ui.FormPanel build_pan_form() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel pan_form = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      pan_form.add(get_f_HorizontalPanel30());
      pan_form.setHeight("33px");
      pan_form.addSubmitCompleteHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);


      owner.pan_form = pan_form;

      return pan_form;
    }

    /**
     * Getter for f_HorizontalPanel30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel30() {
      return build_f_HorizontalPanel30();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel30() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel30 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel30.add(get_uploadFormElement());
      f_HorizontalPanel30.add(get_bnt_Upload());
      f_HorizontalPanel30.setHeight("25px");
      f_HorizontalPanel30.setWidth("331px");


      return f_HorizontalPanel30;
    }

    /**
     * Getter for uploadFormElement called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.FileUpload get_uploadFormElement() {
      return build_uploadFormElement();
    }
    private com.google.gwt.user.client.ui.FileUpload build_uploadFormElement() {
      // Creation section.
      final com.google.gwt.user.client.ui.FileUpload uploadFormElement = (com.google.gwt.user.client.ui.FileUpload) GWT.create(com.google.gwt.user.client.ui.FileUpload.class);
      // Setup section.
      uploadFormElement.setWidth("256px");


      owner.uploadFormElement = uploadFormElement;

      return uploadFormElement;
    }

    /**
     * Getter for bnt_Upload called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Upload() {
      return build_bnt_Upload();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Upload() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Upload = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Upload.setHTML(template_html1().asString());
      bnt_Upload.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      owner.bnt_Upload = bnt_Upload;

      return bnt_Upload;
    }

    /**
     * Getter for f_DisclosurePanel31 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel31;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel31() {
      return f_DisclosurePanel31;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel31() {
      // Creation section.
      f_DisclosurePanel31 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel31.add(get_f_VerticalPanel32());
      f_DisclosurePanel31.setOpen(true);
      f_DisclosurePanel31.setHeight("116px");


      return f_DisclosurePanel31;
    }

    /**
     * Getter for f_VerticalPanel32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel32() {
      return build_f_VerticalPanel32();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel32() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel32 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel32.add(get_btn_savePts());
      f_VerticalPanel32.add(get_btn_resetPts());
      f_VerticalPanel32.setHeight("100px");
      f_VerticalPanel32.setWidth("132px");


      return f_VerticalPanel32;
    }

    /**
     * Getter for btn_savePts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_savePts() {
      return build_btn_savePts();
    }
    private com.google.gwt.user.client.ui.Button build_btn_savePts() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_savePts = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_savePts.setText("Save product");
      btn_savePts.setHeight("33px");
      btn_savePts.setWidth("173px");
      btn_savePts.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.btn_savePts = btn_savePts;

      return btn_savePts;
    }

    /**
     * Getter for btn_resetPts called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_resetPts() {
      return build_btn_resetPts();
    }
    private com.google.gwt.user.client.ui.Button build_btn_resetPts() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_resetPts = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_resetPts.setText("Cancel");
      btn_resetPts.setHeight("33px");
      btn_resetPts.setWidth("173px");
      btn_resetPts.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_resetPts = btn_resetPts;

      return btn_resetPts;
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
