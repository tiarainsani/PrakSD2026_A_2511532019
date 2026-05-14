package Pekan6_2511532019;

import java.util.Scanner;

public class PlaylistMusik_2511532019 {

	static Lagu_2511532019 head_2019=null;
	static Lagu_2511532019 tail_2019=null;
	
	//fungsi tambah lagu
	public static void tambahLagu_2019(String judul_2019, String penyanyi_2019) {
		
		Lagu_2511532019 newLagu_2019=
				new Lagu_2511532019(judul_2019, penyanyi_2019);
		
		//jika DLL kosong
		if(head_2019==null) {
			head_2019=newLagu_2019;
			tail_2019=newLagu_2019;
		}
		else {
			tail_2019.next_2019=newLagu_2019;
			newLagu_2019.prev_2019=tail_2019;
			tail_2019=newLagu_2019;
		}
		
		System.out.println("Lagu berhasil ditambahkan!");
	}
	
	//fungsi hapus lagu pertama
	public static void hapusLaguPertama_2019() {
		
		//jika kosong
		if(head_2019==null) {
			System.out.println("Playlist kosong");
			return;
		}
		
		System.out.println("Lagu dihapus : "+head_2019.judul_2019);
		
		//jika hanya satu node
		if(head_2019==tail_2019) {
			head_2019=null;
			tail_2019=null;
		}
		else {
			head_2019=head_2019.next_2019;
			head_2019.prev_2019=null;
		}
	}
	
	//fungsi tampil maju
	public static void tampilMaju_2019() {
		
		//jika kosong
		if(head_2019==null) {
			System.out.println("Playlist kosong");
			return;
		}
		
		Lagu_2511532019 curr_2019=head_2019;
		
		System.out.println("Playlist Maju:");
		
		while(curr_2019!=null) {
			System.out.println("Judul    : "+curr_2019.judul_2019 + "("+ curr_2019.penyanyi_2019+ ")");
 		
			curr_2019=curr_2019.next_2019;
		}
	}
	
	//fungsi tampil mundur
	public static void tampilMundur_2019() {
		
		//jika kosong
		if(tail_2019==null) {
			System.out.println("Playlist kosong");
			return;
		}
		
		Lagu_2511532019 curr_2019=tail_2019;
		
		System.out.println("Playlist Mundur:");
		
		while(curr_2019!=null) {
			System.out.println("Judul    : "+curr_2019.judul_2019 + "(" + curr_2019.penyanyi_2019 + ")");
			
			curr_2019=curr_2019.prev_2019;
		}
	}
	
	//fungsi cari lagu
	public static void cariLagu_2019(String judulCari_2019) {
		
		//jika kosong
		if(head_2019==null) {
			System.out.println("Playlist kosong");
			return;
		}
		
		Lagu_2511532019 curr_2019=head_2019;
		boolean ketemu_2019=false;
		
		while(curr_2019!=null) {
			
			if(curr_2019.judul_2019.equalsIgnoreCase(judulCari_2019)) {
				System.out.println("Lagu ditemukan");
				System.out.println("Judul    : "+curr_2019.judul_2019);
				System.out.println("Penyanyi : "+curr_2019.penyanyi_2019);
				
				ketemu_2019=true;
				break;
			}
			
			curr_2019=curr_2019.next_2019;
		}
		
		if(ketemu_2019==false) {
			System.out.println("Lagu tidak ditemukan");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input_2019=new Scanner(System.in);
		
		int pilih_2019;
		
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511532019 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			pilih_2019=input_2019.nextInt();
			input_2019.nextLine();
			
			switch(pilih_2019) {
			
			case 1:
				System.out.print("Judul: ");
				String judul_2019=input_2019.nextLine();
				
				System.out.print("Penyanyi: ");
				String penyanyi_2019=input_2019.nextLine();
				
				tambahLagu_2019(judul_2019, penyanyi_2019);
				break;
				
			case 2:
				hapusLaguPertama_2019();
				break;
				
			case 3:
				tampilMaju_2019();
				break;
				
			case 4:
				tampilMundur_2019();
				break;
				
			case 5:
				System.out.print("Masukkan judul lagu: ");
				String cari_2019=input_2019.nextLine();
				
				cariLagu_2019(cari_2019);
				break;
				
			case 6:
				System.out.println("Program selesai");
				break;
				
			default:
				System.out.println("Pilihan tidak valid");
			}
			
		}while(pilih_2019!=6);
		
		input_2019.close();
	}
}