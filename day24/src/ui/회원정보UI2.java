package ui;

import javax.swing.JOptionPane;

import db.회원DAO;
import db.회원DAO2;
import dto.회원bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("회원가입id입력");
		String pw = JOptionPane.showInputDialog("회원가입pw입력");
		String name = JOptionPane.showInputDialog("회원가입name입력");
		String tel = JOptionPane.showInputDialog("회원가입tel입력");
		
		
		
		회원DAO2 dao2 = new 회원DAO2();
		회원bag bag = new 회원bag();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		dao2.create(bag);
		System.out.println("dao의 create()하고 연이어 실행됨.");

	}

}
