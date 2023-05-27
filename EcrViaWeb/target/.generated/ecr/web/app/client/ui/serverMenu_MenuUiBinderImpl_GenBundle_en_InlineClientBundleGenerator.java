package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class serverMenu_MenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenBundle {
  private static serverMenu_MenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new serverMenu_MenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDER{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#b51c44")  + ";}.GPIEPACDER:hover{background:" + ("#7a0423")  + ";}.GPIEPACDFR{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#a300aa")  + ";}.GPIEPACDFR:hover{background:" + ("#7f0184")  + ";}.GPIEPACDHR{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#5b3ab6")  + ";}.GPIEPACDHR:hover{background:" + ("#2c1470")  + ";}.GPIEPACDGR{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#ce4b27")  + ";}.GPIEPACDGR:hover{background:" + ("#983114")  + ";}");
      }
      public java.lang.String brown(){
        return "GPIEPACDER";
      }
      public java.lang.String magenta(){
        return "GPIEPACDFR";
      }
      public java.lang.String orange(){
        return "GPIEPACDGR";
      }
      public java.lang.String violate(){
        return "GPIEPACDHR";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.serverMenu_MenuUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
