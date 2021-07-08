package 클래스사용;

import 클래스생성.Phone;

public class 전화기를만들어생성해보자 {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.color= "검은색";
		p.size = 11;
		System.out.println("전화기의색: "+p.color);
		System.out.println("전화기의크기: "+p.size);
		
		p.text();
		

	}

}
