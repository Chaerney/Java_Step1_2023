package chapter03.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 출력 

		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a=scan.nextInt();
		
//		for(int i=1; i<=a; i++) { //행
//			for(int j=1; j<=i; j++) { //열
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		//전체회전
		for(int i=0; i<a; i++)
		{//공백찍기
			for(int j=0; j<=a-1-i; j++)
			{
				System.out.print(" ");
			}//별
			for(int k=0; k<2*i+1; k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}

		
	}

}
