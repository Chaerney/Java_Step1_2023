package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇 명의 성적을 입력 받을 것인지 정수로 인원수를 입력받고 총점과 평균을 구하시오(단, 평균은 실수로 출력)
		
		Scanner scan=new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg=0;
		
		System.out.print("몇 명의 학생 점수를 입력 받으시겠습니까? : ");
		int stu=scan.nextInt();
		
		for (i=1; i<=stu; i++) {
			System.out.print("점수를 입력하세요 : ");
			int score=scan.nextInt();
			sum+=score;
			//cnt++; //인원수 누적
		}
		avg=sum/(double)stu;
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+avg);

	}

}
