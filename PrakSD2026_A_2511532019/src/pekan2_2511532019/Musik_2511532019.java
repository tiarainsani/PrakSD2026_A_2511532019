package pekan2_2511532019;

public class Musik_2511532019 {
	String judul_2019;
    String penyanyi_2019;
    int durasi_2019;

    // Constructor
    public Musik_2511532019(String judul, String penyanyi, int durasi) {
        this.judul_2019 = judul;
        this.penyanyi_2019 = penyanyi;
        this.durasi_2019 = durasi;
    }
    // Getter
    public String getJudul() {
        return judul_2019;
    }

    public String getPenyanyi() {
        return penyanyi_2019;
    }

    public int getDurasi() {
        return durasi_2019;
    }
 // Setter
    public void setJudul(String judul) {
        this.judul_2019 = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi_2019 = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi_2019 = durasi;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_2019 + 
               ", Penyanyi: " + penyanyi_2019 + 
               ", Durasi: " + durasi_2019 + " detik";
    }
}


