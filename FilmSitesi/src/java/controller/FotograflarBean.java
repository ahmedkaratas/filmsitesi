package controller;

import dao.FotograflarDAO;
import entity.Fotograflar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "fotograflarBean")
@SessionScoped
public class FotograflarBean implements Serializable {

    private Fotograflar entity;
    private FotograflarDAO dao;
    private List<Fotograflar> list;

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

    public FotograflarBean() {
    }

    public void create() {
        this.getDao().createFotograflar(entity);
        this.entity = new Fotograflar();
    }

    public void update() {
        this.getDao().updateFotograflar(entity);
        this.entity = new Fotograflar();

    }

    public void delete(Fotograflar k) {
        this.getDao().deleteFotograflar(k);
    }

    public void clear() {
        this.entity = new Fotograflar();
    }

    public Fotograflar getEntity() {
        if (this.entity == null) {
            this.entity = new Fotograflar();
        }
        return entity;
    }

    public void setEntity(Fotograflar entity) {
        this.entity = entity;
    }

    public FotograflarDAO getDao() {
        if (this.dao == null) {
            this.dao = new FotograflarDAO();
        }
        return dao;
    }

    public void setDao(FotograflarDAO dao) {
        this.dao = dao;
    }

    public List<Fotograflar> getList() {
        this.list = this.getDao().getFotograflarList(page, pageSize);
        return list;
    }

    public void setList(List<Fotograflar> list) {
        this.list = list;
    }

}
