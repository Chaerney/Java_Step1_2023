package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person ps1 = new Person();
		System.out.println("이름 : "+(ps1.name="융용")+" / 키 : "+(ps1.height=175f)+" / 몸무게 : "+(ps1.weight=71f));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		Person ps2 = new Person("아메");
		System.out.println("이름 : "+ps2.name+" / 키 : "+(ps2.height=175f)+" / 몸무게 : "+(ps2.weight=71f));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		Person ps3 = new Person("길동", 178f, 66f);
		System.out.println("이름 : "+ps3.name+" / 키 : "+ps3.height+" / 몸무게 : "+ps3.weight);
		
		
		

	}

}
