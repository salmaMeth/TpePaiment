package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MerchantSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenBundle {
  private static MerchantSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new MerchantSession_MerchantSessionUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GPIEPACDNO{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDHP{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDAP{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDOO{font-size:" + ("small")  + ";font-weight:") + (("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDJO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDLO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDPO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_GREEN") ) + (";}.GPIEPACDIO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDMO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDKO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDIP{font-size:" + ("small")  + " !important;font-weight:") + (("bold")  + " !important;}.GPIEPACDEP{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDDP{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer")  + ";display:" + ("inline-block") ) + (";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDDP:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:" + ("#fff")  + ";text-decoration:") + (("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDDP:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDDP.GPIEPACDBP,.GPIEPACDDP:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDCP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDCP:hover{background:" + ("#01316c")  + ";}.GPIEPACDFP{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px")  + ";height:" + ("auto") ) + (";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"30px"+ " " +"6px"+ " " +"6px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}")) : ((".GPIEPACDNO{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDHP{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDAP{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDOO{font-size:" + ("small")  + ";font-weight:") + (("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDJO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDLO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDPO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_GREEN") ) + (";}.GPIEPACDIO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDMO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDKO{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDIP{font-size:" + ("small")  + " !important;font-weight:") + (("bold")  + " !important;}.GPIEPACDEP{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDDP{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer")  + ";display:" + ("inline-block") ) + (";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDDP:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:" + ("#fff")  + ";text-decoration:") + (("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDDP:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDDP.GPIEPACDBP,.GPIEPACDDP:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDCP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDCP:hover{background:" + ("#01316c")  + ";}.GPIEPACDFP{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px")  + ";height:" + ("auto") ) + (";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"6px"+ " " +"6px"+ " " +"30px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}"));
      }
      public java.lang.String AUTHORISING(){
        return "GPIEPACDIO";
      }
      public java.lang.String BUSY(){
        return "GPIEPACDJO";
      }
      public java.lang.String CANCELLED(){
        return "GPIEPACDKO";
      }
      public java.lang.String CARD_INSERT(){
        return "GPIEPACDLO";
      }
      public java.lang.String COMPLETION(){
        return "GPIEPACDMO";
      }
      public java.lang.String ERROR(){
        return "GPIEPACDNO";
      }
      public java.lang.String IDLE(){
        return "GPIEPACDOO";
      }
      public java.lang.String PIN_VERIFY(){
        return "GPIEPACDPO";
      }
      public java.lang.String UNKNOWN(){
        return "GPIEPACDAP";
      }
      public java.lang.String active(){
        return "GPIEPACDBP";
      }
      public java.lang.String blue(){
        return "GPIEPACDCP";
      }
      public java.lang.String btn1(){
        return "GPIEPACDDP";
      }
      public java.lang.String span(){
        return "GPIEPACDEP";
      }
      public java.lang.String span12(){
        return "GPIEPACDFP";
      }
      public java.lang.String style(){
        return "GPIEPACDGP";
      }
      public java.lang.String success(){
        return "GPIEPACDHP";
      }
      public java.lang.String text(){
        return "GPIEPACDIP";
      }
      public java.lang.String toolcss(){
        return "GPIEPACDJP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.MerchantSession_MerchantSessionUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
