package chapter03.IF;

import java.util.Scanner;

public class IfExample10 {

	public static void main(String[] args) {
		// Scanner scan 이라는 인스턴스 변수 선언
		Scanner scan=new Scanner(System.in);
		
		// ID라는 변수로 아이디 받기 (안내문구)
		System.out.print("아이디를 입력하세요 : ");
		String ID=scan.nextLine();
		
		//PW라는 변수로 비밀번호 받기(String 숫자로 받기, 안내문구)
		System.out.print("비밀번호를 입력하세요 : ");
	    String PW=scan.nextLine();
	    //int PW=Integer.parseInt(scan.nextLine()); // =>한줄코드
	    
		//int형으로 형변환
		int inPw=Integer.parseInt(PW);
	    
		//중첩질의 사용하여 로그인 성공, 비밀번호 다름, 존재하지 않는 아이디 출력되게
		String id="soldesk";
		int pw=95455446;
		
		/*
		if(ID.equals(id)) {
			if(inPw==pw) { //if(PW==pw)
				System.out.println(id+"님 환영합니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			} 
		} else {
			System.out.println("존재하지 않는 아이디입니다");
		}
		*/
		
		//방법2 
		/*
		if(ID.equals("soldesk")) {
			if(inPw==95455446) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 불일치");
			}
		} else {
			System.out.println("로그인 실패!!");
		}
		*/
		
		//논리 연산자
		if ((ID.equals(id)) && (inPw==pw)) {
			System.out.println(id+"님 환영합니다");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
		}
		
		
		
		scan.close();
		
	}//main

}//class
