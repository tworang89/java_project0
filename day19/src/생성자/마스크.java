package 생성자;

public class 마스크 {
	
	//속성=> 멤버변수
	//색, 가격
	//자동 초기화
	
	String color; //참조형 변수는 null
	int price; //기본형 변수는 0
	//객체생성시 클래스 이름과 동일한것이 있으면
	//자동 호출
	//객체생성시 넣어주어야 하는 처음값을
	//넣어주기 위해 사용.
	
	
	public 마스크(String c, int p) {
		
		color = c;
		price = p;
		
		
	}
	
	
	
	//동작 => 멤버메서드
	public void cover() {
		System.out.println("마스크를 쓰다.");
		
	}
	
	public String toString() {
		
		return color + " " + price;
		
	}

}
