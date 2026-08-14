<%-- 
    Document   : question
    Created on : Jul 28, 2026, 8:05:51 PM
    Author     : Rebaona
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="Styles/myStyles.css">  
        <title>Question Page</title>
    </head>
    <body>
        <h1>Question</h1>
        <%
            List<Question> questions = (List<Question>)session.getAttribute("questions");
            Integer index = (Integer)session.getAttribute("index");
            
            Question q = questions.get(index);
        %>
        
        <p>Total questions: <%= questions.size() %></p>
        
        <p>Question <%= index + 1 %></p>
        
        <p>Question: <%= q.getQuesText() %></p>
        
        <form action="AnswerServlet.do" method="POST">
            
            <input type="radio" name="answer" value="A" required=""/>
            A. <%= q.getOptionA() %><br><br> 
            
            <input type="radio" name="answer" value="B" />
            B. <%= q.getOptionB() %><br><br> 
            
            <input type="radio" name="answer" value="C" />
            C. <%= q.getOptionC() %><br><br> 
            
            <input type="radio" name="answer" value="D" />
            D. <%= q.getOptionD() %><br><br> 
            
            <input type="submit" value="SUBMIT" />
            
        </form>
    </body>
</html>
