package com.google.gwt.cell.client;

public class ButtonCellBase_DefaultAppearance_TemplateImpl implements com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml iconContentLayout(java.lang.String arg0,com.google.gwt.safecss.shared.SafeStyles arg1,com.google.gwt.safehtml.shared.SafeHtml arg2,com.google.gwt.safehtml.shared.SafeHtml arg3) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("\" style=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
    sb.append("position:relative;zoom:0;\">");
    sb.append(arg2.asString());
    sb.append(arg3.asString());
    sb.append("</div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml iconWrapper(com.google.gwt.safecss.shared.SafeStyles arg0,com.google.gwt.safehtml.shared.SafeHtml arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div style=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
sb.append("position:absolute;top:50%;line-height:0px;\">");
sb.append(arg1.asString());
sb.append("</div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
