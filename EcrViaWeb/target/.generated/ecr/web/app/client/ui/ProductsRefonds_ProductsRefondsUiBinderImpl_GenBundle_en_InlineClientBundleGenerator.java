package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle {
  private static ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style() {
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
        return (".GPIEPACDNT{border:" + ("2px"+ " " +"solid"+ " " +"black")  + ";}");
      }
      public java.lang.String mainPanel(){
        return "GPIEPACDNT";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.ProductsRefonds_ProductsRefondsUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}