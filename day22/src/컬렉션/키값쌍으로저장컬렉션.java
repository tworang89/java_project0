package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렉션 {

	public static void main(String[] args) {
		
		//쌍으로 값을 넣는다 타입은 상관이 없다.
		
		HashMap dic = new HashMap();
		
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("멜론", "melon");
		
		//       키   ,   값  
		//키는 중복될수 없다. 유니크
		//값은 중복될수 있다
		
		System.out.println(dic);
		
//		dic.clear();
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		
		dic.put("사과", "blueapple");
		
		System.out.println(dic.get("사과"));
		dic.remove("멜론");
		System.out.println(dic);
		

	}

}
