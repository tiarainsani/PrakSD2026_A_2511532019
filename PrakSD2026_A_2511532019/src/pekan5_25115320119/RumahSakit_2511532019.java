package pekan5_25115320119;

import java.util.Scanner;

public class RumahSakit_2511532019 {
	
	static Pasien_2511532019 head_2019=null;
	static int nomor_2019=0;
	
	public static void daftarPasien_2019(String nama_2019, String keluhan_2019) {
		nomor_2019++;
		
		Pasien_2511532019 newPasien_2019=
				new Pasien_2511532019(nama_2019, keluhan_2019, nomor_2019);
		
		//jika list kosong
		if(head_2019==null) {
			head_2019=newPasien_2019;
		}else {
			//telusuri ke node terakhir
			Pasien_2511532019 curr_2019=head_2019;
			
			while(curr_2019.next_2019!=null) {
				curr_2019=curr_2019.next_2019;
			}
			
			curr_2019.next_2019=newPasien_2019;
		}
		
		System.out.println("Pasien berhasil didaftarkan!");
		System.out.println("Nomor Antrian : "+nomor_2019);
	}
	
	public static void panggilPasien_2019() {
		//jika list kosong
		if(head_2019==null) {
			System.out.println("Antrian kosong");
			return;
		}
		
		System.out.println("Pasien dipanggil:");
		System.out.println("Nama     : "+head_2019.namaPasien_2019);
		System.out.println("Keluhan  : "+head_2019.keluhan_2019);
		System.out.println("Antrian  : "+head_2019.nomorAntrian_2019);
		
		head_2019=head_2019.next_2019;
	}
	
	//fungsi tampilkan antrian
	public static void tampilAntrian_2019() {
		//jika list kosong
		if(head_2019==null) {
			System.out.println("Antrian kosong");
			return;
		}
		
		Pasien_2511532019 curr_2019=head_2019;
		
		System.out.println("Daftar Antrian Pasien:");
		
		while(curr_2019!=null) {
			System.out.println("Nomor Antrian : "+curr_2019.nomorAntrian_2019);
			System.out.println("Nama Pasien   : "+curr_2019.namaPasien_2019);
			System.out.println("Keluhan       : "+curr_2019.keluhan_2019);
			
			curr_2019=curr_2019.next_2019;
		}
	}
	
	//fungsi cari pasien
	public static void cariPasien_2019(String namaCari_2019) {
		//jika list kosong
		if(head_2019==null) {
			System.out.println("Antrian kosong");
			return;
		}
		
		Pasien_2511532019 curr_2019=head_2019;
		boolean ketemu_2019=false;
		
		while(curr_2019!=null) {
			if(curr_2019.namaPasien_2019.equalsIgnoreCase(namaCari_2019)) {
				System.out.println("Pasien ditemukan");
				System.out.println("Nomor Antrian : "+curr_2019.nomorAntrian_2019);
				System.out.println("Nama Pasien   : "+curr_2019.namaPasien_2019);
				System.out.println("Keluhan       : "+curr_2019.keluhan_2019);
				
				ketemu_2019=true;
				break;
			}
			
			curr_2019=curr_2019.next_2019;
		}
		
		if(ketemu_2019==false) {
			System.out.println("Pasien tidak ditemukan");
		}
	}
	
	//fungsi cek status antrian
	public static void statusAntrian_2019() {
		//jika list kosong
		if(head_2019==null) {
			System.out.println("Antrian kosong");
			return;
		}
		
		int jumlah_2019=0;
		
		Pasien_2511532019 curr_2019=head_2019;
		
		while(curr_2019!=null) {
			jumlah_2019++;
			curr_2019=curr_2019.next_2019;
		}
		
		System.out.println("Jumlah pasien dalam antrian : "+jumlah_2019);
		System.out.println("Pasien terdepan : "+head_2019.namaPasien_2019);
	}
	
	public static void main(String[] args) {
		Scanner input_2019=new Scanner(System.in);
		
		int pilih_2019;
		
		do {
			System.out.println("\n=== Antrian Rumah Sakit 2511532019 ===");
			System.out.println("1. Daftarkan Pasien");
			System.out.println("2. Panggil Pasien");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Cari Pasien");
			System.out.println("5. Cek Status Antrian");
			System.out.println("6. Keluar");
			System.out.print("Pilihan : ");
			pilih_2019=input_2019.nextInt();
			input_2019.nextLine();
			
			switch(pilih_2019) {
			
			case 1:
				System.out.print("Masukkan Nama Pasien : ");
				String nama_2019=input_2019.nextLine();
				
				System.out.print("Masukkan Keluhan : ");
				String keluhan_2019=input_2019.nextLine();
				
				daftarPasien_2019(nama_2019, keluhan_2019);
				break;
				
			case 2:
				panggilPasien_2019();
				break;
				
			case 3:
				tampilAntrian_2019();
				break;
				
			case 4:
				System.out.print("Masukkan nama pasien yang dicari : ");
				String cari_2019=input_2019.nextLine();
				
				cariPasien_2019(cari_2019);
				break;
				
			case 5:
				statusAntrian_2019();
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
