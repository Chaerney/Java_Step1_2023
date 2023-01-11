package chapter03.Example;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int balance=0;
		int money;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n------------------------------");
			System.out.print("선택 > ");
			int num=scan.nextInt();
			
			switch (num) {
			case 1: { //0이하의 금액이 입력되었을 때 예외처리
				System.out.print("예금액 > ");
				money=scan.nextInt();
				balance+=money;
				break;
			}
			case 2: { //잔액이 부족할 시
				System.out.print("출금액 > ");
				money=scan.nextInt();
				balance-=money;
				break;
			}
			case 3: { 
				System.out.println("잔고 > " + balance);
				break;
			}
			case 4: {
				run=false;
				break; //switch문을 닫는
			}
			default: 
				System.out.println("잘못 입력하셨습니다 : ");
			
			}//switch
//			if (num==4) {
//				break;
//			}
		}//while
		System.out.println("프로그램 종료");
	}//main

}//class
