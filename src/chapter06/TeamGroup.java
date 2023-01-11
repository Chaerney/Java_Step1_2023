package chapter06;

public class TeamGroup {
	
	//멤버변수(배열->팀구성원)
	private TeamMember[] tmember=new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메서드
	public void init() {
		tmember[0]=new TeamMember("김병효", "남");
		tmember[1]=new TeamMember("김형우", "남");
		tmember[2]=new TeamMember("김지성", "남");
		tmember[3]=new TeamMember("이채윤", "여");
		tmember[4]=new TeamMember("김주은", "여");
		tmember[5]=new TeamMember("윤민주", "여");
	}
	
	//출력 메서드
	
	public void Disp() {
		for(int i=0; i<tmember.length; i++) {
			System.out.println("성명 : "+tmember[i].getName()+" | 성별 : "+tmember[i].getGender());
		}
	}
	
}
