package pay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PayDAO {

	public int create(String memid, String bookid, int qty) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. 커넥터 연결 성공");

		String url = "jdbc:mysql://localhost:3306/bookstore"; // database url (ip : port / db)
		String username = "root"; // 관리자 id
		String password = "1234"; // 관리자 pw 
		Connection con = DriverManager.getConnection(url, username, password); // db 연결
		System.out.println("2. bookstore db 연결 성공");

		String sql = "insert into pay values (null, ?, ?, ?)"; // sql문 작성
		PreparedStatement ps = con.prepareStatement(sql); // sql을 나타내는 부품
		// sql문 value 속 ? 마다 지정
		ps.setString(1, memid);
		ps.setString(2, bookid);
		ps.setInt(3, qty);
		System.out.println("3. create-pay sql문 생성 성공");

		int result = ps.executeUpdate(); // sql문 전송 결과 result에 저장
		System.out.println("4. create-pay sql문 전송 성공");
		return result; // result값 return
	} // create
	

	public ArrayList readPay() throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. 커넥터 연결 성공");
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db 연결 성공");
		String sql = "select qty from pay order by qty desc limit 1"; // qty 기준 가장 최근값 가져오기
		String sql2 = "select payid from pay order by payid desc limit 1"; // payid 기준 가장 최근값 가져오기
		PreparedStatement ps = con.prepareStatement(sql);
		PreparedStatement ps2 = con.prepareStatement(sql2);
		System.out.println("3. read-pay sql문 생성 성공");
		ResultSet rs = ps.executeQuery();
		ResultSet rs2 = ps2.executeQuery();
		System.out.println("4. read-book sql문 전송 성공");
		ArrayList list = new ArrayList();
		if (rs.next()) {
			int qty = rs.getInt(1);
			list.add(qty); // 0 구매수량
		}
		if (rs2.next()) {
			int payid = rs2.getInt(1);
			list.add(payid); // 1 payid
		}
		System.out.println("5. read-pay 데이터 ArrayList에 저장 성공");
		return list;
	} // readPay

	
	
	
	public int update(String bookid, int sold) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. 커넥터 연결 성공");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "atempause26";
		Connection con = DriverManager.getConnection(url, username, password); // bookstore DB 접속
		System.out.println("2. bookstore db 접속 성공");

		String sql = "update book set sold = sold+? where bookid = ?"; // sql문 작성 (구매할 때마다 해당 bookid의 sold값 구매수량만큼 증가
		PreparedStatement ps = con.prepareStatement(sql); // sql문 부품
		ps.setInt(1, sold);
		ps.setString(2, bookid);
		System.out.println("3. update-book sql문 생성 성공");

		int result = ps.executeUpdate(); // sql문 전송
		System.out.println("4. update-book sql문 전송 성공");
		return result;
	} // update


	
	public int deletePayB(String bookid) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//		Class.forName("com.mysql.jdbc.Driver"); // window용
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "atempause26";
		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "delete from pay where bookid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookid);
		int result = ps.executeUpdate();
		return result;
	}
	
	
	public int deletePayM(String memid) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//		Class.forName("com.mysql.jdbc.Driver"); // window용
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "atempause26";
		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "delete from pay where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		int result = ps.executeUpdate();
		return result;
	}
	
	
	public ArrayList readBook(String bookid) throws Exception {
		// 커넥터 설정
		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. 커넥터 연결 성공");
		// db 접속
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "atempause26";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db접속 성공");
		// sql문 생성
		String sql = "select bookname, writer, genre, price, img from book where bookid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bookid);
		System.out.println("3. read-book sql문 생성 성공");
		// sql문 전송
		ResultSet rs = ps.executeQuery(); // 데이터를 담을 resultset 만들기
		System.out.println("4. read-book sql문 전송 성공");
		ArrayList list = new ArrayList();
		if (rs.next()) {
			String bookname = rs.getString(1);
			String writer = rs.getString(2);
			String genre = rs.getString(3);
			int price = rs.getInt(4);
			String img = rs.getString(5);
			list.add(bookname); // 0
			list.add(writer); // 1
			list.add(genre); // 2
			list.add(price); // 3
			list.add(img); // 4
		}
		System.out.println("5. read-pay 데이터 ArrayList에 저장 성공");
		return list;
	} // readBook


	
	
	public ArrayList readMem(String memid) throws Exception {
		// 커넥터 연결
		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1. 커넥터 연결 성공");
		// db 연결
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "atempause26";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db접속 성공");
		// sql문 생성
		String sql = "select name, tel, addr from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		System.out.println("3. read-mem sql문 생성 성공");
		// sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. read-mem sql문 전송 성공");
		ArrayList list = new ArrayList();
		if (rs.next()) {
			String name = rs.getString(1);
			String tel = rs.getString(2);
			String addr = rs.getString(3);
			list.add(name); // 0
			list.add(tel); // 1
			list.add(addr); // 2
		}
		System.out.println("5. read-mem 데이터 ArrayList에 저장 성공");
		return list;

	} // readMem

}
