<%--
  Created by IntelliJ IDEA.
  User: spy00
  Date: 2021-09-22
  Time: 오후 6:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="list" items="${list}">
                <tr>
                    <td>${list.idx}</td>
                    <td>${list.bd_name}</td>
                    <td>${list.bd_writer}</td>
                    <td>${list.bd_date}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
