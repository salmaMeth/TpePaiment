package ecr.web.app.client.ui;

public class AlertClient_BinderImpl_TemplateImpl implements ecr.web.app.client.ui.AlertClient_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='stepy-widget'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Search By ID </h3> <div class='pull-right' id='stepy_tabby'> <ul class='stepy-titles' id='stepy-titles'> <li class='current-step' id='stepy-title-0'> <div><span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span></div> <span> <center>Photos</center></span> </li></ul></div></div></div> <div class='widget-container'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span> </div> </div></div> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
