/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author roaggarw
 */
public class FrontEndController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getServletPath();
        HttpSession session = request.getSession();
        System.out.println(" path  " + path);
        if (session.getAttribute("isLoggedIn") == null && !path.contains("login")) {
            response.sendRedirect("login.jsp");
            return;
        }
        if (path.contains("login")) {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            if (name.equals("rohit") && password.equals("password")) {
                System.out.println("33333333333");
                session.setAttribute("isLoggedIn", true);
                request.getRequestDispatcher("allOperations.jsp").forward(request, response);
            } else {
                response.sendRedirect("login.jsp");
            }
        } else if (path.contains("addEmployee")) {
            request.getRequestDispatcher("addEmployee.jsp").forward(request, response);
        } else if (path.contains("deleteEmployee")) {
            request.getRequestDispatcher("deleteEmployee.jsp").forward(request, response);

        } else if (path.contains("findEmployee")) {
            request.getRequestDispatcher("findEmployee.jsp").forward(request, response);

        } else if (path.contains("logout")) {
            session.invalidate();
            response.sendRedirect("login.jsp");
        }
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
