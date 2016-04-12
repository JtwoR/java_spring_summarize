package com.wt.servlet;

import com.wt.entity.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDervletServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<Student> students = new ArrayList<Student>();
        
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("student1_name");
        student1.setAddress("student1_adress");
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("student2_name");
        student2.setAddress("student2_adress");
        
        Student student3 = new Student();
        student3.setId(3);
        student3.setName("student3_name");
        student3.setAddress("student3_adress");
        
        // add
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        request.setAttribute("students", students);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/showStudent.jsp");
        
        // 转发
        requestDispatcher.forward(request, response);
        
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
