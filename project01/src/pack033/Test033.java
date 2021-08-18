package pack033;

import java.util.Iterator;
import java.util.Scanner;

public class Test033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("별을 열개 찍어보세요");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("원하는 기호를 넣으세요");
		String s2 = sc.nextLine();
		System.out.println("원하는 횟수를 넣으세요");
		int a1 = sc.nextInt();
		int i = 0;
		
		while (i < a1) {
			i++;
			System.out.print(s2);
			
		}
		
		

	}

}
