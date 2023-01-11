package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		// 데이터베이스
		String ID="soldesk";
		int PW=221227;
		
		//Scanner scan 인스턴스 변수 만들기
		Scanner scan=new Scanner(System.in);
		
		//ID 받기 (아이디가 있는 게 맞으면 비밀번호를 받기)
		System.out.print("아이디 : ");
		String inputID=scan.nextLine();
		
		if (ID.equals(inputID)) {
			//비번 입력 받고
			System.out.print("비밀번호 : ");
			int inputPW=Integer.parseInt(scan.nextLine());
			//비번확인
			if (PW==inputPW) {
				System.out.println("로그인에 성공하셨습니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}//in if
		} else {
			System.out.println("아이디가 존재하지 않습니다");
		}//out if
		
		scan.close();
		
	}//main

}//class
