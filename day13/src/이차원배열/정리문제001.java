package 이차원배열;

import java.util.Random;

public class 정리문제001 {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		int[][] r1 = new int[4][5];
		

		for (int i = 0; i < r1.length; i++) {
			for (int j = 0; j < r1[i].length; j++) {
				
				r1[i][j]=r.nextInt(100);
				System.out.print(r1[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
