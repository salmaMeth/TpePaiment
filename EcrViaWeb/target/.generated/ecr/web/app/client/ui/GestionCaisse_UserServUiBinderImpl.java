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

public class GestionCaisse_UserServUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.GestionCaisse>, ecr.web.app.client.ui.GestionCaisse.UserServUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.GestionCaisse owner) {


    return new Widgets(owner).get_container();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.GestionCaisse owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onDisclosurePanelAttachOrDetach(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.GestionCaisse owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
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
    private ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style style;
    private ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for container called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_container() {
      return build_container();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_container() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel container = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      container.setHeight("1500");
      container.setWidth("1500");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord20 = UiBinderUtil.attachToDom(container.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord20.detach();
      container.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

      owner.container = container;

      return container;
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
      horizontalPanel.add(get_f_VerticalPanel1());
      horizontalPanel.setHeight("274px");
      horizontalPanel.setWidth("678px");


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
      f_VerticalPanel1.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.add(get_cellTable());
      f_VerticalPanel1.add(get_f_HorizontalPanel9());
      f_VerticalPanel1.add(get_disclosurePanel());
      f_VerticalPanel1.setHeight("526px");
      f_VerticalPanel1.setWidth("672px");


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
      f_HorizontalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel2.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel2.add(get_f_HorizontalPanel3());
      f_HorizontalPanel2.add(get_f_HorizontalPanel6());
      f_HorizontalPanel2.setStyleName("" + get_style().horizontalPanelStyle() + "");
      f_HorizontalPanel2.setHeight("42px");
      f_HorizontalPanel2.setWidth("664px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel3.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel3.add(get_f_Label4());
      f_HorizontalPanel3.add(get_f_TextBox5());
      f_HorizontalPanel3.setHeight("38px");
      f_HorizontalPanel3.setWidth("213px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_Label4.setText("Find");
      f_Label4.setHeight("22px");


      return f_Label4;
    }

    /**
     * Getter for f_TextBox5 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.TextBox get_f_TextBox5() {
      return build_f_TextBox5();
    }
    private com.google.gwt.user.client.ui.TextBox build_f_TextBox5() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox f_TextBox5 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      f_TextBox5.setAlignment(com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment.LEFT);
      f_TextBox5.setHeight("10px");


      return f_TextBox5;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel6.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.add(get_f_ListBox8());
      f_HorizontalPanel6.setHeight("38px");
      f_HorizontalPanel6.setWidth("216px");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_Label7.setText("Cash register");
      f_Label7.setHeight("22px");
      f_Label7.setWidth("105px");


      return f_Label7;
    }

    /**
     * Getter for f_ListBox8 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.ListBox get_f_ListBox8() {
      return build_f_ListBox8();
    }
    private com.google.gwt.user.client.ui.ListBox build_f_ListBox8() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox f_ListBox8 = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      f_ListBox8.setHeight("23px");
      f_ListBox8.setWidth("154px");


      return f_ListBox8;
    }

    /**
     * Getter for cellTable called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.cellview.client.CellTable get_cellTable() {
      return build_cellTable();
    }
    private com.google.gwt.user.cellview.client.CellTable build_cellTable() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable cellTable = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      cellTable.setHeight("125px");
      cellTable.setWidth("662px");


      return cellTable;
    }

    /**
     * Getter for f_HorizontalPanel9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel9() {
      return build_f_HorizontalPanel9();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel9.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel9.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel9.add(get_f_Label10());
      f_HorizontalPanel9.add(get_f_HorizontalPanel11());
      f_HorizontalPanel9.setStyleName("" + get_style().horizontalPanelStyle() + "");
      f_HorizontalPanel9.setHeight("42px");
      f_HorizontalPanel9.setWidth("659px");


      return f_HorizontalPanel9;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label10.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label10.setText("Elements:");
      f_Label10.setHeight("28px");
      f_Label10.setWidth("165px");


      return f_Label10;
    }

    /**
     * Getter for f_HorizontalPanel11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel11() {
      return build_f_HorizontalPanel11();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel11 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel11.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel11.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel11.add(get_f_HorizontalPanel12());
      f_HorizontalPanel11.setHeight("23px");
      f_HorizontalPanel11.setWidth("506px");


      return f_HorizontalPanel11;
    }

    /**
     * Getter for f_HorizontalPanel12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel12() {
      return build_f_HorizontalPanel12();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel12 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel12.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel12.add(get_f_Button13());
      f_HorizontalPanel12.add(get_f_Button14());
      f_HorizontalPanel12.add(get_f_ListBox15());
      f_HorizontalPanel12.add(get_f_Button16());
      f_HorizontalPanel12.add(get_f_Button17());
      f_HorizontalPanel12.setHeight("24px");
      f_HorizontalPanel12.setWidth("472px");


      return f_HorizontalPanel12;
    }

    /**
     * Getter for f_Button13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_f_Button13() {
      return build_f_Button13();
    }
    private com.google.gwt.user.client.ui.Button build_f_Button13() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button f_Button13 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      f_Button13.setText("Premier");
      f_Button13.setWidth("109px");


      return f_Button13;
    }

    /**
     * Getter for f_Button14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_f_Button14() {
      return build_f_Button14();
    }
    private com.google.gwt.user.client.ui.Button build_f_Button14() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button f_Button14 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      f_Button14.setText("Précédent");
      f_Button14.setWidth("109px");


      return f_Button14;
    }

    /**
     * Getter for f_ListBox15 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.ListBox get_f_ListBox15() {
      return build_f_ListBox15();
    }
    private com.google.gwt.user.client.ui.ListBox build_f_ListBox15() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox f_ListBox15 = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      f_ListBox15.setWidth("47px");


      return f_ListBox15;
    }

    /**
     * Getter for f_Button16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_f_Button16() {
      return build_f_Button16();
    }
    private com.google.gwt.user.client.ui.Button build_f_Button16() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button f_Button16 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      f_Button16.setText("Suivant");
      f_Button16.setWidth("109px");


      return f_Button16;
    }

    /**
     * Getter for f_Button17 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_f_Button17() {
      return build_f_Button17();
    }
    private com.google.gwt.user.client.ui.Button build_f_Button17() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button f_Button17 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      f_Button17.setText("Dernier");
      f_Button17.setWidth("116px");


      return f_Button17;
    }

    /**
     * Getter for disclosurePanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel get_disclosurePanel() {
      return build_disclosurePanel();
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_disclosurePanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.DisclosurePanel disclosurePanel = new com.google.gwt.user.client.ui.DisclosurePanel("Close cash register");
      // Setup section.
      disclosurePanel.add(get_panel());
      disclosurePanel.setOpen(false);
      disclosurePanel.setHeight("470px");
      disclosurePanel.setWidth("555px");
      disclosurePanel.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.disclosurePanel = disclosurePanel;

      return disclosurePanel;
    }

    /**
     * Getter for panel called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel() {
      return build_panel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      panel.setHeight("4cm");
      panel.setWidth("553px");


      owner.panel = panel;

      return panel;
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
