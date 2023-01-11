package chapter07;

class Person2 {

	String name;
	int age;
	
	public Person2() {
		this("이름없음", 0); //Person2(String str, int a)
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//자기 자신의 주소
	Person2 returnSelf() {
		return this;
	}
	
}

public class CallAnotherConst {
	public static void main(String[] args) {
		
		Person2 noName=new Person2();
		
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName의 주소 : "+noName);
		System.out.println("noName의 주소 : "+noName.returnSelf());
		System.out.println("- - - - - - - - - - - - - - - - -");
		//객체 하나 더
		//noName과 p의 객체는 전혀 다른 곳으로 할당
		Person2 p=new Person2();
		System.out.println("p의 주소 : "+p); //같은 Person2지만 주소가 다름.
		//주소 복사
		System.out.println("- - - - - - - - - - - - - - - - -");		
		Person2 person=noName.returnSelf();
		System.out.println(person);
		System.out.println(noName);

	}

}
