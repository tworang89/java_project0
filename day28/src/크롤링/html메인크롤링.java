package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements; //tag가 담긴 arraylist

public class html메인크롤링 {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공!! ");
			System.out.println("2. 소스 받아오기 성공!! ");
//			System.out.println(doc);
			Elements list = doc.select("a.w3-bar-item");
			System.out.println(list.size());
//			System.out.println(list);
			
			
//			for (Element tag : list) {
//				System.out.println(tag.text());
//				
//			}
			
			for (int i = 0; i < list.size(); i++) {
				
				System.out.println(i+": "+ list.get(i)); //인덱스추적
				
			}
			for (int i = 8; i < 18; i++) {
				
				System.out.println(list.get(i).text());
				
			}
			
			
		} catch (IOException e) {
			System.out.println("크롤링 하는중 에러발생, 실패실패실패 ");
			e.printStackTrace();
		}
		

	}

}
