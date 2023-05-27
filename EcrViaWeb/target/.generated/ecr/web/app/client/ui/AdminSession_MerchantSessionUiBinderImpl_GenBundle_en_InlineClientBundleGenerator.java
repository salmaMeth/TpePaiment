package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AdminSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle {
  private static AdminSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new AdminSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GPIEPACDNL{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDHM{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDAM{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDOL{font-size:" + ("small")  + ";font-weight:") + (("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDJL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDLL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDPL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_GREEN") ) + (";}.GPIEPACDIL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDML{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDKL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDIM{font-size:" + ("small")  + " !important;font-weight:") + (("bold")  + " !important;}.GPIEPACDEM{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDDM{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer")  + ";display:" + ("inline-block") ) + (";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDDM:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:" + ("#fff")  + ";text-decoration:") + (("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDDM:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDDM.GPIEPACDBM,.GPIEPACDDM:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDCM{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDCM:hover{background:" + ("#01316c")  + ";}.GPIEPACDFM{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px")  + ";height:" + ("auto") ) + (";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"30px"+ " " +"6px"+ " " +"6px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}")) : ((".GPIEPACDNL{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDHM{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDAM{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDOL{font-size:" + ("small")  + ";font-weight:") + (("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDJL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDLL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDPL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_GREEN") ) + (";}.GPIEPACDIL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDML{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDKL{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDIM{font-size:" + ("small")  + " !important;font-weight:") + (("bold")  + " !important;}.GPIEPACDEM{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDDM{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer")  + ";display:" + ("inline-block") ) + (";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDDM:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:" + ("#fff")  + ";text-decoration:") + (("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDDM:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDDM.GPIEPACDBM,.GPIEPACDDM:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDCM{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDCM:hover{background:" + ("#01316c")  + ";}.GPIEPACDFM{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px")  + ";height:" + ("auto") ) + (";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"6px"+ " " +"6px"+ " " +"30px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}"));
      }
      public java.lang.String AUTHORISING(){
        return "GPIEPACDIL";
      }
      public java.lang.String BUSY(){
        return "GPIEPACDJL";
      }
      public java.lang.String CANCELLED(){
        return "GPIEPACDKL";
      }
      public java.lang.String CARD_INSERT(){
        return "GPIEPACDLL";
      }
      public java.lang.String COMPLETION(){
        return "GPIEPACDML";
      }
      public java.lang.String ERROR(){
        return "GPIEPACDNL";
      }
      public java.lang.String IDLE(){
        return "GPIEPACDOL";
      }
      public java.lang.String PIN_VERIFY(){
        return "GPIEPACDPL";
      }
      public java.lang.String UNKNOWN(){
        return "GPIEPACDAM";
      }
      public java.lang.String active(){
        return "GPIEPACDBM";
      }
      public java.lang.String blue(){
        return "GPIEPACDCM";
      }
      public java.lang.String btn1(){
        return "GPIEPACDDM";
      }
      public java.lang.String span(){
        return "GPIEPACDEM";
      }
      public java.lang.String span12(){
        return "GPIEPACDFM";
      }
      public java.lang.String style(){
        return "GPIEPACDGM";
      }
      public java.lang.String success(){
        return "GPIEPACDHM";
      }
      public java.lang.String text(){
        return "GPIEPACDIM";
      }
      public java.lang.String toolcss(){
        return "GPIEPACDJM";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@ecr.web.app.client.ui.AdminSession_MerchantSessionUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
