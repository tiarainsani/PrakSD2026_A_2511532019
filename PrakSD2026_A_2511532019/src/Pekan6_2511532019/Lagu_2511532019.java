package Pekan6_2511532019;

public class Lagu_2511532019 {
	//atribut lagu
	String judul_2019;
	String penyanyi_2019;
	
	//pointer next dan prev
	Lagu_2511532019 next_2019;
	Lagu_2511532019 prev_2019;
	
	//konstruktor
	public Lagu_2511532019(String judul_2019, String penyanyi_2019) {
		this.judul_2019=judul_2019;
		this.penyanyi_2019=penyanyi_2019;
		this.next_2019=null;
		this.prev_2019=null;
	}
}
