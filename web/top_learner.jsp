<%-- 
    Document   : top_learner
    Created on : Aug 14, 2026, 8:02:49 PM
    Author     : Rebaona
--%>

<%@page import="za.ac.tut.model.entity.Learner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="Styles/myStyles.css"> 
        <title>Top Learner Page</title>

        <style>
            table {
                border-collapse: collapse;
                width: 60%;
            }

            th, td {
                border: 1px solid black;
                padding: 10px;
                text-align: left;
            }

            th {
                background-color: #eeeeee;
            }
        </style>
    </head>

    <body>

        <h1>Top Learner</h1>

        <%
            Learner learner =
                    (Learner)request.getAttribute("learner");
        %>

        <table>

            <tr>
                <th>Learner ID</th>
                <th>Name</th>
                <th>Mark</th>
            </tr>

            <tr>
                <td><%= learner.getLearnerId() %></td>
                <td><%= learner.getName() %></td>
                <td><%= String.format("%.2f", learner.getMark()) %>%</td>
            </tr>

        </table>

        <br>

        <a href="teacher_menu.html">Teacher Menu</a>

    </body>
</html>