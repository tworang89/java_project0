package 생성자;

public class 통장 {
	// 멤버변수
	String name;

	String ssn;

	int money;

//	public 통장() {
	// 기본생성자
	// 생성자중에서 입력값이 없는 생서자 -> 기본생성자
	// default constructor
	// 다른생성자가 하나도 없으면 자동 생성
	// 묵시적으로 만들어졌음.

	// }

	public 통장(String name, String ssn, int money) {

		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	// 멤버메서드
	public void 입금하다() {

		System.out.println("입금하다.");

	}

//     오버라이드: 원래 메서드가 있던 것을 똑같은 형태로
	// 정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어 써짐.
	// 위로 올라타다 

	@Override // 오버라이드(재정의)
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	//@ : aliciawill@kkao.com (at, -에)
	// @Override(Annotation, 표시)

}
