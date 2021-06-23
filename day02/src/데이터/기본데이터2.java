package 데이터;

public class 기본데이터2 {

	public static void main(String[] args) {
		
		//예약어는 저장공간의 공간을 쓸 수 없다
		// char, int, class
		// 1. 선언
		// color = 'ㅅ'
		
				char color; 
				int num;
				double avgAge; //낙타(카멜)표기법, avg_age(파이썬, 뱀표기법)
				
				//2. 할당, 대입
				color = 'r';
				num = 709;
				avgAge = 27.5;
				//변수(variable, 값이 변한다): 램에 저장 공간에 들어갈 값은 변할수있다.
				//램에 만들어지는 저장공간을 변수라고 한다.
				
				color = 'b';
				//변수하나에는 값이 하나만 저장된다.
				
				//예약어는 저장공간의 공간을 쓸 수 없다.
				
				// 3. 출력(프린트)
				System.out.println("색은: " + color); //결합연산자
				System.out.println("방번호는: " + num + "호");
				System.out.println("평균나이는: " + avgAge);
				//한 줄 복사: ctrl + alt + 화살표아래
				//한 줄 이동: alt + 이동방향화살표
				//한 줄 삭제: ctrl + d
				

	}

}
