package 클래스사용;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) {
		
		
		membersDB db = new membersDB();
		
		String id = JOptionPane.showInputDialog("아이디 입력: ");
		
		
		db.delete(id);

	}

}
