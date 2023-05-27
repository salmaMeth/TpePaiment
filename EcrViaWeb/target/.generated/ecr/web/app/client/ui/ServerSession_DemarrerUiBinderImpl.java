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

public class ServerSession_DemarrerUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.ServerSession>, ecr.web.app.client.ui.ServerSession.DemarrerUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<a class='icon-home'></a>")
    SafeHtml html1();
     
    @Template("Logout")
    SafeHtml html2();
     
    @Template("")
    SafeHtml html3();
     
    @Template("<i class='icon-trash'></i><span>Echap</span>")
    SafeHtml html4();
     
    @Template("<i class='icon-user'></i> <span>Clients</span>")
    SafeHtml html5();
     
    @Template("<i class='icon-money'></i><span>Cash</span>")
    SafeHtml html6();
     
    @Template("<i class='icon-building'></i> <span>credit card</span>")
    SafeHtml html7();
     
    @Template("<i class='icon-mobile-phone'></i> <span>Status TPE</span>")
    SafeHtml html8();
     
    @Template("<i class='icon-print'></i> <span>Print</span>")
    SafeHtml html9();
     
    @Template("")
    SafeHtml html10();
     
    @Template("<script type='text/javascript'> function showHideMenu() { if($('#menu').css('display') == 'none') { $('#menu').css('display', 'block'); } else { $('#menu').css('display', 'none'); } } </script> <div class='layout'> <div class='navbar navbar-inverse top-nav'> <div class='navbar-inner'> <div class='container'> <span class='home-link'> <p> <span id='{0}'></span> </p> </span> <div class='nav-collapse'> <ul class='nav'> </ul> </div> <div class='btn-toolbar pull-right notification-nav'> <div class='btn-group'> <div class='dropdown'> <a class='btn btn-notification dropdown-toggle' data-toggle='dropdown' title='Shifts Numbers'> <i class='icon-user'> <span class='notify-tip'> <span id='{1}'></span> </span> </i> </a> <div class='dropdown-menu pull-right'> <span class='notify-h'> You have 20 notifications</span> <a class='msg-container clearfix'> <span class='notification-thumb'> <img alt='user-thumb' height='50' src='images/notify-thumb.png' width='50'> </span> <span class='notification-intro'> In hac habitasse platea dictumst. Aliquam posuere quam in nul <span class='notify-time'> 3 Hours Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <i class='icon-file'></i> </span> <span class='notification-intro'> <strong>Files </strong> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 8 Hours Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <img alt='user-thumb' height='50' src='images/user-thumb.png' width='50'> </span> <span class='notification-intro'> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 3 Days Ago </span> </span> </a> <a class='msg-container clearfix'> <span class='notification-thumb'> <i class='icon-envelope-alt'></i> </span> <span class='notification-intro'> <strong>Message</strong> In hac habitasse platea dictumst. Aliquam posuere <span class='notify-time'> 2 Weeks Ago </span> </span> </a> <button class='btn btn-primary btn-large btn-block'> View All</button> </div> </div> </div> <div class='btn-group'> </div> </div> </div> </div> </div> <div class='leftbar leftbar-close clearfix'> <div class='admin-info clearfix'> <div class='admin-thumb'> <span id='{2}'></span> </div> <div class='admin-meta'> <ul> <b> <span id='{3}'></span> </b> <li> <span id='{4}'></span> </li> <li> <span id='{5}'></span> </li> <li><i class='icon-lock'></i> <a> <span id='{6}'></span></a> </li> </ul> </div> </div> <div class='left-nav clearfix'> <div class='left-primary-nav'> <ul id='myTab'> <li class='active'> <a class='icon-desktop' href='#main' title='Dashboard'></a> </li> </ul> </div> <div class='responsive-leftbar'> <i class='icon-list'></i> </div> <div class='left-secondary-nav tab-content'> <div class='tab-pane active' id='main'> <h4 class='side-head'> Cach Register <span id='{7}'></span> </h4> <div class='search-box'> <div class='input-append input-icon'> <span id='{8}'></span> <i class='icon-search'></i> </div> </div> <span id='{9}'></span> <div class='side-widget'> <div class='board-widgets light-blue'> <div class='board-widgets-head clearfix'> <div ID='clock' class='GOXIRTLDJL'> <span id='{10}'></span> </div></div> <div class='board-widgets-content'> <div class='progress progress-striped active min progress-info'> <div class='bar' style='width: 48%;'> </div> </div> <div class='stat-text progress-stat'> </div> </div> </div> <div class='board-widgets light-blue'> <div class='board-widgets-head clearfix'> <div ID='clock' class='GOXIRTLDJL'> <span id='{11}'></span> </div></div> <div class='board-widgets-content'> <div class='progress progress-striped active min progress-success'> <div class='bar' style='width: 20%;'> </div> </div> <div class='stat-text progress-stat'> </div> </div> </div> <div class='board-widgets gray'> <div class='board-widgets-content'> <div class='line-min-chart min-chart'> </div>  </div> </div> </div> </div> </div> </div> </div> <div class='main-wrapper'> <div class='container-fluid'> <i class='icon-play' onclick='bind()'></i> <div id='menu'> <div class='row-fluid'> <div class='span12'> <ul class='clearfix switch-item'> <li> <a> <span id='{12}'></span> </a> </li> <li> <a> <span id='{13}'></span> </a> </li> <li> <a> <span id='{14}'></span> </a> </li> <li> <a> <span id='{15}'></span> </a> </li> <li> <a> <span id='{16}'></span> </a> </li> <li> <a> <span id='{17}'></span> </a> </li> </ul> </div> </div> </div> <div class='row-fluid'> <div class='span12'> <div class='board-widgets gray'> <div class='board-widgets-head clearfix'> <ul class='breadcrumb'> <li><i class='icon-eye-open'></i></li> <li><span id='{18}'></span></li> <li><span id='{19}'></span></li> <li><i class='icon-eye-open'></i></li> <li><span id='{20}'></span></li> <li><span id='{21}'></span></li> <li><i class='icon-eye-open'></i></li> <li><span id='{22}'></span></li> <li><span id='{23}'></span></li> <li><i class='icon-eye-open'></i></li> <li><span id='{24}'></span></li> <li><span id='{25}'></span></li> </ul> </div> <div class='board-widgets-content'> <div class='row-fluid'> <div class='span12'> <div class='widget-container'> <span id='{26}'></span> </div> </div> </div> </div> </div> </div> </div> </div> </div> <div class='copyright'> <p> © 2015 EcrViaWeb </p> </div> <div class='scroll-top'> <a class='tip-top' href='#' title='Go Top'> <i class='icon-double-angle-up'></i> </a> </div> </div>")
    SafeHtml html11(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21, String arg22, String arg23, String arg24, String arg25, String arg26);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.ServerSession owner) {


    return new Widgets(owner).get_panel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.ServerSession owner;


    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onPanel01AttachOrDetach(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onLogoutactionClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMyScriptedAnchor1Click(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.ServerSession owner) {
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
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId22();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId23();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId24();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId25();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId26();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
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
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId22Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId23Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId24Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId25Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId26Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
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
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7();
    }
    SafeHtml template_html8() {
      return template.html8();
    }
    SafeHtml template_html9() {
      return template.html9();
    }
    SafeHtml template_html10() {
      return template.html10();
    }
    SafeHtml template_html11() {
      return template.html11(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11(), get_domId12(), get_domId13(), get_domId14(), get_domId15(), get_domId16(), get_domId17(), get_domId18(), get_domId19(), get_domId20(), get_domId21(), get_domId22(), get_domId23(), get_domId24(), get_domId25(), get_domId26());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 10 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style style;
    private ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      owner.style = style;

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
      final com.google.gwt.user.client.ui.HTMLPanel panel = new com.google.gwt.user.client.ui.HTMLPanel(template_html11().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord3 = UiBinderUtil.attachToDom(panel.getElement());
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
      get_domId13Element().get();
      get_domId14Element().get();
      get_domId15Element().get();
      get_domId16Element().get();
      get_domId17Element().get();
      get_domId18Element().get();
      get_domId19Element().get();
      get_domId20Element().get();
      get_domId21Element().get();
      get_domId22Element().get();
      get_domId23Element().get();
      get_domId24Element().get();
      get_domId25Element().get();
      get_domId26Element().get();

      // Detach section.
      attachRecord3.detach();
      panel.addAndReplaceElement(get_lienhome(), get_domId0Element().get());
      panel.addAndReplaceElement(get_lbl_shift(), get_domId1Element().get());
      panel.addAndReplaceElement(get_imageuser(), get_domId2Element().get());
      panel.addAndReplaceElement(get_username(), get_domId3Element().get());
      panel.addAndReplaceElement(get_editprofile(), get_domId4Element().get());
      panel.addAndReplaceElement(get_viewprofile(), get_domId5Element().get());
      panel.addAndReplaceElement(get_logoutaction(), get_domId6Element().get());
      panel.addAndReplaceElement(get_lbl_idcash(), get_domId7Element().get());
      panel.addAndReplaceElement(get_cmd_ipterminal(), get_domId8Element().get());
      panel.addAndReplaceElement(get_zone_menu(), get_domId9Element().get());
      panel.addAndReplaceElement(get_lbl_time(), get_domId10Element().get());
      panel.addAndReplaceElement(get_lbl_clock(), get_domId11Element().get());
      panel.addAndReplaceElement(get_bnt_esc(), get_domId12Element().get());
      panel.addAndReplaceElement(get_btn_client(), get_domId13Element().get());
      panel.addAndReplaceElement(get_btn_ecpese(), get_domId14Element().get());
      panel.addAndReplaceElement(get_btn_payer(), get_domId15Element().get());
      panel.addAndReplaceElement(get_btn_status(), get_domId16Element().get());
      panel.addAndReplaceElement(get_btn_print(), get_domId17Element().get());
      panel.addAndReplaceElement(get_f_Label1(), get_domId18Element().get());
      panel.addAndReplaceElement(get_lbl_unkuser(), get_domId19Element().get());
      panel.addAndReplaceElement(get_f_Label2(), get_domId20Element().get());
      panel.addAndReplaceElement(get_lbl_output(), get_domId21Element().get());
      panel.addAndReplaceElement(get_f_Label3(), get_domId22Element().get());
      panel.addAndReplaceElement(get_lbl_state(), get_domId23Element().get());
      panel.addAndReplaceElement(get_f_Label4(), get_domId24Element().get());
      panel.addAndReplaceElement(get_lbl_notif(), get_domId25Element().get());
      panel.addAndReplaceElement(get_panel01(), get_domId26Element().get());

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
      lienhome.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


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
     * Getter for lbl_shift called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_shift() {
      return build_lbl_shift();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_shift() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_shift = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_shift.setHeight("14px");


      owner.lbl_shift = lbl_shift;

      return lbl_shift;
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
      logoutaction.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.logoutaction = logoutaction;

      return logoutaction;
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


      owner.lbl_idcash = lbl_idcash;

      return lbl_idcash;
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
     * Getter for cmd_ipterminal called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmd_ipterminal() {
      return build_cmd_ipterminal();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_ipterminal() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmd_ipterminal = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmd_ipterminal.setStyleName("" + get_style().span12() + "");
      cmd_ipterminal.setHeight("42px");
      cmd_ipterminal.setWidth("178px");


      owner.cmd_ipterminal = cmd_ipterminal;

      return cmd_ipterminal;
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


      owner.lbl_time = lbl_time;

      return lbl_time;
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


      owner.lbl_clock = lbl_clock;

      return lbl_clock;
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
     * Getter for bnt_esc called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_esc() {
      return build_bnt_esc();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_esc() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_esc = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_esc.setHTML(template_html4().asString());
      bnt_esc.setStyleName("" + get_style().blue() + "");
      bnt_esc.setHeight("61px");
      bnt_esc.setWidth("86px");


      owner.bnt_esc = bnt_esc;

      return bnt_esc;
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

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId13;
    private java.lang.String get_domId13() {
      return domId13;
    }
    private java.lang.String build_domId13() {
      // Creation section.
      domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId13;
    }

    /**
     * Getter for btn_client called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_client() {
      return build_btn_client();
    }
    private com.google.gwt.user.client.ui.Button build_btn_client() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_client = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_client.setHTML(template_html5().asString());
      btn_client.setStyleName("" + get_style().blue() + "");
      btn_client.setHeight("61px");
      btn_client.setWidth("86px");


      owner.btn_client = btn_client;

      return btn_client;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId13Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId13Element() {
      return domId13Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId13Element() {
      // Creation section.
      domId13Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId13());
      // Setup section.


      return domId13Element;
    }

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId14;
    private java.lang.String get_domId14() {
      return domId14;
    }
    private java.lang.String build_domId14() {
      // Creation section.
      domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId14;
    }

    /**
     * Getter for btn_ecpese called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_ecpese() {
      return build_btn_ecpese();
    }
    private com.google.gwt.user.client.ui.Button build_btn_ecpese() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_ecpese = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_ecpese.setHTML(template_html6().asString());
      btn_ecpese.setStyleName("" + get_style().blue() + "");
      btn_ecpese.setHeight("61px");
      btn_ecpese.setWidth("86px");


      owner.btn_ecpese = btn_ecpese;

      return btn_ecpese;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId14Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId14Element() {
      return domId14Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId14Element() {
      // Creation section.
      domId14Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId14());
      // Setup section.


      return domId14Element;
    }

    /**
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId15;
    private java.lang.String get_domId15() {
      return domId15;
    }
    private java.lang.String build_domId15() {
      // Creation section.
      domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId15;
    }

    /**
     * Getter for btn_payer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_payer() {
      return build_btn_payer();
    }
    private com.google.gwt.user.client.ui.Button build_btn_payer() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_payer = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_payer.setHTML(template_html7().asString());
      btn_payer.setStyleName("" + get_style().blue() + "");
      btn_payer.setHeight("61px");
      btn_payer.setWidth("86px");


      owner.btn_payer = btn_payer;

      return btn_payer;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId15Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId15Element() {
      return domId15Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId15Element() {
      // Creation section.
      domId15Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId15());
      // Setup section.


      return domId15Element;
    }

    /**
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId16;
    private java.lang.String get_domId16() {
      return domId16;
    }
    private java.lang.String build_domId16() {
      // Creation section.
      domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId16;
    }

    /**
     * Getter for btn_status called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_status() {
      return build_btn_status();
    }
    private com.google.gwt.user.client.ui.Button build_btn_status() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_status = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_status.setHTML(template_html8().asString());
      btn_status.setStyleName("" + get_style().blue() + "");
      btn_status.setHeight("61px");
      btn_status.setWidth("87px");


      owner.btn_status = btn_status;

      return btn_status;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId16Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId16Element() {
      return domId16Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId16Element() {
      // Creation section.
      domId16Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId16());
      // Setup section.


      return domId16Element;
    }

    /**
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId17;
    private java.lang.String get_domId17() {
      return domId17;
    }
    private java.lang.String build_domId17() {
      // Creation section.
      domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId17;
    }

    /**
     * Getter for btn_print called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btn_print() {
      return build_btn_print();
    }
    private com.google.gwt.user.client.ui.Button build_btn_print() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_print = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_print.setHTML(template_html9().asString());
      btn_print.setStyleName("" + get_style().blue() + "");
      btn_print.setHeight("61px");
      btn_print.setWidth("86px");


      owner.btn_print = btn_print;

      return btn_print;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId17Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId17Element() {
      return domId17Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId17Element() {
      // Creation section.
      domId17Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId17());
      // Setup section.


      return domId17Element;
    }

    /**
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId18;
    private java.lang.String get_domId18() {
      return domId18;
    }
    private java.lang.String build_domId18() {
      // Creation section.
      domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId18;
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
      f_Label1.setText("Client status");
      f_Label1.setHeight("27px");
      f_Label1.setWidth("66px");


      return f_Label1;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId18Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId18Element() {
      return domId18Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId18Element() {
      // Creation section.
      domId18Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId18());
      // Setup section.


      return domId18Element;
    }

    /**
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId19;
    private java.lang.String get_domId19() {
      return domId19;
    }
    private java.lang.String build_domId19() {
      // Creation section.
      domId19 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId19;
    }

    /**
     * Getter for lbl_unkuser called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_unkuser() {
      return build_lbl_unkuser();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_unkuser() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_unkuser = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_unkuser.setHeight("27px");
      lbl_unkuser.setWidth("177px");


      owner.lbl_unkuser = lbl_unkuser;

      return lbl_unkuser;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId19Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId19Element() {
      return domId19Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId19Element() {
      // Creation section.
      domId19Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId19());
      // Setup section.


      return domId19Element;
    }

    /**
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId20;
    private java.lang.String get_domId20() {
      return domId20;
    }
    private java.lang.String build_domId20() {
      // Creation section.
      domId20 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId20;
    }

    /**
     * Getter for f_Label2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label2() {
      return build_f_Label2();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label2.setText("Request output");
      f_Label2.setHeight("27px");
      f_Label2.setWidth("83px");


      return f_Label2;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId20Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId20Element() {
      return domId20Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId20Element() {
      // Creation section.
      domId20Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId20());
      // Setup section.


      return domId20Element;
    }

    /**
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId21;
    private java.lang.String get_domId21() {
      return domId21;
    }
    private java.lang.String build_domId21() {
      // Creation section.
      domId21 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId21;
    }

    /**
     * Getter for lbl_output called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_output() {
      return build_lbl_output();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_output() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_output = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_output.setHeight("27px");
      lbl_output.setWidth("115px");


      owner.lbl_output = lbl_output;

      return lbl_output;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId21Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId21Element() {
      return domId21Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId21Element() {
      // Creation section.
      domId21Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId21());
      // Setup section.


      return domId21Element;
    }

    /**
     * Getter for domId22 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId22;
    private java.lang.String get_domId22() {
      return domId22;
    }
    private java.lang.String build_domId22() {
      // Creation section.
      domId22 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId22;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Terminal state");
      f_Label3.setHeight("27px");
      f_Label3.setWidth("93px");


      return f_Label3;
    }

    /**
     * Getter for domId22Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId22Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId22Element() {
      return domId22Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId22Element() {
      // Creation section.
      domId22Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId22());
      // Setup section.


      return domId22Element;
    }

    /**
     * Getter for domId23 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId23;
    private java.lang.String get_domId23() {
      return domId23;
    }
    private java.lang.String build_domId23() {
      // Creation section.
      domId23 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId23;
    }

    /**
     * Getter for lbl_state called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lbl_state() {
      return build_lbl_state();
    }
    private com.google.gwt.user.client.ui.Label build_lbl_state() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lbl_state = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lbl_state.setHeight("27px");
      lbl_state.setWidth("82px");


      owner.lbl_state = lbl_state;

      return lbl_state;
    }

    /**
     * Getter for domId23Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId23Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId23Element() {
      return domId23Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId23Element() {
      // Creation section.
      domId23Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId23());
      // Setup section.


      return domId23Element;
    }

    /**
     * Getter for domId24 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId24;
    private java.lang.String get_domId24() {
      return domId24;
    }
    private java.lang.String build_domId24() {
      // Creation section.
      domId24 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId24;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("Notification");
      f_Label4.setHeight("27px");
      f_Label4.setWidth("58px");


      return f_Label4;
    }

    /**
     * Getter for domId24Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId24Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId24Element() {
      return domId24Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId24Element() {
      // Creation section.
      domId24Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId24());
      // Setup section.


      return domId24Element;
    }

    /**
     * Getter for domId25 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId25;
    private java.lang.String get_domId25() {
      return domId25;
    }
    private java.lang.String build_domId25() {
      // Creation section.
      domId25 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId25;
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
      lbl_notif.setWidth("145px");


      owner.lbl_notif = lbl_notif;

      return lbl_notif;
    }

    /**
     * Getter for domId25Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId25Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId25Element() {
      return domId25Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId25Element() {
      // Creation section.
      domId25Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId25());
      // Setup section.


      return domId25Element;
    }

    /**
     * Getter for domId26 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId26;
    private java.lang.String get_domId26() {
      return domId26;
    }
    private java.lang.String build_domId26() {
      // Creation section.
      domId26 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId26;
    }

    /**
     * Getter for panel01 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel01() {
      return build_panel01();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel01() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel01 = new com.google.gwt.user.client.ui.HTMLPanel(template_html10().asString());
      // Setup section.
      panel01.setHeight("367px");
      panel01.setWidth("930px");
      panel01.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.panel01 = panel01;

      return panel01;
    }

    /**
     * Getter for domId26Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId26Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId26Element() {
      return domId26Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId26Element() {
      // Creation section.
      domId26Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId26());
      // Setup section.


      return domId26Element;
    }
  }
}
