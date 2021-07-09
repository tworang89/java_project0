package 클래스사용;

public class BbsDb {
	
	
	
	public void create(String name, String jemok, String story) {
		
		System.out.println("게시판명: "+name);
		System.out.println("제목: "+jemok);
		System.out.println("게시글: "+story);
		
		
		
	}
	
	public void delete(String jemok) {
		
		System.out.println("제목: "+jemok+"의 게시글이 삭제되었습니다.");
		
	}

}
