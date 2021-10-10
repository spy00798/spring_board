<%--
  Created by IntelliJ IDEA.
  User: spy00
  Date: 2021-10-10
  Time: 오후 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<form>
    <table border="1">
        <thead>
        <tr>
            <th>작성자</th>
            <td>${boardView.bd_writer}</td>
            <th>작성일</th>
            <td>${boardView.bd_date}</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">제목</td>
            <td colspan="2">${boardView.bd_name}</td>
        </tr>
        <tr>
            <td colspan="2">내용</td>
            <td colspan="2">
                <textarea readonly>${boardView.bd_content}</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <button class="list_btn"><a href="/">홈으로</a></button>
                <button class="up_btn"><a href="/update">수정</a></button>
                <button class="del_btn"><a href="/delete">삭제</a></button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
