package 조건문;

import java.util.Date;


public class 시간부품2 {

	public static void main(String[] args) {
		// 시간을 구해보세요
		// 10시전이면 굿모닝
		// 15시전이면 굿애프터눈
		// 20시전이면 굿이브닝
		// 나머지는 굿나잇
		
		// 요일이 토,일이면 쉬어요
		// 나머지 요일이면 달려요.
		
		// 월이 3-5이면 봄
		// 6-8이면 여름
		// 9-11이면 가을
		// 나머지면 겨울
		
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초");
		
		if (hour >= 10 ) {
			
			System.out.println("굿모닝");
			
	
			}
			
		}

		
			
		}
		
		
		
		
	


