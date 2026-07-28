<%-- 
    Document   : outcome
    Created on : May 25, 2026, 2:49:09 PM
    Author     : Rebaona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Question Outcome Page</title>
    </head>
    <body>
        <h1>Question Outcome</h1>
        <%
            String currentOutcome = (String)session.getAttribute("currentOutcome");
        
        %>
        
        <pre><%= currentOutcome %></pre>
        
        <form action="NextQuestionServlet.do" method="POST">
              <input type="submit" value="Next Question"> 
        </form>
    </body>
</html>
