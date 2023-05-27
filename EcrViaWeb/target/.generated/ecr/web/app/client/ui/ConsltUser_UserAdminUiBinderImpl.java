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

public class ConsltUser_UserAdminUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.ConsltUser>, ecr.web.app.client.ui.ConsltUser.UserAdminUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.ConsltUser owner) {


    return new Widgets(owner).get_Container();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.ConsltUser owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onContainerAttachOrDetach(event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onCmd_roleChange(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.ConsltUser owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_cmd_role();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_Label5();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_HorizontalPanel2();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      owner.style = style;

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
      UiBinderUtil.TempAttachment attachRecord12 = UiBinderUtil.attachToDom(Container.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord12.detach();
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
      f_VerticalPanel1.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.setCellVerticalAlignment(get_f_HorizontalPanel2(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_VerticalPanel1.add(get_tab_cell());
      f_VerticalPanel1.add(get_f_HorizontalPanel4());
      f_VerticalPanel1.setHeight("308px");
      f_VerticalPanel1.setWidth("960px");


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
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.add(get_searchBox());
      f_HorizontalPanel2.add(get_cmd_role());
      f_HorizontalPanel2.setCellVerticalAlignment(get_cmd_role(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel2.setHeight("38px");
      f_HorizontalPanel2.setWidth("944px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Search:");
      f_Label3.setWidth("50px");


      return f_Label3;
    }

    /**
     * Getter for searchBox called 1 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for cmd_role called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ListBox cmd_role;
    private com.google.gwt.user.client.ui.ListBox get_cmd_role() {
      return cmd_role;
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_role() {
      // Creation section.
      cmd_role = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmd_role.addItem("", "0");
      cmd_role.addItem("Admin", "1");
      cmd_role.addItem("Merchant", "2");
      cmd_role.addItem("Server", "3");
      cmd_role.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.cmd_role = cmd_role;

      return cmd_role;
    }

    /**
     * Getter for tab_cell called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.cellview.client.CellTable get_tab_cell() {
      return build_tab_cell();
    }
    private com.google.gwt.user.cellview.client.CellTable build_tab_cell() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTable tab_cell = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
      // Setup section.
      tab_cell.addStyleName("" + get_style().editCell() + "");
      tab_cell.setHeight("154px");
      tab_cell.setWidth("946px");
      tab_cell.setPageSize(5);


      owner.tab_cell = tab_cell;

      return tab_cell;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel4.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.setCellHorizontalAlignment(get_f_Label5(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel4.setCellVerticalAlignment(get_f_Label5(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel4.add(get_simp_user_pager());
      f_HorizontalPanel4.setHeight("23px");
      f_HorizontalPanel4.setWidth("893px");


      return f_HorizontalPanel4;
    }

    /**
     * Getter for f_Label5 called 3 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label5;
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return f_Label5;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_Label5.setText("Elements:");
      f_Label5.setHeight("24px");
      f_Label5.setWidth("589px");


      return f_Label5;
    }

    /**
     * Getter for simp_user_pager called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_simp_user_pager() {
      return build_simp_user_pager();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_simp_user_pager() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager simp_user_pager = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
      // Setup section.
      simp_user_pager.setWidth("205px");


      owner.simp_user_pager = simp_user_pager;

      return simp_user_pager;
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
