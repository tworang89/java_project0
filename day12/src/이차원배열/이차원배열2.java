package 이차원배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][];
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		
		//      0   1  2  2  4
		//0     0   0  0  0  0
		//1     0   0  0  0  0
		//2     0   0  0  0  0
		
		System.out.println(arrList.length);

	}

}
