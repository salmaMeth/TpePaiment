package ecr.web.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ConsultClientServ_ArticleUiBinderImpl_GenBundle_en_InlineClientBundleGenerator implements ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenBundle {
  private static ConsultClientServ_ArticleUiBinderImpl_GenBundle_en_InlineClientBundleGenerator _instance0 = new ConsultClientServ_ArticleUiBinderImpl_GenBundle_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("table{-moz-border-bottom-colors:" + ("none")  + ";-moz-border-right-colors:" + ("none")  + ";-moz-border-left-colors:" + ("none")  + ";-moz-border-top-colors:" + ("none")  + ";border-collapse:" + ("separate")  + ";border-color:" + ("#ddd"+ " " +"-moz-use-text-color"+ " " +"#ddd"+ " " +"#ddd")  + ";border-image:" + ("none")  + ";border-width:" + ("1px"+ " " +"0"+ " " +"1px"+ " " +"1px")  + ";width:" + ("100%")  + ";}td{line-height:" + ("20px")  + ";text-align:") + (("right")  + ";vertical-align:" + ("top")  + ";color:" + ("black")  + ";border-collapse:" + ("collapse")  + ";}")) : (("table{-moz-border-bottom-colors:" + ("none")  + ";-moz-border-left-colors:" + ("none")  + ";-moz-border-right-colors:" + ("none")  + ";-moz-border-top-colors:" + ("none")  + ";border-collapse:" + ("separate")  + ";border-color:" + ("#ddd"+ " " +"#ddd"+ " " +"#ddd"+ " " +"-moz-use-text-color")  + ";border-image:" + ("none")  + ";border-width:" + ("1px"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";width:" + ("100%")  + ";}td{line-height:" + ("20px")  + ";text-align:") + (("left")  + ";vertical-align:" + ("top")  + ";color:" + ("black")  + ";border-collapse:" + ("collapse")  + ";}"));
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@ecr.web.app.client.ui.ConsultClientServ_ArticleUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
