
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
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
public class AnswerServlet extends HttpServlet {

       @EJB QuestionFacadeLocal facade;
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         HttpSession session = request.getSession();
         
           //session data
         List<Question> questions = (List<Question>)session.getAttribute("questions");
         Integer index = (Integer)session.getAttribute("index");
         Integer score = (Integer)session.getAttribute("score");
         String outcome = (String)session.getAttribute("outcome");
         
         String answer = request.getParameter("answer");
         //get quest
         Question q = questions.get(index);
         
         //compare 
         Boolean correct = false;
         if(answer.equals(q.getCorrectAnswer()))
         {
             correct = true;
             score++;
         }
         
         //
         String currentOutcome = "Question " + (index + 1) + "\n" + 
                                q.getQuesText() + ": " + "\n" +
                                "Options: " + "\n" + 
                                "A. " + q.getOptionA() + "\n" + 
                                "B. " + q.getOptionB() + "\n" + 
                                "C. " + q.getOptionC() + "\n" + 
                                "D. " + q.getOptionD() + "\n" + 
                                "Learner Answer: " + answer + "\n" + 
                                "Correct Answer: " + q.getCorrectAnswer() + "\n" + 
                                "Result: " + (correct ? "Correct" : "Wrong" ) + "\n\n";
         
         //add to outcome 
         outcome += currentOutcome;
         
         //set attributes 
         session.setAttribute("currentOutcome",currentOutcome);
         session.setAttribute("score", score);
         session.setAttribute("outcome", outcome);
         
         //jsp 
          response.sendRedirect("outcome.jsp");
    }


}
