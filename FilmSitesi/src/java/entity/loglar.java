package entity;

public class loglar {

    private int id;
    private String kullaniciadi;
    private String hareket;
    private String ip;
    private String tarih;

    public loglar(int id, String kullaniciadi, String hareket, String ip, String tarih) {
        this.id = id;
        this.kullaniciadi = kullaniciadi;
        this.hareket = hareket;
        this.ip = ip;
        this.tarih = tarih;

    }

    public loglar() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getHareket() {
        return hareket;
    }

    public void setHareket(String hareket) {
        this.hareket = hareket;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

}