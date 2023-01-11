package chapter04.Example;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example03moi {

	public static void main(String[] args) {
		//학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		
		// 변수선언
		boolean run=true;
		int score[]=null;
		int student=0;
		Scanner scan=new Scanner(System.in);
		
		while(run) {			
			System.out.println("--------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택 : ");
			int num=scan.nextInt();
			
			
			if(num==1) {
				System.out.print("학생 수 : ");
				student=scan.nextInt();
				score=new int[student];
			} else if(num==2) {	
				for(int i=0; i<score.length; i++) {
					System.out.print("[score"+(i+1)+"] :");
					score[i]=scan.nextInt();					
				}//for				
			} else if(num==3) {
				for(int i=0; i<score.length; i++) {
					System.out.println("[score"+(i+1)+"] :" +score[i]);					
				}//for				
			} else if(num==4) {
				int sum=0;
				int max=0;
				double avg=0.0;
				
				for(int i=0; i<score.length; i++) {
					sum+=score[i];					
					if(max<score[i]) {
						max=score[i];
					}//if					
				}//for
				avg=sum/(double)student;
				System.out.println("총점 : "+sum);
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 : "+avg);
			} else {
				run=false;
			}
		
		}//while
		
		System.out.println("프로그램 종료");

	}//main

}//class
