package People;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User1
 */
@WebServlet(name = "PeopleServlet", urlPatterns = {"/PeopleServlet"})

public class PeopleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession session = request.getSession();
            PersonCollection pc = (PersonCollection) session.getAttribute("personCollection");
            String url = "/index.jsp";
            
            if (pc == null)
                pc = new PersonCollection();
            
            if (request.getParameter("clearButton") != null){
                
                pc.clear();
            }
            
            if (request.getParameter("button") != null){
               
                String button = request.getParameter("button");
                int personNum = Integer.parseInt(request.getParameter("personNum"));
                //String personNum = request.getParameter("personNum");
                
                if (button.equals("delete")){
                   System.out.println("delete pressed");
                   System.out.println("person num=" + personNum);
                   pc.removePerson(personNum);
                }
                if (button.equals("edit")){
                    
                   url = "/edit.jsp";
                   request.setAttribute("editNum", new Integer(personNum));
                   System.out.println("edit pressed");
                   System.out.println(personNum);
                }
            }
            if (request.getParameter("editButton") != null){
                
                int edit = Integer.parseInt(request.getParameter("editNum"));
                System.out.println("edit num=" + edit);
                String name = request.getParameter("name");
                String hairColor = request.getParameter("hairColor");
                String eyeColor = request.getParameter("eyeColor");
                String height = request.getParameter("height");
                String weight = request.getParameter("weight");

                Person pers = new Person(name, hairColor, eyeColor, height, weight);
                
                pc.editPerson(pers, edit);
            }
           
            if (request.getParameter("button") == null && request.getParameter("editNum") == null && request.getParameter("clearButton") == null) {
                
                String name = request.getParameter("name");
                String hairColor = request.getParameter("hairColor");
                String eyeColor = request.getParameter("eyeColor");
                String height = request.getParameter("height");
                String weight = request.getParameter("weight");

                Person pers = new Person(name, hairColor, eyeColor, height, weight);
            
                pc.addPerson(pers);
            
            }
            
            session.setAttribute("personCollection", pc);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
            
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
