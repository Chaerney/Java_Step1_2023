package chapter03.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking=2;
		char medalColor;
		
		switch (ranking) {
		case 1: 
			medalColor='G';
			break;
		case 2:
			medalColor='S';
			break;
		case 3:
			medalColor='B';
			break;

		default: //나머지 value (=else)
			medalColor='A';
			//break; 더 이상 비교할 게 없는 곳이기 때문에 break를 안 해도 됨.
		}
		
		System.out.println(ranking +"등 메달은 "+medalColor+"입니다.");
	}

}
