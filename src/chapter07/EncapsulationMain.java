package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("side"));
		height=Integer.parseInt(JOptionPane.showInputDialog("height"));
				
		//객체생성
		Encapsulation enc = new Encapsulation();
				
		//EncapsulationMain 메서드를 사용해서 사각형의 넓이 구하기
		area=enc.Cal_Area(side, height);		
		System.out.println("사각형의 넓이 : "+area);
		String str="사각형의 넓이 : "+area;
		JOptionPane.showMessageDialog(null, str);
		//System.out.println(enc.Cal_Area(side, height));
		
		
		
		
		
		

	}

}
