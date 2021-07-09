package 클래스사용;

import 클래스생성.Phone;
import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV();
		
		TV myTv =new TV();
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
		
		System.out.println("myTv의 채널은 "+myTv.ch);
		System.out.println("myTv의 채널은 "+myTv.vol);
		System.out.println("myTv의 채널은 "+myTv.onOff);
		System.out.println(myTv);
//		myTv.onOff = false;
		
		
		TV yourTv =new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		
		System.out.println("myTv의 채널은 "+yourTv.ch);
		System.out.println("myTv의 채널은 "+yourTv.vol);
		System.out.println("myTv의 채널은 "+yourTv.onOff);
		System.out.println(yourTv);
		
		Phone myPhone = new Phone();
		myPhone.onOff = true;
		myPhone.vol = 10;
		myPhone.size = 5;
		myPhone.color = "블랙";
		System.out.println("myPhone의 크기는 "+myPhone.size);
		System.out.println("myPhone의 색상은 "+myPhone.color);
		System.out.println("myPhone의 볼륨은 "+myPhone.vol);
		System.out.println("myPhone의 상태는 "+myPhone.onOff);
		
				
		
		
	

		
	}

}
