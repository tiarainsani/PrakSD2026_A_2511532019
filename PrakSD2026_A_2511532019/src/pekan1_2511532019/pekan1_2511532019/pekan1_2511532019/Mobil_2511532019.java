package pekan1_2511532019;

public class Mobil_2511532019 {
	 private String nama;
	    private int tahun;
	    private int cc;
	    private double harga;
	    private String merk;

	    // Konstruktor
	    public Mobil_2511532019(String nama, int tahun, int cc, double harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    // ===== SELECTOR (GETTER) =====
	    public String getNama() { return nama; }
	    public int getTahun() { return tahun; }
	    public int getCc() { return cc; }
	    public double getHarga() { return harga; }
	    public String getMerk() { return merk; }
	    
	    // ===== MUTATOR (SETTER) =====
	    public void setNama(String nama) { this.nama = nama; }
	    public void setTahun(int tahun) { this.tahun = tahun; }
	    public void setCc(int cc) { this.cc = cc; }
	    public void setHarga(double harga) { this.harga = harga; }
	    public void setMerk(String merk) { this.merk = merk; }

	    //toString

	    public String toString() {
	        return nama + ", " + tahun + ", " + cc + "cc, " + (long)harga + ", " + merk;
	    }
	}
