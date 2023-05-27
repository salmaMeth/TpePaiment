package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AlertClient_BinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle {
  private static AlertClient_BinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new AlertClient_BinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style() {
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
        return (".GPIEPACDBS{border:" + ("2px"+ " " +"solid"+ " " +"black")  + ";}.GPIEPACDNR{font-size:" + ("small")  + ";color:" + ("red")  + ";font-weight:" + ("bold")  + ";}.GPIEPACDDS{font-size:" + ("small")  + ";color:" + ("green")  + ";font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String AUTHORISING(){
        return "GPIEPACDIR";
      }
      public java.lang.String BUSY(){
        return "GPIEPACDJR";
      }
      public java.lang.String CANCELLED(){
        return "GPIEPACDKR";
      }
      public java.lang.String CARD_INSERT(){
        return "GPIEPACDLR";
      }
      public java.lang.String COMPLETION(){
        return "GPIEPACDMR";
      }
      public java.lang.String ERROR(){
        return "GPIEPACDNR";
      }
      public java.lang.String IDLE(){
        return "GPIEPACDOR";
      }
      public java.lang.String PIN_VERIFY(){
        return "GPIEPACDPR";
      }
      public java.lang.String UNKNOWN(){
        return "GPIEPACDAS";
      }
      public java.lang.String mainPanel(){
        return "GPIEPACDBS";
      }
      public java.lang.String style(){
        return "GPIEPACDCS";
      }
      public java.lang.String success(){
        return "GPIEPACDDS";
      }
      public java.lang.String toolcss(){
        return "GPIEPACDES";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.AlertClient_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.AlertClient_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
