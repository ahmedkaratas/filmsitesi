/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Fotograflar {

    private int id;
    private int filmid;
    private String linki;

    public Fotograflar() {
    }

    

    public Fotograflar(int id, int filmid,  String linki ) {
        this.id = id;
        this.filmid = filmid;
        this.linki = linki;

    }

    public Fotograflar(String linki) {
        this.linki = linki;
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getLinki() {
        return linki;
    }

    public void setLinki(String ad) {
        this.linki = linki;
    }
    

    @Override
    public String toString() {
        return "Fotograflar{" + "id=" + id + ", filmid=" + filmid + ", linki=" + linki + '}';
    }


}
