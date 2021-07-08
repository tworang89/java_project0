package 알고리즘;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		// 많은양의 데이터를 다룰때, 가변 다양한 데이터인 경우 사용

		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");

		Random r = new Random();

		list.add(r);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));

		}

		list.remove(5); // 5번 인덱스를 지워라!

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));

		}

	}

}
