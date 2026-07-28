/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.entity.Question;

/**
 *
 * @author Rebaona
 */
public class NextQuestionServlet extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();

        List<Question> questions = (List<Question>)session.getAttribute("questions");
        Integer index = (Integer)session.getAttribute("index");
        
        //increment index 
        index++;
        
        //set index
        session.setAttribute("index", index);
        
        //if
        if(index < questions.size())
        {
            response.sendRedirect("question.jsp");
        }
        else
        {
            response.sendRedirect("FinalResultServlet.do");
        }
        
    }
}
