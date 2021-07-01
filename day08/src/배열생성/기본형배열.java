package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		
		// int[] 변수명 : int로 만들어진 배열을 가르키는 주소가 변수명에 들어간다는 의미
		
		int[] s = new int[10];
		double[] s2 = new double[5];
		//char[] s3 = new char[100];
		String[] s3 = new String[100];
		
		
		System.out.println(s);
		System.out.println(s2[0]);
		System.out.println(s3);
		System.out.println(s3[0]);

	}

}
