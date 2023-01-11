package chapter03.FOR;

import java.util.Scanner;


public class ForTest05 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력 받은 정수부터 100까지의 합
		
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		System.out.print("100미만의 정수를 입력하세요 : ");
		
		for (int i=scan.nextInt(); i<=100; i++) {
			sum+=i;
		}
		
		System.out.println("입력받은 정수부터 100까지의 합 : "+sum);
		
		//1부터 10까지 반복하면서 정수를 입력받아 그 수 중에 짝수의 개수가 몇 개인지 출력
		//단, 입력받은 수가 0이면 무시
		//int j=scan.nextInt();
//		int count=0;
//		System.out.println("정수 입력");
//
//		for (int j=scan.nextInt(); j<=10; j++) {
//			if(j==0)
//				continue;
//			if(j%2==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		System.out.println("정수를 입력하세요");
		int b, j, cnt=0;
		
		for(j=1; j<=10;j++) {
			b=scan.nextInt();
			if(b==0)
				continue;
			if(b%2 ==0) {
				cnt++; //cnt=cnt+1
			}//if
		}//for
		System.out.println("입력받은 수의 짝수의 개수 : " +cnt );
	}

}
