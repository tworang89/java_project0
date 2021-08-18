package 컬렉션;

import java.util.ArrayList;

public class 시험일정 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		
		System.out.println("전체시험볼목록: "+list);
		System.out.println("---------------------------------------");
		list.remove(0);
		System.out.println("1일차 시험 본 후 남은 과목: "+list);
		System.out.println("---------------------------------------");
		list.remove(0);
		System.out.println("2일차 시험 본 후 남은 과목: "+list);
		System.out.println("---------------------------------------");
		list.remove(0);
		System.out.println("3일차 시험 본 후 남은 과목: "+list);
		System.out.println("---------------------------------------");
		
		
		
		
		

	}

}
