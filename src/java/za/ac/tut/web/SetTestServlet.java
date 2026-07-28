
package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.QuestionFacadeLocal;
import za.ac.tut.model.entity.Question;

/**
 *
 * @author Rebaona
 */
public class SetTestServlet extends HttpServlet {

    @EJB QuestionFacadeLocal facade;
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //set test
        //set q1
        Question q1 = new Question();
        q1.setQuesText("Which SQL statement is used to retrieve data from a database?");
        q1.setOptionA("INSERT");
        q1.setOptionB("UPDATE");
        q1.setOptionC("SELECT");
        q1.setOptionD("DELETE");
        q1.setCorrectAnswer("C");
        
        facade.create(q1);
        
        Question q2 = new Question();
        q2.setQuesText("Which HTML tag is used to create a hyperlink?");
        q2.setOptionA( "&lt img &gt");
        q2.setOptionB("&lt a &gt");
        q2.setOptionC("&lt link &gt");
        q2.setOptionD("&lt button &gt");
        q2.setCorrectAnswer("B");
        
        facade.create(q2);
        
        Question q3 = new Question();
        q3.setQuesText("What does CSS stand for?");
        q3.setOptionA("Creative Styles Sheet");
        q3.setOptionB("Cascading Styles Sheet");
        q3.setOptionC("Computer Style Sheet");
        q3.setOptionD("Cascading Style Sheet");
        q3.setCorrectAnswer("D");
        
        facade.create(q3);
        
        Question q4 = new Question();
        q4.setQuesText("Which Java keyword is used to inherit from another class? ");
        q4.setOptionA("this");
        q4.setOptionB("extends");
        q4.setOptionC("implements");
        q4.setOptionD("super");
        q4.setCorrectAnswer("B");
        
        facade.create(q4);
        
        Question q5 = new Question();
        q5.setQuesText("Which data structure follows the Last In first Out(LIFO) principle?");
        q5.setOptionA("Stack");
        q5.setOptionB("Queue");
        q5.setOptionC("Linked List");
        q5.setOptionD("Array");
        q5.setCorrectAnswer("A");
        
        facade.create(q5);
        
        Question q6 = new Question();
        q6.setQuesText("Which SDLC model completes one phase before moving to the next?");
        q6.setOptionA("Agile");
        q6.setOptionB("Scrum");
        q6.setOptionC("Waterfall");
        q6.setOptionD("Spiral");
        q6.setCorrectAnswer("C");
        
        facade.create(q6);
        
        Question q7 = new Question();
        q7.setQuesText("Which SQL clause is used to group rows with the same values?");
        q7.setOptionA("Order by");
        q7.setOptionB("Group by");
        q7.setOptionC("Where");
        q7.setOptionD("Having");
        q7.setCorrectAnswer("B");
        
        facade.create(q7);
        
        Question q8 = new Question();
        q8.setQuesText("Which Power BI language is used to create a calculated measure?");
        q8.setOptionA("SQL");
        q8.setOptionB("Java");
        q8.setOptionC("Python");
        q8.setOptionD("DAX");
        q8.setCorrectAnswer("D");
        
        facade.create(q8);
        

        RequestDispatcher disp = request.getRequestDispatcher("setTestOutcome.html");
        disp.forward(request, response);        
    }

}
