package entity;

public class Film {

    private int filmid;
    private String adı;
    private String türü;
    private String vizyontarihi;
    private String filmsüresi;
    private String ülkesi;
    private double puanı;
    private String yassınırı;
    private String link;
    private String açıklama;
    private String görsel;

    public Film(int filmid, String adı, String türü, String vizyontarihi, String filmsüresi, String ülkesi, double puanı, String yassınırı, String link, String açılama, String görsel) {
        this.filmid = filmid;
        this.adı = adı;
        this.türü = türü;
        this.vizyontarihi = vizyontarihi;
        this.filmsüresi = filmsüresi;
        this.ülkesi = ülkesi;
        this.puanı = puanı;
        this.yassınırı = yassınırı;
        this.link = link;
        this.açıklama = açılama;
        this.görsel = görsel;
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

    public String getTürü() {
        return türü;
    }

    public void setTürü(String türü) {
        this.türü = türü;
    }

    public String getVizyontarihi() {
        return vizyontarihi;
    }

    public void setVizyontarihi(String vizyontarihi) {
        this.vizyontarihi = vizyontarihi;
    }

    public String getFilmsüresi() {
        return filmsüresi;
    }

    public void setFilmsüresi(String filmsüresi) {
        this.filmsüresi = filmsüresi;
    }

    public String getÜlkesi() {
        return ülkesi;
    }

    public void setÜlkesi(String ülkesi) {
        this.ülkesi = ülkesi;
    }

    public double getPuanı() {
        return puanı;
    }

    public void setPuanı(double puanı) {
        this.puanı = puanı;
    }

    public String getYassınırı() {
        return yassınırı;
    }

    public void setYassınırı(String yassınırı) {
        this.yassınırı = yassınırı;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAçıklama() {
        return açıklama;
    }

    public void setAçıklama(String açılama) {
        this.açıklama = açılama;
    }

    public String getGörsel() {
        return görsel;
    }

    public void setGörsel(String görsel) {
        this.görsel = görsel;
    }

}
