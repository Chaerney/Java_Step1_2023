package chapter06;

import javax.swing.JOptionPane;

public class Sungjuk {
	
	//필드 또는 멤버 변수
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//디폴트 생성자(생략 가능하지만 꼭 꺼내야 할 때가 있음)
	
	//메서드
	public void Sum() {
		int total=java+oracle+spring; //지역변수(stac)
		
		System.out.println("총합 : "+total);
	}
	
	public void Avg() {
		int avg=(java+oracle+spring)/3;
		System.out.println("평균 : "+avg);
	}
	
	public static void main(String[] args) {
		
		Sungjuk rec=new Sungjuk();
		
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("이름");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("자바 점수"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));
		
		System.out.println("학번 - "+rec.std_num+" | 이름 - "+rec.std_name+"님의 성적입니다");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		rec.Sum();
		rec.Avg();
		
		
	}//main

}//class
