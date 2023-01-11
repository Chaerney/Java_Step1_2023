package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {
		
		int num1=10;
		int i=2;
		
		boolean value=((i=i+2)<10) && ((num1=num1+2)<10);
		System.out.println(i); // 4
		System.out.println(num1); // 12
		System.out.println(value); //false
		
		System.out.println("====================");
		
		value=((i=i+2)<10) || ((num1=num1+2)<10);
		System.out.println(i); // 6  앞이 트루니까 뒤를 판단할 필요 없음.
		System.out.println(num1); // 12
		System.out.println(value); //true
		
		

	}

}
