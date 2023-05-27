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

public class StatisticsProducts_StatisticsProductsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.StatisticsProducts>, ecr.web.app.client.ui.StatisticsProducts.StatisticsProductsUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='container-fluid'> <div class='row-fluid'> <div class='span12'> <div class='primary-head'> <h3 class='page-header'>Charts</h3> </div></div></div> <div class='row-fluid'> <div class='span6'> <div class='content-widgets white'> <div class='widget-head blue'> <h3>Basic Bar Chart</h3> </div> <div class='widget-container'> <div id='chart_div' style='position: relative;'> <div dir='ltr' style='position: relative; width: 543px; height: 400px;'> <div> <span id='{0}'></span>  </div> </div> </div> </div> </div> </div> <div class='span4'> <div class='content-widgets white'> <div class='widget-head blue'> <h3>Interpretation</h3> </div> <div class='widget-container'> <div class='pack-details'> <p>In this diagram, the comparison is made between the different categories of products and brands to give the best brands sold in each category.</p>  <span id='{1}'></span>  </div> </div> </div> </div> </div></div>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.StatisticsProducts owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.StatisticsProducts owner;


    public Widgets(final ecr.web.app.client.ui.StatisticsProducts owner) {
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
    private ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.StatisticsProducts_StatisticsProductsUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord37 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord37.detach();
      f_HTMLPanel1.addAndReplaceElement(get_usagePie(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_tab_infos(), get_domId1Element().get());

      return f_HTMLPanel1;
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
     * Getter for usagePie called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.moxieapps.gwt.highcharts.client.Chart get_usagePie() {
      return build_usagePie();
    }
    private org.moxieapps.gwt.highcharts.client.Chart build_usagePie() {
      // Creation section.
      final org.moxieapps.gwt.highcharts.client.Chart usagePie = (org.moxieapps.gwt.highcharts.client.Chart) GWT.create(org.moxieapps.gwt.highcharts.client.Chart.class);
      // Setup section.


      owner.usagePie = usagePie;

      return usagePie;
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
     * Getter for tab_infos called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.cellview.client.CellTable get_tab_infos() {
      return build_tab_infos();
    }
    private com.google.gwt.user.cellview.client.CellTable build_tab_infos() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable tab_infos = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      tab_infos.addStyleName("" + get_style().editCell() + "");
      tab_infos.setHeight("269px");
      tab_infos.setPageSize(5);


      owner.tab_infos = tab_infos;

      return tab_infos;
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
