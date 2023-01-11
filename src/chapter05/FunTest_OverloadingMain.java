package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading test=new FunTest_Overloading(); //생성자를 읽음
		test.getResult(1);
		test.getResult("금");
		test.getResult('A');
		test.getResult(1, "그묘일");

	}

}
