/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.LoglarDAO;
import entity.Loglar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Ahmed
 */
@Named
@SessionScoped
public class LoglarBean implements Serializable {

    private Loglar entity;
    private LoglarDAO dao;
    private List<Loglar> list;

    public LoglarBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new Loglar();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Loglar();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new Loglar();
    }

    public Loglar getEntity() {
        if (entity == null) {
            entity = new Loglar();
        }
        return entity;
    }

    public void setEntity(Loglar entity) {
        this.entity = entity;
    }

    public LoglarDAO getDao() {
        if (dao == null) {
            dao = new LoglarDAO();
        }
        return dao;
    }

    public void setDao(LoglarDAO dao) {
        this.dao = dao;
    }

    public List<Loglar> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Loglar> list) {
        this.list = list;
    }

}
