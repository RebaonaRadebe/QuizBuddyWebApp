package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.LearnerFacadeLocal;
import za.ac.tut.model.entity.Learner;

public class TopLearnerServlet extends HttpServlet {

    @EJB
    LearnerFacadeLocal fac;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the top learner
        Learner learner = fac.viewTopLearner();

        // Send learner to the JSP
        request.setAttribute("learner", learner);

        // Forward to display page
        RequestDispatcher disp =
                request.getRequestDispatcher("top_learner.jsp");

        disp.forward(request, response);
    }
}