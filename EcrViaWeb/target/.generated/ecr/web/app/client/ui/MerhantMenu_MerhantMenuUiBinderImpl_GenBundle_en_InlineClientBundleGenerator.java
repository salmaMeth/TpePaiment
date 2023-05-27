package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MerhantMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenBundle {
  private static MerhantMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new MerhantMenu_MerhantMenuUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDMP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#b51c44")  + ";}.GPIEPACDMP:hover{background:" + ("#7a0423")  + ";}.GPIEPACDPP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#a300aa")  + ";}.GPIEPACDPP:hover{background:" + ("#7f0184")  + ";}.GPIEPACDBQ{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#5b3ab6")  + ";}.GPIEPACDBQ:hover{background:" + ("#2c1470")  + ";}.GPIEPACDOP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#009600")  + ";}.GPIEPACDOP:hover{background:" + ("#983114")  + ";}.GPIEPACDAQ{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#ce4b27")  + ";}.GPIEPACDAQ:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#306630")  + ";}.GPIEPACDLP{background:") + (("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#0093a8")  + ";}.GPIEPACDLP:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#066b79")  + ";}.GPIEPACDNP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#e88a05")  + ";}.GPIEPACDNP:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#b06700")  + ";}.GPIEPACDKP{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#3498db")  + ";}.GPIEPACDKP:hover{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#005580")  + ";}");
      }
      public java.lang.String bluefon(){
        return "GPIEPACDKP";
      }
      public java.lang.String bondiBlue(){
        return "GPIEPACDLP";
      }
      public java.lang.String brown(){
        return "GPIEPACDMP";
      }
      public java.lang.String darkYellow(){
        return "GPIEPACDNP";
      }
      public java.lang.String green(){
        return "GPIEPACDOP";
      }
      public java.lang.String magenta(){
        return "GPIEPACDPP";
      }
      public java.lang.String orange(){
        return "GPIEPACDAQ";
      }
      public java.lang.String violate(){
        return "GPIEPACDBQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.MerhantMenu_MerhantMenuUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
