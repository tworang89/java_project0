package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		// 우동이면 일식집, 짜장이면 중국집, 아니면 집에서

		String food = "떡볶이";

		switch (food) {
		case "떡볶이":

			System.out.println("분식집으로");

			break;
		case "우동":

			System.out.println("일식집으로");

			break;
		case "짜장면":

			System.out.println("중국집으로");

			break;

		default:

			System.out.println("집에서");

			break;

		}

		String sn = "980201-1037514";

		char gender = sn.charAt(7); // '1'
		// switch~case
		// if~else : char는 기본데이터이기 때문에 비교연산자 사용 가능

		switch (gender) {
		case '1':
		case '3':

			System.out.println("남자");

			break;

		case '2':
		case '4':

			System.out.println("여자");

			break;

		default:

			System.out.println("잘못입력하셨어요");
			break;
		}

		if (gender == '1' || gender == '3') {

			System.out.println("남자");

		}
		else if ( gender == '2' || gender ==  '4') {
			
			
			System.out.println("여자");
			
		}
		
		
		
		
		else {

			System.out.println("잘못입력하셨어요.");

		}

	}

}
