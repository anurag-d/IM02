package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.Console;
import java.sql.*;
import com.imconfig.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("        <title>Informatica Monitoring Tool</title>\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo/favicon1.png\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/weather-icons.min.css\"/>\n");
      out.write("\n");
      out.write("        <!--lobiadmin-with-plugins.css contains all LobiAdmin css plus lobiplugins all css files, plus third party plugins-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lobiadmin-with-plugins.css\"/>\n");
      out.write("        <!--Put your css here-->\n");
      out.write("\n");
      out.write("        <!--This css file is for only demo usage-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-header header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <div class=\"navbar-brand-img\"></div>\n");
      out.write("                <img src=\"img/logo/favicon.png\" class=\"hidden-xs\" alt=\"\"  />\n");
      out.write("            </a>\n");
      out.write("            <!--Menu show/hide toggle button-->\n");
      out.write("            <ul class=\"nav navbar-nav pull-left show-hide-menu\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"border-radius-0 btn font-size-lg\" data-action=\"show-hide-sidebar\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <form class=\"navbar-search pull-left\">\n");
      out.write("\n");
      out.write("                <!--<label for=\"search\" class=\"sr-only\">Search...</label>\n");
      out.write("                <input type=\"text\" class=\"font-size-lg\" name=\"search\" id=\"search\" placeholder=\"Search...\">-->\n");
      out.write("                <a class=\"btn btn-search\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-remove\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-remove\"></span>\n");
      out.write("                </a>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"navbar-items\">\n");
      out.write("                <!--User avatar dropdown-->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right user-actions\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <img class=\"user-avatar\" src=\"img/users/avatar2.png\" alt=\"...\"/>\n");
      out.write("                            <b class=\"caret\"></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#profile\"><span class=\"glyphicon glyphicon-user\"></span> &nbsp;&nbsp;Profile</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"lock.html\"><span class=\"glyphicon glyphicon-lock\"></span> &nbsp;&nbsp;Lock screen</a></li>\n");
      out.write("                            <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-off\"></span> &nbsp;&nbsp;Log out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix-xxs\"></div>\n");
      out.write("            <div class=\"navbar-items-2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-actions\">\n");
      out.write("                    <li class=\"visible-lg\">\n");
      out.write("                        <a href=\"#\" data-action=\"fullscreen\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-fullscreen\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"menu-heading\">\n");
      out.write("                <div class=\"menu-header-buttons-wrapper clearfix\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-info btn-menu-header-collapse\">\n");
      out.write("                        <i class=\"fa fa-cogs\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <!--Put your favourite pages here-->\n");
      out.write("                    <div class=\"menu-header-buttons\">\n");
      out.write("                        <a href=\"#profile\" class=\"btn btn-info btn-outline\" data-title=\"Profile\">\n");
      out.write("                            <i class=\"fa fa-user\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#invoice\" class=\"btn btn-info btn-outline\" data-title=\"Invoice\">\n");
      out.write("                            <i class=\"fa fa-file-pdf-o\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#lobimail\" class=\"btn btn-info btn-outline\" data-title=\"Inbox\">\n");
      out.write("                            <i class=\"fa fa-envelope\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#calendar\" class=\"btn btn-info btn-outline\" data-title=\"Calendar\">\n");
      out.write("                            <i class=\"fa fa-calendar\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#dashboard\">\n");
      out.write("                            <i class=\"fa fa-home menu-item-icon\"></i>\n");
      out.write("                            <span class=\"inner-text\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#monitor\">\n");
      out.write("                            <i class=\"fa fa-binoculars menu-item-icon\"></i>\n");
      out.write("                            <span class=\"inner-text\">Monitor</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fa fa-gears menu-item-icon\"></i>\n");
      out.write("                            <span class=\"inner-text\">Configuration</span>\n");
      out.write("                            <!--<span class=\"badge-wrapper\"><span class=\"badge badge-xs badge-cyan\">4</span></span>-->\n");
      out.write("                        </a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#usermanagment\">\n");
      out.write("                                    <span class=\"inner-text\">User Management</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#infaconfig\">\n");
      out.write("                                    <span class=\"inner-text\">Informatica Configuration</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#alertgroups\">\n");
      out.write("                                    <span class=\"inner-text\">Alert Groups</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"menu-collapse-line\">\n");
      out.write("                <!--Menu collapse/expand icon is put and control from LobiAdmin.js file-->\n");
      out.write("                <div class=\"menu-toggle-btn\" data-action=\"collapse-expand-sidebar\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"ribbon\" class=\"hidden-print\">\n");
      out.write("                <a href=\"#dashboard\" class=\"btn-ribbon\" data-container=\"#main\" data-toggle=\"tooltip\" data-title=\"Show dashboard\"><i class=\"fa fa-home\"></i></a>\n");
      out.write("                <span class=\"vertical-devider\">&nbsp;</span>\n");
      out.write("                <button class=\"btn-ribbon\" data-container=\"#main\" data-action=\"reload\" data-toggle=\"tooltip\" data-title=\"Reload content by ajax\"><i class=\"fa fa-refresh\"></i></button>\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Loading indicator for ajax page loading-->\n");
      out.write("        <div class=\"spinner spinner-horizontal hide\">\n");
      out.write("            <span class=\"spinner-text\">Loading...</span>\n");
      out.write("            <div class=\"bounce1\"></div>\n");
      out.write("            <div class=\"bounce2\"></div>\n");
      out.write("            <div class=\"bounce3\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery-ui.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lobi-plugins/lobibox.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lobi-plugins/lobipanel.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Make sure that config.js file is loaded before LobiAdmin.js-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/config.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/LobiAdmin.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/demo.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
