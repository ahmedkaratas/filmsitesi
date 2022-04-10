package entity;

public class Yorumlar {

    private int yorumid;
    private int kullanici_id;
    private int filmid;
    private String yorum;
    private String tarih;

    public Yorumlar(int kullanici_id, int film_id, String yorum, String tarih) {
        this.kullanici_id = kullanici_id;
        this.filmid = filmid;

        this.yorum = yorum;
        this.tarih = tarih;
    }

    public Yorumlar() {
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public int getFilm_id() {
        return filmid;
    }

    public void setFilm_id(int film_id) {
        this.filmid = film_id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

}
