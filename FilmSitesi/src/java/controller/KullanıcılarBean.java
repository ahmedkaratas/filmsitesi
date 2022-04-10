/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.KullanıcılarDAO;
import entity.Kullanıcılar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Ahmed
 */
@Named(value = "kullanıcılarBean")
@SessionScoped
public class KullanıcılarBean implements Serializable {

    private Kullanıcılar entity;
    private KullanıcılarDAO dao;
    private List<Kullanıcılar> list;

    public KullanıcılarBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new Kullanıcılar();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Kullanıcılar();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new Kullanıcılar();
    }

    public Kullanıcılar getEntity() {
        if (entity == null) {
            entity = new Kullanıcılar();
        }
        return entity;
    }

    public void setEntity(Kullanıcılar entity) {
        this.entity = entity;
    }

    public KullanıcılarDAO getDao() {
        if (dao == null) {
            dao = new KullanıcılarDAO();
        }
        return dao;
    }

    public void setDao(KullanıcılarDAO dao) {
        this.dao = dao;
    }

    public List<Kullanıcılar> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Kullanıcılar> list) {
        this.list = list;
    }

}
