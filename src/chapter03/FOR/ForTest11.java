package chapter03.FOR;

public class ForTest11 {

	public static void main(String[] args) {

		int i, j;
		
		for (i=1;i<=5;i++) {
			for(j=1; j<=i;j++) {
				System.out.print(j+" ");
			}//안쪽for
		}//바깥for
		

	}//main

}//class
