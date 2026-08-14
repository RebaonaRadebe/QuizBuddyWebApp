<%-- 
    Document   : take_test
    Created on : May 25, 2026, 1:22:19 PM
    Author     : Rebaona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="Styles/myStyles.css"> 
        <title>Take Test Page</title>
    </head>
    <body>
        <h1>Take Test</h1>
        
    <form action="StartTestServlet.do" method="POST">

    Learner ID:
    <input type="text" name="learnerId" required>

    <br><br>

    Learner Name:
    <input type="text" name="name" required>

    <br><br>

    <input type="submit" value="Start Test" />

</form>
    </body>
</html>
