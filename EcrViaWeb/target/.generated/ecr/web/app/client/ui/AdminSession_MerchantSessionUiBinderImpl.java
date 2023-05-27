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

public class AdminSession_MerchantSessionUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AdminSession>, ecr.web.app.client.ui.AdminSession.MerchantSessionUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<a class='icon-home'></a>")
    SafeHtml html1();
     
    @Template("Logout")
    SafeHtml html2();
     
    @Template("")
    SafeHtml html3();
     
    @Template("")
    SafeHtml html4();
     
    @Template("<script type='text/javascript'> function showHideMenu() { if($('#menu').css('display') == 'none') { $('#menu').css('display', 'block'); } else { $('#menu').css('display', 'none'); } } </script> <div class='layout'> <div class='navbar navbar-inverse top-nav'> <div class='navbar-inner'> <div class='container'> <span class='home-link'> <p> <span id='{0}'></span> </p> </span> <div class='nav-collapse'> <ul class='nav'> </ul> </div> <div class='btn-toolbar pull-right notification-nav'> <div class='btn-group'> <div class='dropdown'> <div class='dropdown-menu pull-right'> <span class='notify-h'> You have 20 notifications</span> <a class='msg-container clearfix'> <span class='notification-thumb'> <img alt='user-thumb' height='50' src='images/notify-thumb.png' width='50'> </span> <span class='notification-intro'> In hac habitasse platea dictumst. Aliquam posuere quam in nul <span class='notify-time'> 3 Hours Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <i class='icon-file'></i> </span> <span class='notification-intro'> <strong>Files </strong> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 8 Hours Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <img alt='user-thumb' height='50' src='images/user-thumb.png' width='50'> </span> <span class='notification-intro'> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 3 Days Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <i class='icon-envelope-alt'></i> </span> <span class='notification-intro'> <strong>Message</strong> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 2 Weeks Ago </span> </span> </a> <button class='btn btn-primary btn-large btn-block'> View All</button> </div> </div> </div> <div class='btn-group'> </div> </div> </div> </div> </div> <div class='leftbar leftbar-close clearfix'> <div class='admin-info clearfix'> <div class='admin-thumb'> <span id='{1}'></span> </div> <div class='admin-meta'> <ul> <b> <span id='{2}'></span> </b> <li> <span id='{3}'></span> </li> <li> <span id='{4}'></span> </li> <li><i class='icon-lock'></i> <a> <span id='{5}'></span></a> </li> </ul> </div> </div> <div class='left-nav clearfix'> <div class='left-primary-nav'> <ul id='myTab'> <li class='active'> <a class='icon-desktop' href='#main' title='Dashboard'></a> </li> </ul> </div> <div class='responsive-leftbar'> <i class='icon-list'></i> </div> <div class='left-secondary-nav tab-content'> <div class='tab-pane active' id='main'> <h4 class='side-head'> Session Admin <span id='{6}'></span> </h4> <span id='{7}'></span> <div class='side-widget'> <div class='board-widgets light-blue'> <div class='board-widgets-head clearfix'> <div ID='clock' class='GOXIRTLDJL'> <span id='{8}'></span> </div></div> <div class='board-widgets-content'> <div class='progress progress-striped active min progress-info'> <div class='bar' style='width: 48%;'> </div> </div> <div class='stat-text progress-stat'> </div> </div> </div> <div class='board-widgets light-blue'> <div class='board-widgets-head clearfix'> <div ID='clock' class='GOXIRTLDJL'> <span id='{9}'></span> </div></div> <div class='board-widgets-content'> <div class='progress progress-striped active min progress-success'> <div class='bar' style='width: 20%;'> </div> </div> <div class='stat-text progress-stat'> </div> </div> </div> <div class='board-widgets gray'> <div class='board-widgets-content'> <div class='line-min-chart min-chart'> </div>  </div> </div> </div> </div> </div> </div> </div> <div class='main-wrapper'> <div class='container-fluid'> <div class='row-fluid'> <div class='span12'> <div class='board-widgets gray'> <div class='board-widgets-head clearfix'> <ul class='breadcrumb'> <li><i class='icon-eye-open'></i></li> <li><span id='{10}'></span></li> <li><span id='{11}'></span></li> </ul> </div> <div class='board-widgets-content'> <div class='row-fluid'> <div class='span12'> <div class='widget-container'> <span id='{12}'></span> </div> </div> </div> </div> </div> </div> </div> </div> </div> <div class='copyright'> <p> © 2015 EcrViaWeb </p> </div> <div class='scroll-top'> <a class='tip-top' href='#' title='Go Top'> <i class='icon-double-angle-up'></i> </a> </div> </div>")
    SafeHtml html5(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AdminSession owner) {


    return new Widgets(owner).get_panel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AdminSession owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onLogoutactionClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMyScriptedAnchor1Click(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AdminSession owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
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
      return template.html5(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11(), get_domId12());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style style;
    private ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for panel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel() {
      return build_panel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord5 = UiBinderUtil.attachToDom(panel.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();
      get_domId8Element().get();
      get_domId9Element().get();
      get_domId10Element().get();
      get_domId11Element().get();
      get_domId12Element().get();

      // Detach section.
      attachRecord5.detach();
      panel.addAndReplaceElement(get_lienhome(), get_domId0Element().get());
      panel.addAndReplaceElement(get_imageuser(), get_domId1Element().get());
      panel.addAndReplaceElement(get_username(), get_domId2Element().get());
      panel.addAndReplaceElement(get_viewprofile(), get_domId3Element().get());
      panel.addAndReplaceElement(get_editprofile(), get_domId4Element().get());
      panel.addAndReplaceElement(get_logoutaction(), get_domId5Element().get());
      panel.addAndReplaceElement(get_lbl_idcash(), get_domId6Element().get());
      panel.addAndReplaceElement(get_zone_menu(), get_domId7Element().get());
      panel.addAndReplaceElement(get_lbl_time(), get_domId8Element().get());
      panel.addAndReplaceElement(get_lbl_clock(), get_domId9Element().get());
      panel.addAndReplaceElement(get_f_Label1(), get_domId10Element().get());
      panel.addAndReplaceElement(get_lbl_notif(), get_domId11Element().get());
      panel.addAndReplaceElement(get_panel01(), get_domId12Element().get());

      return panel;
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
      lienhome.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


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
     * Getter for imageuser called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Image get_imageuser() {
      return build_imageuser();
    }
    private com.google.gwt.user.client.ui.Image build_imageuser() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image imageuser = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.


      owner.imageuser = imageuser;

      return imageuser;
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
     * Getter for username called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_username() {
      return build_username();
    }
    private com.google.gwt.user.client.ui.Label build_username() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label username = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      username.setHeight("14px");


      owner.username = username;

      return username;
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
     * Getter for viewprofile called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_viewprofile() {
      return build_viewprofile();
    }
    private com.google.gwt.user.client.ui.Label build_viewprofile() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label viewprofile = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      viewprofile.setText("View Profile");
      viewprofile.setStyleName("" + get_style().btn1() + "");


      owner.viewprofile = viewprofile;

      return viewprofile;
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
     * Getter for editprofile called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_editprofile() {
      return build_editprofile();
    }
    private com.google.gwt.user.client.ui.Label build_editprofile() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label editprofile = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      editprofile.setText("Edit Profile");
      editprofile.setStyleName("" + get_style().btn1() + "");


      owner.editprofile = editprofile;

      return editprofile;
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
     * Getter for logoutaction called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_logoutaction() {
      return build_logoutaction();
    }
    private com.google.gwt.user.client.ui.Button build_logoutaction() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button logoutaction = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      logoutaction.setHTML(template_html2().asString());
      logoutaction.setStyleName("" + get_style().btn1() + "");
      logoutaction.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.logoutaction = logoutaction;

      return logoutaction;
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
     * Getter for lbl_idcash called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_idcash() {
      return build_lbl_idcash();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_idcash() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_idcash = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_idcash.setHeight("30px");
      lbl_idcash.setWidth("99px");


      return lbl_idcash;
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

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId7;
    private java.lang.String get_domId7() {
      return domId7;
    }
    private java.lang.String build_domId7() {
      // Creation section.
      domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId7;
    }

    /**
     * Getter for zone_menu called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_zone_menu() {
      return build_zone_menu();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_zone_menu() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel zone_menu = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      zone_menu.setHeight("");


      owner.zone_menu = zone_menu;

      return zone_menu;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId7Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId7Element() {
      return domId7Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId7Element() {
      // Creation section.
      domId7Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId7());
      // Setup section.


      return domId7Element;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId8;
    private java.lang.String get_domId8() {
      return domId8;
    }
    private java.lang.String build_domId8() {
      // Creation section.
      domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId8;
    }

    /**
     * Getter for lbl_time called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_time() {
      return build_lbl_time();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_time() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_time = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_time.setHeight("14px");


      return lbl_time;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId8Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId8Element() {
      return domId8Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId8Element() {
      // Creation section.
      domId8Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId8());
      // Setup section.


      return domId8Element;
    }

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId9;
    private java.lang.String get_domId9() {
      return domId9;
    }
    private java.lang.String build_domId9() {
      // Creation section.
      domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId9;
    }

    /**
     * Getter for lbl_clock called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_clock() {
      return build_lbl_clock();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_clock() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_clock = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_clock.setHeight("14px");


      return lbl_clock;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId9Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId9Element() {
      return domId9Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId9Element() {
      // Creation section.
      domId9Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId9());
      // Setup section.


      return domId9Element;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId10;
    private java.lang.String get_domId10() {
      return domId10;
    }
    private java.lang.String build_domId10() {
      // Creation section.
      domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId10;
    }

    /**
     * Getter for f_Label1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label1() {
      return build_f_Label1();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label1() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label1.setText("Notification");
      f_Label1.setHeight("27px");
      f_Label1.setWidth("82px");


      return f_Label1;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId10Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId10Element() {
      return domId10Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId10Element() {
      // Creation section.
      domId10Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId10());
      // Setup section.


      return domId10Element;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId11;
    private java.lang.String get_domId11() {
      return domId11;
    }
    private java.lang.String build_domId11() {
      // Creation section.
      domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId11;
    }

    /**
     * Getter for lbl_notif called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_notif() {
      return build_lbl_notif();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_notif() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_notif = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_notif.setHeight("27px");
      lbl_notif.setWidth("811px");


      owner.lbl_notif = lbl_notif;

      return lbl_notif;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId11Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId11Element() {
      return domId11Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId11Element() {
      // Creation section.
      domId11Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId11());
      // Setup section.


      return domId11Element;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId12;
    private java.lang.String get_domId12() {
      return domId12;
    }
    private java.lang.String build_domId12() {
      // Creation section.
      domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId12;
    }

    /**
     * Getter for panel01 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel01() {
      return build_panel01();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel01() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel01 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.
      panel01.setHeight("477px");
      panel01.setWidth("930px");


      owner.panel01 = panel01;

      return panel01;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId12Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId12Element() {
      return domId12Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId12Element() {
      // Creation section.
      domId12Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId12());
      // Setup section.


      return domId12Element;
    }
  }
}
