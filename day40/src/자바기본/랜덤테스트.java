package 자바기본;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		Random r = new Random(100); // seed값, 씨앗값
		int start = r.nextInt(100); // 0~99 시작값 
		int end = r.nextInt(10) + 1000; // 1000~10009 종료값
		
		

	}

}
