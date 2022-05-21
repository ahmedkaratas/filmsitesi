package controller;

import dao.KategoriDAO;
import entity.Kategori;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "kullanicilarBean")
@SessionScoped
public class KategoriBean implements Serializable {

    private Kategori entity;
    private KategoriDAO dao;
    private List<Kategori> list;

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
        this.list = this.getDao().getKategoriList();
        return list;
    }

    public void setList(List<Kategori> list) {
        this.list = list;
    }

}
