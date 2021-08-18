package 상속;

public class GiantBaby extends Baby{
	
	boolean big;
	
	public void joke() {
		
		System.out.println("장난치기!!");
		
		
	}

	@Override
	public String toString() {
		return "GiantBaby [big=" + big + ", cute=" + cute + ", name=" + name + ", age=" + age + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
