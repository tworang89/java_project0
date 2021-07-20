package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {

//	******** 크게 수정한 부분 ********
//	클래스명 수정 BookDAO.java
//	create: 판매량의 값은 넣지 않기 때문에 0을 기본값으로 들어가게끔 sql문 수정
//	update: 엉뚱한 sql문이 들어가있길래 삭제 (update set book set tel = ? where id = ?)
	
	

	public int create(String bookname, String writer, String genre, String price) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. connector 연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		String sql = "insert into book values (null,?,?,?,?,0, null)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookname);
		ps.setString(2, writer);
		ps.setString(3, genre);
		ps.setString(4, price);
		System.out.println("3. sql문 생성 성공!!");
		// int result = 1;
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);
		return result;

	}

	public int delete(String bookid) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);

		System.out.println("2. db 연결 성공!!");
		String sql = "delete from book where bookid= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookid);
		System.out.println("3. sql문 생성 성공!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);
		return result;
	}

	public ArrayList<String[]> readBook() throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		String sql = "select * from book";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공!!");
		ResultSet rs = ps.executeQuery();
		ArrayList<String[]> list = new ArrayList<>();
		// list = {row1, row2, row3, ....};
		while (rs.next()) {
			String bookid2 = rs.getString(1);
			String bookname = rs.getString(2);
			String writer = rs.getString(3);
			String genre = rs.getString(4);
			String price = rs.getString(5);
			String sold = rs.getString(6);
			String img = rs.getString(7);

			String[] s = new String[7];
			s[0] = bookid2;
			s[1] = bookname;
			s[2] = writer;
			s[3] = genre;
			s[4] = price;
			s[5] = sold;
			s[6] = img;

			list.add(s);
		}
		System.out.println("4. sql문 전송 전송!!");
		return list;

	}

	public String[] readBook(String bookid) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		String sql = "select * from book where bookid =? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookid);
		System.out.println("3. sql문 생성 성공!!");
		ResultSet rs = ps.executeQuery();
		String[] s = new String[7];
		if (rs.next()) {
			String bookid2 = rs.getString(1);
			String bookname = rs.getString(2);
			String writer = rs.getString(3);
			String genre = rs.getString(4);
			String price = rs.getString(5);
			String sold = rs.getString(6);
			String img = rs.getString(7);

			s[0] = bookid2;
			s[1] = bookname;
			s[2] = writer;
			s[3] = genre;
			s[4] = price;
			s[5] = sold;
			s[6] = img;

		}
		System.out.println("4. sql문 전송 전송!!");
		return s;

	}

} // class end
