<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록페이지</title>
</head>
<body bgcolor="darkgray">
<h3></h3>
<hr>
<h3></h3>
<strong>BairBnB</strong>
<h3></h3>
<hr>
	<div>
		<h2>상품등록</h2>
		
		<form action="ProInsertStop.jsp">
			<fieldset>
				<legend><<상품정보입력>></legend>
				
				<h3></h3>
				<div>
					<span>판매자아이디</span>
					<div>
					<input name="memid">
					</div>
				</div>
				<h3></h3>
				<div>
					<span>숙소명</span>
					<div>
					<input name="pronam">
					</div>
				</div>
				<h3></h3>
				<div>
					<span>숙소주소</span>
					<div>
					<input name="proadd">
					</div>
				</div>
				<h3></h3>
				<div>
					<span>전화번호</span>
					<div>
					<input  name="protel">
					</div>
				</div>
				<h3></h3>
				<div>
					<span>주차가능여부(O/X)</span>
					<div>
						<input  name="propk" >
					</div>
				</div>
				<h3></h3>	
					<div>
					<span>와이파이여부(O/X)</span>
					<div>
						<input  name="prowifi" >
					</div>
					</div>
				<h3></h3>
				<div>
					<span>애완동물가능여부(O/X)</span>
					<div>
						<input  name="propet" >
					</div>
				</div>
				<h3></h3>	
				<div>
					<span>조식제공여부(O/X)</span>
					<div>
						<input  name="probk">
					</div>
					
				</div>
				<h3></h3>
				<div>
					<span>가격(1박)</span>
					<div> 
						<input name="proprice"> <span>원</span>
					</div>
				</div>
			<!-- <div>
					<span>숙소사진</span>
					<div> 
						<input name="proimg"> 
					</div>
				 </div> -->
				
				<div>
				<hr>
					<button style="background: white;" type="submit">상품등록</button>
				<hr>
				</div>
				
				
				
			</fieldset>
		</form>
	</div>
<hr>
</body>
</html>