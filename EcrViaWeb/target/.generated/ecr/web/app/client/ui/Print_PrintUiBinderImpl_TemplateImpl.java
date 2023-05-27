package ecr.web.app.client.ui;

public class Print_PrintUiBinderImpl_TemplateImpl implements ecr.web.app.client.ui.Print_PrintUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Print </h3> </div> <div class='widget-container'> <form class='form-horizontal'> <div class='control-group'> <label class='control-label'>Print On Terminal</label> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span></div> <div class='control-group'> <label class='control-label'>Print As PDF</label> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span></div> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'></span> </form>  </div> </div></div> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
