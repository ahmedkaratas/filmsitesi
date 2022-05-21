/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.YorumlarDAO;
import entity.Yorumlar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


@Named(value = "yorumlarBean")
@SessionScoped
public class YorumlarBean implements Serializable {
    
    private Yorumlar entity;
    private YorumlarDAO dao;
    private List<Yorumlar> list;
   
    public YorumlarBean() {
    }
    public void create() {
        this.getDao().createYorumlar(entity);
        this.entity = new Yorumlar();
    }

    public void update() {
        this.getDao().updateYorumlar(entity);
        this.entity = new Yorumlar();
        
    }

    public void delete(Yorumlar y) {
        this.getDao().deleteYorumlar(y);
    }

    public Yorumlar getEntity() {
        if (this.entity == null) {
            this.entity = new Yorumlar();
        }
        return entity;
    }

    public void setEntity(Yorumlar entity) {
        this.entity = entity;
    }

    public YorumlarDAO getDao() {
        if (this.dao == null) {
            this.dao = new YorumlarDAO();
        }
        return dao;
    }

    public void setDao(YorumlarDAO dao) {
        this.dao = dao;
    }

    public List<Yorumlar> getList() {
        this.list = this.getDao().getYorumlarList();
        return list;
    }

    public void setList(List<Yorumlar> list) {
        this.list = list;
    }
}
