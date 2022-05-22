package controller;

import dao.FilmKategoriDAO;
import entity.FilmKategori;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "filmkategoriBean")
@SessionScoped
public class FilmKategoriBean implements Serializable {

    private FilmKategori entity;
    private FilmKategoriDAO dao;
    private List<FilmKategori> list;

    public FilmKategoriBean() {
    }

    public void create() {
        this.getDao().createFilmKategori(entity);
        this.entity = new FilmKategori();
    }

    public void update() {
        this.getDao().updateKategori(entity);
        this.entity = new FilmKategori();
        
    }

    public void delete(FilmKategori k) {
        this.getDao().deleteFilmKategori(k);
    }

    public FilmKategori getEntity() {
        if (this.entity == null) {
            this.entity = new FilmKategori();
        }
        return entity;
    }

    public void setEntity(FilmKategori entity) {
        this.entity = entity;
    }

    public FilmKategoriDAO getDao() {
        if (this.dao == null) {
            this.dao = new FilmKategoriDAO();
        }
        return dao;
    }

    public void setDao(FilmKategoriDAO dao) {
        this.dao = dao;
    }

    public List<FilmKategori> getList() {
        this.list = this.getDao().getFilmKategoriList();
        return list;
    }

    public void setList(List<FilmKategori> list) {
        this.list = list;
    }

}
