/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Eren Can
 */
public class Sss {
    private int soruid;
    private String soru;
    private String cevap;

    public Sss() {
    }

    public Sss(int soruid, String soru, String cevap) {
        this.soruid = soruid;
        this.soru = soru;
        this.cevap = cevap;
    }

    public int getSoruid() {
        return soruid;
    }

    public void setSoruid(int soruid) {
        this.soruid = soruid;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    @Override
    public String toString() {
        return "Sss{" + "soruid=" + soruid + ", soru=" + soru + ", cevap=" + cevap + '}';
    }
    
    
}
