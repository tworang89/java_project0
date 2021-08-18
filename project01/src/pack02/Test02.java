package pack02;

import java.util.Iterator;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner를 임포트하여 입력값을 sc로 선언
		System.out.println("당신의 소속은?>> ");
		// "당신의 소속은?>>" 출력
		String n1 = sc.next();
		// 입력값을 받아 데이터타입 String을 n1 으로 선언
		System.out.println("당신의 소속은 " + n1 + " 이군요!!");
		// 당신의 소속은 n1이군요 출력
		System.out.println("당신의 나이는?>> ");
		// 당신의나이는 출력
		int n2 = sc.nextInt();
		// 입력값을 받아 데이터타입 int로 n2 선언
		int n3 = n2 - 1;
		// 데이터 타입 int 인 n3는 n2의 값에서 -1을 계산
		System.out.println("당신의 작년 나이는 " + n3 + "세군요!!");
		// 당신의 작년 나이는 n3 세군요 출력
		System.out.println("현재 당신의 몸무게는?>> ");
		// 현재 당신의 몸무게는 출력
		double n4 = sc.nextDouble();
		// 입력값을 받아 데이터타입 double 인 n4 선언
		if (n4 >= 90) {
			// n4가 90이상일때 if문 발동 과체중 출력
			System.out.println("과체중");
		}
		else if (n4 >= 70) {
			// n4가 70이상일때 if문 발동 보통 출력
			System.out.println("보통");
		} else {
			// n4가 그외일때 if문 발동 미달 출력
			System.out.println("미달");
		}
		System.out.println("당신은 결혼하셨나요?(true/false)>> ");
		// 당신은 결혼하셨나요?(true/false)>> 출력
		boolean n5 = sc.nextBoolean();
		// 입력값을 값아 데이터타입 boolean인 n5 선언

		if (n5) {
			// n5가 참일때 if문 발동 당신은 배우자가 있군요 출력
			System.out.println("당신은 배우자가 있군요!");
		} else {
			// 그외 즉 거짓일때 당신은 배우자가 없겠군요 출력
			System.out.println("당신은 배우자가 없겠군요!");
		}
	}
}
