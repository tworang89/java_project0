package 배열;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		
		
//		String s = "감자,고구마,양파";
//		String[] s2 = s.split(","); // {"감자", "고구마","양파"}
//		System.out.println(s2[0]);
//		System.out.println(s2[1]);
//		System.out.println(s2[2]);
//		System.out.println(s2.length);
//		System.out.println(s2[0].equals(s2[1]));
		
		//일, 월, 화 날씨는 순서대로 적어보세요.(흐림,맑음,흐림)
		//흐림이 몇개인지, 맑음이 몇개인지 세어보세요.
		//1. sc.next()로 받아서
		//2. 스트링을 배열로 변환해서 넣으세요.
		//3. count 해보세요.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일,월,화 날씨를 순서대로 입력해보세요.--");
		String data = sc.next();
		String[] data2 = data.split(",");
		int count1 = 0, count2 =0 ;
		for (int i = 0; i < data2.length; i++) {
			if (data2[i].equals("흐림")) {
				count1++;
				
			}else {
				
				count2++;
				
			}
			
		}
		System.out.println("흐림의 개수"+ count1);
		System.out.println("흐림의 개수"+ count2);
		
		
		
		
		
		
		
		
		
		

	}

}
