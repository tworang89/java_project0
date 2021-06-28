package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1. 입력

		int jumsu = 66;

		// 2. 처리

		String result = null; // 선언: 램에 공간이 할당
		// 처음에 공간을 할당할때 쓰레기 값이 들어있는 공간이 할당됨.
		// 쓰레기 값은 프린트도 안되고, 연산도 불가능
		// 공간을 깨끗하는 작업을 처음에 초기에 해두는것이 좋다.
		// 변수의 초기화

		// System.out.println(result);

		if (jumsu >= 90) {

			result = "A학점";

		} else if (jumsu >= 80) {

			result = "B학점";
		}

		else if (jumsu >= 70) {

			result = "C학점";
		}

		else {
			result = "F학점";

		}
		System.out.println("당신의 학점은"+result);
		// 3. 출력

	}

}
