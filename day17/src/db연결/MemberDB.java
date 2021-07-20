package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {

	// 자바에서 db처리할 때는 DML 중심으로 클래스를 만든다.
	// db연결할 때는 db를 단위로 연결한다.
	// db연결하여 데이터처리를 하는 클래스를 만들때는 테이블 단위로 만든다.
	// 테이블(entity,개체)
	// creat(insert~into valies)

	public int create(String id, String pw, String name, String tel) throws Exception {
		// 자바와 db 연결하는 프로그램(JDBC) 순서
		// 1.jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip , port, db명_, username, password

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		// 3. sql문을 만든다.
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공!!");
		// PreparedStatment(String sql)
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.

//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);
		return result;

	} // creat end

	public int update(String id, String tel) throws Exception {
		// 자바와 db 연결하는 프로그램(JDBC) 순서
		// 1.jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip , port, db명_, username, password

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db 연결 성공!!");
		// 3. sql문을 만든다.
		String sql = "update member set tel = ? where id ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공!!");
		// PreparedStatment(String sql)
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.

//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);

	 return result;
	}// creat end

	public int delete(String id) throws Exception {
		// 자바와 db 연결하는 프로그램(JDBC) 순서
		// 1.jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip , port, db명_, username, password

		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);

		System.out.println("2. db 연결 성공!!");
		// 3. sql문을 만든다.
		String sql = "delete from member where id= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!");
		// PreparedStatment(String sql)
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.

//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송!!");
		System.out.println(result);
		return result;

	} // creat end

} // class end
