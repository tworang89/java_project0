package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		
		int yes = 0;
		int no = 0;
		
		
		
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가고픈가요?(배고프면 1번, 안고프면 2번)1");
			
			switch (reply) {
			case "1":
				
				yes++;
				
				break;
				
			case "2":
				
				no++;
					
					break;

			default:
				
				JOptionPane.showMessageDialog(null, "1,2중에 선택해주세요");
				i--;
				break;
			}
			
			
			
		}//for
		System.out.println("배고픈사람"+ yes + "명");
		System.out.println("안배고픈사람"+ no + "명");
	

	}

}
