package chapter01;

public class Exercise01 {

	public static void main(String[] args) {
		//Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현
		byte cNum = 11;
		int dNum = cNum;
		
		System.out.println(cNum);
		System.out.println(dNum);
		
		System.out.println("===============================");
		
		int eNum = 1234;
		float fNum = eNum;
		System.out.println(eNum);
		System.out.println(fNum);
		
		System.out.println("===============================");
		
		
		
		
		//Q2 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현
		float cVal = 2.25f;
		int zVal = (int)cVal;
		System.out.println(zVal);
		System.out.println((int)cVal);
		
		System.out.println("===============================");
		
		double douNum = 1.0;
		int intNum = (int)douNum;
		System.out.println(douNum);
		System.out.println(intNum);
		
		System.out.println("===============================");
		
		int aVal = 25;
		float bVal = 16.6f;
		
		var total = aVal+bVal;
		System.out.println(total);
		System.out.println("aVal + bVal = " + (int)(total));	
		
		System.out.println("===============================");
		
		
		
		//Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식 ( 부동소수점 ) 

		
		
		//Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		int num1=10;
		double num2=2.5;
		
		System.out.println("두 수를 더하면 " + (int)(num1+num2));
		System.out.println("두 수를 빼면 " + (int)(num1-num2));
		System.out.println("두 수를 곱하면 " + (int)(num1*num2));
		System.out.println("두 수를 나누면 " + (int)(num1/num2));
		
		System.out.println("===============================");
		
		//Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
		char ch1='글';
		char ch2='\uAE00'; 
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
	}

}
