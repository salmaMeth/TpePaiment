package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ServerSession_DemarrerUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle {
  private static ServerSession_DemarrerUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new ServerSession_DemarrerUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GPIEPACDAR{background-color:" + ("#e0dfe6")  + " !important;}.GPIEPACDHQ{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDBR{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDKQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDIQ{font-size:") + (("small")  + ";font-weight:" + ("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDDQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDFQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDJQ{font-size:" + ("small")  + ";font-weight:" + ("bold") ) + (";color:" + ("DARK_GREEN")  + ";}.GPIEPACDCQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDGQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDEQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDCR{font-size:") + (("small")  + " !important;font-weight:" + ("bold")  + " !important;}.GPIEPACDOQ{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDNQ{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer") ) + (";display:" + ("inline-block")  + ";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDNQ:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:") + (("#fff")  + ";text-decoration:" + ("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDNQ:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDNQ.GPIEPACDLQ,.GPIEPACDNQ:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDMQ{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDMQ:hover{background:" + ("#01316c")  + ";}.GPIEPACDPQ{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px") ) + (";height:" + ("auto")  + ";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"30px"+ " " +"6px"+ " " +"6px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}")) : ((".GPIEPACDAR{background-color:" + ("#e0dfe6")  + " !important;}.GPIEPACDHQ{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDBR{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDKQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("YELLOW")  + ";}.GPIEPACDIQ{font-size:") + (("small")  + ";font-weight:" + ("bold")  + ";color:" + ("GREEN")  + ";}.GPIEPACDDQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("RED")  + ";}.GPIEPACDFQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("BLUE")  + ";}.GPIEPACDJQ{font-size:" + ("small")  + ";font-weight:" + ("bold") ) + (";color:" + ("DARK_GREEN")  + ";}.GPIEPACDCQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("CYAN")  + ";}.GPIEPACDGQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("DARK_MAGENTA")  + ";}.GPIEPACDEQ{font-size:" + ("small")  + ";font-weight:" + ("bold")  + ";color:" + ("COLOR_DARK_GRAY")  + ";}.GPIEPACDCR{font-size:") + (("small")  + " !important;font-weight:" + ("bold")  + " !important;}.GPIEPACDOQ{color:" + ("#eee")  + " !important;display:" + ("block")  + ";font-size:" + ("12px")  + " !important;padding:" + ("0"+ " " +"5px")  + " !important;text-align:" + ("center")  + ";}.GPIEPACDNQ{background-color:" + ("#e2e1e3")  + ";border:" + ("0"+ " " +"none")  + ";color:" + ("#444")  + ";cursor:" + ("pointer") ) + (";display:" + ("inline-block")  + ";font-size:" + ("12px")  + ";line-height:" + ("20px")  + ";margin-bottom:" + ("0")  + ";padding:" + ("7px"+ " " +"18px")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0"+ " " +"12px")  + ";}.GPIEPACDNQ:hover{background-color:" + ("#7c798f")  + ";background-position:" + ("0"+ " " +"-15px")  + ";color:") + (("#fff")  + ";text-decoration:" + ("none")  + ";transition:" + ("background-position"+ " " +"0.1s"+ " " +"linear"+ " " +"0")  + ";}.GPIEPACDNQ:focus{outline:" + ("thin"+ " " +"dotted"+ " " +"#333")  + ";outline-offset:" + ("-2px")  + ";}.GPIEPACDNQ.GPIEPACDLQ,.GPIEPACDNQ:active{background-image:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GPIEPACDMQ{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDMQ:hover{background:" + ("#01316c")  + ";}.GPIEPACDPQ{border:" + ("1px"+ " " +"solid"+ " " +"#060")  + ";font-size:" + ("14px") ) + (";height:" + ("auto")  + ";margin-bottom:" + ("15px")  + ";padding:" + ("6px"+ " " +"6px"+ " " +"6px"+ " " +"30px")  + ";background-color:" + ("#fff")  + ";transition:" + ("border"+ " " +"0.2s"+ " " +"linear"+ " " +"0"+ ","+ " " +"box-shadow"+ " " +"0.2s"+ " " +"linear"+ " " +"0")  + ";color:" + ("#555")  + ";display:" + ("inline-block")  + ";line-height:" + ("20px")  + ";vertical-align:" + ("middle")  + ";height:" + ("35px")  + " !important;}"));
      }
      public java.lang.String AUTHORISING(){
        return "GPIEPACDCQ";
      }
      public java.lang.String BUSY(){
        return "GPIEPACDDQ";
      }
      public java.lang.String CANCELLED(){
        return "GPIEPACDEQ";
      }
      public java.lang.String CARD_INSERT(){
        return "GPIEPACDFQ";
      }
      public java.lang.String COMPLETION(){
        return "GPIEPACDGQ";
      }
      public java.lang.String ERROR(){
        return "GPIEPACDHQ";
      }
      public java.lang.String IDLE(){
        return "GPIEPACDIQ";
      }
      public java.lang.String PIN_VERIFY(){
        return "GPIEPACDJQ";
      }
      public java.lang.String UNKNOWN(){
        return "GPIEPACDKQ";
      }
      public java.lang.String active(){
        return "GPIEPACDLQ";
      }
      public java.lang.String blue(){
        return "GPIEPACDMQ";
      }
      public java.lang.String btn1(){
        return "GPIEPACDNQ";
      }
      public java.lang.String span(){
        return "GPIEPACDOQ";
      }
      public java.lang.String span12(){
        return "GPIEPACDPQ";
      }
      public java.lang.String style(){
        return "GPIEPACDAR";
      }
      public java.lang.String success(){
        return "GPIEPACDBR";
      }
      public java.lang.String text(){
        return "GPIEPACDCR";
      }
      public java.lang.String toolcss(){
        return "GPIEPACDDR";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.ServerSession_DemarrerUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
