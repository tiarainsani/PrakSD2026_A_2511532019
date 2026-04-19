package pekan2_2511532019;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532019 {
	 public static void tampilMenu() {
	        System.out.println("\n=== Playlist Musik NIM: 2511532019 ===");
	        System.out.println("1. Tambah Lagu");
	        System.out.println("2. Lihat Playlist");
	        System.out.println("3. Hapus Lagu");
	        System.out.println("4. Cek Jumlah Lagu");
	        System.out.println("5. Keluar");
	    }
	 public static void main(String[] args) {
	        ArrayList<Musik_2511532019> playlist = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);
	        int pilihan;

	        do {
	            tampilMenu();
	            System.out.print("Pilihan: ");
	            pilihan = sc.nextInt();
	            sc.nextLine();
	            
	            switch (pilihan) {
	            case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = sc.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    playlist.add(new Musik_2511532019(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                    
	            case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.println("Daftar Lagu:");
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;
                    
	            case 3:
                    System.out.print("Masukkan nomor lagu yang akan dihapus: ");
                    int index = sc.nextInt() - 1;

                    if (index >= 0 && index < playlist.size()) {
                        playlist.remove(index);
                        System.out.println("Lagu berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;
                    
	            case 4:
                    System.out.println("Jumlah lagu: " + playlist.size());
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}