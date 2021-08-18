package 자바기본;

import java.util.ArrayList;
import java.util.Random;

public class 문제만들기01 {

	public static void main(String[] args) {
		//랜덤값 생성
		//시작값 0~99, 종료값 100~199
		//시작값 출력
		//종료값 출력
		//시작갑과 종료값의 5의 배수 합계 연산
		//5의배수 합계 연산 후 출력
		//5의배수의 갯수 연산 후 출력
		
		
		Random r = new Random(); 
		int s1 = r.nextInt(100); // 0~99 시작값 
		int e1 = r.nextInt(100) + 100; // 100~199 종료값//랜덤값 생성
		//시작값 0~99, 종료값 100~199
		//시작값 출력
		//종료값 출력
		//시작갑과 종료값의 5의 배수 합계 연산
		//5의배수 합계 연산 후 출력
		//5의배수의 갯수 연산 후 출력
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = s1; i < e1; i++) {
			if (i % 5 == 0) {
				sum += i;
				list.add(i);
			}
			
		}
		System.out.println("랜덤한 시작값: "+s1);//랜덤한 시작값
		System.out.println("랜덤한 종료값: "+e1);//랜덤한 종료값
		System.out.println("랜덤한 시작값과 종료값에서 5의 배수를 더한 합계: " + sum);//랜덤값에서 5의 배수의 합계
		System.out.println("랜덤한 시작값과 종료값에서 5의 배수의 갯수: " + list.size());// 5의 배수의 갯수
		

	}
		

}


