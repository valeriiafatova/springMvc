<%--
  Created by IntelliJ IDEA.
  User: lerafatova
  Date: 25.07.17
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home page</title>
  </head>
  <body>
  <h1>Home page</h1>
  <p>
    ${message}<br/>
    <a href="${pageContext.request.contextPath}/course/add.html">Add new course</a><br/>
    <a href="${pageContext.request.contextPath}/course/list.html">Team list</a><br/>
  </p>
</html>
