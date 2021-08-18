package 생성자;

public class MemberBag {
	
	String id;
	String pw;
	String name;
	String tel;
	
	
	public MemberBag(String id, String pw, String name, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}

	public String toString() {
		return "회원가입 [아이디=" + id + ", 패스워드=" + pw + ", 이름=" + name + ", 전화번호=" + tel + "]";
	}
	
	
	
	
	
	

}
