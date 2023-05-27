package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AdminMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenBundle {
  private static AdminMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new AdminMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDCL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#b51c44")  + ";}.GPIEPACDCL:hover{background:" + ("#7a0423")  + ";}.GPIEPACDFL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#a300aa")  + ";}.GPIEPACDFL:hover{background:" + ("#7f0184")  + ";}.GPIEPACDHL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#5b3ab6")  + ";}.GPIEPACDHL:hover{background:" + ("#2c1470")  + ";}.GPIEPACDEL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#009600")  + ";}.GPIEPACDEL:hover{background:" + ("#983114")  + ";}.GPIEPACDGL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#ce4b27")  + ";}.GPIEPACDGL:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#306630")  + ";}.GPIEPACDBL{background:") + (("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#0093a8")  + ";}.GPIEPACDBL:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#066b79")  + ";}.GPIEPACDDL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#e88a05")  + ";}.GPIEPACDDL:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#b06700")  + ";}.GPIEPACDAL{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDAL:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#005580")  + ";}");
      }
      public java.lang.String bluefon(){
        return "GPIEPACDAL";
      }
      public java.lang.String bondiBlue(){
        return "GPIEPACDBL";
      }
      public java.lang.String brown(){
        return "GPIEPACDCL";
      }
      public java.lang.String darkYellow(){
        return "GPIEPACDDL";
      }
      public java.lang.String green(){
        return "GPIEPACDEL";
      }
      public java.lang.String magenta(){
        return "GPIEPACDFL";
      }
      public java.lang.String orange(){
        return "GPIEPACDGL";
      }
      public java.lang.String violate(){
        return "GPIEPACDHL";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.AdminMenu_MerhantMenuUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
