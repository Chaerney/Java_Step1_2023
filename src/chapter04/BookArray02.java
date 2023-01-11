package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		
		//Book(); 5번 호출
		Book library[]=new Book[5];
		
		library[0]=new Book("데미안","헤르만 헤세");
		library[1]=new Book("파피용","베르나르 베르베르");
		library[2]=new Book("햄릿","윌리엄 셰익스피어");
		library[3]=new Book("갈매기","안톤 체홉");
		library[4]=new Book("상상병 환자","몰리에르");

		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
			System.out.println();
		}
		
		
	}

}
