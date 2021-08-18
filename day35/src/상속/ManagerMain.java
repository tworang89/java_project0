package 상속;

public class ManagerMain {

	public static void main(String[] args) {
		
		Manager man = new Manager();
		
		man.name = "kim";
		man.address = "양천구";
		man.rrn = 1000;
		man.salary = 3000;
		man.bonus = 200;
		
		System.out.println(man);
		
		man.test();
	
		

	}

}
