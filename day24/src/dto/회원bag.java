package dto;

public class 회원bag {
	//public String id; // 모든 패키지에서 접근 가능
	String id; //default 접근제어자, 같은 패키지내에서
	String pw;
	String name;
	String tel; //String tel = nill;
	//멤버변수, 클래스 바로 아래 선언됨.
	//선언의 위치는 생존범위를 결정 => 클래스 전역에서 사용에서
	//전역변수(global, 글로벌 변수), 자동 초기화 됨.
	//참조형인 경우, null로 초기화됨.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//값을 넣을 때는 set 변수명(), setId() 대문자
	//값을 꺼낼 때는 get 변수명(), getId() 대문자
	//getters / setters

}
