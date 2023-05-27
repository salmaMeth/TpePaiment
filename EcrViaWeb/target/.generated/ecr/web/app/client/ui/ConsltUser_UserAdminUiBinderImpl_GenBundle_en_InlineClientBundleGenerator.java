package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ConsltUser_UserAdminUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle {
  private static ConsltUser_UserAdminUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new ConsltUser_UserAdminUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDCO{font-size:" + ("11px")  + ";}.GPIEPACDAO input{width:" + ("60px")  + ";text-align:" + ("center")  + ";}.GPIEPACDBO{margin:" + ("0")  + ";font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";line-height:" + ("1px")  + ";color:" + ("#444")  + ";background-color:" + ("#e1e1e1")  + ";}");
      }
      public java.lang.String AUTHORISING(){
        return "GPIEPACDHN";
      }
      public java.lang.String BUSY(){
        return "GPIEPACDIN";
      }
      public java.lang.String CANCELLED(){
        return "GPIEPACDJN";
      }
      public java.lang.String CARD_INSERT(){
        return "GPIEPACDKN";
      }
      public java.lang.String COMPLETION(){
        return "GPIEPACDLN";
      }
      public java.lang.String ERROR(){
        return "GPIEPACDMN";
      }
      public java.lang.String IDLE(){
        return "GPIEPACDNN";
      }
      public java.lang.String PIN_VERIFY(){
        return "GPIEPACDON";
      }
      public java.lang.String UNKNOWN(){
        return "GPIEPACDPN";
      }
      public java.lang.String editCell(){
        return "GPIEPACDAO";
      }
      public java.lang.String size(){
        return "GPIEPACDBO";
      }
      public java.lang.String style(){
        return "GPIEPACDCO";
      }
      public java.lang.String success(){
        return "GPIEPACDDO";
      }
      public java.lang.String toolcss(){
        return "GPIEPACDEO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.ConsltUser_UserAdminUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
