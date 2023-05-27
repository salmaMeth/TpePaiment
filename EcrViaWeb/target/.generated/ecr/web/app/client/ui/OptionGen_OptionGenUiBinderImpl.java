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

public class OptionGen_OptionGenUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.OptionGen>, ecr.web.app.client.ui.OptionGen.OptionGenUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<i class='icon-upload-alt'></i> Upload")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.OptionGen owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.OptionGen owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_saveClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_cancelClick(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.OptionGen owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel30();  // more than one getter call detected. Type: DEFAULT, precedence: 4
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
    private ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenCss_style style;
    private ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private ecr.web.app.client.ui.OptionGen_OptionGenUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord35 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord35.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_VerticalPanel2(), get_domId0Element().get());

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
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_TOP);
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.setHeight("437px");
      f_VerticalPanel2.setWidth("906px");


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
      f_HorizontalPanel3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel3.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      f_HorizontalPanel3.add(get_vp1());
      f_HorizontalPanel3.add(get_f_VerticalPanel20());
      f_HorizontalPanel3.add(get_f_DisclosurePanel30());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_f_DisclosurePanel30(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel3.setHeight("361px");
      f_HorizontalPanel3.setWidth("885px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for vp1 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_vp1() {
      return build_vp1();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_vp1() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel vp1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      vp1.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      vp1.add(get_f_Label4());
      vp1.add(get_f_Label5());
      vp1.add(get_txt_name());
      vp1.add(get_f_Label6());
      vp1.add(get_f_FormPanel7());
      vp1.add(get_f_Label11());
      vp1.add(get_txt_mail());
      vp1.add(get_f_Label12());
      vp1.add(get_txt_passwordmail());
      vp1.add(get_f_Label13());
      vp1.add(get_f_HorizontalPanel14());
      vp1.add(get_f_HorizontalPanel17());
      vp1.setHeight("400px");
      vp1.setWidth("370px");


      owner.vp1 = vp1;

      return vp1;
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
      f_Label4.addStyleName("" + get_style().pageHeader() + "");
      f_Label4.setText("General Options");
      f_Label4.setHeight("23px");
      f_Label4.setWidth("266px");


      return f_Label4;
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
      f_Label5.setText("Name Of Shop");
      f_Label5.setHeight("23px");
      f_Label5.setWidth("266px");


      return f_Label5;
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
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setText("logo shop");
      f_Label6.setHeight("23px");
      f_Label6.setWidth("266px");


      return f_Label6;
    }

    /**
     * Getter for f_FormPanel7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.FormPanel get_f_FormPanel7() {
      return build_f_FormPanel7();
    }
    private com.google.gwt.user.client.ui.FormPanel build_f_FormPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel f_FormPanel7 = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      f_FormPanel7.add(get_f_VerticalPanel8());
      f_FormPanel7.setHeight("38px");
      f_FormPanel7.setWidth("356px");


      return f_FormPanel7;
    }

    /**
     * Getter for f_VerticalPanel8 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel8() {
      return build_f_VerticalPanel8();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel8 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel8.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_VerticalPanel8.add(get_f_HorizontalPanel9());
      f_VerticalPanel8.setHeight("41px");
      f_VerticalPanel8.setWidth("197px");


      return f_VerticalPanel8;
    }

    /**
     * Getter for f_HorizontalPanel9 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel9() {
      return build_f_HorizontalPanel9();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel9.add(get_pan_form());
      f_HorizontalPanel9.setHeight("31px");
      f_HorizontalPanel9.setWidth("337px");


      return f_HorizontalPanel9;
    }

    /**
     * Getter for pan_form called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private com.google.gwt.user.client.ui.FormPanel get_pan_form() {
      return build_pan_form();
    }
    private com.google.gwt.user.client.ui.FormPanel build_pan_form() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel pan_form = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      pan_form.add(get_f_HorizontalPanel10());
      pan_form.setHeight("33px");


      return pan_form;
    }

    /**
     * Getter for f_HorizontalPanel10 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel10() {
      return build_f_HorizontalPanel10();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel10 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel10.add(get_uploadFormElement());
      f_HorizontalPanel10.add(get_bnt_Upload());
      f_HorizontalPanel10.setHeight("25px");
      f_HorizontalPanel10.setWidth("331px");


      return f_HorizontalPanel10;
    }

    /**
     * Getter for uploadFormElement called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private com.google.gwt.user.client.ui.FileUpload get_uploadFormElement() {
      return build_uploadFormElement();
    }
    private com.google.gwt.user.client.ui.FileUpload build_uploadFormElement() {
      // Creation section.
      final com.google.gwt.user.client.ui.FileUpload uploadFormElement = (com.google.gwt.user.client.ui.FileUpload) GWT.create(com.google.gwt.user.client.ui.FileUpload.class);
      // Setup section.
      uploadFormElement.setWidth("256px");


      return uploadFormElement;
    }

    /**
     * Getter for bnt_Upload called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private com.google.gwt.user.client.ui.Button get_bnt_Upload() {
      return build_bnt_Upload();
    }
    private com.google.gwt.user.client.ui.Button build_bnt_Upload() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button bnt_Upload = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      bnt_Upload.setHTML(template_html1().asString());


      owner.bnt_Upload = bnt_Upload;

      return bnt_Upload;
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
      f_Label11.setText("Email");
      f_Label11.setHeight("17px");
      f_Label11.setWidth("266px");


      return f_Label11;
    }

    /**
     * Getter for txt_mail called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_mail() {
      return build_txt_mail();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_mail() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_mail = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_mail = txt_mail;

      return txt_mail;
    }

    /**
     * Getter for f_Label12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label12() {
      return build_f_Label12();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label12() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label12.setText("Password Email");
      f_Label12.setHeight("17px");
      f_Label12.setWidth("266px");


      return f_Label12;
    }

    /**
     * Getter for txt_passwordmail called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_passwordmail() {
      return build_txt_passwordmail();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_passwordmail() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_passwordmail = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_passwordmail = txt_passwordmail;

      return txt_passwordmail;
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
      f_Label13.addStyleName("" + get_style().pageHeader() + "");
      f_Label13.setText("Management barcodes");
      f_Label13.setHeight("23px");
      f_Label13.setWidth("266px");


      return f_Label13;
    }

    /**
     * Getter for f_HorizontalPanel14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel14() {
      return build_f_HorizontalPanel14();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel14 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel14.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel14.add(get_f_RadioButton15());
      f_HorizontalPanel14.add(get_f_Label16());
      f_HorizontalPanel14.setHeight("33px");
      f_HorizontalPanel14.setWidth("127px");


      return f_HorizontalPanel14;
    }

    /**
     * Getter for f_RadioButton15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.RadioButton get_f_RadioButton15() {
      return build_f_RadioButton15();
    }
    private com.google.gwt.user.client.ui.RadioButton build_f_RadioButton15() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton f_RadioButton15 = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.


      return f_RadioButton15;
    }

    /**
     * Getter for f_Label16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label16() {
      return build_f_Label16();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label16() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label16 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label16.setText("None");


      return f_Label16;
    }

    /**
     * Getter for f_HorizontalPanel17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel17() {
      return build_f_HorizontalPanel17();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel17 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel17.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel17.add(get_f_RadioButton18());
      f_HorizontalPanel17.add(get_f_Label19());
      f_HorizontalPanel17.setHeight("33px");
      f_HorizontalPanel17.setWidth("353px");


      return f_HorizontalPanel17;
    }

    /**
     * Getter for f_RadioButton18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.RadioButton get_f_RadioButton18() {
      return build_f_RadioButton18();
    }
    private com.google.gwt.user.client.ui.RadioButton build_f_RadioButton18() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton f_RadioButton18 = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.


      return f_RadioButton18;
    }

    /**
     * Getter for f_Label19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label19() {
      return build_f_Label19();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label19() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label19 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label19.setText("USB laser shower");


      return f_Label19;
    }

    /**
     * Getter for f_VerticalPanel20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel20() {
      return build_f_VerticalPanel20();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel20() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel20 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel20.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_VerticalPanel20.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_TOP);
      f_VerticalPanel20.add(get_f_Label21());
      f_VerticalPanel20.add(get_f_Label22());
      f_VerticalPanel20.add(get_txt_entete());
      f_VerticalPanel20.add(get_f_Label23());
      f_VerticalPanel20.add(get_txt_pied());
      f_VerticalPanel20.add(get_f_HorizontalPanel24());
      f_VerticalPanel20.add(get_f_HorizontalPanel27());
      f_VerticalPanel20.setHeight("397px");
      f_VerticalPanel20.setWidth("355px");


      return f_VerticalPanel20;
    }

    /**
     * Getter for f_Label21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label21() {
      return build_f_Label21();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label21() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label21 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label21.addStyleName("" + get_style().pageHeader() + "");
      f_Label21.setText("Tickets For Cash");
      f_Label21.setHeight("21px");
      f_Label21.setWidth("273px");


      return f_Label21;
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
      f_Label22.setText("Header Tickets");
      f_Label22.setHeight("23px");
      f_Label22.setWidth("266px");


      return f_Label22;
    }

    /**
     * Getter for txt_entete called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_entete() {
      return build_txt_entete();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_entete() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_entete = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_entete.setHeight("60px");
      txt_entete.setWidth("345px");


      owner.txt_entete = txt_entete;

      return txt_entete;
    }

    /**
     * Getter for f_Label23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label23() {
      return build_f_Label23();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label23() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label23 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label23.setText("Footers");
      f_Label23.setHeight("23px");
      f_Label23.setWidth("266px");


      return f_Label23;
    }

    /**
     * Getter for txt_pied called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_pied() {
      return build_txt_pied();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_pied() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_pied = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_pied.setHeight("60px");
      txt_pied.setWidth("345px");


      owner.txt_pied = txt_pied;

      return txt_pied;
    }

    /**
     * Getter for f_HorizontalPanel24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel24() {
      return build_f_HorizontalPanel24();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel24() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel24 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel24.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel24.add(get_f_CheckBox25());
      f_HorizontalPanel24.add(get_f_Label26());
      f_HorizontalPanel24.setHeight("33px");
      f_HorizontalPanel24.setWidth("353px");


      return f_HorizontalPanel24;
    }

    /**
     * Getter for f_CheckBox25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.CheckBox get_f_CheckBox25() {
      return build_f_CheckBox25();
    }
    private com.google.gwt.user.client.ui.CheckBox build_f_CheckBox25() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox f_CheckBox25 = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.


      return f_CheckBox25;
    }

    /**
     * Getter for f_Label26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label26() {
      return build_f_Label26();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label26() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label26 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label26.setText("Display TVA on the ticket");


      return f_Label26;
    }

    /**
     * Getter for f_HorizontalPanel27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel27() {
      return build_f_HorizontalPanel27();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel27() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel27 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel27.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel27.add(get_f_CheckBox28());
      f_HorizontalPanel27.add(get_f_Label29());
      f_HorizontalPanel27.setHeight("33px");
      f_HorizontalPanel27.setWidth("353px");


      return f_HorizontalPanel27;
    }

    /**
     * Getter for f_CheckBox28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.CheckBox get_f_CheckBox28() {
      return build_f_CheckBox28();
    }
    private com.google.gwt.user.client.ui.CheckBox build_f_CheckBox28() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox f_CheckBox28 = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.


      return f_CheckBox28;
    }

    /**
     * Getter for f_Label29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label29() {
      return build_f_Label29();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label29() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label29 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label29.setText("Display the Personal notes on the ticket");


      return f_Label29;
    }

    /**
     * Getter for f_DisclosurePanel30 called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel30;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel30() {
      return f_DisclosurePanel30;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel30() {
      // Creation section.
      f_DisclosurePanel30 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel30.add(get_f_VerticalPanel31());
      f_DisclosurePanel30.setOpen(true);
      f_DisclosurePanel30.setHeight("116px");
      f_DisclosurePanel30.setWidth("138px");


      return f_DisclosurePanel30;
    }

    /**
     * Getter for f_VerticalPanel31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel31() {
      return build_f_VerticalPanel31();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel31() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel31 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel31.add(get_btn_save());
      f_VerticalPanel31.add(get_btn_cancel());
      f_VerticalPanel31.setHeight("100px");
      f_VerticalPanel31.setWidth("132px");


      return f_VerticalPanel31;
    }

    /**
     * Getter for btn_save called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Button get_btn_save() {
      return build_btn_save();
    }
    private com.google.gwt.user.client.ui.Button build_btn_save() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_save.setText("Save Data");
      btn_save.setHeight("33px");
      btn_save.setWidth("173px");
      btn_save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.btn_save = btn_save;

      return btn_save;
    }

    /**
     * Getter for btn_cancel called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.Button get_btn_cancel() {
      return build_btn_cancel();
    }
    private com.google.gwt.user.client.ui.Button build_btn_cancel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_cancel.setText("Cancel");
      btn_cancel.setHeight("33px");
      btn_cancel.setWidth("173px");
      btn_cancel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_cancel = btn_cancel;

      return btn_cancel;
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
