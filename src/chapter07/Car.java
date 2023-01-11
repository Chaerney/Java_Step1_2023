package chapter07;

public class Car {
	
	String color;
	int cc;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
	}
/*
	public void show() {
		System.out.println("색상 : "+color+" | cc : "+cc);
	}
	*/
	public String getColor() {
		return color;
	}

	public int getCc() {
		return cc;
	}
	
	
	
	
	

}
