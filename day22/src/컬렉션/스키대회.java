package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class 스키대회 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");

		System.out.println("1등 " + list.get(0));
		System.out.println("2등 " + list.get(1));
		System.out.println("3등 " + list.get(2));
		System.out.println("4등 " + list.get(3));

		System.out.println("-----------------------------");

		list.remove(1);
		System.out.println("2등이 반칙으로 탈락!!");

		System.out.println("-----------------------------");

		System.out.println("1등 " + list.get(0));
		System.out.println("2등 " + list.get(1));
		System.out.println("3등 " + list.get(2));

		System.out.println("-----------------------------");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(i + 1 + "등: " + list.get(i));

		}

		System.out.println("-----------------------------");

		for (Object o : list) {

			System.out.println(o);

		}

	}

}
