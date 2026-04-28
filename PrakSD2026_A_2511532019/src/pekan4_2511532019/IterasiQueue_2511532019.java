package pekan4_2511532019;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class IterasiQueue_2511532019 {

	public static void main(String[] args) {
		Queue<String>q_2019=new LinkedList<>();
		q_2019.add("Praktikum");
		q_2019.add("Struktur");
		q_2019.add("Data");
		q_2019.add("Dan");
		q_2019.add("Algoritma");
		Iterator<String>iterator_2019=q_2019.iterator();
		while (iterator_2019.hasNext()) {
			System.out.print(iterator_2019.next()+ " ");
		}
	}
}
