package controller;

import dao.KategoriDAO;
import entity.Kategori;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "kategoriBean")
@SessionScoped
public class KategoriBean implements Serializable {

    private Kategori entity;
    private KategoriDAO dao;
    private List<Kategori> list;

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

    public KategoriBean() {
    }

    public void create() {
        this.getDao().createKategori(entity);
        this.entity = new Kategori();
    }

    public void update() {
        this.getDao().updateKategori(entity);
        this.entity = new Kategori();

    }

    public void delete(Kategori k) {
        this.getDao().deleteKategori(k);
    }

    public Kategori getEntity() {
        if (this.entity == null) {
            this.entity = new Kategori();
        }
        return entity;
    }

    public void setEntity(Kategori entity) {
        this.entity = entity;
    }

    public KategoriDAO getDao() {
        if (this.dao == null) {
            this.dao = new KategoriDAO();
        }
        return dao;
    }

    public void setDao(KategoriDAO dao) {
        this.dao = dao;
    }

    public List<Kategori> getList() {
        this.list = this.getDao().getKategoriList(page, pageSize);
        return list;
    }

    public void setList(List<Kategori> list) {
        this.list = list;
    }

}
