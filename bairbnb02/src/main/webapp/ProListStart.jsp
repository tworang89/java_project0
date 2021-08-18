<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="java.util.ArrayList"%>
<%@page import="product.ProDAO"%>
<%@page import="product.ProDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
	ProDAO dao = new ProDAO();


	ArrayList<ProDTO> list = dao.read();
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
<title>상품리스트</title>

</head>
<body bgcolor="darkgray">
	<table>

	<tr>
<h3></h3>
<hr>
<h3></h3>
<strong>BairBnB</strong>
<h3></h3>
<hr>
	<div>
		<ul>
			<strong><h3><<상품리스트>></h3></strong>	
		</ul>
	</div>
<h3></h3>
		<%
		for (ProDTO dto : list) {
			
		%>
		
	<ul><div>
	
		<div>
		<h3></h3>
			<hr>
			<h3></h3>
			<fieldset>
				<a href=Proread.jsp?proid=<%=dto.getProid()%>>
					<figure>
						<strong>상품번호: <%=dto.getProid()%>번</strong><br>
					</figure>
					<figure>
					<img src ="<%=dto.getProimg()%>" class ="roomimg">
								</figure>
					
					<figure>
						<strong>숙소명: <%=dto.getPronam()%></strong><br></figure>
					<figure>
						<strong>숙소주소: <%=dto.getProadd()%></strong><br></figure>
					<figure>
						<strong>전화번호: <%=dto.getProtel()%></strong><br></figure>
					<figure>
						<strong>가격(1박): <%=dto.getProprice()%>원</strong></figure>
				</a>
			</hr>
			
			
			
	</div>
</ul></div>
			
			
		</tr>
		<%
		}
		%>



	</table>

</body>
</html>