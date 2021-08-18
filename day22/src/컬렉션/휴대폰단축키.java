package 컬렉션;

import java.util.HashMap;

public class 휴대폰단축키 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
	
		map.put("1번", "엄마");
		map.put("2번", "아빠");
		map.put("3번", "친구");
		map.put("4번", "동생");
		
		System.out.println("휴대폰 2번 단축기는 누구인가?");
		System.out.println(map.get("2번"));

	}

}
