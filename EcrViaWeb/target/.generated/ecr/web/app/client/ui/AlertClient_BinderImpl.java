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

public class AlertClient_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AlertClient>, ecr.web.app.client.ui.AlertClient.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='stepy-widget'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Search By ID </h3> <div class='pull-right' id='stepy_tabby'> <ul class='stepy-titles' id='stepy-titles'> <li class='current-step' id='stepy-title-0'> <div><span id='{0}'></span></div> <span> <center>Photos</center></span> </li></ul></div></div></div> <div class='widget-container'> <span id='{1}'></span> </div> </div></div> </div>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AlertClient owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AlertClient owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_searchClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_canncelClick(event);
      }
    };

    final com.google.gwt.event.dom.client.MouseDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.MouseDownHandler() {
      public void onMouseDown(com.google.gwt.event.dom.client.MouseDownEvent event) {
        owner.onTextBox_2MouseDown(event);
      }
    };

    final com.google.gwt.event.dom.client.KeyPressHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.KeyPressHandler() {
      public void onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent event) {
        owner.onTextBox_2KeyPress(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AlertClient owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_txt_search();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      owner.style = style;

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
      UiBinderUtil.TempAttachment attachRecord14 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord14.detach();
      f_HTMLPanel1.addAndReplaceElement(get_image(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_VerticalPanel2(), get_domId1Element().get());

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
     * Getter for image called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Image get_image() {
      return build_image();
    }
    private com.google.gwt.user.client.ui.Image build_image() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image image = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      image.setHeight("47px");
      image.setWidth("51px");


      owner.image = image;

      return image;
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
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.add(get_btn_canncel());
      f_VerticalPanel2.setHeight("87px");
      f_VerticalPanel2.setWidth("537px");


      return f_VerticalPanel2;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel3.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel3.add(get_txt_search());
      f_HorizontalPanel3.setCellVerticalAlignment(get_txt_search(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel3.add(get_btn_search());
      f_HorizontalPanel3.setHeight("28px");
      f_HorizontalPanel3.setWidth("535px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for txt_search called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox txt_search;
    private com.google.gwt.user.client.ui.TextBox get_txt_search() {
      return txt_search;
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_search() {
      // Creation section.
      txt_search = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txt_search.setHeight("38px");
      txt_search.setWidth("320px");
      txt_search.addMouseDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);
      txt_search.addKeyPressHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      owner.txt_search = txt_search;

      return txt_search;
    }

    /**
     * Getter for btn_search called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_btn_search() {
      return build_btn_search();
    }
    private com.google.gwt.user.client.ui.Button build_btn_search() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_search = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_search.setText("Serach");
      btn_search.setHeight("32px");
      btn_search.setWidth("162px");
      btn_search.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.btn_search = btn_search;

      return btn_search;
    }

    /**
     * Getter for btn_canncel called 1 times. Type: DEFAULT. Build precedence: 3.
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
      btn_canncel.setWidth("121px");
      btn_canncel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


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
