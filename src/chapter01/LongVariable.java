package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
//		int num1=12345678900; //32비트 = 4Byte
		long num2=12345678900L;
		long num3=1000; //long형의 64비트지만 L로 선언을 안 했으므로 int로 인식(mais, int 범주에 들어와야 함.)
		
		int level; //선언만 하고 초기화되지 않음.
		level=10; //리터널값
		
		System.out.println(num2+num3); // 결과값 = long (큰 걸 따라감.)
		System.out.println(level);
		
	}

}
