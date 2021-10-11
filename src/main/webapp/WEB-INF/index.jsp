<%--
  Created by IntelliJ IDEA.
  User: spy00
  Date: 2021-10-10
  Time: 오후 7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
    <table border="1">
        <colgroup>
            <col width="10%">
            <col width="40%">
            <col width="20%">
            <col width="30%">
        </colgroup>
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="list" items="${boardList}">
                <tr>
                    <th>${list.idx}</th>
                    <th><a href="/view?idx=${list.idx}">${list.bd_name}</a></th>
                    <th>${list.bd_writer}</th>
                    <th>${list.bd_date}</th>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button><a href="/insert">등록</a></button>
</body>
</html>
