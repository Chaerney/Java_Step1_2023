package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
	 
		Vending vd=new Vending();
		Scanner scan=new Scanner(System.in);
		String select="";
		int money=0;
		
		vd.initial();//음료 준비
		
		System.out.print("돈을 투입하세요 : ");
		money=scan.nextInt(); //돈 투입
		vd.showCans(money); 	
		System.out.println("- - - - - - - - - - - - - ");
		System.out.print("음료를 선택하세요 : ");
		select=scan.next(); //돈 투입
		vd.outCan(select);
	}
	
		
	
	
	
	
	
	
}
