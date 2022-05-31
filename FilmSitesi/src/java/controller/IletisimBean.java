/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.IletisimDAO;
import entity.Iletisim;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eren Can
 */
@Named(value = "iletisimBean")
@SessionScoped
public class IletisimBean implements Serializable {

    private Iletisim entity;
    private IletisimDAO dao;
    private List<Iletisim> list;

    private int page = 1;
    private int pageSize = 10;
    private int pageCount;

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

    public IletisimBean() {
    }

    public void create() {
        this.getDao().createIletisim(entity);
        this.entity = new Iletisim();
    }

    public void update() {
        this.getDao().updateIletisim(entity);
        this.entity = new Iletisim();

    }

    public void delete(Iletisim i) {
        this.getDao().deleteIletisim(i);
    }

    public void clear() {
        this.entity = new Iletisim();
    }

    public Iletisim getEntity() {
        if (this.entity == null) {
            this.entity = new Iletisim();
        }
        return entity;
    }

    public void setEntity(Iletisim entity) {
        this.entity = entity;
    }

    public IletisimDAO getDao() {
        if (this.dao == null) {
            this.dao = new IletisimDAO();
        }
        return dao;
    }

    public void setDao(IletisimDAO dao) {
        this.dao = dao;
    }

    public List<Iletisim> getList() {
        this.list = this.getDao().getIletisimList(page, pageSize);
        return list;
    }

    public void setList(List<Iletisim> list) {
        this.list = list;
    }

}
