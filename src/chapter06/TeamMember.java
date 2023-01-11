package chapter06;

public class TeamMember {
	
	//멤버 변수
	public String teamName; //팀명
	public String mName; //팀장
	public String mPhone; //팀장번호
	public String sName; //부팀장
	public String name; //팀원
	public String gender; //팀원성별
	
	//기본 생성자
	public TeamMember() {}
	
	//오버 로딩(생성자를 통하여 초기화)
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}

	//메서드를 통한 초기화
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
