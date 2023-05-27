package ecr.web.app.client.ui;

public class MessageBox_MessageBoxUiBinderImpl_TemplateImpl implements ecr.web.app.client.ui.MessageBox_MessageBoxUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("OK");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(java.lang.String arg0,java.lang.String arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Message </h3> </div> <div class='widget-container'> <div class='control-group'> <div class='controls'> <div class='pull-left'> <button class='btn btn-round-min btn-primary'> <span> <i class='icon-info-sign'></i> </span> </button> </div></div> <div class='controls'> <h5><span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> </h5> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span> </div> </div> </div> </div> </div> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
