
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
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author Rebaona
 */
public class PassedLearnersServlet extends HttpServlet {

    @EJB LearnerFacadeLocal fac;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //HttpSession session = request.getSession();
        
        List<Learner> learners = fac.LearnersWhoPassed();
        
        request.setAttribute("learners", learners);
        
        RequestDispatcher disp = request.getRequestDispatcher("passed_learners.jsp");
        disp.forward(request, response);
    }

}
