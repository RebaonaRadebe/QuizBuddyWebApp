
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
import za.ac.tut.model.bl.LearnerFacadeLocal;
import za.ac.tut.model.bl.QuestionFacadeLocal;
import za.ac.tut.model.entity.Learner;
import za.ac.tut.model.entity.Question;

/**
 *
 * @author Rebaona
 */
public class FinalResultServlet extends HttpServlet {

    @EJB LearnerFacadeLocal facade;
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        
        String name = (String)session.getAttribute("name");
        String learnerId = (String)session.getAttribute("learnerId");
        List<Question> questions = (List<Question>)session.getAttribute("questions");
        Integer score = (Integer)session.getAttribute("score");
        String outcome = (String)session.getAttribute("outcome");
        
        //calc
        Double mark = (score * 100.0)/questions.size();
        //create learner 
        Learner learner = createLearner(learnerId, name, mark, outcome);
        //call create 
        facade.create(learner);
        //set to display
        request.setAttribute("name", name);
        request.setAttribute("mark", mark);
        request.setAttribute("score", score);
        request.setAttribute("total", questions.size());
        //jsp 
        RequestDispatcher disp = request.getRequestDispatcher("final_result.jsp");
        disp.forward(request, response);
        
        
        
    }

    private Learner createLearner(String learnerId, String name, Double mark, String outcome) {
        
        Learner learner = new Learner();
        
        learner.setLearnerId(learnerId);
        learner.setName(name);
        learner.setMark(mark);
        learner.setOutcome(outcome);
        
        return learner;
    }

}
