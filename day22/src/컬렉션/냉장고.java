package 컬렉션;

import java.util.LinkedList;

public class 냉장고 {

	public static void main(String[] args) {
		
		LinkedList queue = new LinkedList();
		
		queue.add("어제 사다놓은 상한 우유");
		queue.add("오늘 사다놓은 싱싱한 우유");
		
		System.out.println("---------------------------------------");
		System.out.println("어제 냉장고에 남은 우유");
		System.out.println(queue);
		System.out.println("---------------------------------------");
		System.out.println("어제 사다놓은 우유를 먼저 먹음");
		System.out.println("---------------------------------------");
		queue.remove(0);
		System.out.println("현재 냉장고에 남은 우유");
		System.out.println(queue);
		System.out.println("---------------------------------------");
	

	}

}
