package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	private String result="FAIL";
	
	public String check() {
		
		Scanner scan=new Scanner(System.in);
		
		//컴퓨터가 발생한 난수 1개
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			//1-9 사이의 난수 발생
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while (com1==com2 || com1==com3 || com2==com3);
		
		//컴퓨터 준비 완료
	
		//사용자가 입력할 수
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("- - - 1 ~ 9 사이의 수를 입력하세요 - - -");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1=scan.nextInt();
			System.out.print("두번째 수를 입력하세요 : ");
			user2=scan.nextInt();
			System.out.print("세번째 수를 입력하세요 : ");
			user3=scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//만약에 com1과 사용자가 입력한 user1 숫자가 같으면 strike
			//user1 숫자가 com2 ou com3랑 같으면 ball
			if(user1 == com1) {
				strike++;
			} else if(user1==com2 || user1==com3) {
				ball++;
			}
			
			//com2
			if(user2 == com2) {
				strike++;
			} else if(user2==com1 || user2==com3) {
				ball++;
			}
			
			//com3
			if(user3 == com3) {
				strike++;
			} else if(user3==com1 || user3==com2) {
				ball++;
			}
			
			if(strike == 3) {
				result="WIN";
				System.out.println("!! 정답 !!  => " +com1+" "+com2+" "+com3);
				break;
			} else {
				if(strike > 0 || ball > 0) {
					System.out.println(strike+" Strike | "+ball+" Ball");
				} else {//아무것도 일치하는 것이 없을 경우
					System.out.println("! - - OUT - - !");
				}//in if
			}//out if
			
		}//while
		return result;
		
	}
	
	
}
