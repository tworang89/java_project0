package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너4 {

	public static void main(String[] args) {
		// 안정성 점수 (30%) : 100 => 100 * 0.3 = 30
		// 속도 점수 (50%) : 80 => 80 * 0.5 = 40
		// 연비 점수 (20%) : 60 => 60 * 0.2 = 12
		// 90점이상 최우수, 80점이상 우수, 70점이상 보통, 그것도아니면 미달

		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수 입력");
		double a1 = sc.nextDouble(); 
		
		System.out.print("속도 점수 입력");
		double b1 = sc.nextDouble();
		
		System.out.print("연비 점수 입력");
		double c1 = sc.nextDouble();
		
		
		double a2 = a1 * 0.3 ;
		
		double b2 = b1 * 0.5 ;
		
		double c2 = c1 * 0.2 ;
		
		double d1 = a2 + b2 + c2 ;
		
		if (d1 >= 90) {
			
			System.out.println( d1+"점"+"최우수");
			
		} else if (d1 >= 80) {
			
			System.out.println( d1+"점"+"우수");
			
		}else if (d1 >= 70) {
			
			System.out.println( d1+"점"+"보통");
			
		} else {
			
			
			System.out.println( d1+"점"+"미달");
			
			
			
			
		} 
		
		
		
		
		
		
		
		}

	}


