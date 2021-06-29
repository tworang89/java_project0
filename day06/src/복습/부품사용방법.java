package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가 있음.
		// 클래스 이름으로 바로 사용 가능.
		// Integet, Double, System, joptionpane
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택
		//
		// 벽돌

		// Date name = new Date();
		// name = new Date();

		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다.
		// CPU는 모든 부품을 RAM에 가져다놓고 조립한다
		// Date date; => 저장된 타입 변수명;(선언)
		// 선언: RAM에 저장공간을 만드는것
		Date date = new Date();

		// Random r = new Random();
		//		
		// Scanner sc = new Scanner(System.in);

		int hour = date.getHours(); // 10
		System.out.println("현재 시각은" + hour + "시");

		// 함수는 반환이 있는 것이 있고, 없는 것이 있다.
		// 반환을 return 이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		
		
		
		System.out.println(date.getMinutes());
		// System.out.println(System.out.println());
		// 반환이 없는 경우에는 void 라고 써있다. void는 없다 라는 의미 이다.

		int month = date.getMonth() + 1;
		// if ( 3<= month && month <= 5) {}
		String result = "해당 계절이 없습니다/";
		if (month == 3 || month == 4 || month == 5) {
		} else if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		} 
		System.out.println(result);
		System.out.println("============");
	
	
		int day =date.getDay(); // 요일
		
		if (day == 0 || day == 6) {
			
			System.out.println("주말에는 놀아요");
			
		} else {
			System.out.println("주중에는 달려요");

		}
		
		while (true) {
			
			System.out.println("달려요!! 달려요!!");//1
			System.out.println("또 달려요!!");//2
			System.out.println("마지막달려요");//3
			
			break;
			
		}
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			
			break;

		default: //else
			
			System.out.println("겨울");
			break;
		}
		
		
		// 2월은 28일까지 3,5,7,8,10,12월은 31일까지 나머지는 30일까지
		// 정수(int), 문자 한글자, Stringd만 된다.
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
			
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지");
			break;

		default:
			
			System.out.println("30일까지");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}


