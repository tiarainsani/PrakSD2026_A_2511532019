package pekan4_2511532019;

import java.util.Scanner;

public class AntrianLoketDriver_2511532019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AntrianLoket_2511532019 q = new AntrianLoket_2511532019(5);
		int pilihan;
		do {
			System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			pilihan = input.nextInt();
			input.nextLine();

			switch (pilihan) {
				case 1:
					System.out.print("Masukkan nama pelanggan: ");
					String nama = input.nextLine();
					q.enqueue_2019(nama);
					break;
				case 2:
					q.dequeue_2019();
					break;
				case 3:
					q.display_2019();
					break;
				case 4:
					q.reverse_2019();
					q.display_2019();
					break;
				case 5:
					System.out.println("Program selesai");
					break;

				default:
					System.out.println("Pilihan tidak valid");
			}
		} 
		while (pilihan != 5);
		input.close();
    }
}
