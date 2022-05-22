package controller;

import Validator.ValidatorBean;
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

    public void delete(Kullanicilar k) {
        this.getDao().deleteKullanicilar(k);
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
        this.list = this.getDao().getKullanicilarList();
        return list;
    }

    public void setList(List<Kullanicilar> list) {
        this.list = list;
    }

}
