<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품메인</title>
<!-- <meta name="viewport" content="width=device-width,initial-scale=1"> -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/ProMain.css">
</head>
<body>
<div id="wrap">
	<header>
		<div class="container_wrap">
			<nav>
				<jsp:include page="ProMainTop.jsp"></jsp:include>
			</nav>
		</div>
	</header>
	<main>
		<div class="container container_wrap">
			<section>
				<h3><i class="demo-icon">&#xe825;</i>전체상품목록</h3>
				<form action="ProReadStart.jsp">
					<a href="ProListStart.jsp">상품 전체 리스트로 이동</a>
				</form>
			</section>
			
			<section>
				<h3><i class="demo-icon">&#xf0fe;</i>상품등록</h3>
				
				
				 <form action="ProInsertStop.jsp">
					<div>
						<span>판매자 아이디</span>
						<input name="memid">
					</div>
					<div>
						<span>숙소명</span>
						<input name="pronam">
					</div>
					<div>
						<span>주소</span>
						<input name="proadd">
					</div>
					<div>
						<span>전화번호</span>
						<input name="protel">
					</div>
					<div>
						<span>주차여부(O/X)</span>
						<input name="propk">
					</div>
					<div>
						<span>와이파이(O/X)</span>
						<input name="prowifi">
					</div>
					<div>
						<span>애완동물가능여부(O/X)</span>
						<input name="propet">
					</div>
					<div>
						<span>조식제공여부(O/X)</span>
						<input name="probk">
					</div>
					<div>
						<span>가격(1박)</span>
						<input name="proprice">
					</div>
					<div class="send_btn">
						<button type="submit">상품등록</button>
					</div>					
				</form> 
			</section>
			
			
			
			<section>
				<h3><i class="demo-icon">&#xe911;</i>상품수정</h3>
				<form action="ProUpdateStop.jsp">
					<div>
						<span>상품번호</span>
						<input name="proid">
					</div>
					<div>
						<span>판매자아이디</span>
						<input name="memid">
					</div>
					<div>
						<span>숙소명</span>
						<input name="pronam">
					</div>
					<div>
						<span>숙소주소</span>
						<input name="proadd">
					</div>
					<div>
						<span>전화번호</span>
						<input name="protel">
					</div>
					<div>
						<span>주차가능여부(O/X)</span>
						<input name="propk">
					</div>
					<div>
						<span>와이파이여부(O/X)</span>
						<input name="prowifi">
					</div>
					<div>
						<span>애완동물가능여부(O/X)</span>
						<input name="propet">
					</div>
					<div>
						<span>조식제공여부(O/X)</span>
						<input name="probk">
					</div>
					<div>
						<span>가격(1박)</span>
						<input name="proprice">
					</div>
					<div class="send_btn">
						<button type="submit">상품수정</button>
					</div>	
				</form>
			</section>
			<section>
				<h3><i class="demo-icon">&#xf083;</i>상품삭제</h3>
				<form action="ProDeleteStop.jsp">
					<div>
						<span>상품번호</span>
						<input name="proid">
					</div>
					<div class="send_btn">
						<button type="submit">상품삭제</button>
					</div>	
				</form>
			</section>
			<section>
				<h3><i class="demo-icon">&#xea0c;</i>회원검색</h3>
				<form action="Proread.jsp">
					<div>
						<span>상품번호</span>
						<input name="proid">
					</div>
					<div class="send_btn">
						<button type="submit">회원검색</button>
					</div>
				</form>
			</section>
		</div>
	</main>
</div>

<!-- 
	<div id="center">
		<div>
			<h3>상품등록</h3>
			<form action="ProInsertStop.jsp">
				판매자아이디: <input name="memin"><br> 
				숙소명: <input name="pronam"><br>
				숙소주소: <input name="proadd"><br> 
				전화번호: <input name="protel"><br>
				주차가능여부(O/X): <input name="propk"><br>
				와이파이여부(O/X): <input name="prowifi"><br>
				애완동물가능여부(O/X): <input name="propet"><br>
				조식제공여부(O/X): <input name="probk"><br>
				가격(1박): <input name="proprice"><br>
		<hr>
			<button style="background: white;" type="submit">상품등록</button>
		<hr>
			</form>
		</div>
		
		
		<div>	
			<hr>
			
			<h3>상품삭제</h3>
			<form action="ProDeleteStop.jsp">
				상품번호: <input name="proid"><br> 
				<hr>
			<button style="background: white;" type="submit">상품삭제</button>
				<hr>
			</form>
			
		</div>
		
		
		<div>
			<h3>상품수정</h3>
			<form action="ProUpdateStop.jsp">
				상품번호: <input name="proid"><br> 
				판매자아이디: <input name="memin"><br> 
				숙소명: <input name="pronam"><br>
				숙소주소: <input name="proadd"><br> 
				전화번호: <input name="protel"><br>
				주차가능여부(O/X): <input name="propk"><br>
				와이파이여부(O/X): <input name="prowifi"><br>
				애완동물가능여부(O/X): <input name="propet"><br>
				조식제공여부(O/X): <input name="probk"><br>
				가격(1박): <input name="proprice"><br>
				<hr>
				<button style="background: white;" type="submit">상품수정</button>
				<hr>
			</form>
		</div>
		
		
		<div>	
			<h3>회원검색</h3>
			<form action="ProReadStart.jsp">
				상품번호: <input name="proid"><br> 
				<hr>
				<button style="background: white;" type="submit">상품검색</button>
				<hr>
				</form>
		</div>
		
			
		<div>	
			<h3>전체상품목록</h3>
			<button><a href="ProListStart.jsp">상품 전체 리스트로 이동</a></button>
		</div>	
			
</div>
 -->
	
</body>
</html>