package 알고리즘;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입3 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add("휴지");
		set.add("휴대폰");
		set.add("볼펜");
		set.add("휴지");
		
		System.out.println("내 가방안에 들어간 물건:"+ set + " 갯수는:"+set.size() +"개");
		
		
		

	}
}
