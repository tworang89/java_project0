package 파일시스템;

import java.io.File;
import java.util.Iterator;

public class 파일다루기2 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		
		String [] list1 = file.list();
		
		for (String x : list1) {
			
			System.out.println(x);
			
		} //목록만 알고 싶을때
		
		File[] list2 = file.listFiles();
		
		for (File f : list2) {
			
			System.out.println(f);
			System.out.println(f.isDirectory());
			
		}// 상세하게 무엇인지 알고 싶을때
		
		System.out.println(list2.length+"개");
		
		boolean result = file.exists();
		if (result) {

			System.out.println("파일이나 폴더가 존재함");
			System.out.println(file.getAbsolutePath());

		} else {

			System.out.println("파일이나 폴더가 존재하지 않음");

		}

		if (file.isDirectory()) {

			System.out.println("이것은 폴더 입니다.!!");

		} else {
			System.out.println("이걸은 파일입니다!");
		}

		File[] list = file.listFiles();
		System.out.println("총 파일이나 폴더의 갯수는: "+list.length+"개");

//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//			System.out.println("총 파일이나 폴더의 갯수는: "+i+"개");
//
//		}

	} // 클래스
} // 메인
