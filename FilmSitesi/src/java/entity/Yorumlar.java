
package entity;


public class Yorumlar {
     private int yorumid;
    private int kullaniciid;
    private int filmid;
    private String yorum;
    private String tarih;

    public Yorumlar(int yorumid, int kullaniciid, int filmid, String yorum, String tarih) {
        this.yorumid = yorumid;
        this.kullaniciid = kullaniciid;
        this.filmid = filmid;
        this.yorum = yorum;
        this.tarih = tarih;
    }

    public Yorumlar() {
    }
    
    
    public int getYorumid() {
        return yorumid;
    }

    public void setYorumid(int yorumid) {
        this.yorumid = yorumid;
    }

    public int getKullaniciid() {
        return kullaniciid;
    }

    public void setKullaniciid(int kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
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

    @Override
    public String toString() {
        return "yorumlar{" + "yorumid=" + yorumid + ", kullaniciid=" + kullaniciid + ", filmid=" + filmid + ", yorum=" + yorum + ", tarih=" + tarih + '}';
    }
    
}
