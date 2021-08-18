package 자바기본;

import java.util.ArrayList;
import java.util.Random;

public class 기본입출력8추가문제 {

	public static void main(String[] args) {
		
	
		Random r = new Random(); // seed값, 씨앗값
		int s1 = r.nextInt(100); // 0~99 시작값 
		int e1 = r.nextInt(100) + 1000; // 1000~10009 종료값
		int sum = 0;
		for (int i = s1; i < e1; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
			
		}
		System.out.println("랜덤한 시작값: "+s1);
		System.out.println("랜덤한 종료값: "+e1);
		System.out.println("랜덤한 시작값과 종료값에서 3의 배수를 더한 합계: " + sum);

	}
}
