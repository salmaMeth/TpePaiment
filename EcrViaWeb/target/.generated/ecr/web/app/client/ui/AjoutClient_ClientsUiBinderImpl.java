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

public class AjoutClient_ClientsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutClient>, ecr.web.app.client.ui.AjoutClient.ClientsUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<i class='icon-upload-alt'></i> Upload")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutClient owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutClient owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_UploadClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_AjoutClientClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_cancelClientClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutClient owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel33();  // more than one getter call detected. Type: DEFAULT, precedence: 3
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
    private ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutClient_ClientsUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord39 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord39.detach();
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
      horizontalPanel.add(get_f_VerticalPanel16());
      horizontalPanel.add(get_f_DisclosurePanel33());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel33(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
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
      f_VerticalPanel2.add(get_f_HorizontalPanel4());
      f_VerticalPanel2.add(get_f_HorizontalPanel6());
      f_VerticalPanel2.add(get_f_HorizontalPanel8());
      f_VerticalPanel2.add(get_f_HorizontalPanel10());
      f_VerticalPanel2.add(get_f_HorizontalPanel12());
      f_VerticalPanel2.add(get_f_HorizontalPanel14());
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
      f_HorizontalPanel3.add(get_radio_Homme());
      f_HorizontalPanel3.add(get_radio_Femme());
      f_HorizontalPanel3.setHeight("31px");
      f_HorizontalPanel3.setWidth("337px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for radio_Homme called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radio_Homme() {
      return build_radio_Homme();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radio_Homme() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radio_Homme = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      radio_Homme.setText("Male");


      owner.radio_Homme = radio_Homme;

      return radio_Homme;
    }

    /**
     * Getter for radio_Femme called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radio_Femme() {
      return build_radio_Femme();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radio_Femme() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radio_Femme = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      radio_Femme.setText("Female");


      owner.radio_Femme = radio_Femme;

      return radio_Femme;
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
      f_HorizontalPanel4.add(get_txt_cardid());
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
      f_Label5.setText("Card Id");
      f_Label5.setWidth("140px");


      return f_Label5;
    }

    /**
     * Getter for txt_cardid called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_cardid() {
      return build_txt_cardid();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_cardid() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_cardid = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_cardid = txt_cardid;

      return txt_cardid;
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
      f_HorizontalPanel6.add(get_txt_Name());
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
      f_Label7.setText("First first");
      f_Label7.setWidth("140px");


      return f_Label7;
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
      f_HorizontalPanel8.add(get_txt_SecName());
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
      f_Label9.setText("Last name");
      f_Label9.setWidth("140px");


      return f_Label9;
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
      f_HorizontalPanel10.add(get_txt_phone1());
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
      f_Label11.setText("Phone 1");
      f_Label11.setWidth("140px");


      return f_Label11;
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
      f_HorizontalPanel12.add(get_txt_phone2());
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
      f_Label13.setText("Phone 2");
      f_Label13.setWidth("140px");


      return f_Label13;
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
      f_HorizontalPanel14.add(get_Date_nais());
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
      f_Label15.setText("Date of birth");
      f_Label15.setWidth("140px");


      return f_Label15;
    }

    /**
     * Getter for Date_nais called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_Date_nais() {
      return build_Date_nais();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_Date_nais() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox Date_nais = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.


      owner.Date_nais = Date_nais;

      return Date_nais;
    }

    /**
     * Getter for f_VerticalPanel16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel16() {
      return build_f_VerticalPanel16();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel16 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel16.add(get_f_HorizontalPanel17());
      f_VerticalPanel16.add(get_f_HorizontalPanel19());
      f_VerticalPanel16.add(get_f_HorizontalPanel21());
      f_VerticalPanel16.add(get_f_HorizontalPanel23());
      f_VerticalPanel16.add(get_f_HorizontalPanel25());
      f_VerticalPanel16.add(get_f_HorizontalPanel27());
      f_VerticalPanel16.add(get_f_HorizontalPanel29());
      f_VerticalPanel16.add(get_f_HorizontalPanel31());
      f_VerticalPanel16.setHeight("319px");
      f_VerticalPanel16.setWidth("341px");


      return f_VerticalPanel16;
    }

    /**
     * Getter for f_HorizontalPanel17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel17() {
      return build_f_HorizontalPanel17();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel17 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel17.add(get_f_Label18());
      f_HorizontalPanel17.add(get_txt_SituationFa());
      f_HorizontalPanel17.setHeight("31px");
      f_HorizontalPanel17.setWidth("337px");


      return f_HorizontalPanel17;
    }

    /**
     * Getter for f_Label18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label18() {
      return build_f_Label18();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label18() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label18 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label18.setText("Family situation");
      f_Label18.setWidth("140px");


      return f_Label18;
    }

    /**
     * Getter for txt_SituationFa called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_SituationFa() {
      return build_txt_SituationFa();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_SituationFa() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_SituationFa = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_SituationFa = txt_SituationFa;

      return txt_SituationFa;
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
      f_HorizontalPanel19.add(get_txt_Profession());
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
      f_Label20.setText("Profession");
      f_Label20.setWidth("140px");


      return f_Label20;
    }

    /**
     * Getter for txt_Profession called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Profession() {
      return build_txt_Profession();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Profession() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Profession = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Profession = txt_Profession;

      return txt_Profession;
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
      f_HorizontalPanel21.add(get_txt_Adresse());
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
      f_Label22.setText("Address");
      f_Label22.setWidth("140px");


      return f_Label22;
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
      f_HorizontalPanel23.add(get_txt_City());
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
      f_Label24.setText("City");
      f_Label24.setWidth("140px");


      return f_Label24;
    }

    /**
     * Getter for txt_City called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_City() {
      return build_txt_City();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_City() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_City = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_City = txt_City;

      return txt_City;
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
      f_HorizontalPanel25.add(get_txt_codepos());
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
      f_Label26.setText("Postal code");
      f_Label26.setWidth("140px");


      return f_Label26;
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
      f_HorizontalPanel27.add(get_comb_continent());
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
      f_Label28.setText("Continent");
      f_Label28.setWidth("140px");


      return f_Label28;
    }

    /**
     * Getter for comb_continent called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.ListBox get_comb_continent() {
      return build_comb_continent();
    }
    private com.google.gwt.user.client.ui.ListBox build_comb_continent() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox comb_continent = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      comb_continent.addItem("American", "1");
      comb_continent.addItem("European", "2");
      comb_continent.addItem("Australia", "3");
      comb_continent.addItem("Asian", "4");
      comb_continent.addItem("African", "5");


      owner.comb_continent = comb_continent;

      return comb_continent;
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
      f_HorizontalPanel29.add(get_txt_Pointfidal());
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
      f_Label30.setText("Points de fidalités");
      f_Label30.setWidth("140px");


      return f_Label30;
    }

    /**
     * Getter for txt_Pointfidal called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Pointfidal() {
      return build_txt_Pointfidal();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Pointfidal() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Pointfidal = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txt_Pointfidal.setEnabled(false);
      txt_Pointfidal.setText("0");
      txt_Pointfidal.setReadOnly(true);


      owner.txt_Pointfidal = txt_Pointfidal;

      return txt_Pointfidal;
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
      f_HorizontalPanel31.add(get_pan_form());
      f_HorizontalPanel31.setHeight("31px");
      f_HorizontalPanel31.setWidth("337px");


      return f_HorizontalPanel31;
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
      pan_form.add(get_f_HorizontalPanel32());
      pan_form.setHeight("33px");


      owner.pan_form = pan_form;

      return pan_form;
    }

    /**
     * Getter for f_HorizontalPanel32 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel32() {
      return build_f_HorizontalPanel32();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel32() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel32 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel32.add(get_uploadFormElement());
      f_HorizontalPanel32.add(get_bnt_Upload());
      f_HorizontalPanel32.setHeight("25px");
      f_HorizontalPanel32.setWidth("331px");


      return f_HorizontalPanel32;
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
      bnt_Upload.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.bnt_Upload = bnt_Upload;

      return bnt_Upload;
    }

    /**
     * Getter for f_DisclosurePanel33 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel33;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel33() {
      return f_DisclosurePanel33;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel33() {
      // Creation section.
      f_DisclosurePanel33 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel33.add(get_f_VerticalPanel34());
      f_DisclosurePanel33.setOpen(true);
      f_DisclosurePanel33.setHeight("116px");


      return f_DisclosurePanel33;
    }

    /**
     * Getter for f_VerticalPanel34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel34() {
      return build_f_VerticalPanel34();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel34() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel34 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel34.add(get_bnt_AjoutClient());
      f_VerticalPanel34.add(get_bnt_Imprimer());
      f_VerticalPanel34.add(get_bnt_Reset());
      f_VerticalPanel34.setHeight("180px");
      f_VerticalPanel34.setWidth("132px");


      return f_VerticalPanel34;
    }

    /**
     * Getter for bnt_AjoutClient called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_AjoutClient() {
      return build_bnt_AjoutClient();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_AjoutClient() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_AjoutClient = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_AjoutClient.setText("Add client");
      bnt_AjoutClient.setHeight("33px");
      bnt_AjoutClient.setWidth("173px");
      bnt_AjoutClient.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.bnt_AjoutClient = bnt_AjoutClient;

      return bnt_AjoutClient;
    }

    /**
     * Getter for bnt_Imprimer called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Imprimer() {
      return build_bnt_Imprimer();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Imprimer() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Imprimer = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Imprimer.setText("Print card");
      bnt_Imprimer.setHeight("33px");
      bnt_Imprimer.setWidth("173px");


      owner.bnt_Imprimer = bnt_Imprimer;

      return bnt_Imprimer;
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
      bnt_Reset.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


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
