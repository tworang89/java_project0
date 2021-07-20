package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//******** 크게 수정한 부분 ********
//클래스명 수정 SearchDAO.java
//(기존 BookDAO에 추가하기 헷갈려서 그냥 SearchDAO로 이름만 바꾸고 그대로 씁니다)


public class SearchDAO {
	
	// 도서 검색
		public ArrayList<String[]> searchRead() throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select bookname, writer, genre, price, sold from book order by sold desc";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			ArrayList<String[]> result = new ArrayList<String[]>();
			while (rs.next()) {
				result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5) });
			}
			System.out.println("4. SQL문 전송 완료");

			return result;
		}// end of 도서 검색

		// 도서 키워드 검색
		public ArrayList<String[]> searchRead(String opt, String keyword) throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select bookname, writer, genre, price, sold from book order by sold desc";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			ArrayList<String[]> result = new ArrayList<String[]>();
			switch (opt) {
			case "도서명":
				while (rs.next()) {
					if (rs.getString(1).contains(keyword)) {
						result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5) });
					}
				}
				break;
			case "저자":
				while (rs.next()) {
					if (rs.getString(2).contains(keyword)) {
						result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5) });
					}
				}
				break;
			case "장르":
				while (rs.next()) {
					if (rs.getString(3).contains(keyword)) {
						result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5) });
					}
				}
				break;
			}
			System.out.println("4. SQL문 전송 완료");
			return result;
		}// end of 도서 키워드 검색
		
		// 도서 판매량 검색
		public ArrayList<String[]> searchRead(int qty) throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select bookname, writer, genre, price, sold from book order by sold desc";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			ArrayList<String[]> result = new ArrayList<String[]>();
			while (rs.next()) {
				if (Integer.parseInt(rs.getString(5)) >= qty) {
					result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5) });
				}
			}
			System.out.println("4. SQL문 전송 완료");
			return result;
		}// end of 도서 판매량 검색

		// 도서 가격 검색
		public ArrayList<String[]> searchPrice() throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select bookname, writer, genre, price, sold from book order by price desc";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			ArrayList<String[]> result = new ArrayList<String[]>();
			while (rs.next()) {
				result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5) });
			}
			System.out.println("4. SQL문 전송 완료");
			return result;
		}// end of 도서 가격 검색
		
		// 도서 가격 키워드 검색
			public ArrayList<String[]> searchPrice(int keyPrice) throws Exception {
				// 1. JDBC connector 설정
				Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//				Class.forName("com.mysql.jdbc.Driver"); // window용
				System.out.println("1. connector 연결 성공!");

				String url = "jdbc:mysql://localhost:3306/bookstore";
				String username = "root";
				String password = "atempause26";
				Connection con = DriverManager.getConnection(url, username, password);
				System.out.println("2. bookstore DB 연결 성공!");

				String sql = "select bookname, writer, genre, price, sold from book order by price desc";
				PreparedStatement ps = con.prepareStatement(sql);
				System.out.println("3. SQL문 생성 완료");

				ResultSet rs = ps.executeQuery();
				ArrayList<String[]> result = new ArrayList<String[]>();
				while (rs.next()) {
					if (Integer.parseInt(rs.getString(4)) <= keyPrice) {
						result.add(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5) });
					}
				}
				System.out.println("4. SQL문 전송 완료");
				return result;
			}// end of 도서 가격 키워드 검색

		// 인기 도서
		public String[][] tableRead() throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select bookname, sold from book order by sold desc limit 5";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			String[][] result = new String[5][2];
			for (int i = 0; i < result.length; i++) {
				if (rs.next()) {// if (true): 테이블에 검색 결과가 있다면!
					result[i][0] = rs.getString(1);
					result[i][1] = rs.getString(2);
				}
			}
			System.out.println("4. SQL문 전송 완료");
			return result;
		}// end of 인기 도서

		// 인기 장르
		public int[] chartRead(String[] genre) throws Exception {
			// 1. JDBC connector 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // mac용 @@@@
//			Class.forName("com.mysql.jdbc.Driver"); // window용
			System.out.println("1. connector 연결 성공!");

			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "root";
			String password = "atempause26";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. bookstore DB 연결 성공!");

			String sql = "select genre, sold from book";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 완료");

			ResultSet rs = ps.executeQuery();
			int[] result = { 0, 0, 0, 0 };
			while (rs.next()) {
				if (rs.getString(1).equals("computer")) {
					result[0] += Integer.parseInt(rs.getString(2));
				} else if (rs.getString(1).equals("business")) {
					result[1] += Integer.parseInt(rs.getString(2));
				} else if (rs.getString(1).equals("language")) {
					result[2] += Integer.parseInt(rs.getString(2));
				} else if (rs.getString(1).equals("novel")) {
					result[3] += Integer.parseInt(rs.getString(2));
				}
			}
			System.out.println("4. SQL문 전송 완료");
			return result;
		}// end of 인기 장르

}// end of class
