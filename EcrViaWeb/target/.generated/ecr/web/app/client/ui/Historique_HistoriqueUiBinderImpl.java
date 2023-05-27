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

public class Historique_HistoriqueUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.Historique>, ecr.web.app.client.ui.Historique.HistoriqueUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.Historique owner) {


    return new Widgets(owner).get_Container();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.Historique owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onContainerAttachOrDetach(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.Historique owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_Label3();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_HorizontalPanel2();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.Historique_HistoriqueUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for Container called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_Container() {
      return build_Container();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_Container() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel Container = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      Container.setHeight("1500");
      Container.setWidth("1500");
      Container.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord18 = UiBinderUtil.attachToDom(Container.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord18.detach();
      Container.addAndReplaceElement(get_f_VerticalPanel1(), get_domId0Element().get());

      owner.Container = Container;

      return Container;
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
     * Getter for f_VerticalPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
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
      f_VerticalPanel1.setCellVerticalAlignment(get_f_HorizontalPanel2(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_VerticalPanel1.add(get_cellTable());
      f_VerticalPanel1.add(get_f_HorizontalPanel8());
      f_VerticalPanel1.setHeight("252px");
      f_VerticalPanel1.setWidth("900px");


      return f_VerticalPanel1;
    }

    /**
     * Getter for f_HorizontalPanel2 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2;
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return f_HorizontalPanel2;
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel2.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.setCellVerticalAlignment(get_f_Label3(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel2.add(get_f_Label4());
      f_HorizontalPanel2.add(get_f_DateBox5());
      f_HorizontalPanel2.add(get_f_Label6());
      f_HorizontalPanel2.add(get_f_TextBox7());
      f_HorizontalPanel2.setHeight("42px");
      f_HorizontalPanel2.setWidth("100%");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_Label3 called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label3;
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return f_Label3;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label3.setText("Cash register");
      f_Label3.setHeight("37px");
      f_Label3.setWidth("307px");


      return f_Label3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label4.setText("Date");
      f_Label4.setHeight("31px");
      f_Label4.setWidth("39px");


      return f_Label4;
    }

    /**
     * Getter for f_DateBox5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_f_DateBox5() {
      return build_f_DateBox5();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_f_DateBox5() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox f_DateBox5 = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      f_DateBox5.setHeight("20px");


      return f_DateBox5;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label6.setText("Find ById");
      f_Label6.setHeight("30px");
      f_Label6.setWidth("64px");


      return f_Label6;
    }

    /**
     * Getter for f_TextBox7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_f_TextBox7() {
      return build_f_TextBox7();
    }
    private com.google.gwt.user.client.ui.TextBox build_f_TextBox7() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox f_TextBox7 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      f_TextBox7.setHeight("20px");


      return f_TextBox7;
    }

    /**
     * Getter for cellTable called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.cellview.client.CellTable get_cellTable() {
      return build_cellTable();
    }
    private com.google.gwt.user.cellview.client.CellTable build_cellTable() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable cellTable = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      cellTable.setHeight("125px");
      cellTable.setWidth("936px");
      cellTable.setPageSize(5);


      owner.cellTable = cellTable;

      return cellTable;
    }

    /**
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel8.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel8.add(get_f_HorizontalPanel9());
      f_HorizontalPanel8.add(get_f_HorizontalPanel10());
      f_HorizontalPanel8.setHeight("34px");
      f_HorizontalPanel8.setWidth("100%");


      return f_HorizontalPanel8;
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
      f_HorizontalPanel9.setHeight("16px");
      f_HorizontalPanel9.setWidth("481px");


      return f_HorizontalPanel9;
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
      f_HorizontalPanel10.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel10.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel10.add(get_f_Label11());
      f_HorizontalPanel10.add(get_pager());
      f_HorizontalPanel10.setHeight("23px");
      f_HorizontalPanel10.setWidth("376px");


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
      f_Label11.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label11.setText("Elements:");
      f_Label11.setHeight("22px");
      f_Label11.setWidth("88px");


      return f_Label11;
    }

    /**
     * Getter for pager called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_pager() {
      return build_pager();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_pager() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager pager = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
      // Setup section.
      pager.setWidth("225px");


      owner.pager = pager;

      return pager;
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
