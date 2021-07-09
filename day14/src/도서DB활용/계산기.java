package 도서DB활용;

public class 계산기 {
	
	
	public void order(String food) {
		
		System.out.println("당신이 주문한 것은"+food+"입니다.");
		
	}
	
	//사칙연산 계산기
	
	public void 더하기(int price, int count) {
		System.out.println("더하기 기능 처리내용 구현");
		int result = price + count;
		System.out.println("두 수의 더하기의 결과는 :"+result);
	}
	
	public void 빼기(int price1, int count1){
		
		System.out.println("빼기 기능 처리내용 구현");
		int result1 = price1 - count1;
		System.out.println("두 수의 뺴기의 결과는 :" + result1);
		
	}
	public void 곱하기(int price2, int count2) {
		
		
		System.out.println("곱하기 기능 처리내용 구현");
		int result2 = price2 * count2;
		System.out.println("두 수의 곱의 결과는 :" + result2);
		
	}
	public void 나누기(double sum1, double sum2) {
		
		
		System.out.println("나누기 기능 처리내용 구현");
		double result3 = sum1 / sum2;
		System.out.println("두 수의 나누기의 결과는 :" + result3);
		
	}

}
