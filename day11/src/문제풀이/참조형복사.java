package 문제풀이;

import java.util.Iterator;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		
		int[] x = {1, 2, 3};
		
		//int[] y = x; //참조형 복사(얇은복사:주소만복사)
		int[] y = x.clone(); //참조형복사 (깊은복사:주소가 가르키는 값들의 목록을 복사)
		
		System.out.println("x:  ");
		
		for (int i : x ) {
			
			System.out.println(i+"  ");
			
		}
		
		System.out.println();
		System.out.println("y:  ");
		for (int i : y) {
			
			System.out.println( i+"  ");
			
		}
		
		System.out.println("\n==원본  x값  수정후==");
		x[0] = 9;
		System.out.println("x:  ");
		for (int i : x) {
			
			System.out.println(i+"  ");
			
		}
		System.out.println();
		System.out.println("y:  ");
		
		for (int i : y) {
			
		}

		
		
		

	}

}
