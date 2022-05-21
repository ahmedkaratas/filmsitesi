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
import java.sql.Date;
import java.util.List;


@Named(value = "loglarBean")
@SessionScoped
public class LoglarBean implements Serializable {

    private Loglar entity;
    private LoglarDAO dao;
    private List<Loglar> list;
    
    public LoglarBean() {
        
        
    }
     public void create() {
        this.entity.setTarih(new Date(System.currentTimeMillis()));
        this.getDao().createLoglar(entity);
        this.entity = new Loglar();
    }

    public void update() {
        this.getDao().updateLoglar(entity);
        this.entity = new Loglar();
        
    }

    public void delete(Loglar l) {
        this.getDao().deleteLoglar(l);
    }

    public Loglar getEntity() {
        if (this.entity == null) {
            this.entity = new Loglar();
        }
        return entity;
    }

    public void setEntity(Loglar entity) {
        this.entity = entity;
    }

    public LoglarDAO getDao() {
        if (this.dao == null) {
            this.dao = new LoglarDAO();
        }
        return dao;
    }

    public void setDao(LoglarDAO dao) {
        this.dao = dao;
    }

    public List<Loglar> getList() {
        this.list = this.getDao().getLoglarList();
        return list;
    }

    public void setList(List<Loglar> list) {
        this.list = list;
    }
    
}
