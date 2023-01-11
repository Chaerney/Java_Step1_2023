package chapter03.FOR;

public class ForTest06 {

	public static void main(String[] args) {
		
		int i;
		char a='A'; //ASCII 코드 : 65
		
		//!! String->char = charAt(0)
		
		for(i=a; i<='Z'; i++) {
			System.out.printf("%c ", i);
		}
		

	}//main

}//class
