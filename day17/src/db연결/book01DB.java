package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class book01DB {


	public int create(String bookid, String bookname, String writer, String genre, String price, String sold)
			throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		String sql = "insert into book values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookid);
		ps.setString(2, bookname);
		ps.setString(3, writer);
		ps.setString(4, genre);
		ps.setString(5, price);
		ps.setString(6, sold);
		System.out.println("3. sql문 생성 성공!!");
		//int result = 1;
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);
		return result;

	} 

	public int update(String id, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		String sql = "update book set tel = ? where bookid ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);

		return result;
	}

	public int delete(String bookid) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
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

} // class end
