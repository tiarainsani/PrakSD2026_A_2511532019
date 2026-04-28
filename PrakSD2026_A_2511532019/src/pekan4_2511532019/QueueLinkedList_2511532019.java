package pekan4_2511532019;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511532019 {

	public static void main(String[] args) {
		Queue<Integer>q_2019=new LinkedList<>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian 
		for(int i=0; i<6; i++) 
			q_2019.add(i);
		//menampilkan isi antrian
		System.out.println("Elemen Antrian"+q_2019);
		//untuk menghapus kepala antrian
		int hapus_2019=q_2019.remove();
		System.out.println("Hapus elemen = "+hapus_2019);
		System.out.println(q_2019);
		//untuk melihat antrian terdepan
		int depan_2019=q_2019.peek();
		System.out.println("Kepala antrian = "+depan_2019);
		int banyak_2019=q_2019.size();
		System.out.println("Size Antrian = "+banyak_2019);
	}
}
