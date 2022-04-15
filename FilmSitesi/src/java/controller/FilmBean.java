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

/**
 *
 * @author celal
 */
@Named(value = "filmBean")
@SessionScoped
public class FilmBean implements Serializable {

    private Film entity;
    private FilmDAO dao;
    private List<Film> list;

    public FilmBean() {

    }

    public String create() {
        this.getDao().create(entity);
        entity = new Film();

        return "index";
    }

    public void delete(Film s) {
        this.getDao().delete(s);
    }

    public void update() {
        this.getDao().update(this.entity);
        this.entity = new Film();
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
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Film> list) {
        this.list = list;
    }

}
