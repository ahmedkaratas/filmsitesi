/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class FilmKategori {

    private int filmid;
    private int kategoriid;

    public FilmKategori() {
    }

    public FilmKategori(int filmid, int kategoriid ) {
        this.filmid = filmid;
        this.kategoriid = kategoriid;

    }

    public FilmKategori(int kategoriid) {
        this.kategoriid = kategoriid;
    }
  

    public int getId() {
        return filmid;
    }

    public void setId(int filmid) {
        this.filmid = filmid;
    }


    public int getKategoriid() {
        return kategoriid;
    }

    public void setKategoriid(int kategoriid) {
        this.kategoriid = kategoriid;
    }


    @Override
    public String toString() {
        return "FilmKategori{" + "id=" + filmid + ", adi=" + kategoriid + '}';
    }


}
