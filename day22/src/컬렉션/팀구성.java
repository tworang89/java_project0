package 컬렉션;

import java.util.HashSet;

public class 팀구성 {

	public static void main(String[] args) {
		
		HashSet team = new HashSet();
		
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		
		System.out.println("팀을 구성합니다. 각 파트별로 한분씩만 필요합니다.");
		System.out.println(team);

	}

}
