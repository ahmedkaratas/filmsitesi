
package entity;

import java.sql.Date;


public class Yorumlar {
    private int yorumid;
    private Film filmid;
    private int kullaniciid;
    private String yorum;
    private Date tarih;

    public Yorumlar(int yorumid, int kullaniciid, Film filmid, String yorum, Date tarih) {
        this.yorumid = yorumid;
        this.filmid = filmid;
        this.kullaniciid = kullaniciid;
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

    public Film getFilmid() {
        return filmid;
    }

    public void setFilmid(Film filmid) {
        this.filmid = filmid;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Yorumlar{" + "yorumid=" + yorumid + ", kullaniciid=" + kullaniciid + ", filmid=" + filmid + ", yorum=" + yorum + ", tarih=" + tarih + '}';
    }

    

   
    
}
