package pekan1_2511532019;

import java.util.Scanner;

public class Driver_2511532019 {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
  
        System.out.println("=== Program Driver Mobil ===");

        Mobil_2511532019[] data = new Mobil_2511532019[5];
        int jumlah = 0;

        // INPUT JUMLAH DATA
        System.out.print("Berapa data mobil yang ingin dimasukkan? ");
        int n = input.nextInt();
        input.nextLine();

        // VALIDASI
        if (n > data.length) {
            System.out.println("Maksimal hanya " + data.length + " data!");
            n = data.length;
        }
        // INPUT DATA
        System.out.println("\n--- Input Data Mobil ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            data[jumlah] = buatMobilDariInput(input);
            jumlah++;
        }

        // TAMPIL
        System.out.println("\n--- Data Mobil ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mobil ke-" + (i + 1) + " : " + data[i]);
        }
        // HAPUS MOBIL
        System.out.println("\n--- Hapus Mobil ---");
        System.out.print("Masukkan nama mobil yang ingin dihapus: ");
        String hapus = input.nextLine();

        int index = -1;
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getNama().equalsIgnoreCase(hapus)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < jumlah - 1; i++) {
                data[i] = data[i + 1];
            }
            jumlah--;
            System.out.println("Mobil berhasil dihapus!");
        } else {
            System.out.println("Mobil tidak ditemukan!");
        }
        // TAMPIL
        System.out.println("\n--- Data Setelah Hapus ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mobil ke-" + (i + 1) + " : " + data[i]);
        }

        input.close();
        System.out.println("\nProgram selesai.");
    }

    // METHOD INPUT
    private static Mobil_2511532019 buatMobilDariInput(Scanner sc) {
        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Tahun : ");
        int tahun = sc.nextInt();

        System.out.print("CC    : ");
        int cc = sc.nextInt();

        System.out.print("Harga : ");
        double harga = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Merk  : ");
        String merk = sc.nextLine();

        return new Mobil_2511532019(nama, tahun, cc, harga, merk);
    }
}