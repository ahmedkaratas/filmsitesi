/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Kategori {

    private int id;
    private String adi;

    public Kategori() {
    }

    public Kategori(int id, String adi ) {
        this.id = id;
        this.adi = adi;

    }

    public Kategori(String ad) {
        this.adi = adi;
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String ad) {
        this.adi = ad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final Kategori other = (Kategori) obj;
        return this.id == other.id;
    }


    @Override
    public String toString() {
        return "Kategori{" + "id=" + id + ", adi=" + adi + '}';
    }


}
