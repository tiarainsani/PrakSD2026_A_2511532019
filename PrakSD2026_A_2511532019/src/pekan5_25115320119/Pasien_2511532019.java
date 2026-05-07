package pekan5_25115320119;

public class Pasien_2511532019 {
	//atribut pasien
	String namaPasien_2019;
	String keluhan_2019;
	int nomorAntrian_2019;
	
	//pointer ke pasien berikutnya
	Pasien_2511532019 next_2019;
	
	public Pasien_2511532019(String namaPasien_2019, String keluhan_2019, int nomorAntrian_2019) {
		this.namaPasien_2019=namaPasien_2019;
		this.keluhan_2019=keluhan_2019;
		this.nomorAntrian_2019=nomorAntrian_2019;
		this.next_2019=null;
	}
	
	public String getNamaPasien_2019() {
		return namaPasien_2019;
	}
	public String getKeluhan_2019() {
		return keluhan_2019;
	}
	public int getNomorAntrian_2019() {
		return nomorAntrian_2019;
	}
	public Pasien_2511532019 getNext_2019() {
		return next_2019;
	}

	public void setNamaPasien_2019(String namaPasien_2019) {
		this.namaPasien_2019=namaPasien_2019;
	}
	public void setKeluhan_2019(String keluhan_2019) {
		this.keluhan_2019=keluhan_2019;
	}
	public void setNomorAntrian_2019(int nomorAntrian_2019) {
		this.nomorAntrian_2019=nomorAntrian_2019;
	}
	public void setNext_2019(Pasien_2511532019 next_2019) {
		this.next_2019=next_2019;
	}
}