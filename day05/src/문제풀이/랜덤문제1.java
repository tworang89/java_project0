package 문제풀이;

import java.util.Random; //부품이 저장된 장소

public class 랜덤문제1 {

	public static void main(String[] args) {

		// 랜덤2개

		Random r = new Random(); // 변수선언, RAM에 Random부품 저장
		int n1 = r.nextInt(100); // 첫번째 값 설정
		int n2 = r.nextInt(100); // 두번째 값 설정
		System.out.println(n1); // 첫번째 값 출력
		System.out.println(n2); // 두번째 값 출력
		
		
		if (n1 > n2) { //조건문
			
			System.out.println("n1이 더큼"); //조건에 따른 출력
			
		}
		

		if (n1 < n2) { //조건문2
			
			System.out.println("n2가더큼"); //조건에 따른 출력2
			
		}

	}

}
