package 클래스사용;

import javax.swing.JOptionPane;

public class 회원가입처리 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id =JOptionPane.showInputDialog("아이디 입력: ");
		String pw =JOptionPane.showInputDialog("패스워드 입력: ");
		
		membersDB db = new membersDB();
		
		db.create(id, pw, id, pw);
		
		
		

	}

}
