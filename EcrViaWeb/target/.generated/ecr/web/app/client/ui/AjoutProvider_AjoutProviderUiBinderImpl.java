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

public class AjoutProvider_AjoutProviderUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutProvider>, ecr.web.app.client.ui.AjoutProvider.AjoutProviderUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutProvider owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutProvider owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_AjoutProviderClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_cancelClientClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutProvider owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel20();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutProvider_AjoutProviderUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord41 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord41.detach();
      f_HTMLPanel1.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

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
      horizontalPanel.add(get_f_VerticalPanel2());
      horizontalPanel.add(get_f_VerticalPanel11());
      horizontalPanel.add(get_f_DisclosurePanel20());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel20(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      horizontalPanel.setHeight("340px");
      horizontalPanel.setWidth("971px");


      return horizontalPanel;
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
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.add(get_f_HorizontalPanel5());
      f_VerticalPanel2.add(get_f_HorizontalPanel7());
      f_VerticalPanel2.add(get_f_HorizontalPanel9());
      f_VerticalPanel2.setHeight("319px");
      f_VerticalPanel2.setWidth("341px");


      return f_VerticalPanel2;
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
      f_HorizontalPanel3.add(get_f_Label4());
      f_HorizontalPanel3.add(get_txt_Name());
      f_HorizontalPanel3.setHeight("31px");
      f_HorizontalPanel3.setWidth("337px");


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
      f_Label4.setText("First first");
      f_Label4.setWidth("140px");


      return f_Label4;
    }

    /**
     * Getter for txt_Name called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Name() {
      return build_txt_Name();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Name() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Name = txt_Name;

      return txt_Name;
    }

    /**
     * Getter for f_HorizontalPanel5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return build_f_HorizontalPanel5();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.add(get_f_Label6());
      f_HorizontalPanel5.add(get_txt_SecName());
      f_HorizontalPanel5.setHeight("31px");
      f_HorizontalPanel5.setWidth("337px");


      return f_HorizontalPanel5;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setText("Last name");
      f_Label6.setWidth("140px");


      return f_Label6;
    }

    /**
     * Getter for txt_SecName called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_SecName() {
      return build_txt_SecName();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_SecName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_SecName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_SecName = txt_SecName;

      return txt_SecName;
    }

    /**
     * Getter for f_HorizontalPanel7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel7() {
      return build_f_HorizontalPanel7();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel7 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel7.add(get_f_Label8());
      f_HorizontalPanel7.add(get_txt_phone1());
      f_HorizontalPanel7.setHeight("31px");
      f_HorizontalPanel7.setWidth("337px");


      return f_HorizontalPanel7;
    }

    /**
     * Getter for f_Label8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label8() {
      return build_f_Label8();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label8() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label8.setText("Phone 1");
      f_Label8.setWidth("140px");


      return f_Label8;
    }

    /**
     * Getter for txt_phone1 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_phone1() {
      return build_txt_phone1();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_phone1() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_phone1 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_phone1 = txt_phone1;

      return txt_phone1;
    }

    /**
     * Getter for f_HorizontalPanel9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel9() {
      return build_f_HorizontalPanel9();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel9.add(get_f_Label10());
      f_HorizontalPanel9.add(get_txt_phone2());
      f_HorizontalPanel9.setHeight("31px");
      f_HorizontalPanel9.setWidth("337px");


      return f_HorizontalPanel9;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label10.setText("Phone 2");
      f_Label10.setWidth("140px");


      return f_Label10;
    }

    /**
     * Getter for txt_phone2 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_phone2() {
      return build_txt_phone2();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_phone2() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_phone2 = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_phone2 = txt_phone2;

      return txt_phone2;
    }

    /**
     * Getter for f_VerticalPanel11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel11() {
      return build_f_VerticalPanel11();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel11 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel11.add(get_f_HorizontalPanel12());
      f_VerticalPanel11.add(get_f_HorizontalPanel14());
      f_VerticalPanel11.add(get_f_HorizontalPanel16());
      f_VerticalPanel11.add(get_f_HorizontalPanel18());
      f_VerticalPanel11.setHeight("319px");
      f_VerticalPanel11.setWidth("341px");


      return f_VerticalPanel11;
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
      f_HorizontalPanel12.add(get_txt_Mail());
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
      f_Label13.setText("Mail adress");
      f_Label13.setWidth("140px");


      return f_Label13;
    }

    /**
     * Getter for txt_Mail called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Mail() {
      return build_txt_Mail();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Mail() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Mail = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Mail = txt_Mail;

      return txt_Mail;
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
      f_HorizontalPanel14.add(get_txt_property());
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
      f_Label15.setText("property");
      f_Label15.setWidth("140px");


      return f_Label15;
    }

    /**
     * Getter for txt_property called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_property() {
      return build_txt_property();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_property() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_property = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_property = txt_property;

      return txt_property;
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
      f_HorizontalPanel16.add(get_txt_Adresse());
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
      f_Label17.setText("Address");
      f_Label17.setWidth("140px");


      return f_Label17;
    }

    /**
     * Getter for txt_Adresse called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Adresse() {
      return build_txt_Adresse();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Adresse() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Adresse = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Adresse = txt_Adresse;

      return txt_Adresse;
    }

    /**
     * Getter for f_HorizontalPanel18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel18() {
      return build_f_HorizontalPanel18();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel18() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel18 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel18.add(get_f_Label19());
      f_HorizontalPanel18.add(get_txt_codepos());
      f_HorizontalPanel18.setHeight("31px");
      f_HorizontalPanel18.setWidth("337px");


      return f_HorizontalPanel18;
    }

    /**
     * Getter for f_Label19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label19() {
      return build_f_Label19();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label19() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label19 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label19.setText("Postal code");
      f_Label19.setWidth("140px");


      return f_Label19;
    }

    /**
     * Getter for txt_codepos called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_codepos() {
      return build_txt_codepos();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_codepos() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_codepos = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_codepos = txt_codepos;

      return txt_codepos;
    }

    /**
     * Getter for f_DisclosurePanel20 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel20;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel20() {
      return f_DisclosurePanel20;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel20() {
      // Creation section.
      f_DisclosurePanel20 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel20.add(get_f_VerticalPanel21());
      f_DisclosurePanel20.setOpen(true);
      f_DisclosurePanel20.setHeight("116px");


      return f_DisclosurePanel20;
    }

    /**
     * Getter for f_VerticalPanel21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel21() {
      return build_f_VerticalPanel21();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel21 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel21.add(get_bnt_Ajoutprovider());
      f_VerticalPanel21.add(get_bnt_Reset());
      f_VerticalPanel21.setHeight("180px");
      f_VerticalPanel21.setWidth("132px");


      return f_VerticalPanel21;
    }

    /**
     * Getter for bnt_Ajoutprovider called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Ajoutprovider() {
      return build_bnt_Ajoutprovider();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Ajoutprovider() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Ajoutprovider = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Ajoutprovider.setText("Add provider");
      bnt_Ajoutprovider.setHeight("33px");
      bnt_Ajoutprovider.setWidth("173px");
      bnt_Ajoutprovider.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.bnt_Ajoutprovider = bnt_Ajoutprovider;

      return bnt_Ajoutprovider;
    }

    /**
     * Getter for bnt_Reset called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Reset() {
      return build_bnt_Reset();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Reset() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Reset = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Reset.setText("Cancel");
      bnt_Reset.setHeight("33px");
      bnt_Reset.setWidth("173px");
      bnt_Reset.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.bnt_Reset = bnt_Reset;

      return bnt_Reset;
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
