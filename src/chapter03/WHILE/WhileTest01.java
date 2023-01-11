package chapter03.WHILE;

public class WhileTest01 {

	public static void main(String[] args) {
		
		while(true) {
			
			int num=(int)(Math.random()*6)+1; //1부터 시작해서 6까지
			System.out.println("주사위의 눈 : "+num );
			
			if(num==6) {
				break;
			}
			
		}//while
		
		System.out.println("프로그램 종료");
	}

}
