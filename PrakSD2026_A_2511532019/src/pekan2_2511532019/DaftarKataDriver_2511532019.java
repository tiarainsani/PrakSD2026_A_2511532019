package pekan2_2511532019;

public class DaftarKataDriver_2511532019 {
	public static void main (String[] args) {
		DaftarKata_2511532019 al=new DaftarKata_2511532019();
		//Menambah elemen (akhir)
		al.tambah ("kami");
		al.tambah ("informatika");
		//menyisipkan elemen pada index 1
		al.tambahPada (1, "Mahasiswa");
		//cetak isi awal
		System.out.println ("Awal             :"+al);
		//Mengubah elemen (index 1)
		al.ubahElemen (1, "Departemen");
		System.out.println ("Setelah Ubah     :"+al);
		//menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen(0);
		System.out.println("Terhapus         :"+terhapus);
		System.out.println("Setelah Hapus    :" +al);
		//iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi          :");
		al.iterasiCetak();
		System.out.println();
	}
}
