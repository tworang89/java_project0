<%@page import="java.util.ArrayList"%>
<%@page import="product.ProDAO"%>
<%@page import="product.ProDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     
 	 	int proid=Integer.parseInt(request.getParameter("proid"));
 	
    	
    	ProDTO bag = new ProDTO();
    	bag.setProid(proid);
    	ProDAO dao = new ProDAO();
    	ProDTO bag2 = dao.read3(bag);
    	
    	
    	
    	
    
    %> 
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.roomImg {
	width: 100%;
	max-height: 190px;
	object-fit: cover;
	border-radius: 15px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="darkgray">
<h3></h3>
<hr>
<h3></h3>
<strong>BairBnB</strong>
<h3></h3>
<hr>
<tr>

	
	<ul><fieldset>
	<h3></h3>  
		<strong><td>상품번호: <%=bag2.getProid()%>번</td><br>
	<h3></h3>
	<figure>
		<td><img src ="<%=bag2.getProimg()%>" class ="roomimg"></figure></td><br>
								
		<td>판매자아이디: <%=bag2.getMemid()%></td><br>
	<h3></h3>
		<td>숙소명: <%=bag2.getPronam()%></td><br>
	<h3></h3>
		<td>숙소주소: <%=bag2.getProadd()%></td><br>
	<h3></h3>
		<td>전화번호: <%=bag2.getProtel()%></td><br>
	<h3></h3>
		<td>주차가능여부: <%=bag2.getPropk()%></td><br>
	<h3></h3>
		<td>와이파이: <%=bag2.getProwifi()%></td><br>
	<h3></h3>
		<td>애완동물가능여부: <%=bag2.getPropet()%></td><br>
	<h3></h3>
		<td>조식제공여부: <%=bag2.getProbk()%></td><br>
	<h3></h3>
		<td>가격(1박): <%=bag2.getProprice()%>원</td><br></strong>
	</ul></fieldset>
<hr>

</tr>
</body>
</html>