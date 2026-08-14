<%-- 
    Document   : final_result
    Created on : May 25, 2026, 3:14:54 PM
    Author     : Rebaona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="Styles/myStyles.css"> 
         <title>Final Result Display Page</title>
    </head>
    <body>
        <h1>Final Result Display</h1>
        
        <%
             String name = (String)request.getAttribute("name");
             Double mark = (Double)request.getAttribute("mark");
             Integer score = (Integer)request.getAttribute("score");
             Integer total = (Integer)request.getAttribute("total");
             String outcome = (String)session.getAttribute("outcome");
        
        %>
        
             <h1>Test Completed</h1>

            <h2>Welcome, <%= name %></h2>
            
            <table border="1">
                <tr>
                    <td>Name: </td>
                    <td><%=name%></td>
                </tr>
                
                 <tr>
                    <td>Total Questions: </td>
                    <td><%=total%></td>
                </tr>
                
                 <tr>
                    <td>Correct Answers: </td>
                    <td><%=score%></td>
                </tr>
                
                 <tr>
                    <td>Percentage Mark: </td>
                    <td><%= String.format("%.2f", mark)  %></td>
                </tr>
            </table>
                
                <h3>Question outcomes</h3>
                <pre><%= outcome %></pre>
                
                <br><br>


       <ul>
         
                <li><a href="menu.html">Menu</a></li>
                <li><a href="take_test.jsp">Take another test</a></li>
                <li><a href="LogoutServlet.do">Logout</a></li>
            </ul>
        
       
    </body>
</html>
