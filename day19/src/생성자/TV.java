package 생성자;

public class TV {
	String color;
	int price;
	//클래스 이름과 동일한 메서드를 생성자라고 부르고
	//파라메터 없는 생성자는 기본 생성자 
	//기본 생성자는 자동으로 만들어진다.
	//묵시적으로 생성 된다.
//	public TV() {
//		//객체생성할때마다 무엇을 하고 싶은 경우
//		//클래스 이름과 동일한 이름을 가진
//		//메소드를 만들어 주면 자동호출 되어
//		//객체 생성 할때 마다 특정한 기능을 처리하게 할 수 있다.
//		
//		System.out.println("객체 하나 만들어짐");
//	}
	public TV(String c, int p) {
		
		color = c;
		price = p;
		
	}
	
	public String toString() {
		return color + ", " + price ;
	}
	
}
