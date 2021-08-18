package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 조건문50 {

	public static void main(String[] args) {
		
	   Random r = new Random();
	   
	   int target = r.nextInt(100);
	   
	   int count = 0;
	   
	   while (true) {
		   
		   String date = JOptionPane.showInputDialog("숫자입력");
		   
		   count++;
		   
		   int guess = Integer.parseInt(date);
		   
		   if (target == guess) {
			   
			   
			   System.out.println("정답입니다.");
			   System.out.println("당신의 시도 횟수는"+count+"회");
			   System.out.println("시스템을 종료합니다.");
			   break;
			   
			   
		} else {
			
			System.out.println("정답이 아닙니다.");

		} if(target > guess) {
			
			System.out.println("너무작아요");
			
			
			
			
		} else {
			
			System.out.println("너무커요");
			
			
			
		}
		
	}

	}

}
