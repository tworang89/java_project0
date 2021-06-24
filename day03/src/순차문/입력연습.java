package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		
	
		
    String name;
    name=JOptionPane.showInputDialog(" 당신의 이름을 입력하세요. ");
		//JOptionPane.showInputDialog( name + "님 안녕히가세요." );
	
		JOptionPane.showMessageDialog(null, name + "님 안녕히가세요");
		
		String name2;
		name2=JOptionPane.showInputDialog( "당신이 있는 강의실 호수는?" );
		JOptionPane.showInputDialog("당신은" + name2 + "호에있습니다.");
		
	
		
		String name3;
	name3=JOptionPane.showInputDialog("당신의 점심 메뉴는?");
	JOptionPane.showInputDialog("당신은" + name3 + "을먹는군요");
	
	

	

	}

}
