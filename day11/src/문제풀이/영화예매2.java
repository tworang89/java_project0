package 문제풀이;

import java.util.Scanner;

public class 영화예매2 {

	public static void main(String[] args) {
		
		
		while(true) {
		System.out.println("-------------------");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i+"  ");
			
		}
		
		System.out.println();
		
		System.out.println("------------------");
		
		int[] seat = new int[10];
		
		//{0,0,0,0,0,0,0,0,0,..}
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int i = 0; i < seat.length; i++) {
			
			System.out.println(seat[i] + "  ");
			
		}
		System.out.println();
		System.out.print("원하시는 자리 번호 입력(종료-1)");
		
		
		int no = sc.nextInt(); // 0번 입력
		
		if (no == -1) {
			
			
			System.out.println("예약시스템을 종료합니다.");
			int total = count * MONEY;
			System.exit(0);
			
		}
		//예약처리하기 전에 이미 그 자리가 예약된 자리 인지 확인! 해야함.
		//확인방법을 정해봅시다.
		//
		
		//0번을 입력헀으면 배열의 인덱스 0번 자리를 1로 변경해서 
		//예약되었다는 것을 저장해두자.
		if(seat[no] != 1) {
		seat[no] = 1;
		
		
		System.out.println(no + "번 예약완료");
		}else {
			System.out.println("이미 예약된 자리 입니다.");
			System.out.println("다른 자리를 선택해주세요.");
		}
		
		System.out.println();
		sc.close();
		}
		
		
		
		//예약된 자리를 배열에 1이 들어간 개수를 세어도 구할수있음
		//지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요.
		//{1,1,1,1,0,0,0,0,....}
		
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
		
							
			
			if(seat[i]==1) {
				
				
				count2++;
				
			}
			
		}
			
		
		
		System.out.println(count2+"자리 예약됨");
		
		//2. 1로 예약된 자리가 어디인지 프린트
		
		
		String sum = "  ";
		for (int i = 0; i < args.length; i++) {
			
			if (seat[i] == 1) {
				
				sum = sum + i + "번" ;
				
			}
			
		}
		
		System.out.println("예약된 자리 목록:    "+sum);

	}

}
