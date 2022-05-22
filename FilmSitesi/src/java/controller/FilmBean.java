/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.FilmDAO;
import entity.Film;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "filmBean")
@SessionScoped
public class FilmBean implements Serializable {

    private Film entity;
    private FilmDAO dao;
    private List<Film> list;

    public FilmBean() {
    }

    public void create() {
        this.getDao().createFilm(entity);
        this.entity = new Film();
    }

    public void update() {
        this.getDao().updateFilm(entity);
        this.entity = new Film();

    }

    public void delete(Film f) {
        this.getDao().deleteFilm(f);
    }

    

    public Film getEntity() {
        if (this.entity == null) {
            this.entity = new Film();
        }
        return entity;
    }

    public void setEntity(Film entity) {
        this.entity = entity;
    }

    public FilmDAO getDao() {
        if (this.dao == null) {
            this.dao = new FilmDAO();
        }
        return dao;
    }

    public void setDao(FilmDAO dao) {
        this.dao = dao;
    }

    public List<Film> getList() {
        this.list = this.getDao().getFilmList();
        return list;
    }

    public void setList(List<Film> list) {
        this.list = list;
    }

}
