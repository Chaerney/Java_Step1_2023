package chapter03.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 9 - 18
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재시각 : "+time+"시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: case 11: case 12: case 15: case 16: case 17:
			System.out.println("수업듣기");
			break;
		case 10:
			System.out.println("아아 마시기");
			break;
		case 13:
			System.out.println("점심먹기");
			break;
		case 14:
			System.out.println("가벼운 스트레칭");
			break;
		case 18:
			System.out.println("짐 싸기");
			break;
		default:
			System.out.println("복습하기");
			break;
		}

	}

}
