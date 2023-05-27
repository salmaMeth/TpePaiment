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

public class ProductsRefonds_ProductsRefondsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.ProductsRefonds>, ecr.web.app.client.ui.ProductsRefonds.ProductsRefondsUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Historic </h3> </div> <div class='widget-container'> <div class='span6' width='78.718%'> <div class='dataTables_filter' id='DataTables_Table_0_filter'> <label> Search: <span id='{0}'></span> </label> </div> </div> <span id='{1}'></span>  </div> </div></div> </div>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.ProductsRefonds owner) {


    return new Widgets(owner).get_container();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.ProductsRefonds owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onContainerAttachOrDetach(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_okClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_canncelClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.ProductsRefonds owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel container = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      container.setStyleName("" + get_style().mainPanel() + "");
      container.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord49 = UiBinderUtil.attachToDom(container.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord49.detach();
      container.addAndReplaceElement(get_txt_search(), get_domId0Element().get());
      container.addAndReplaceElement(get_f_HorizontalPanel1(), get_domId1Element().get());

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
     * Getter for txt_search called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_search() {
      return build_txt_search();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_search() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_search = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_search = txt_search;

      return txt_search;
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
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.add(get_f_VerticalPanel2());
      f_HorizontalPanel1.add(get_f_DisclosurePanel7());
      f_HorizontalPanel1.setHeight("228px");
      f_HorizontalPanel1.setWidth("996px");


      return f_HorizontalPanel1;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_VerticalPanel2.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_VerticalPanel2.add(get_tab_cell());
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.setHeight("224px");
      f_VerticalPanel2.setWidth("700px");


      return f_VerticalPanel2;
    }

    /**
     * Getter for tab_cell called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.cellview.client.CellTable get_tab_cell() {
      return build_tab_cell();
    }
    private com.google.gwt.user.cellview.client.CellTable build_tab_cell() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable tab_cell = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      tab_cell.setWidth("818px");
      tab_cell.setPageSize(5);


      owner.tab_cell = tab_cell;

      return tab_cell;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel3.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel3.add(get_f_Label4());
      f_HorizontalPanel3.add(get_f_HorizontalPanel5());
      f_HorizontalPanel3.setHeight("42px");
      f_HorizontalPanel3.setWidth("822px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label4.setHeight("28px");
      f_Label4.setWidth("256px");


      return f_Label4;
    }

    /**
     * Getter for f_HorizontalPanel5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return build_f_HorizontalPanel5();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel5.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel5.add(get_f_Label6());
      f_HorizontalPanel5.add(get_simple_pdt());
      f_HorizontalPanel5.setHeight("23px");
      f_HorizontalPanel5.setWidth("317px");


      return f_HorizontalPanel5;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_Label6.setText("Elements:");
      f_Label6.setHeight("24px");
      f_Label6.setWidth("120px");


      return f_Label6;
    }

    /**
     * Getter for simple_pdt called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_simple_pdt() {
      return build_simple_pdt();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_simple_pdt() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager simple_pdt = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
      // Setup section.
      simple_pdt.setWidth("221px");


      owner.simple_pdt = simple_pdt;

      return simple_pdt;
    }

    /**
     * Getter for f_DisclosurePanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel7() {
      return build_f_DisclosurePanel7();
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel7 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel7.add(get_f_VerticalPanel8());
      f_DisclosurePanel7.setOpen(true);


      return f_DisclosurePanel7;
    }

    /**
     * Getter for f_VerticalPanel8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel8() {
      return build_f_VerticalPanel8();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel8 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel8.add(get_btn_ok());
      f_VerticalPanel8.add(get_btn_canncel());
      f_VerticalPanel8.setHeight("79px");
      f_VerticalPanel8.setWidth("5cm");


      return f_VerticalPanel8;
    }

    /**
     * Getter for btn_ok called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_ok() {
      return build_btn_ok();
    }
    private com.google.gwt.user.client.ui.Button build_btn_ok() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_ok = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_ok.setText("Ok");
      btn_ok.setHeight("32px");
      btn_ok.setWidth("186px");
      btn_ok.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_ok = btn_ok;

      return btn_ok;
    }

    /**
     * Getter for btn_canncel called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_canncel() {
      return build_btn_canncel();
    }
    private com.google.gwt.user.client.ui.Button build_btn_canncel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_canncel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_canncel.setText("Cancel");
      btn_canncel.setHeight("32px");
      btn_canncel.setWidth("186px");
      btn_canncel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


      owner.btn_canncel = btn_canncel;

      return btn_canncel;
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
