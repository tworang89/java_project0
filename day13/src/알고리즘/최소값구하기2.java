package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 최소값구하기2 {

	public static void main(String[] args) {

		// 1~1000까지의 값을 랜덤하게 10000개 만들어서
		// 1. 최소값을 찾아보세요
		// 2. 개수를 세어보세요
		// 3. 위치값을 찾아보세요

		Random r = new Random(100);
		int[] s = new int[10000];

		

		for (int i = 0; i < s.length; i = i + 1) {

			s[i] = r.nextInt(1000) + 1;

		}

		int min = s[0];
		int count = 0;

		String result = "";

		for (int i = 1; i < s.length; i++) {

			if (s[i] < min) {
				
				min = s[i];

				count++;
				result += i + " ";

			}

		}

		System.out.println("최소값은 총" + min + "개");
		System.out.println("위치값은 " + count + "입니다");
		System.out.println(result);
		
		
		Arrays.sort(s);
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
		
		
		

	}

}
