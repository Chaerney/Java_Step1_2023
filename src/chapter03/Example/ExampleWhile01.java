package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int balance=0;
		int money;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n------------------------------");
			System.out.print("선택 > ");
			int num=scan.nextInt();
			
			
			if(num==1) {
				System.out.print("예금액 > ");
				money=scan.nextInt();
				balance+=money;
			} else if(num==2) {
				System.out.print("출금액 > ");
				money=scan.nextInt();
				balance-=money;
			} else if(num==3) {
				System.out.println("잔고 > " + balance);
			} else if (run=false) {
				break;
			}
		
		}//while
		System.out.println("프로그램 종료");

	}//main

}//class
