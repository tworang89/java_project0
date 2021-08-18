package 생성자;

public class 휴대폰 {
	
	String telecom ;
	int tel;
	String who;
	
	
	public 휴대폰(String t1 , int t2 ,String w) {
		
		telecom = t1;
		tel = t2;
		who = w;
		
	}
	
public String toString() {
	return "휴대폰 [telecom=" + telecom + ", tel=" + tel + ", who=" + who + "]";
}
}
