package 메서드반환값;

import java.util.Date;
import java.util.Random;

public class 다양한리턴2 {

//	다양한리턴사용2 r2 = new 다양한리턴사용2();
//	int result2 = r2.get(100); //result1 = 200
//	double result2 = r2.get(); //result2 = 11.11
//	int[] result3 = r2.get(); // {10,20,30,40,50};
//	for (int x : result3) {
//		System.out.println(x); // 10,20,30,40,50
//	}
//	
//	Random rd = r2.get3();
//	System.out.println(rd.nextInt());

	public int get(int x) {// double, float, long
		

		return x+100;

	}

	public double get() {// float, double

		return 11.11;

	}


	

	public int[] get2() {
		int[] num = { 10, 20, 30, 40, 50 };
		return num;

	}
	
	public Random get3() {
		
//		Random r = null; //초기화 시켜주지 않으면 쓰레기값.
		Random r = new Random();
		return r;
		
		
	}
	
	


}
