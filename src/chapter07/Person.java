package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person() {}
	
	//오버로딩
	public Person(String name) {
		this.name=name; //매개변수 이름이 같으면 찾을 수 있게  this로 구분
	}
	
	//오버로딩2
	public Person(String name,float height,float weight) {
		this.name=name; 
		this.height=height; 
		this.weight=weight; 
	}
	
}
