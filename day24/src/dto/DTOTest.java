package dto;

public class DTOTest {

	public static void main(String[] arg) {
		
		회원bag bag = new 회원bag();
		
//		bag.id="apple";
//		bag.pw="apple";
//		bag.name="apple";
//		bag.tel="apple";
		
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		
		System.out.println(bag);
		
		회원bag bag2 = new 회원bag();
		
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");
		
		System.out.println(bag2);
		
		
	}
	
	
}
