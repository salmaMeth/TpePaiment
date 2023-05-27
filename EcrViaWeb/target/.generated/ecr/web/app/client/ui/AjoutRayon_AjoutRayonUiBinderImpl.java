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

public class AjoutRayon_AjoutRayonUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ecr.web.app.client.ui.AjoutRayon>, ecr.web.app.client.ui.AjoutRayon.AjoutRayonUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<i class='icon-upload-alt'></i> Upload")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ecr.web.app.client.ui.AjoutRayon owner) {


    return new Widgets(owner).get_panel_ajoutpdt();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ecr.web.app.client.ui.AjoutRayon owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_Ajout_RayoClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBtn_ResetClick(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onBnt_UploadClick(event);
      }
    };

    final com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler() {
      public void onSubmitComplete(com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent event) {
        owner.onPan_formSubmitComplete(event);
      }
    };

    public Widgets(final ecr.web.app.client.ui.AjoutRayon owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_DisclosurePanel8();  // more than one getter call detected. Type: DEFAULT, precedence: 3
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
    private ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenBundle) GWT.create(ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final ecr.web.app.client.ui.AjoutRayon_AjoutRayonUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for panel_ajoutpdt called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panel_ajoutpdt() {
      return build_panel_ajoutpdt();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panel_ajoutpdt() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panel_ajoutpdt = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord40 = UiBinderUtil.attachToDom(panel_ajoutpdt.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord40.detach();
      panel_ajoutpdt.addAndReplaceElement(get_horizontalPanel(), get_domId0Element().get());

      return panel_ajoutpdt;
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
      horizontalPanel.add(get_f_DisclosurePanel8());
      horizontalPanel.setCellHorizontalAlignment(get_f_DisclosurePanel8(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
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
      f_HorizontalPanel2.add(get_txt_Nom());
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
      f_Label3.setText("Name");
      f_Label3.setWidth("140px");


      return f_Label3;
    }

    /**
     * Getter for txt_Nom called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txt_Nom() {
      return build_txt_Nom();
    }
    private com.google.gwt.user.client.ui.TextBox build_txt_Nom() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txt_Nom = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      owner.txt_Nom = txt_Nom;

      return txt_Nom;
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
      f_HorizontalPanel4.add(get_txt_desp());
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
      f_Label5.setText("Description");
      f_Label5.setWidth("140px");


      return f_Label5;
    }

    /**
     * Getter for txt_desp called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextArea get_txt_desp() {
      return build_txt_desp();
    }
    private com.google.gwt.user.client.ui.TextArea build_txt_desp() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea txt_desp = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      txt_desp.setHeight("58px");
      txt_desp.setWidth("307px");


      owner.txt_desp = txt_desp;

      return txt_desp;
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
      f_HorizontalPanel6.add(get_pan_form());
      f_HorizontalPanel6.setHeight("31px");
      f_HorizontalPanel6.setWidth("337px");


      return f_HorizontalPanel6;
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
      pan_form.add(get_f_HorizontalPanel7());
      pan_form.setHeight("33px");
      pan_form.addSubmitCompleteHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      owner.pan_form = pan_form;

      return pan_form;
    }

    /**
     * Getter for f_HorizontalPanel7 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel7() {
      return build_f_HorizontalPanel7();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel7 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel7.add(get_uploadFormElement());
      f_HorizontalPanel7.add(get_bnt_Upload());
      f_HorizontalPanel7.setHeight("25px");
      f_HorizontalPanel7.setWidth("331px");


      return f_HorizontalPanel7;
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
      bnt_Upload.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


      owner.bnt_Upload = bnt_Upload;

      return bnt_Upload;
    }

    /**
     * Getter for f_DisclosurePanel8 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel8;
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel8() {
      return f_DisclosurePanel8;
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel8() {
      // Creation section.
      f_DisclosurePanel8 = new com.google.gwt.user.client.ui.DisclosurePanel("");
      // Setup section.
      f_DisclosurePanel8.add(get_f_VerticalPanel9());
      f_DisclosurePanel8.setOpen(true);
      f_DisclosurePanel8.setHeight("116px");


      return f_DisclosurePanel8;
    }

    /**
     * Getter for f_VerticalPanel9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel9() {
      return build_f_VerticalPanel9();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel9 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel9.add(get_btn_Ajout_Rayo());
      f_VerticalPanel9.add(get_btn_Reset());
      f_VerticalPanel9.setHeight("100px");
      f_VerticalPanel9.setWidth("132px");


      return f_VerticalPanel9;
    }

    /**
     * Getter for btn_Ajout_Rayo called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_Ajout_Rayo() {
      return build_btn_Ajout_Rayo();
    }
    private com.google.gwt.user.client.ui.Button build_btn_Ajout_Rayo() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_Ajout_Rayo = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_Ajout_Rayo.setText("Save range");
      btn_Ajout_Rayo.setHeight("33px");
      btn_Ajout_Rayo.setWidth("173px");
      btn_Ajout_Rayo.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.btn_Ajout_Rayo = btn_Ajout_Rayo;

      return btn_Ajout_Rayo;
    }

    /**
     * Getter for btn_Reset called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btn_Reset() {
      return build_btn_Reset();
    }
    private com.google.gwt.user.client.ui.Button build_btn_Reset() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btn_Reset = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btn_Reset.setText("Cancel");
      btn_Reset.setHeight("33px");
      btn_Reset.setWidth("173px");
      btn_Reset.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.btn_Reset = btn_Reset;

      return btn_Reset;
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
