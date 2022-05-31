package controller;

import dao.KullanicilarDAO;
import entity.Kullanicilar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.util.List;

@Named(value = "kullanicilarBean")
@SessionScoped
public class KullanicilarBean implements Serializable {

    private Kullanicilar entity;
    private KullanicilarDAO dao;
    private ValidatorBean vb;
    private List<Kullanicilar> list;

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

    public KullanicilarBean() {
    }

    public void create() {
        this.getDao().createKullanicilar(entity);
        this.entity = new Kullanicilar();
    }

    public void update() {
        this.getDao().updateKullanicilar(entity);
        this.entity = new Kullanicilar();

    }

    public void update2() {
        this.getDao().updateKullanicilar2(entity);
        this.entity = new Kullanicilar();

    }

    public void create1() {
        this.getDao().createKullanicilar1(entity);
        this.entity = new Kullanicilar();
    }

    public void update1() {
        this.getDao().updateKullanicilar1(entity);
        this.entity = new Kullanicilar();

    }

    public void delete(Kullanicilar k) {
        this.getDao().deleteKullanicilar(k);
    }

    public void clear() {
        this.entity = new Kullanicilar();
    }

    public Kullanicilar getEntity() {
        if (this.entity == null) {
            this.entity = new Kullanicilar();
        }
        return entity;
    }

    public ValidatorBean getVb() {
        if (this.vb == null) {
            this.vb = new ValidatorBean();
        }
        return vb;
    }

    public void setVb(ValidatorBean vb) {
        this.vb = vb;
    }

    public void setEntity(Kullanicilar entity) {
        this.entity = entity;
    }

    public KullanicilarDAO getDao() {
        if (this.dao == null) {
            this.dao = new KullanicilarDAO();
        }
        return dao;
    }

    public void setDao(KullanicilarDAO dao) {
        this.dao = dao;
    }

    public List<Kullanicilar> getList() {
        this.list = this.getDao().getKullanicilarList(page, pageSize);
        return list;
    }

    public void setList(List<Kullanicilar> list) {
        this.list = list;
    }

}
