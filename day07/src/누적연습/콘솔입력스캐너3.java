package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		// 나이입력 100세 nextInt()
		// 내년 나이는 101세

		Scanner sc = new Scanner(System.in);
		System.out.print(" 나이를 입력 >> ");
		int y1 = sc.nextInt(); // String -> Int
		System.out.println("내년나이는 " + (y1 + 1) + "세");

		System.out.print("키를 입력 >>");
		double h1 = sc.nextDouble();
		System.out.println("내년 키는" + (h1 + 10));

		System.out.print("저녘을 먹었는지 입력(true/false)");
		boolean food = sc.nextBoolean();

		if (food) {

			System.out.println("배가 부르시겠군요!");

		} else {

			System.out.println("배가 고프시겠군요!");

		}

		System.out.print(" 올해의 목표는 >> ");
		String life = sc.nextLine();
		System.out.println("올해의 목표는" + life + "!!!");

		System.out.println("과목을 입력(자바,C,python)>>");
		String data = sc.next();
		if (data.equals("자바")) {

			System.out.println("JSP점프");

		} else if (data.equals("C++")) {

			System.out.println("ASP점프");

		} else if (data.equals("python")) {

			System.out.println("python점프");

		}

		switch (data) {
		case "자바":

			System.out.println("JSP점프");

			break;

		case "C++":

			System.out.println("ASP점프");

			break;

		default:

			System.out.println("python점프");
			break;
		}

	}

}
