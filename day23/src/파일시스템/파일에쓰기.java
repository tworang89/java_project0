package 파일시스템;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {

		try {
			String day = JOptionPane.showInputDialog("날짜입력");
			String title = JOptionPane.showInputDialog("제목입력");
			String content = JOptionPane.showInputDialog("내용입력");
			String we = JOptionPane.showInputDialog("날씨입력");
			// 1. test2.txt 스트링을 file 객체로 만들어 준다.
			// 2. test2.txt 파일고 java 프로그램간에 stream까지 만들어 준다.

			FileWriter file = new FileWriter(day + ".txt");

			// 3. stream으로 데이터를 보내면 된다.

			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
			file.write(we + "\n");
			file.close();
			
			JOptionPane.showMessageDialog(null, "일기가 기록됨");

		} catch (IOException e) {

			System.out.println("파일을 저장하는 동안 에러가 발생 하였습니다.");

		}

	}

}
