package 클래스사용;

import javax.swing.JOptionPane;

public class 회원로그인처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id =JOptionPane.showInputDialog("아이디 입력: ");
		String pw =JOptionPane.showInputDialog("패스워드 입력: ");
		String name =JOptionPane.showInputDialog("이름 입력: ");
		String tel =JOptionPane.showInputDialog("전화번호 입력: ");
		
		membersDB db = new membersDB();
		
		db.login(id, pw);
		
		db.create(id, pw, name, tel);
		
		
		
		
		
		
	

	}

}
