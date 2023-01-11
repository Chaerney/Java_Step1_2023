package chapter03.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		
		// 정수 입력 받아서 입력된 수만큼 ★ 출력

		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a=scan.nextInt();
		int i,j;
		
		for(i=1;i<=a;i++) {
			for(j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
