<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	session.setAttribute("count", 100);
    
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr>
<a href="page04.jsp">카운트값 증가 후 다시 세션 저장</a><hr>
<a href="page05.jsp">카운트값 확인</a><hr>
</body>
</html>