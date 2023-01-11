package chapter04;

public class Book {

	public String bookname; //멤버 변수 어디서든 쓸 수 있음
	public String author;
	
	//디폴트 생성자
	public Book() {
		
	}
	
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
	}
	
	
	//=======================================================
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	} 
	//======================================================
	//사용자 정의
	public void showBookinfo() {
		System.out.println("책 이름 : "+bookname+" | 저자 : "+author);
	}
	
}//class
