package 조건문;

import java.util.Date;


public class 시간부품3 {

	public static void main(String[] args) {
	
		// 요일이 토,일이면 쉬어요
		// 나머지 요일이면 달려요.
		// || : OR
		// && : AND
		
		Date date = new Date();
		int day = date.getDay();
		
	
	
	if (day == 0 || day == 6) {
		
		System.out.println("쉬어요");
		
	} else  { 
		
		
		System.out.println("달려요");

	}
	
	}

		
			
		}
		
		
		
		
	


