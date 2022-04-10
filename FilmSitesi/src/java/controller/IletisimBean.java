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
 * @author Ahmed
 */
@Named(value = "kullanıcılarBean")
@SessionScoped
public class IletisimBean implements Serializable {

    private Iletisim entity;
    private IletisimDAO dao;
    private List<Iletisim> list;

    public IletisimBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new Iletisim();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new Iletisim();
    }

    public Iletisim getEntity() {
        if (entity == null) {
            entity = new Iletisim();
        }
        return entity;
    }

    public void setEntity(Iletisim entity) {
        this.entity = entity;
    }

    public IletisimDAO getDao() {
        if (dao == null) {
            dao = new IletisimDAO();
        }
        return dao;
    }

    public void setDao(IletisimDAO dao) {
        this.dao = dao;
    }

    public List<Iletisim> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Iletisim> list) {
        this.list = list;
    }

}
