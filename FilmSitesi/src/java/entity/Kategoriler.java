package entity;

public class Kategoriler {

    private int kategori_id;
    private int filmid;
    private String adı;

    public Kategoriler(int kategori_id, int filmid, String adı) {
        this.kategori_id = kategori_id;
        this.filmid = filmid;
        this.adı = adı;
    }

    public Kategoriler() {
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

}
