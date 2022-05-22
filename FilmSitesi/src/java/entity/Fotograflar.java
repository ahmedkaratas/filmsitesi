/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Fotograflar {

    private int id;
    private Film film_id;
    private String linki;

    public Fotograflar() {
    }

    public Fotograflar(int id, Film film_id, String linki) {
        this.id = id;
        this.film_id = film_id;
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

    public Film getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Film film_id) {
        this.film_id = film_id;
    }

    public String getLinki() {
        return linki;
    }

    public void setLinki(String linki) {
        this.linki = linki;
    }

    @Override
    public String toString() {
        return "Fotograflar{" + "id=" + id + ", filmid=" + film_id + ", linki=" + linki + '}';
    }

}
