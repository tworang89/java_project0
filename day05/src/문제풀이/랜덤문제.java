package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {

		Random n1 = new Random();
		
		Random n2 = new Random();
		
		int t1 = n1.nextInt(1000);
		System.out.println(t1);
		int t2 = n2.nextInt(1000);
		System.out.println(t2);

	if (t1 > t2) {
		
		JOptionPane.showMessageDialog(null, "첫번째가 더 커요");
		
	} else {
		
		JOptionPane.showMessageDialog(null, "두번째가 더 커요");

	}
		

		}

	}


