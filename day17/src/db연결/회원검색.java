package db연결;

import javax.swing.JOptionPane;

public class 회원검색 {

	public static void main(String[] args) throws Exception {
		
//		String sql = "delete from member where id = 'apple' "
		
		
		String id =JOptionPane.showInputDialog("검색할 아이디 입력: ");
		
		MemberDB db = new MemberDB();
		
		db.read(id);
		
		
		

	}

}
