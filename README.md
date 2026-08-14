# QuizBuddyWebApp

QuizBuddy is a Java-based web application that allows learners to take online tests and view their results. Teachers can create tests and monitor learner performance through the application.

## Project Overview

The system provides two main roles:

- **Teacher**
- **Learner**

### Teacher

The teacher can:

- Set/create a test
- View learners who have passed
- View the top-performing learner

### Learner

The learner can:

- Take an available test
- Answer test questions
- Have their score updated as they answer questions
- View their total score at the end of the test

## Main Features

- Teacher and learner functionality
- Test creation
- Online test taking
- Automatic score tracking
- Score updates while completing a test
- Final total score displayed to the learner
- Passed learner information
- Top learner information

## Technologies Used

- Java
- Java Servlets
- JSP (JavaServer Pages)
- HTML
- CSS
- Apache NetBeans
- GlassFish
- Git
- GitHub

## Project Structure

```text
QuizBuddyWebApp/
│
├── src/
│   └── java/
│       └── za/ac/tut/web/
│           ├── AnswerServlet.java
│           ├── FinalResultServlet.java
│           ├── LogoutServlet.java
│           ├── NextQuestionServlet.java
│           ├── PassedLearnersServlet.java
│           ├── SetTestServlet.java
│           ├── StartTestServlet.java
│           └── TopLearnerServlet.java
│
├── web/
│   ├── WEB-INF/
│   │   └── web.xml
│   ├── Styles/
│   │   └── myStyles.css
│   ├── index.html
│   ├── learner_menu.html
│   ├── teacher_menu.html
│   ├── question.jsp
│   ├── take_test.jsp
│   ├── outcome.jsp
│   ├── final_result.jsp
│   ├── passed_learners.jsp
│   └── top_learner.jsp
│
└── README.md

## Project Purpose

QuizBuddyWebApp was developed as a web-based quiz and assessment system that provides separate functionality for teachers and learners, including test creation, quiz participation, automated scoring, and learner performance tracking.

### Author 
Rebaona Radebe
