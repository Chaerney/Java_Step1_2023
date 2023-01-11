package chapter05;

import java.util.Scanner;

public class Method2 {
	
	int cnt, num;
	boolean run=true;
	String str="";
	Method br=new Method();
	Scanner scan=new Scanner(System.in);
	
	public Method2() {
		
	}
	
	void order2() {
	while(run) {
		
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("1.빵 개수 선택 | 2. 빵 개수와 종류 | 3. 종료 ");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.print("선택 -> ");
		num=scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("주문할 빵의 개수 : ");
			int cnt1=scan.nextInt();
			br.makeBread(cnt1);
			break;
		case 2:
			System.out.print("주문할 빵의 개수 : ");
			int cnt2=scan.nextInt();
			System.out.print("주문할 빵의 종류 : ");
			String breadName=scan.next();
			br.makeBread(cnt2, breadName);
			break;
		case 3:
			run=false;
			System.out.println("프로그램 종료");
			break;
			
		default:
			System.out.println("잘못된 번호 입니다");
		}
	}//while
	
	}//order2
	
}//class
