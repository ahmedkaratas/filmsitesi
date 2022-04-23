/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Kullanicilar {

    private int id;
    private String kullaniciadi;
    private String ad;
    private String soyad;
    private String eposta;
    private String sifre;

    public Kullanicilar() {
    }

    

    public Kullanicilar(int id, String kullaniciadi,  String ad, String soyad, String eposta, String sifre ) {
        this.id = id;
        this.kullaniciadi=kullaniciadi;
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.sifre = sifre;

    }

    public Kullanicilar(String ad) {
        this.ad = ad;
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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "Kullanicilar{" + "id=" + id + ", kullaniciadi=" + kullaniciadi + ", ad=" + ad + ", soyad=" + soyad + ", eposta=" + eposta + ", sifre=" + sifre + '}';
    }


}
