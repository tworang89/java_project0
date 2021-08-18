package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner 부품을 임포트해서 sc로 선언
		System.out.println("숫자를 입력!>>");
		//숫자를 입력을 출력
		int num1 = sc.nextInt();
		//입력값을 데이터타입 int로 num1로 선언
		System.out.println("숫자를 입력!>>");
		//숫자를 입력을 출력
		int num2 = sc.nextInt();
		//입력값을 데이터타입 int로 num2로 선언
		int num3 =0;
		//데이터 타입 int 인 num3 을 0으로 선언
		while (num1>num2) {
			//while문 num1보다 num2가 작으면 작동
			num3++;
			//num3가 반복
			System.out.println("판결은 앞숫자가 크다!");
			//while문이 작동할때 판결은 앞숫자가 크다 출력
			if (num1<num2) {
				//if문 num1보다 num2가 크면 작동
				System.out.println("판결은 뒷숫자가 크다!");
				//if문이 작동할때 판결은 뒷숫자가 크다 출력
			}
			
		}
		

		
		
		
		
		
		
	}

}
