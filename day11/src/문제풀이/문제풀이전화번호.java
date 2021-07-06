package 문제풀이;

import java.util.Scanner;

public class 문제풀이전화번호 {

	public static void main(String[] args) {
		// 전화번호입력>> 011-245-1234
		// 1) 양쪽 공백을 제거하시오.
		// 2) -을 기준으로 분리해내세요.(String[])
		// 3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
		// 4) 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호 아니면 유효하지 않은 전화번호
	
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력>> ");
		String t = sc.nextLine();
		String t2 = t.trim();
		//trim 공백제거
		String[] t3 = t2.split("-");
		// t3 = {"011", "245", "1234"}
		
		for (int i = 0; i < t3.length; i++) {
			
		}//for
		
		if (t3[0].equals("011")) {
			System.out.println("011 > SK");
			
		}
		
		else if (t3[0].equals("019")) {
			
			System.out.println("019 > LG");
			
			
			
		}
		
		else {
			
			System.out.println("나머지 > Apple");
			
		}
		
		//========================================
		
		if (t3[1].length()==4) {
			
			System.out.println("최신폰");
			
		}
		
		else {
			System.out.println("올드폰");
		}
		
		//=======================================
		
		if (t3[0].length()+t3[1].length()+t3[2].length() >= 10) {
			
			System.out.println("유효한 전화번호 입니다.");
			
		}
		
		else {
			
			System.out.println("유효하지 않은 전화번호 입니다.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
