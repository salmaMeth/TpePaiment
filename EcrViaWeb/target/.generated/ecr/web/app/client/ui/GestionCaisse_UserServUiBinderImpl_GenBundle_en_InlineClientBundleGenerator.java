package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GestionCaisse_UserServUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle {
  private static GestionCaisse_UserServUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new GestionCaisse_UserServUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDKS{width:" + ("100%")  + ";height:" + ("100%")  + ";background:" + ("#fff")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#e5e5e5"+ " " +"100%" + ")")  + ";background:" + ("-webkit-gradient(" + "linear"+ ","+ " " +"left"+ " " +"top"+ ","+ " " +"left"+ " " +"bottom"+ ","+ " " +"color-stop(" + "0"+ ","+ " " +"#fff" + ")"+ ","+ " " +"color-stop(" + "100%"+ ","+ " " +"#e5e5e5" + ")" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#e5e5e5"+ " " +"100%" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#e5e5e5"+ " " +"100%" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#e5e5e5"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#e5e5e5"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GPIEPACDLS{border:") + (("1px"+ " " +"solid"+ " " +"black")  + ";}");
      }
      public java.lang.String horizontalPanelStyle(){
        return "GPIEPACDKS";
      }
      public java.lang.String mainPanel(){
        return "GPIEPACDLS";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.GestionCaisse_UserServUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
