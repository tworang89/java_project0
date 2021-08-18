package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제02 {

	 public static void main(String[] args) {
	      // 1. HashMap을 이용하여 예약된 이름과 백신을 출력하세요.
	      // ("홍길동", "얀센"), ("정길동", "모더나"), ("김길동", "화이자")
	      // * 각 과정의 처리 후 잘 처리가 되었는지 명단을 출력해 확인하세요.
	      // 2. 박길동을 AZ 접종 예약을 추가하세요.
	      // 3. 김길동의 예약을 모더나로 변경하세요.
	      // 4. 정길동의 예약을 취소하세요.
	      // 5. 마지막에 시스템을 종료하세요.
	      HashMap<String, String> vaccine = new HashMap<>();
	      vaccine.put("홍길동", "얀센");
	      vaccine.put("정길동", "모더나");
	      vaccine.put("김길동", "화이자");
	      Scanner sc = new Scanner(System.in);
	      while (true) {
	         System.out.println("--------------------------");
	         System.out.println("1. 예약 리스트 출력 ");
	         System.out.println("2. 신규 예약 ");
	         System.out.println("3. 예약 변경 ");
	         System.out.println("4. 예약 취소 ");
	         System.out.println("9. 예약 종료 ");
	         System.out.print("메뉴를 선택하시오 >> ");
	         int choice = sc.nextInt();
	         if (choice == 9) {
	            System.out.println("시스템을 종료합니다.");
	            break;
	         }else if (choice == 1) { 
	            System.out.println("예약 리스트: " + vaccine);
	            System.out.println();
	         }else if (choice == 2) { 
	            System.out.print("백신 접종자의 이름을 입력해주세요. >> ");
	            String add1 = sc.next();
	            System.out.print("접종할 백신을 입력해주세요. >> ");
	            String add2 = sc.next();
	            int size1 = vaccine.size();
	            vaccine.put(add1, add2);
	            int size2 = vaccine.size();
	            if (size2 > size1) {
	               System.out.println("백신 예약이 완료 되었습니다.");
	            }
	            System.out.println("예약 리스트: " + vaccine); // 목록 확인할 경우 사용
	            System.out.println();
	         }else if (choice == 3) { 
	            System.out.println("변경할 예약자를 골라주세요.");
	            System.out.println("예약 리스트: " + vaccine);
	            System.out.print("변경할 예약자의 이름을 입력해주세요 >> ");
	            String name = sc.next();
	            System.out.print("변경할 백신 종류를 입력해주세요 >> ");
	            String tel = sc.next();
	            vaccine.put(name, tel);
	            System.out.println("예약 리스트: " + vaccine);
	            System.out.println();
	         }else if (choice == 4) { 
	            System.out.println("취소할 예약자를 골라주세요.");
	            System.out.println("예약 리스트: " + vaccine);
	            System.out.print("취소할 예약자의 이름을 입력해주세요. >> ");
	            String name = sc.next();
	            vaccine.remove(name);
	            if (!vaccine.containsKey(name)) {
	               System.out.println("취소가 완료되었습니다.");
	            }
	            System.out.println("친구 목록: " + vaccine);
	            System.out.println();
	         }else { 
	            JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요");
	            System.out.println();
	         }
	      }
	      sc.close();
	   }


}
