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
    private List<Film> listFull;
    private List<Film> TekFilm;

    private int page = 1;
    private int pageSize = 10;
    private int pageCount;
    private int filmid = 1;

    public void next() {
        if (this.page == this.getPageCount()) {
            this.page = 1;
        } else {
            this.page++;
        }
    }

    public void previous() {
        if (this.page == 1) {
            this.page = this.getPageCount();
        } else {
            this.page--;
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        this.pageCount = (int) Math.ceil(this.getDao().count() / (double) pageSize);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

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

    public void clear() {
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
        this.list = this.getDao().getFilmList(page, pageSize);
        return list;
    }

    public void setList(List<Film> list) {
        this.list = list;
    }
    
    public List<Film> getTekFilm(int filmid) {
        this.TekFilm = this.getDao().getListTekFilm(filmid);
        return TekFilm;
    }

    public void setTekFilm(List<Film> TekFilm) {
        this.TekFilm = TekFilm;
    }
    
    public List<Film> getListFull() {
        this.listFull = this.getDao().getFilmListFull();
        return listFull;
    }
    
    public void setListFull(List<Film> listFull) {
        this.listFull = listFull;
    }
    

}
