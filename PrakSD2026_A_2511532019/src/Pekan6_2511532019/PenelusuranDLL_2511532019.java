package Pekan6_2511532019;

public class PenelusuranDLL_2511532019 {
	//funsi penelusuran maju
	static void forwardTraversal_2019(NodeDLL_2511532019 head_2019) {
		//memulai penelususran dari head
		NodeDLL_2511532019 curr_2019=head_2019;
		//lanjutkan sampai akhir
		while (curr_2019 != null) {
			//print data
			System.out.print(curr_2019.data_2019 + " <-> ");
			//pindah ke node berikutnya
			curr_2019=curr_2019.next_2019;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_2019(NodeDLL_2511532019 tail_2019) {
		//mulai dari akhir
		NodeDLL_2511532019 curr_2019=tail_2019;
		//lanjut sampai head
		while (curr_2019 != null) {
			//cetak data 
			System.out.print(curr_2019.data_2019 + " <-> ");
			//pindah ke node sebelumnya
			curr_2019=curr_2019.prev_2019;
		}
		//cetak spasi
		System.out.println();
	}
	public static void main (String[] args) {
		//cetak DLL
		NodeDLL_2511532019 head_2019 = new NodeDLL_2511532019(1);
		NodeDLL_2511532019 second_2019=new NodeDLL_2511532019(2);
		NodeDLL_2511532019 third_2019=new NodeDLL_2511532019(3);
		
		head_2019.next_2019=second_2019;
		second_2019.prev_2019=head_2019;
		second_2019.next_2019=third_2019;
		third_2019.prev_2019=second_2019;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2019(head_2019);
		
		System.out.println("Penelususran mundur: ");
		backwardTraversal_2019 (third_2019);
	}

}
