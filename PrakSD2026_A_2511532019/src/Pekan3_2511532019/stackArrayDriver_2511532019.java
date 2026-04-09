package Pekan3_2511532019;

public class stackArrayDriver_2511532019 {
	public static void main (String[] args) {
		stackArray_2511532019 s = new stackArray_2511532019();
		s.push_2019(10);
		s.push_2019(20);
		s.push_2019(30);
		System.out.println(s.pop_2019()+" dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2019());
		System.out.print("Elemen pada stack     :");
		s.print_2019();
	}
}
