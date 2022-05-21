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
        this.list = this.getDao().getFotograflarList();
        return list;
    }

    public void setList(List<Fotograflar> list) {
        this.list = list;
    }

}
