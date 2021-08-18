<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    int count = (int)session.getAttribute("count"); // object로 변환
    count++;
    session.setAttribute("count", count);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count : <%= session.getAttribute("count") %><hr>
<a href="page05.jsp">카운트값 확인</a><hr>
</body>
</html>