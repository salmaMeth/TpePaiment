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

public class AjoutUser_AjoutUserUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutUser>, ecr.web.app.client.ui.AjoutUser.AjoutUserUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<i class='icon-upload-alt'></i> Upload")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutUser owner) {


    return new Widgets(owner).get_panel_ajoutuser();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutUser owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBn_Ajout_UserClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_annulerClick(event);
      }
    };

    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onPanel_ajoutuserAttachOrDetach(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_UploadClick(event);
      }
    };

    final com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler() {
      public void onSubmitComplete(com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent event) {
        owner.onPan_formSubmitComplete(event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onComb_roleChange(event);
      }
    };

    final com.google.gwt.event.logical.shared.AttachEvent.Handler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
      public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
        owner.onComb_roleAttachOrDetach(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutUser owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel37();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutUser_AjoutUserUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for panel_ajoutuser called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel_ajoutuser() {
      return build_panel_ajoutuser();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel_ajoutuser() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel_ajoutuser = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      panel_ajoutuser.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord30 = UiBinderUtil.attachToDom(panel_ajoutuser.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord30.detach();
      panel_ajoutuser.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

      owner.panel_ajoutuser = panel_ajoutuser;

      return panel_ajoutuser;
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
     * Getter for horizontalPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_horizontalPanel() {
      return build_horizontalPanel();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_horizontalPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel horizontalPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      horizontalPanel.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      horizontalPanel.add(get_f_VerticalPanel1());
      horizontalPanel.add(get_f_VerticalPanel18());
      horizontalPanel.add(get_f_DisclosurePanel37());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel37(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      horizontalPanel.setHeight("340px");
      horizontalPanel.setWidth("971px");


      return horizontalPanel;
    }

    /**
     * Getter for f_VerticalPanel1 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel1() {
      return build_f_VerticalPanel1();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.add(get_f_HorizontalPanel4());
      f_VerticalPanel1.add(get_f_HorizontalPanel6());
      f_VerticalPanel1.add(get_f_HorizontalPanel8());
      f_VerticalPanel1.add(get_f_HorizontalPanel10());
      f_VerticalPanel1.add(get_f_HorizontalPanel12());
      f_VerticalPanel1.add(get_f_HorizontalPanel14());
      f_VerticalPanel1.add(get_f_HorizontalPanel16());
      f_VerticalPanel1.setHeight("319px");
      f_VerticalPanel1.setWidth("341px");


      return f_VerticalPanel1;
    }

    /**
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.add(get_txt_login());
      f_HorizontalPanel2.setHeight("31px");
      f_HorizontalPanel2.setWidth("337px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Login");
      f_Label3.setWidth("140px");


      return f_Label3;
    }

    /**
     * Getter for txt_login called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_login() {
      return build_txt_login();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_login() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_login = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_login = txt_login;

      return txt_login;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.add(get_txt_MP());
      f_HorizontalPanel4.setHeight("31px");
      f_HorizontalPanel4.setWidth("337px");


      return f_HorizontalPanel4;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("Password");
      f_Label5.setWidth("140px");


      return f_Label5;
    }

    /**
     * Getter for txt_MP called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_MP() {
      return build_txt_MP();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_MP() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_MP = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_MP = txt_MP;

      return txt_MP;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.add(get_comb_role());
      f_HorizontalPanel6.setHeight("31px");
      f_HorizontalPanel6.setWidth("337px");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setText("Role");
      f_Label7.setWidth("140px");


      return f_Label7;
    }

    /**
     * Getter for comb_role called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_comb_role() {
      return build_comb_role();
    }
    private com.google.gwt.user.client.ui.ListBox build_comb_role() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox comb_role = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      comb_role.addItem("Admin", "2");
      comb_role.addItem("Merchant", "3");
      comb_role.addItem("Server", "4");
      comb_role.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);
      comb_role.addAttachHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);


      owner.comb_role = comb_role;

      return comb_role;
    }

    /**
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.add(get_f_Label9());
      f_HorizontalPanel8.add(get_cmd_defaultip());
      f_HorizontalPanel8.setHeight("31px");
      f_HorizontalPanel8.setWidth("337px");


      return f_HorizontalPanel8;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label9.setText("Terminal default ip");
      f_Label9.setWidth("140px");


      return f_Label9;
    }

    /**
     * Getter for cmd_defaultip called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmd_defaultip() {
      return build_cmd_defaultip();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_defaultip() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmd_defaultip = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      owner.cmd_defaultip = cmd_defaultip;

      return cmd_defaultip;
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
      f_HorizontalPanel10.add(get_f_Label11());
      f_HorizontalPanel10.add(get_cmd_ipsec1());
      f_HorizontalPanel10.setHeight("31px");
      f_HorizontalPanel10.setWidth("337px");


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
      f_Label11.setText("Terminal ip address1");
      f_Label11.setWidth("140px");


      return f_Label11;
    }

    /**
     * Getter for cmd_ipsec1 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmd_ipsec1() {
      return build_cmd_ipsec1();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmd_ipsec1() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmd_ipsec1 = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      owner.cmd_ipsec1 = cmd_ipsec1;

      return cmd_ipsec1;
    }

    /**
     * Getter for f_HorizontalPanel12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel12() {
      return build_f_HorizontalPanel12();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel12 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel12.add(get_f_Label13());
      f_HorizontalPanel12.add(get_cmb_ipsec2());
      f_HorizontalPanel12.setHeight("31px");
      f_HorizontalPanel12.setWidth("337px");


      return f_HorizontalPanel12;
    }

    /**
     * Getter for f_Label13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label13() {
      return build_f_Label13();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label13() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label13.setText("Terminal ip address2");
      f_Label13.setWidth("140px");


      return f_Label13;
    }

    /**
     * Getter for cmb_ipsec2 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_ipsec2() {
      return build_cmb_ipsec2();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_ipsec2() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_ipsec2 = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      owner.cmb_ipsec2 = cmb_ipsec2;

      return cmb_ipsec2;
    }

    /**
     * Getter for f_HorizontalPanel14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel14() {
      return build_f_HorizontalPanel14();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel14 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel14.add(get_f_Label15());
      f_HorizontalPanel14.add(get_cmb_ipsec3());
      f_HorizontalPanel14.setHeight("31px");
      f_HorizontalPanel14.setWidth("337px");


      return f_HorizontalPanel14;
    }

    /**
     * Getter for f_Label15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label15() {
      return build_f_Label15();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label15() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label15.setText("Terminal ip address3");
      f_Label15.setWidth("140px");


      return f_Label15;
    }

    /**
     * Getter for cmb_ipsec3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_ipsec3() {
      return build_cmb_ipsec3();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_ipsec3() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_ipsec3 = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      owner.cmb_ipsec3 = cmb_ipsec3;

      return cmb_ipsec3;
    }

    /**
     * Getter for f_HorizontalPanel16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel16() {
      return build_f_HorizontalPanel16();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel16 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel16.add(get_f_Label17());
      f_HorizontalPanel16.add(get_cmb_idcash());
      f_HorizontalPanel16.setHeight("31px");
      f_HorizontalPanel16.setWidth("337px");


      return f_HorizontalPanel16;
    }

    /**
     * Getter for f_Label17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label17() {
      return build_f_Label17();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label17() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label17.setText("Cash register");
      f_Label17.setWidth("140px");


      return f_Label17;
    }

    /**
     * Getter for cmb_idcash called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_cmb_idcash() {
      return build_cmb_idcash();
    }
    private com.google.gwt.user.client.ui.ListBox build_cmb_idcash() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox cmb_idcash = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      cmb_idcash.addItem("100", "1");
      cmb_idcash.addItem("101", "2");
      cmb_idcash.addItem("102", "3");


      owner.cmb_idcash = cmb_idcash;

      return cmb_idcash;
    }

    /**
     * Getter for f_VerticalPanel18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel18() {
      return build_f_VerticalPanel18();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel18() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel18 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel18.add(get_f_HorizontalPanel19());
      f_VerticalPanel18.add(get_f_HorizontalPanel21());
      f_VerticalPanel18.add(get_f_HorizontalPanel23());
      f_VerticalPanel18.add(get_f_HorizontalPanel25());
      f_VerticalPanel18.add(get_f_HorizontalPanel27());
      f_VerticalPanel18.add(get_f_HorizontalPanel29());
      f_VerticalPanel18.add(get_f_HorizontalPanel31());
      f_VerticalPanel18.add(get_f_HorizontalPanel33());
      f_VerticalPanel18.add(get_f_HorizontalPanel35());
      f_VerticalPanel18.setHeight("319px");
      f_VerticalPanel18.setWidth("341px");


      return f_VerticalPanel18;
    }

    /**
     * Getter for f_HorizontalPanel19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel19() {
      return build_f_HorizontalPanel19();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel19 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel19.add(get_f_Label20());
      f_HorizontalPanel19.add(get_txt_name());
      f_HorizontalPanel19.setHeight("31px");
      f_HorizontalPanel19.setWidth("337px");


      return f_HorizontalPanel19;
    }

    /**
     * Getter for f_Label20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label20() {
      return build_f_Label20();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label20.setText("First name");
      f_Label20.setWidth("140px");


      return f_Label20;
    }

    /**
     * Getter for txt_name called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_name() {
      return build_txt_name();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_name() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_name = txt_name;

      return txt_name;
    }

    /**
     * Getter for f_HorizontalPanel21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel21() {
      return build_f_HorizontalPanel21();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel21 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel21.add(get_f_Label22());
      f_HorizontalPanel21.add(get_txt_secname());
      f_HorizontalPanel21.setHeight("31px");
      f_HorizontalPanel21.setWidth("337px");


      return f_HorizontalPanel21;
    }

    /**
     * Getter for f_Label22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label22() {
      return build_f_Label22();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label22() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label22 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label22.setText("Last name");
      f_Label22.setWidth("140px");


      return f_Label22;
    }

    /**
     * Getter for txt_secname called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_secname() {
      return build_txt_secname();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_secname() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_secname = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_secname = txt_secname;

      return txt_secname;
    }

    /**
     * Getter for f_HorizontalPanel23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel23() {
      return build_f_HorizontalPanel23();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel23() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel23 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel23.add(get_f_Label24());
      f_HorizontalPanel23.add(get_txt_tel1());
      f_HorizontalPanel23.setHeight("31px");
      f_HorizontalPanel23.setWidth("337px");


      return f_HorizontalPanel23;
    }

    /**
     * Getter for f_Label24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label24() {
      return build_f_Label24();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label24() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label24 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label24.setText("Phone 1");
      f_Label24.setWidth("140px");


      return f_Label24;
    }

    /**
     * Getter for txt_tel1 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_tel1() {
      return build_txt_tel1();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_tel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_tel1 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_tel1 = txt_tel1;

      return txt_tel1;
    }

    /**
     * Getter for f_HorizontalPanel25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel25() {
      return build_f_HorizontalPanel25();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel25() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel25 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel25.add(get_f_Label26());
      f_HorizontalPanel25.add(get_date_nais());
      f_HorizontalPanel25.setHeight("31px");
      f_HorizontalPanel25.setWidth("337px");


      return f_HorizontalPanel25;
    }

    /**
     * Getter for f_Label26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label26() {
      return build_f_Label26();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label26() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label26 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label26.setText("Date of birth");
      f_Label26.setWidth("140px");


      return f_Label26;
    }

    /**
     * Getter for date_nais called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_date_nais() {
      return build_date_nais();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_date_nais() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox date_nais = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.


      owner.date_nais = date_nais;

      return date_nais;
    }

    /**
     * Getter for f_HorizontalPanel27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel27() {
      return build_f_HorizontalPanel27();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel27() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel27 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel27.add(get_f_Label28());
      f_HorizontalPanel27.add(get_txt_adresse());
      f_HorizontalPanel27.setHeight("31px");
      f_HorizontalPanel27.setWidth("337px");


      return f_HorizontalPanel27;
    }

    /**
     * Getter for f_Label28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label28() {
      return build_f_Label28();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label28() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label28 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label28.setText("Address");
      f_Label28.setWidth("140px");


      return f_Label28;
    }

    /**
     * Getter for txt_adresse called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_adresse() {
      return build_txt_adresse();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_adresse() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_adresse = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_adresse = txt_adresse;

      return txt_adresse;
    }

    /**
     * Getter for f_HorizontalPanel29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel29() {
      return build_f_HorizontalPanel29();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel29() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel29 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel29.add(get_f_Label30());
      f_HorizontalPanel29.add(get_txt_Email());
      f_HorizontalPanel29.setHeight("31px");
      f_HorizontalPanel29.setWidth("337px");


      return f_HorizontalPanel29;
    }

    /**
     * Getter for f_Label30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label30() {
      return build_f_Label30();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label30() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label30 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label30.setText("Email");
      f_Label30.setWidth("140px");


      return f_Label30;
    }

    /**
     * Getter for txt_Email called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Email() {
      return build_txt_Email();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Email() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Email = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Email = txt_Email;

      return txt_Email;
    }

    /**
     * Getter for f_HorizontalPanel31 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel31() {
      return build_f_HorizontalPanel31();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel31() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel31 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel31.add(get_f_Label32());
      f_HorizontalPanel31.add(get_txt_codepost());
      f_HorizontalPanel31.setHeight("31px");
      f_HorizontalPanel31.setWidth("337px");


      return f_HorizontalPanel31;
    }

    /**
     * Getter for f_Label32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label32() {
      return build_f_Label32();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label32() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label32 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label32.setText("Postal code");
      f_Label32.setWidth("140px");


      return f_Label32;
    }

    /**
     * Getter for txt_codepost called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_codepost() {
      return build_txt_codepost();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_codepost() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_codepost = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_codepost = txt_codepost;

      return txt_codepost;
    }

    /**
     * Getter for f_HorizontalPanel33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel33() {
      return build_f_HorizontalPanel33();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel33() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel33 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel33.add(get_f_Label34());
      f_HorizontalPanel33.add(get_txt_Interest());
      f_HorizontalPanel33.setHeight("31px");
      f_HorizontalPanel33.setWidth("337px");


      return f_HorizontalPanel33;
    }

    /**
     * Getter for f_Label34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label34() {
      return build_f_Label34();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label34() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label34 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label34.setText("Interest");
      f_Label34.setWidth("140px");


      return f_Label34;
    }

    /**
     * Getter for txt_Interest called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Interest() {
      return build_txt_Interest();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Interest() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Interest = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Interest = txt_Interest;

      return txt_Interest;
    }

    /**
     * Getter for f_HorizontalPanel35 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel35() {
      return build_f_HorizontalPanel35();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel35() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel35 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel35.add(get_pan_form());
      f_HorizontalPanel35.setHeight("31px");
      f_HorizontalPanel35.setWidth("337px");


      return f_HorizontalPanel35;
    }

    /**
     * Getter for pan_form called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.FormPanel get_pan_form() {
      return build_pan_form();
    }
    private com.google.gwt.user.client.ui.FormPanel build_pan_form() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel pan_form = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      pan_form.add(get_f_HorizontalPanel36());
      pan_form.setHeight("33px");
      pan_form.addSubmitCompleteHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);


      owner.pan_form = pan_form;

      return pan_form;
    }

    /**
     * Getter for f_HorizontalPanel36 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel36() {
      return build_f_HorizontalPanel36();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel36() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel36 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel36.add(get_uploadFormElement());
      f_HorizontalPanel36.add(get_bnt_Upload());
      f_HorizontalPanel36.setHeight("25px");
      f_HorizontalPanel36.setWidth("331px");


      return f_HorizontalPanel36;
    }

    /**
     * Getter for uploadFormElement called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.FileUpload get_uploadFormElement() {
      return build_uploadFormElement();
    }
    private com.google.gwt.user.client.ui.FileUpload build_uploadFormElement() {
      // Creation section.
      final com.google.gwt.user.client.ui.FileUpload uploadFormElement = (com.google.gwt.user.client.ui.FileUpload) GWT.create(com.google.gwt.user.client.ui.FileUpload.class);
      // Setup section.
      uploadFormElement.setWidth("256px");


      owner.uploadFormElement = uploadFormElement;

      return uploadFormElement;
    }

    /**
     * Getter for bnt_Upload called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Upload() {
      return build_bnt_Upload();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Upload() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Upload = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Upload.setHTML(template_html1().asString());
      bnt_Upload.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      owner.bnt_Upload = bnt_Upload;

      return bnt_Upload;
    }

    /**
     * Getter for f_DisclosurePanel37 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel37;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel37() {
      return f_DisclosurePanel37;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel37() {
      // Creation section.
      f_DisclosurePanel37 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel37.add(get_f_VerticalPanel38());
      f_DisclosurePanel37.setOpen(true);
      f_DisclosurePanel37.setHeight("116px");


      return f_DisclosurePanel37;
    }

    /**
     * Getter for f_VerticalPanel38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel38() {
      return build_f_VerticalPanel38();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel38() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel38 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel38.add(get_bn_Ajout_User());
      f_VerticalPanel38.add(get_btn_annuler());
      f_VerticalPanel38.setHeight("100px");
      f_VerticalPanel38.setWidth("132px");


      return f_VerticalPanel38;
    }

    /**
     * Getter for bn_Ajout_User called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bn_Ajout_User() {
      return build_bn_Ajout_User();
    }
    private com.google.gwt.user.client.ui.Button build_bn_Ajout_User() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bn_Ajout_User = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bn_Ajout_User.setText("Add user");
      bn_Ajout_User.setHeight("33px");
      bn_Ajout_User.setWidth("173px");
      bn_Ajout_User.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.bn_Ajout_User = bn_Ajout_User;

      return bn_Ajout_User;
    }

    /**
     * Getter for btn_annuler called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_annuler() {
      return build_btn_annuler();
    }
    private com.google.gwt.user.client.ui.Button build_btn_annuler() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_annuler = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_annuler.setText("Cancel");
      btn_annuler.setHeight("33px");
      btn_annuler.setWidth("173px");
      btn_annuler.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_annuler = btn_annuler;

      return btn_annuler;
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
