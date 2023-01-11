package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		
		//0~100까지의 수 중 홀수만 합하기
		
		int num;
		int total=0;
		for(num=0; num<=100; num++) {
			//무시되는 수행문(어떻게 해야 그냥 지나가게 둘 수 있을까)
			if(num%2==0)
				continue; //그냥 가세요~~~ 무시하세요~~~
			total +=num;
		}
		System.out.println("0~100까지의 수 홀수 값의 합 : "+total);
		
		System.out.println("====================");
		System.out.println();
		System.out.println("1~20까지의 수 중 홀수값만 출력하시오");
		//방법1
		int i;
		for(i=1; i<=20; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}//if		
		}//for
		//방법2
		for(int j=1; j<=20; j++) {
			if(j%2!=0) {
				System.out.print(j+" ");
			}//if
		}//for
		
		
		//ex
		System.out.println();
		System.out.println("1~55까지의 수 중 3의 배수와 합을 출력하시오");
		
		int sum=0;
		for(int k=1; k<=55; k++) {
			if(k%3==0) {
				System.out.print(k+" ");
				sum+=k;
			}
			
		}
		System.out.println();
		System.out.println(sum);
		
	}//main

}//class
