package dto;

public class DTOTest2 {

	public static void main(String[] args) {
		// 게시판 bag을 2개 만들어서, 값들을 넣어보시고
		// 넣은값들을 프린트 해보세요 toString()
		// 그림 그려보세요.

		게시판bag2 bag = new 게시판bag2();

		bag.setId("hello");
		bag.setTitle("hello");
		bag.setWriter("hello");
		bag.setContent("hello");
		
		System.out.println(bag);

		게시판bag2 bag2 = new 게시판bag2();

		bag2.setId("would");
		bag2.setTitle("would");
		bag2.setWriter("would");
		bag2.setContent("would");

		System.out.println(bag2);
	}

}
