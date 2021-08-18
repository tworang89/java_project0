package 자바심화;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제01 {

	public static void main(String[] args) {
		// 1. Arraylist를 이용하여 물품목록 작성
		// 2. 명령번호 출력, 1번 창고내 물품리스트보기 2번 물품추가 3번 삭제 4번 변경 9번 종료
		// 3. 잘못된 번호 입력시 재입력 하시오 출력
		// 4. 입력 받은 명령 번호대로 물품리스트 전체보기, 물품추가, 물품삭제, 물품수정 
		// 5. 각 명령수행 후 완료 출력
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		list.add("아이폰");
		list.add("아이맥");
		list.add("맥북에어");
		list.add("맥북프로");
		list.add("아이맥프로");
		list.add("에어팟");
		list.add("에어팟프로");
		
		while (true) {
			System.out.println("--------------");
			System.out.println("1. 창고내 재고 물품 리스트 보기");
			System.out.println("2. 물품 추가");
			System.out.println("3. 물품 삭제");
			System.out.println("4. 물품 변경");
			System.out.println("9. 종료");
			System.out.println("수행할 명령 번호를 입력 하시오>>");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템 종료 합니다.");
				break;
				
			}else if (choice == 1) { // 1. 물품 리스트 출력
				System.out.println("총 물품 목록은 " + list);
			}else if (choice == 2) { // 2. 물품 추가
				System.out.println("추가 할 물품명 입력 >> ");
				String name = sc.next();
				
				int size1 = list.size();
				list.add(name);
				int size2 = list.size();
				if (size2 > size1) {
					System.out.println("창고내 물품 추가완료.");
					
				}
			}else if (choice == 3) { // 3. 물품 삭제
				System.out.println("삭제할 물품 번호를 입력하시오..");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
					
				}
				System.out.println("삭제할 물품 번호를 고르시오>> ");
				int no = sc.nextInt();
				String name = list.get(no);
				list.remove(no);
				if (!list.contains(name)) {
					System.out.println("삭제가 완료 되었습니다.");
					
				}
				
			}else if (choice == 4) { // 4. 물품 변경
				System.out.println("수정 할 물품번호를 입력하시오");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
					
				}
				System.out.println("수정 할 번호를 고르시오>> ");
				int index = sc.nextInt();
				System.out.println("수정 할 물품명을 입력하시오>> ");
				String name = sc.next();
				list.set(index, name);
				System.out.println("수정이 완료 되었습니다.");
				
				
			}else {// 1~4, 9도 아닌 경우
				
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요!");
				
			}
		
		
		}
		sc.close();
	}
	
}
