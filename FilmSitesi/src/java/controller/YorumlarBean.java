/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.YorumlarDAO;
import entity.Kullanicilar;
import entity.Yorumlar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Named(value = "yorumlarBean")
@SessionScoped
public class YorumlarBean implements Serializable {

    private Yorumlar entity;
    private YorumlarDAO dao;
    private List<Yorumlar> list;
    private List<Yorumlar> YorumList;

    private int page = 1;
    private int pageSize = 10;
    private int pageCount;
    private List<Kullanicilar> KullaniciYorum;

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

    public YorumlarBean() {
    }

    public void create() {
        this.entity.setTarih(new Date(System.currentTimeMillis()));
        this.getDao().createYorumlar(entity);
        this.entity = new Yorumlar();
    }

    public void update() {
        this.getDao().updateYorumlar(entity);
        this.entity = new Yorumlar();

    }

    public void delete(Yorumlar y) {
        this.getDao().deleteYorumlar(y);
    }

    public void clear() {
        this.entity = new Yorumlar();
    }

    public Yorumlar getEntity() {
        if (this.entity == null) {
            this.entity = new Yorumlar();
        }
        return entity;
    }

    public void setEntity(Yorumlar entity) {
        this.entity = entity;
    }

    public YorumlarDAO getDao() {
        if (this.dao == null) {
            this.dao = new YorumlarDAO();
        }
        return dao;
    }

    public void setDao(YorumlarDAO dao) {
        this.dao = dao;
    }

    public List<Yorumlar> getList() {
        this.list = this.getDao().getYorumlarList(page, pageSize);
        return list;
    }

    public void setList(List<Yorumlar> list) {
        this.list = list;
    }
    
    public List<Yorumlar> getYorumList(int filmid) {
        this.YorumList = this.getDao().getFilmYorumlarList(filmid);
        return YorumList;
    }

    public void setYorumList(List<Yorumlar> YorumList) {
        this.YorumList = YorumList;
    }
    
    public List<Kullanicilar> getKullaniciYorum(int kid) {
        this.KullaniciYorum = this.getDao().getKullaniciAdi(kid);
        return KullaniciYorum;
    }

    public void setKullaniciYorum(List<Kullanicilar> KullaniciYorum) {
        this.KullaniciYorum = KullaniciYorum;
    }
}
