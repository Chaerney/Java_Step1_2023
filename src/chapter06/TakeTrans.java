package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
		StdInfo studentClaire=new StdInfo("Claire", 20000);
		
		//톰 100번 버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo();//지출
		bus100.showInfo();//수입증가 인원수 증가
		System.out.println("- - - - - - - - - - - - - - - - -");
		//톰 987번 버스 타기
		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("- - - - - - - - - - - - - - - - -");
		//톰 지하철 타기(1호선)
		Subway sub1=new Subway("1호선");
		studentTom.takeSubway(sub1);
		studentTom.showInfo();
		sub1.showInfo();
		System.out.println("- - - - - - - - - - - - - - - - -");
		//클레어도 1호선 타기		
		studentClaire.takeSubway(sub1);
		studentClaire.showInfo();
		sub1.showInfo();
		System.out.println("- - - - - - - - - - - - - - - - -");
	}

}
