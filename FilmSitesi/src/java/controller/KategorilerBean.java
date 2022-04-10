package controller;

import dao.KategorilerDAO;
import entity.Kategoriler;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "kategoriBean")
@SessionScoped
public class KategorilerBean implements Serializable {

    private Kategoriler entity;
    private KategorilerDAO dao;
    private List<Kategoriler> list;

    public String create() {
        this.getDao().create(entity);
        entity = new Kategoriler();

        return "index";
    }

    public void delete(Kategoriler k) {
        this.getDao().delete(k);
    }

    public void update() {
        this.getDao().update(this.entity);
        this.entity = new Kategoriler();
    }

    public Kategoriler getEntity() {
        return entity;
    }

    public void setEntity(Kategoriler entity) {
        this.entity = entity;
    }

    public KategorilerDAO getDao() {
        return dao;
    }

    public void setDao(KategorilerDAO dao) {
        this.dao = dao;
    }

    public List<Kategoriler> getList() {
        return list;
    }

    public void setList(List<Kategoriler> list) {
        this.list = list;
    }

    public KategorilerBean() {
    }

}
