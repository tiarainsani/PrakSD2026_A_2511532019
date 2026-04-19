package Pekan3_2511532019;

public class Website_2511532019 {
	private String judul_2019;
    private String url_2019;

    // Constructor
    public Website_2511532019(String judul_2019, String url_2019) {
        this.judul_2019 = judul_2019;
        this.url_2019 = url_2019;
    }

    // Getter
    public String getJudul_2019() {
        return judul_2019;
    }

    public String getUrl_2019() {
        return url_2019;
    }

    // Setter
    public void setJudul_2019(String judul_2019) {
        this.judul_2019 = judul_2019;
    }

    public void setUrl_2019(String url_2019) {
        this.url_2019 = url_2019;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_2019 + " | URL: " + url_2019;
    }
}