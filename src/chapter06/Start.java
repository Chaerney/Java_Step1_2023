package chapter06;

import java.util.Random;

public class Start {
	
	private int random=new Random().nextInt(50)+1; //1~50까지의 정수 중 랜덤 추출
	private int count=0;
	

	private String result="FAIL";
	
	public String check(int myNumber) {
		count++;
		//random값보다 작으면 up / 크면 down / 일치하면 -> result="success"
		if(random>myNumber) {
			System.out.println("UP");
		} else if (random<myNumber) {
			System.out.println("DOWN");
		} else {
			System.out.println(count+"회 만에 정답!!");
			result="SUCCESS";
		}
				
		return result;
		
		
		
	}
	
	
	
	
}
