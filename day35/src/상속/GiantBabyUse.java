package 상속;

public class GiantBabyUse extends GiantBaby{

	public static void main(String[] args) {
		
		GiantBaby gb = new GiantBaby();
		
		gb.age = 1;
		gb.big = true;
		gb.cute = "megacute";
		gb.name = "Rang2th";
		
		
		
		System.out.println(gb);
		
		gb.cry();
		gb.joke();
		gb.think();
		

	}

}
