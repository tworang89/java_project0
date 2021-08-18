package 생성자;

public class 컴퓨터 {

	int num;
	String name;
	int num2;

	public 컴퓨터(int n, String n1, int n2) {
		num = n;
		name = n1;
		num2 = n2;

	}

	public String toString() {
		return "컴퓨터 [가격=" + num + ", 제조회사=" + name + ", 모니터크기=" + num2 + "]";
	}

}
