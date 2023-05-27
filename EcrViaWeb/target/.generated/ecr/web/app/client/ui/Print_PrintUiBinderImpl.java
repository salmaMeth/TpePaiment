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

public class Print_PrintUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.Print>, ecr.web.app.client.ui.Print.PrintUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Print </h3> </div> <div class='widget-container'> <form class='form-horizontal'> <div class='control-group'> <label class='control-label'>Print On Terminal</label> <span id='{0}'></span></div> <div class='control-group'> <label class='control-label'>Print As PDF</label> <span id='{1}'></span></div> <span id='{2}'></span> </form>  </div> </div></div> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.Print owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.Print owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_okClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_canncelClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.Print owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.Print_PrintUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_HTMLPanel1.setStyleName("" + get_style().mainPanel() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord17 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord17.detach();
      f_HTMLPanel1.addAndReplaceElement(get_radio_terminal(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_radio_print(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_DisclosurePanel2(), get_domId2Element().get());

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
     * Getter for radio_terminal called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radio_terminal() {
      return build_radio_terminal();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radio_terminal() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radio_terminal = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      radio_terminal.setText("");


      owner.radio_terminal = radio_terminal;

      return radio_terminal;
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
     * Getter for radio_print called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radio_print() {
      return build_radio_print();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radio_print() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radio_print = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      radio_print.setText("");


      return radio_print;
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

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for f_DisclosurePanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel2() {
      return build_f_DisclosurePanel2();
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel2 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel2.add(get_f_VerticalPanel3());
      f_DisclosurePanel2.setOpen(true);
      f_DisclosurePanel2.setHeight("116px");
      f_DisclosurePanel2.setWidth("205px");


      return f_DisclosurePanel2;
    }

    /**
     * Getter for f_VerticalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel3() {
      return build_f_VerticalPanel3();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel3.add(get_btn_ok());
      f_VerticalPanel3.add(get_btn_cancel());
      f_VerticalPanel3.setHeight("72px");
      f_VerticalPanel3.setWidth("198px");


      return f_VerticalPanel3;
    }

    /**
     * Getter for btn_ok called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_btn_ok() {
      return build_btn_ok();
    }
    private com.google.gwt.user.client.ui.Button build_btn_ok() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_ok = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_ok.setText("Print");
      btn_ok.setHeight("32px");
      btn_ok.setWidth("186px");
      btn_ok.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.btn_ok = btn_ok;

      return btn_ok;
    }

    /**
     * Getter for btn_cancel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_btn_cancel() {
      return build_btn_cancel();
    }
    private com.google.gwt.user.client.ui.Button build_btn_cancel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_cancel.setText("Cancel");
      btn_cancel.setHeight("32px");
      btn_cancel.setWidth("186px");
      btn_cancel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_cancel = btn_cancel;

      return btn_cancel;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }
  }
}
