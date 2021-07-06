package 문제풀이;

public class 문제풀이02 {

	public static void main(String[] args) {
		// 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" }
		// 1학기 성적 = { 44, 66, 22, 99, 100 }
		// 배열의 깊은 복사 이용
		// 2학기 성적 = {22, 66, 88, 99, 100}
		
		// 0)전체 1학기, 2학기 성적 프린트
		// 1) 1학기, 2학기 성적중 동일한 성적과목수
		// 2) 1학기, 2학기 성적중 오른 과목수
		// 3) 1학기, 2학기 성적 중 오픈 과목명
		
		
		String[] subject = {"컴퓨터", "국어", "수학", "영어", "체육"};
		
		int[] term1 = {44,66,22,99,100};
		
		int[] term2 = term1.clone();
		
		term2[0] = 22;
		term2[2] = 88;
		int count1 = 0;
		
		for (int x : term1) {
			
			System.out.print(x+" ");
			
			}
		
		System.out.println();
		
		for (int y : term1) {
			
			System.out.print(y+"  ");
			
		}
		
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < term2.length; i++) {
			
			if (term1[i] == term2[i]) {
				
				count++;
				
			}
			
		}
		
		System.out.println("1) 1학기, 2학기 성적중 동일한 성적과목수: "+count);
		
		int count2 = 0;
		int location= -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]<term2[i]) {
				count2++;
				location = i;
				
			}
			
		}
		
		System.out.println("2) 1학기, 2학기 성적중 오른 과목수: "+count2);
		
		if (location != -1) {
			System.out.println("3) 1학기, 2학기 성적 중 오픈 과목명: "+subject[location]);
			
		}
			
			
		
		
		
			
		}

		
		
		
		
		
	}


