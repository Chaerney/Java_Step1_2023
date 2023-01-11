package chapter05;

public class FunTest06 {
	
	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//void외 모든 타입의 메소드는 반드시 꼭!! return값을 갖는다.
	
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
		
	}
	
	public void channelDown(int volume) {
		this.volume=volume;
		System.out.println("소리를 "+ volume+"만큼 내립니다");
		//return volume+2; //void는 절대 return값이 존재할 수 없다.
		
	}
	//=========================================================================	
	public static void main(String[] args) {
		
		FunTest06 tv=new FunTest06();
		tv.channelUp(4); //6
		System.out.println("--------------------------");
		//방법1
		System.out.println("소리를 "+tv.channelUp(3)+"만큼 올립니다");
		System.out.println("--------------------------");
		//방법2
		int volume=tv.channelUp(5);
		System.out.println("소리를 "+volume+"만큼 올립니다");
		System.out.println("--------------------------");
		//void쓴 메소드
		tv.channelDown(3);
		System.out.println("--------------------------");
	}

}
