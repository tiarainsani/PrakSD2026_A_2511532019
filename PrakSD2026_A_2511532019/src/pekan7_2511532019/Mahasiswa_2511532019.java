package pekan7_2511532019;

public class Mahasiswa_2511532019 {

	//atribut mahasiswa
	String nama_2019;
	String nim_2019;
	String prodi_2019;
	
	//konstruktor
	public Mahasiswa_2511532019(String nama_2019, String nim_2019, String prodi_2019) {
		this.nama_2019=nama_2019;
		this.nim_2019=nim_2019;
		this.prodi_2019=prodi_2019;
	}
	
	//getter nama
	public String getNama_2019() {
		return nama_2019;
	}
	
	//getter nim
	public String getNim_2019() {
		return nim_2019;
	}
	
	//getter prodi
	public String getProdi_2019() {
		return prodi_2019;
	}
	
	//setter nama
	public void setNama_2019(String nama_2019) {
		this.nama_2019=nama_2019;
	}
	
	//setter nim
	public void setNim_2019(String nim_2019) {
		this.nim_2019=nim_2019;
	}
	
	//setter prodi
	public void setProdi_2019(String prodi_2019) {
		this.prodi_2019=prodi_2019;
	}
	
	//menampilkan data mahasiswa
	public String toString() {
		return nama_2019 + " - " + nim_2019 + " - " + prodi_2019;
	}
}