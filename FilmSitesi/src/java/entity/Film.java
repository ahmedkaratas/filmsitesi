package entity;

import java.util.List;

public class Film {

    private int filmid;
    private String ad;
    private String tur;
    private String vizyon;
    private String sure;
    private String ulke;
    private double puan;
    private String yassiniri;
    private String filmlinki;
    private String aciklama;
    private String gorsel;
    
    private List<Kategori> categories;

    public Film() {
    }

    public Film(int filmid, List<Kategori> cat, String ad, String tur, String vizyon, String sure, String ulke, double puan, String yassiniri, String filmlinki, String aciklama, String gorsel) {
        this.filmid = filmid;
        this.categories = cat;
        this.ad = ad;
        this.tur = tur;
        this.vizyon = vizyon;
        this.sure = sure;
        this.ulke = ulke;
        this.puan = puan;
        this.yassiniri = yassiniri;
        this.filmlinki = filmlinki;
        this.aciklama = aciklama;
        this.gorsel = gorsel;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public List<Kategori> getCategories() {
        return categories;
    }

    public void setCategories(List<Kategori> categories) {
        this.categories = categories;
    }
    

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getVizyon() {
        return vizyon;
    }

    public void setVizyon(String vizyon) {
        this.vizyon = vizyon;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    public String getYassiniri() {
        return yassiniri;
    }

    public void setYassiniri(String yassiniri) {
        this.yassiniri = yassiniri;
    }

    public String getFilmlinki() {
        return filmlinki;
    }

    public void setFilmlinki(String filmlinki) {
        this.filmlinki = filmlinki;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getGorsel() {
        return gorsel;
    }

    public void setGorsel(String gorsel) {
        this.gorsel = gorsel;
    }

    @Override
    public String toString() {
        return "Film{" + "filmid=" + filmid + ", ad=" + ad + ", tur=" + tur + ", vizyon=" + vizyon + ", sure=" + sure + ", ulke=" + ulke + ", puan=" + puan + ", yassiniri=" + yassiniri + ", filmlinki=" + filmlinki + ", aciklama=" + aciklama + ", gorsel=" + gorsel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.filmid;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        return this.filmid == other.filmid;
    }

}
