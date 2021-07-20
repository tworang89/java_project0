package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {

	public int create(String memid, String pw, String name, String tel, String addr) throws Exception {

//		회원가입 메서드
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1.connector연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db연결 성공!!!");

		String sql = "insert into member values (?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		ps.setString(5, addr);
		System.out.println("3. sql문 생성 성공!!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
	}

	public int update(String memid, String[] all) throws Exception {
//		회원정보 수정 메서드
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1.connector연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db연결 성공!!!");
		int result = 0;

		if (!all[0].equals("")) {
			String sql = "update member set pw = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, all[0]);
			ps.setString(2, memid);
			result += ps.executeUpdate();
		}
		if (!all[1].equals("")) {
			String sql = "update member set name = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, all[1]);
			ps.setString(2, memid);
			result += ps.executeUpdate();
		}
		if (!all[2].equals("")) {
			String sql = "update member set tel = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, all[2]);
			ps.setString(2, memid);
			result += ps.executeUpdate();
		}
		if (!all[3].equals("")) {
			String sql = "update member set addr = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, all[3]);
			ps.setString(2, memid);
			result += ps.executeUpdate();
		}
		System.out.println("3. sql문 생성 성공!!!");
		// 4.sql문을 mysql로 전송한다.
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
	}

	public int delete(String memid) throws Exception {
//		회원 탈퇴 메서드
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1.connector연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db연결 성공!!!");
		String sql = "delete from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
//		System.out.println(result);
		return result;
		
	}

	public ArrayList read(String memid) throws Exception {
//		회원 정보 검색 메서드
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1.connector연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/bookstore" + "";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db연결 성공!!!");
		String sql = "select pw, name, tel, addr from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		System.out.println("3. sql문 생성 성공!!!");
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();
		if (rs.next()) {
			String pw = rs.getString(1);
			String name = rs.getString(2);
			String tel = rs.getString(3);
			String addr = rs.getString(4);
			list.add(pw);
			list.add(name);
			list.add(tel);
			list.add(addr);
		}
		System.out.println("4. sql문 전송 전송");
		return list;
	}

	public String read2(String memid) throws Exception {
//		로그인 아이디 비밀번호 비교용 메서드
//		Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
		Class.forName("com.mysql.jdbc.Driver"); // window용
		System.out.println("1.connector연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/bookstore" + "";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. bookstore db연결 성공!!!");
		String sql = "select pw from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		System.out.println("3. sql문 생성 성공!!!");
		ResultSet rs = ps.executeQuery();
		String pw = null;
		if (rs.next()) {
			pw = rs.getString(1);
		}
		System.out.println("4. sql문 전송 전송");
		return pw;
	}
}// class
