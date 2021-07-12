package db연결;

import javax.swing.JOptionPane;

public class 회원수정처리 {

	public static void main(String[] args) throws Exception {
		
//		String sql = "update member set id = ? where id ? ; "
		
		
		String id =JOptionPane.showInputDialog("아이디 입력: ");
		String tel =JOptionPane.showInputDialog("전화번호 입력: ");
		
		MemberDB db = new MemberDB();
		
		db.update(id, tel);
		
		
		

	}

}
