<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Learner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
         <link rel="stylesheet" href="Styles/myStyles.css"> 
        <title>Passed Learners</title>

        <style>
            table {
                border-collapse: collapse;
                width: 70%;
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

        <h1>Passed Learners</h1>

        <%
            List<Learner> learners =
                    (List<Learner>) request.getAttribute("learners");
        %>

        <table>

            <tr>
                <th>Learner ID</th>
                <th>Name</th>
                <th>Mark</th>
            </tr>

            <%
                for (Learner learner : learners) {
            %>

            <tr>
                <td><%= learner.getLearnerId() %></td>
                <td><%= learner.getName() %></td>
                <td><%= String.format("%.2f", learner.getMark()) %>%</td>
            </tr>

            <%
                }
            %>

        </table>

        <br>

        <a href="teacher_menu.html">Teacher Menu</a>

    </body>
</html>