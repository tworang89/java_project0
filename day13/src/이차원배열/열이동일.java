package 이차원배열;

public class 열이동일 {

	public static void main(String[] args) {

		int[][] n2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행의 개수:  " + n1.length);
		System.out.println("0행의 배열의 열의 개수:  " + n1[0].length);
		System.out.println("0행의 배열의 열의 개수:  " + n1[1].length);
		System.out.println("0행의 배열의 열의 개수:  " + n1[2].length);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[0].length; j++) {
				System.out.println(n1[i][j] + " ");
			}

			System.out.println();
		}
		
		// 2. 배열 처음에 만들 때 값을 모르고 있는 경우
		// 2-1) 1차원 배열을 만들어라.
		// 2-2) 1차원 배열을 2차워 배열의 각 행에 끼워 넣어라
		
		int[][] n2 =new int [3][];
		int[] r0 = new int [10];
		int[] r1 = new int [15];
		int[] r2 = new int [12];
		for (int i = 0; i < r2.length; i++) {
			for (int j = 0; j <n2[i].length; j++) {
				System.out.println(n2[i]+n2[j]);
			}
			
		}
		
		

	}

}
