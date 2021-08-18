package ui;

import javax.swing.JOptionPane;

import db.게시판DAO;
import db.회원DAO;
import db.회원DAO2;
import dto.게시판bag;
import dto.회원bag;

public class 게시판UI {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("id입력");
		String writer = JOptionPane.showInputDialog("작성자입력");
		String title = JOptionPane.showInputDialog("제목입력");
		String content = JOptionPane.showInputDialog("게시글입력");
		
		게시판DAO dao = new 게시판DAO();
		게시판bag bag = new 게시판bag();
		
		bag.setId(id);
		bag.setTitle(title);
		bag.setWriter(writer);
		bag.setContent(content);
		
		dao.create(bag);
		
		

	}

}
