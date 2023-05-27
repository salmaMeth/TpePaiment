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

public class Authentification_AuthentificationUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.Authentification>, ecr.web.app.client.ui.Authentification.AuthentificationUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<a class='icon-home'></a>")
    SafeHtml html1();
     
    @Template("<i class='icon-reply'></i>")
    SafeHtml html2();
     
    @Template("Sign in")
    SafeHtml html3();
     
    @Template("Click here")
    SafeHtml html4();
     
    @Template("Cancel")
    SafeHtml html5();
     
    @Template("<div class='layout'> <div class='navbar navbar-inverse top-nav'> <div class='navbar-inner'> <div class='container'> <span class='home-link'> <p> <span id='{0}'></span> </p> </span> <div class='btn-toolbar pull-right notification-nav'> <div class='btn-group'> <div class='dropdown'> <a class='btn btn-notification'> <span id='{1}'></span> </a> </div> </div> </div> </div> </div> </div> <div class='container'> <form class='form-signin-ribbon'> <div class='content-widgets gray'> <div class='login-head orange'> <h3 class='form-signin-heading'>Please sign in</h3> </div> <div class='long-ribbon'> <div class='ribbon-content'> <div class='controls input-icon'> <i class='icon-user-md'></i> <span id='{2}'></span>  </div> <div class='controls input-icon'> <i class='icon-key'></i> <span id='{3}'></span> </div>  <span id='{4}'></span>  </div> </div> <div class='forgot-block'> <h4>Forgot your password ?</h4> <p> <span id='{5}'></span> to get your password. </p> <span id='{6}'></span> </div> </div> </form> </div> </div>")
    SafeHtml html6(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.Authentification owner) {


    return new Widgets(owner).get_htmll();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.Authentification owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_loginClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_cancelClick(event);
      }
    };

    final com.google.gwt.event.dom.client.KeyPressHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.KeyPressHandler() {
      public void onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent event) {
        owner.onTextBox_2KeyPress(event);
      }
    };

    final com.google.gwt.event.dom.client.MouseDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.MouseDownHandler() {
      public void onMouseDown(com.google.gwt.event.dom.client.MouseDownEvent event) {
        owner.onTextBox_2MouseDown(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMyScriptedAnchorClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMyScriptedAnchor1Click(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMyScriptedAnchor2Click(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.Authentification owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5();
    }
    SafeHtml template_html6() {
      return template.html6(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenCss_style style;
    private ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private ecr.web.app.client.ui.Authentification_AuthentificationUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for htmll called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_htmll() {
      return build_htmll();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_htmll() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel htmll = new com.google.gwt.user.client.ui.HTMLPanel(template_html6().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(htmll.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();

      // Detach section.
      attachRecord0.detach();
      htmll.addAndReplaceElement(get_lienhome(), get_domId0Element().get());
      htmll.addAndReplaceElement(get_lienreply(), get_domId1Element().get());
      htmll.addAndReplaceElement(get_cmd_listbox(), get_domId2Element().get());
      htmll.addAndReplaceElement(get_textBox_2(), get_domId3Element().get());
      htmll.addAndReplaceElement(get_bnt_login(), get_domId4Element().get());
      htmll.addAndReplaceElement(get_lien(), get_domId5Element().get());
      htmll.addAndReplaceElement(get_btn_cancel(), get_domId6Element().get());

      return htmll;
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
     * Getter for lienhome called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_lienhome() {
      return build_lienhome();
    }
    private com.google.gwt.user.client.ui.Anchor build_lienhome() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor lienhome = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      lienhome.setHTML(template_html1().asString());
      lienhome.setHref("javascript:;");
      lienhome.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);


      return lienhome;
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
     * Getter for lienreply called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_lienreply() {
      return build_lienreply();
    }
    private com.google.gwt.user.client.ui.Anchor build_lienreply() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor lienreply = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      lienreply.setHTML(template_html2().asString());
      lienreply.setHref("javascript:;");
      lienreply.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);


      return lienreply;
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
     * Getter for cmd_listbox called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmd_listbox() {
      return build_cmd_listbox();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_listbox() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmd_listbox = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmd_listbox.setStyleName("" + get_style().span12() + "");
      cmd_listbox.setHeight("42px");
      cmd_listbox.setWidth("301px");


      owner.cmd_listbox = cmd_listbox;

      return cmd_listbox;
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

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId3;
    }

    /**
     * Getter for textBox_2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_textBox_2() {
      return build_textBox_2();
    }
    private com.google.gwt.user.client.ui.TextBox build_textBox_2() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox textBox_2 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      textBox_2.setStyleName("" + get_style().textBox() + "");
      textBox_2.addKeyPressHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);
      textBox_2.addMouseDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      owner.textBox_2 = textBox_2;

      return textBox_2;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.


      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId4;
    }

    /**
     * Getter for bnt_login called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_login() {
      return build_bnt_login();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_login() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_login = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_login.setHTML(template_html3().asString());
      bnt_login.setStyleName("" + get_style().buttonBlack() + "");
      bnt_login.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.bnt_login = bnt_login;

      return bnt_login;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.


      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId5;
    }

    /**
     * Getter for lien called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_lien() {
      return build_lien();
    }
    private com.google.gwt.user.client.ui.Anchor build_lien() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor lien = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      lien.setHTML(template_html4().asString());
      lien.setHref("javascript:;");
      lien.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);


      return lien;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.


      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId6;
    }

    /**
     * Getter for btn_cancel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_cancel() {
      return build_btn_cancel();
    }
    private com.google.gwt.user.client.ui.Button build_btn_cancel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_cancel.setHTML(template_html5().asString());
      btn_cancel.setStyleName("" + get_style().buttonGreen() + "");
      btn_cancel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_cancel = btn_cancel;

      return btn_cancel;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.


      return domId6Element;
    }
  }
}
