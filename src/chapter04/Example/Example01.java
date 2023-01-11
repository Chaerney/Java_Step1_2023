package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		//int sum=0;
		double avg=0;
		double allAvg;
		int total=0;
		int allTotal=0;
		int count=0;
		int allCount=0;
		
		
		//방법1
		/*
		int sum[]=new int[3];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum[i]+=array[i][j]; //(0,0) (0,1) | (1,0) (1,1) (1,2) | (2,0) (2,1) (2,2) (2,3) (2,4)
				count++;
			}
			System.out.println("각 행의 합 : "+sum[i]);
			avg=sum[i]/(double)count;
			System.out.println("각 행의 평균 : "+avg);
			System.out.println("=================");
			count=0;
		}
		*/
		
		//방법2
		/*
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				total+=array[i][j];
				count++;
			}
			avg=total/(double)(array[i].length);
			System.out.println("각 행의 합 : "+total);			
			System.out.println("각 행의 평균 : "+Math.round(avg));
			System.out.println("=================");
			
			allTotal+=total;//전체 총합
			//쓰레기값 초기화
			total=0;
			avg=0;			
		}
		allAvg=allTotal/(double)count;
		System.out.println("전체 총합 : "+allTotal);
		System.out.println("전체 평균 : "+allAvg);
		*/
		
		//방법3
		/*
		for(int[] num : array) {//첫번째 줄만 떼어서 줌 ->95,86
			for (int score : num) {//그 줄에 있는 데이터 ->95 / 86
				total+=score;
			}//in for
			count++;
			System.out.println(count+"번째 학생의 합계 : "+total);
			
			total=0;
		}//out for
		*/
		
		//채윤
		int sum=0;
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				count++;				
			}
			avg=sum/(double)count;
			System.out.println("합계는 : "+sum);			
			System.out.println("평균은 : "+avg);
			System.out.println("(반올림)평균은 : "+Math.round(avg));
			
			//전체값 저장
			allTotal+=sum;
			allCount+=count;
			//쓰레기값 처리
			sum=0;
			count=0;
			System.out.println("======================");
		}//for
			allAvg=allTotal/(double)allCount;
			System.out.println("전체 값 : "+allTotal);
			System.out.println("전체 평균 값 : "+allAvg);
			System.out.println("(반올림)전체 평균 값 : "+Math.round(allAvg));
	
	}//main
}//class
