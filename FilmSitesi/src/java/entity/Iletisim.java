/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Eren Can
 */
public class Iletisim {

    private int id;
    private String ad;
    private String soyad;
    private String eposta;
    private String baslik;
    private String mesaj;

    public Iletisim() {
    }

    public Iletisim(int id, String ad, String soyad, String eposta, String baslik, String mesaj) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.baslik = baslik;
        this.mesaj = mesaj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public String toString() {
        return "Iletisim{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", eposta=" + eposta + ", baslik=" + baslik + ", mesaj=" + mesaj + '}';
    }

}
