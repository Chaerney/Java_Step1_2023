package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원
		// 전시관의 입장료는 중.고등학생은 3500원
		// 전시관의 입장료는 성인은 5000원
		
		int age;
		int charge;
		
		//swing(나이를 입력하세요) 사용해서 입력 받기
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		//if문 사용
		if (age<=7) {
			charge=1000;
			System.out.println("미취학 아동입니다");
		} else if (age<=13) {
			charge=2000;
			System.out.println("초등학생입니다");
		} else if (age<=19) {
			charge=3500;
			System.out.println("중.고등학생입니다");
		} else {
			charge=5000;
			System.out.println("성인입니다");
		}//if 
		
		System.out.println("입장료는 " + charge + "원 입니다");
		
		/*
		//방법2
		String cond;
		int pay;
		
		int age1;
		age1=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		if (age1<=7) {
			cond = "미취학아동";
			pay = 1000;					
		} else if (age1<=13) {
			cond = "초등학생";
			pay = 2000;
		} else if (age1<=19) {
			cond = "청소년";
			pay = 3500;
		} else {
			cond = "성인";
			pay = 5000;
		}
		
		System.out.println(cond + "입니다");
		System.out.println("입장료는 " + pay + "원 입니다");
		
		*/
		
	}//main

}//class
