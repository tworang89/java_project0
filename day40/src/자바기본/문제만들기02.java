package 자바기본;

import java.util.ArrayList;
import java.util.Random;

public class 문제만들기02 {

	public static void main(String[] args) {
		//랜덤값 생성
		//0~99의 랜덤값 7개 생성
		//7개의 랜덤 값을 합한다.
		//랜덤값의 합계 출력
		//랜덤값의 합계가 450보다 크면 우선 접종 대상자 출력
		//아니라면 조금 더 기다려주세요 출력
		Random r = new Random(); 
		int s1 = r.nextInt(100); // 0~99 랜덤값 1번
		int s2 = r.nextInt(100); // 0~99 랜덤값 2번 
		int s3 = r.nextInt(100); // 0~99 랜덤값 3번 
		int s4 = r.nextInt(100); // 0~99 랜덤값 4번 
		int s5 = r.nextInt(100); // 0~99 랜덤값 5번 
		int s6 = r.nextInt(100); // 0~99 랜덤값 6번 
		int s7 = r.nextInt(100); // 0~99 랜덤값 7번 
		
		int num = s1 + s2 + s3 + s4 + s5 + s6 + s7;//랜덤값의 합
		
		System.out.println("접종 대상자 랜덤 추첨번호: "+ num);//랜덤값 출력
		
		if (num > 450) { //랜덤한값이 450보다 크면
			
			System.out.println("당첨! 우선 접종 대상자 입니다.");// 당첨 출력
			
		} else {
			
			System.out.println("조금 더 기다려주세요!");// 반대 경우 출력
			
		}
		
		
		
		
	
		
		

	}
		

}


