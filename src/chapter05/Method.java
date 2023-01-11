package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드	
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//메소드1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//요청하신 n개의 빵이 모두 완료되었습니다
		for(int i=0; i<count; i++) {
			System.out.println("["+(i+1)+"번째] 빵을 만들었습니다");						
		}
		//System.out.println("===============================");
		System.out.println("=> 요청하신 "+count+"개의 빵이 모두 완료되었습니다");
	}//메소드2
	
	void makeBread(int num, String str) {
		//1번째 생크림빵을 만들었습니다
		//2번째 생크림빵을 만들었습니다
		//요청하신 n개의 생크림빵이 모두 완료되었습니다
		for(int i=0; i<num; i++) {
			System.out.println("["+(i+1)+"번째] "+str+"빵을 만들었습니다");						
		}
		//System.out.println("===============================");
		System.out.println("=> 요청하신 "+num+"개의 "+str+"빵이 모두 완료되었습니다");
	}//메소드3
	
	void order() {
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("- - - - - - - - - - - - - - - - - - - -");
			System.out.println("1.빵 개수 선택 | 2. 빵 개수와 종류 | 3. 종료 ");
			System.out.println("- - - - - - - - - - - - - - - - - - - -");
			System.out.print("선택 -> ");
			int selecNum=scan.nextInt();
			
			if(selecNum==1) {
				System.out.print("주문할 빵의 개수 : ");
				int breadNum=scan.nextInt();
				makeBread(breadNum);
			} else if(selecNum==2) {
				System.out.print("주문할 빵의 개수 : ");
				int breadNum=scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String breadName=scan.next();
				makeBread(breadNum, breadName);
			} else {
				run=false;
			}
		}//while
		System.out.println("프로그램 종료");
	}//order 메소드

}
