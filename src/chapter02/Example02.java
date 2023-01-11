package chapter02;

public class Example02 {

	public static void main(String[] args) {
		
		/* 원의 넓이를 구하시오(반지름*반지름*3.14) 
		 * 반지름 : 10, 3.14는 double로 정의하여 구하시오 
		 * 반지름 변수방 num1 / 3.14 변수방 pi /넓이 변수방 result
		 */
		
		int num1 = 10;
		double pi = 3.14;
		
		double result;
		result = num1 * num1 * pi;
		System.out.println(result);
		
		//int => double : Double.parseDouble
		//String => int : Integer.parseInt
		
		//방법2
		int num2=10;
		int num3=3;
		int num4=14;
		
		double result2=num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println(result2);

	}

}
