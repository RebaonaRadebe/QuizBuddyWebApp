
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.QuestionFacadeLocal;
import za.ac.tut.model.entity.Question;

/**
 *
 * @author Rebaona
 */
public class StartTestServlet extends HttpServlet {

    @EJB QuestionFacadeLocal facade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        String learnerId = request.getParameter("learnerId");
        //load questions 
        List<Question> questions = facade.findAll();
        //set attrbutes to use soon
       session.setAttribute("name", name);
       session.setAttribute("learnerId", learnerId);
       session.setAttribute("questions", questions);
       session.setAttribute("index", 0);
       session.setAttribute("score", 0);
       session.setAttribute("outcome", "");
        
       RequestDispatcher disp = request.getRequestDispatcher("question.jsp");
       disp.forward(request, response);
        
    }

}
