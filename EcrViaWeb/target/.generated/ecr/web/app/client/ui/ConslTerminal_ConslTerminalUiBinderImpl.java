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

public class ConslTerminal_ConslTerminalUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.ConslTerminal>, ecr.web.app.client.ui.ConslTerminal.ConslTerminalUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='row-fluid'> <div class='widget-container'> <div class='span6'> <div class='dataTables_filter' id='DataTables_Table_0_filter'> <label> Search: <span id='{0}'></span> </label> </div> </div> </div></div> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.ConslTerminal owner) {


    return new Widgets(owner).get_Container();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.ConslTerminal owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onContainerAttachOrDetach(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.ConslTerminal owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_Label3();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.ConslTerminal_ConslTerminalUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      Container.setHeight("100%");
      Container.setWidth("100%");
      Container.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord36 = UiBinderUtil.attachToDom(Container.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord36.detach();
      Container.addAndReplaceElement(get_searchBox(), get_domId0Element().get());
      Container.addAndReplaceElement(get_f_VerticalPanel1(), get_domId1Element().get());

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
     * Getter for searchBox called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_searchBox() {
      return build_searchBox();
    }
    private com.google.gwt.user.client.ui.TextBox build_searchBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox searchBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.searchBox = searchBox;

      return searchBox;
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

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
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
      f_VerticalPanel1.add(get_tab_termenal());
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.setHeight("192px");
      f_VerticalPanel1.setWidth("993px");


      return f_VerticalPanel1;
    }

    /**
     * Getter for tab_termenal called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.cellview.client.CellTable get_tab_termenal() {
      return build_tab_termenal();
    }
    private com.google.gwt.user.cellview.client.CellTable build_tab_termenal() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable tab_termenal = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      tab_termenal.addStyleName("" + get_style().editCell() + "");
      tab_termenal.setHeight("125px");
      tab_termenal.setWidth("946px");
      tab_termenal.setPageSize(5);


      owner.tab_termenal = tab_termenal;

      return tab_termenal;
    }

    /**
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel2.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.setCellHorizontalAlignment(get_f_Label3(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel2.setCellVerticalAlignment(get_f_Label3(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel2.add(get_page_terminal());
      f_HorizontalPanel2.setHeight("23px");
      f_HorizontalPanel2.setWidth("893px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_Label3 called 3 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label3;
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return f_Label3;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_Label3.setText("Elements:");
      f_Label3.setHeight("24px");
      f_Label3.setWidth("589px");


      return f_Label3;
    }

    /**
     * Getter for page_terminal called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_page_terminal() {
      return build_page_terminal();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_page_terminal() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager page_terminal = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
      // Setup section.
      page_terminal.setWidth("205px");


      owner.page_terminal = page_terminal;

      return page_terminal;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }
  }
}
