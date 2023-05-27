package ecr.web.app.client.ui;

public class GetPassword_GetPasswordUiBinderImpl_TemplateImpl implements ecr.web.app.client.ui.GetPassword_GetPasswordUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Send");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("Cancel");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div class='row-fluid'> <div class='span12'> <div class='content-widgets gray'> <div class='widget-head blue clearfix'> <h3 class='pull-left'>Get Password </h3> </div> <div class='widget-container'> <form class='form-horizontal'></form> <h5>To get your password, enter your e-mail address below:</h5> <div class='control-group'> <label class='control-label'>Mail address</label> <div class='controls'> <div class='controls input-icon'> <i class='icon-envelope'></i> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> <div class='error'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span></div> </div></div> <div class='controls'> <div class='pull-right'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
sb.append("'></span> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
sb.append("'></span> </div> </div> </div> </div> </div> </div> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
