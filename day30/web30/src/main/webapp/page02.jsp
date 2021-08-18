<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    	Cookie[] list = request.getCookies();
    	for(Cookie c: list){
    		
    		//out: 브라우저에 텍스트로 프린트하고자 하는 경우 
    		//out.print(c.getName() + ", " + c.getValue() + "<br>");
    		//쿠키의 이름이 age인 값만 프린트해보세요.
    		if(!c.getName().equals("JSESSIONID")){
    			//앞에!를 찍으면 같이 않으면 이라는 의미
    			out.print(c.getValue()+"<br>");
    		}
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 갯수: <%= list.length %>
</body>
</html>