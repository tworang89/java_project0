package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;


public class 시간부품4 {

	public static void main(String[] args) {
	
		// 월이 3-5이면 봄
		// 6-8이면 여름
		// 9-11이면 가을
		// 나머지면 겨울
		
		Date date = new Date();
		int month = date.getMonth()+1;
		

		if (month==3||month==4||month==5) {
			
			System.out.println("봄");
			
		} else if (month==6||month==7||month==8) {
			
			System.out.println("여름");
			
		} else if (month==9||month==10||month==11) {
			
			System.out.println("가을");}
		
		else { System.out.println("겨울");
			
			
		}
		
		
	
	
	
	
	
	
	
	}
	
		
	
	
	
	}

		
			
		
		
		
		
		
	


