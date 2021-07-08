package 클래스생성;

public class Car {

	// 전역변수 (glibal, 글로벌 변수)
	// 성질: 색(Color), 바퀴수(count)

	public String color; // 자동초기화 null
	public int count; // 자동초기화 0
	// 동작

	public static void run() {

		System.out.println("네 바퀴로 달리다.");

	}

	public static void up() {

		System.out.println("속도를 20씩 빨라진다");

	}

}