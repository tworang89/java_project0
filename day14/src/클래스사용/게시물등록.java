package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
		
		
		String name = JOptionPane.showInputDialog("게시판명을 입력하세요");
		String jemok = JOptionPane.showInputDialog("제목을 입력하세요");
		String story = JOptionPane.showInputDialog("게시글을 입력하세요");
		
		
		BbsDb db = new BbsDb();
		
		db.create(name, jemok, story);
		
		db.delete(jemok);
		

	}
	

}
