package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int JavaScore[][]=new int[2][3];
		int score;
		for(int i=0; i<JavaScore.length; i++) {
			for(int j=0; j<JavaScore[i].length; j++) {
				//입력
				score=Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
				//입력받은 점수 대입
				//JavaScore[i][j]+=score;
				JavaScore[i][j]=score;
				//System.out.print(JavaScore[i][j]+" ");
				System.out.println("JavaScore["+i+"]["+j+"] : " +JavaScore[i][j]);
			}
			System.out.println();
		}//for

	}//main
}//class
