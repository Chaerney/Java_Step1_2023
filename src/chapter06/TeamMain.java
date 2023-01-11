package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//메서드를 통해서 팀명을 초기화
		t.setTeamName("IT프렌즈");
		System.out.println("팀명 : "+t.getTeamName());
		System.out.println("- - - - 팀원 명단 - - - -");
		team.init(); //초기화값
		team.Disp();
		
		System.out.println("- - - - - - - - - - - - - - -");
		t.setmName("김병효");
		t.setmPhone("010-1234-5678");
		t.setsName("이채윤");
		System.out.println("팀장 이름 : "+t.getmName());
		System.out.println("팀장 번호 : "+t.getmPhone());
		System.out.println("부팀장 이름 : "+t.getsName());
		
		
		

	}

}
