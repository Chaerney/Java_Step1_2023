package chapter04;

public class ArrayCopy03 {
	//깊은 복사
	public static void main(String[] args) {
		
		//Book클래스의 3개의 첨자를 갖는 배열 만들기 
		Book bookArray1[]=new Book[3]; //선언만 함. 초기화x
		Book[] bookArray2=new Book[3];
		
		//초기화
		bookArray1[0]=new Book("햄릿","윌리엄 셰익스피어");
		bookArray1[1]=new Book("갈매기","안톤 체홉");
		bookArray1[2]=new Book("상상병 환자","몰리에르");
		
		//bookArray2 객체(new로 만드는) 생성 
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		System.out.println("=====원본(bookArray1)=====");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		
		//깊은 복사 
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			//bookArray2[i].showBookinfo();
		}
		
		System.out.println("=====복사본(bookArray2)=====");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		System.out.println();
		//=============================================
		System.out.println();
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=====수정본(bookArray1)=====");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		System.out.println();
		System.out.println("=====복사수정본(bookArray2)=====");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}

	}//main

}//class
