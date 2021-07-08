package 알고리즘;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class 가변적인다양한타입2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		// 많은양의 데이터를 다룰때, 가변 다양한 데이터인 경우 사용

		list.add("1위: 김연아");
		list.add("2위: 김영아");
		list.add("3위: 김양아");
		list.add("4위: 김용아");

//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));

		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		
		System.out.println("====================");
		
		list.remove(3); // 5번 인덱스를 지워라!

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}


	}

}
