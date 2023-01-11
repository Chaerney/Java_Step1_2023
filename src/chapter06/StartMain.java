package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//객체생성
		Start start=new Start();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			select=scan.nextInt();
			check=start.check(select);
			
			
			if(check.equals("SUCCESS"))
				break;
			
		}//while
		
		
		
		
		
		
		
	}//main

}//class
