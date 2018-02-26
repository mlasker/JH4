package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import People.PersonCollection;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Person Collection</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    ");
 PersonCollection pc = (PersonCollection) session.getAttribute("personCollection"); 
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Person Collection</h1>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"PeopleServlet\" name=\"myForm\">\n");
      out.write("            <input type=\"text\" name=\"name\"> Name</input><br>\n");
      out.write("            <input type=\"text\" name=\"hairColor\"> Hair Color</input><br>\n");
      out.write("            <input type=\"text\" name=\"eyeColor\"> Eye Color</input><br>\n");
      out.write("            <input type=\"text\" name=\"height\"> Height</input><br>\n");
      out.write("            <input type=\"text\" name=\"weight\"> Weight</input><br>\n");
      out.write("            <input type=\"submit\" value=\"Add Person\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td>Hair Color</td>\n");
      out.write("                <td>Eye Color</td>\n");
      out.write("                <td>Height</td>\n");
      out.write("                <td>Weight</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 try {for(int i=0; i < pc.getSize(); i++) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( pc.getPerson(i).getName() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pc.getPerson(i).getHairColor() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pc.getPerson(i).getEyeColor() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pc.getPerson(i).getHeight() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pc.getPerson(i).getWeight() );
      out.write("</td>\n");
      out.write("                <form method=\"post\" action=\"PeopleServlet\">\n");
      out.write("                <td><input type=\"submit\" value=\"delete\" name=\"button\"> </td>\n");
      out.write("                <td><input type=\"submit\" value=\"edit\" name=\"button\"> </td>\n");
      out.write("                <input type=\"hidden\" name=\"personNum\" value=\"");
      out.print( i );
      out.write("\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}}catch(NullPointerException e ){ }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <form method=\"post\" action=\"PeopleServlet\">\n");
      out.write("            <input type=\"submit\" value=\"Clear List\" name=\"clearButton\">\n");
      out.write("        </form>\n");
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
