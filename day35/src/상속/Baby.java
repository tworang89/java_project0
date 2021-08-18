package 상속;

public class Baby extends Person{
	
	String cute;
	
	
	public void cry() {
		
		System.out.println("울어버리기!");
		
	}


	@Override
	public String toString() {
		return "Baby [cute=" + cute + ", name=" + name + ", age=" + age + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
