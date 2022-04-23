/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.SssDAO;
import entity.Sss;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Eren Can
 */
@Named(value = "sssBean")
@SessionScoped
public class SssBean implements Serializable {

    private Sss entity;
    private SssDAO dao;
    private List<Sss> list;

    public SssBean() {
    }

    public void create() {
        this.getDao().createSss(entity);
        this.entity = new Sss();
    }

    public void update() {
        this.getDao().updateSss(entity);
        this.entity = new Sss();

    }

    public void delete(Sss s) {
        this.getDao().deleteSss(s);
    }

    public Sss getEntity() {
        if (this.entity == null) {
            this.entity = new Sss();
        }
        return entity;
    }

    public void setEntity(Sss entity) {
        this.entity = entity;
    }

    public SssDAO getDao() {
        if (this.dao == null) {
            this.dao = new SssDAO();
        }
        return dao;
    }

    public void setDao(SssDAO dao) {
        this.dao = dao;
    }

    public List<Sss> getList() {
        this.list = this.getDao().getSssList();
        return list;
    }

    public void setList(List<Sss> list) {
        this.list = list;
    }

}
