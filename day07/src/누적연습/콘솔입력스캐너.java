package 누적연습;

//패키지가 java.utill.a.Test;
import java.util.Scanner;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하시오. →");

		String name = sc.next(); 
		// String 입력, 여러글자를 받을 수 있다.
		// next는 단어를 가져오기 때문에 공백이 생기면 인식하지 못한다.

		System.out.println("당신의 이름은" + name);
		
		System.out.print("당신의 소속을 입력하시오. →");
		String com = sc.next();
		System.out.println("당신의 소속은"+com);

	}

}
