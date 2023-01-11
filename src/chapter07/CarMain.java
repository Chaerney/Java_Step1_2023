package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통하여 초기화
		Car car = new Car("Pink", 2200);
		
		//멤버 변수에 직접 접근해서 출력
		System.out.println("[멤버변수 이용] 색상 : "+car.color+" / cc : "+car.cc);		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		
		//메서드를 이용한 출력
		System.out.println("[메서드 이용] 색상 : "+car.getColor()+" / cc : "+car.getCc());

	}

}
