package 배열생성;

public class 기본형배열생성문제풀이0 {

	public static void main(String[] args) {
		//
		// 1. int 크기 5인 배열을 생성 해보세요.
		//
		// 2. 배열의 크기를 프린트 해보세요.
		//
		// 3. 배열의 첫번째 위치에 100을 넣어보세요, 프린트
		//
		// 4. 배열의 마지막 위치 500을 넣어서 , 프린트
		//
		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		//
		// 6. 배열의 전체 데이터를 프린트
		//
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		//
		// 8. 이것을 그림으로 그려보세요

		int[] s = new int[5];

		System.out.println("배열의 크기"  + s.length );
		
		s[0] = 100;
		System.out.println("첫번째 위치"+s[0]);
		
		s[4] = 500;
		System.out.println("마지막 위치"+s[4]);
		
		s[2] = 200;
		System.out.println("세번째 위치"+s[2]);
		
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.print(s[i]+" ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println( "인덱스: " + i + " 값: " + s[i] );
			
		}


		}

	}


