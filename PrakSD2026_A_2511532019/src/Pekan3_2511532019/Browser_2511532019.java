package Pekan3_2511532019;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532019 {
	public static void main(String[] args) {
        Stack<Website_2511532019> history_2019 = new Stack<>();
        Scanner input_2019 = new Scanner(System.in);
        int pilihan_2019;
       
        do {
            System.out.println("\n=== Browser History NIM: 2511532019 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2019 = input_2019.nextInt();
            input_2019.nextLine();
            
            switch (pilihan_2019) {
            case 1:
                System.out.print("Masukkan Judul: ");
                String judul_2019 = input_2019.nextLine();

                System.out.print("Masukkan URL: ");
                String url_2019 = input_2019.nextLine();

                Website_2511532019 web = new Website_2511532019(judul_2019, url_2019);
                history_2019.push(web);

                System.out.println("Berhasil mengunjungi halaman!");
                break;
                
            case 2:
                if (!history_2019.isEmpty()) {
                    Website_2511532019 removed = history_2019.pop();
                    System.out.println("Halaman dihapus: " + removed.getJudul_2019());
                } else {
                    System.out.println("History kosong!");
                }
                break;

            case 3:
                if (!history_2019.isEmpty()) {
                    System.out.println("Halaman aktif: " + history_2019.peek());
                } else {
                    System.out.println("Tidak ada halaman aktif!");
                }
                break;

            case 4:
                if (history_2019.isEmpty()) {
                    System.out.println("History kosong!");
                } else {
                    System.out.println("Jumlah history: " + history_2019.size());
                }
                break;
                
            case 5:
                System.out.println("Keluar dari program...");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

    } while (pilihan_2019 != 5);

    input_2019.close();
}
}
