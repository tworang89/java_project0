package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		
		
		String jemok = JOptionPane.showInputDialog("제목을 입력하세요");
		
		
		BbsDb db = new BbsDb();
		
		
		db.delete(jemok);
		

	}
	

}
