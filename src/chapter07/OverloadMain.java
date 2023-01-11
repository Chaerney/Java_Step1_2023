package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload ol = new Overload();
		ol.Disp();
		System.out.println("- - - - - - - - - - - - - - - -");
		Overload ol2 = new Overload(21, 149f);
		ol2.Disp();
		System.out.println("- - - - - - - - - - - - - - - -");
		Overload ol3 = new Overload(23, 150f, "냐냐");
		ol3.Disp();
		
		
		

	}

}
