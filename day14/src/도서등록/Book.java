package 도서등록;

public class Book {

	public String bookImage;
	public String bookNo;
	public String bookName;
	public String bookWriter;
	public String bookPublisher;
	public String bookGenre;
	public String bookStory;
	public String bookPrice;
	public String bookVol;

	public void create() {
		
		System.out.println("도서등록");

		System.out.println("도서사진: " + bookImage);
		System.out.println("도서번호: No." + bookNo);
		System.out.println("도서명: " + bookName);
		System.out.println("지은이: " + bookWriter);
		System.out.println("출판사: " + bookPublisher);
		System.out.println("장르: " + bookGenre);
		System.out.println("줄거리: " + bookStory);
		System.out.println("가격: " + bookPrice);
		System.out.println("판매량: " + bookVol);

	}

	public void read() {
		
		System.out.println("도서리스트");
		
		System.out.println("도서번호: No." + bookNo);
		System.out.println("도서사진: " + bookImage);
		System.out.println("도서명: " + bookName);

	}

	public void read2() {
		
		System.out.println("도서상세페이지");

		System.out.println("도서사진: " + bookImage);
		System.out.println("도서번호: No." + bookNo);
		System.out.println("도서명: " + bookName);
		System.out.println("지은이: " + bookWriter);
		System.out.println("출판사: " + bookPublisher);
		System.out.println("장르: " + bookGenre);
		System.out.println("줄거리: " + bookStory);
		System.out.println("가격: " + bookPrice);
		System.out.println("판매량: " + bookVol);

	}

}
