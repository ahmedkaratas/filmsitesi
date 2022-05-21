package entity;

import java.sql.Date;

public class Loglar {

    private int id;
    private String kullaniciadi;
    private String hareket;
    private String ip;
    private Date tarih;

    public Loglar(int id, String kullaniciadi, String hareket, String ip, Date tarih) {
        this.id = id;
        this.kullaniciadi = kullaniciadi;
        this.hareket = hareket;
        this.ip = ip;
        this.tarih = tarih;

    }

    public Loglar() {

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

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Loglar{" + "id=" + id + ", kullaniciadi=" + kullaniciadi + ", hareket=" + hareket + ", ip=" + ip + ", tarih=" + tarih + '}';
    }

    


}