package chapter06;

import chapter05.FunTest02;

public class AccesTest {

	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자
	
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Display() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
	}
	
	
	public static void main(String[] args) {
		// 객체 obj
		
		AccesTest obj=new AccesTest();
		obj.setAa(1);
		obj.setBb(2);
		obj.setCc(3);
		obj.Display();
		
		
		
			

	}

	

}
