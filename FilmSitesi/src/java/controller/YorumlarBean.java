/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.YorumlarDAO;
import dao.sssDAO;
import entity.Yorumlar;
import entity.sss;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author celal
 */
@Named(value = "yorumlarBean")
@SessionScoped
public class YorumlarBean implements Serializable {
     private Yorumlar entity;
    private YorumlarDAO dao;
     private List<Yorumlar> list;
     
     public String create() {
        this.getDao().create(entity);
        entity = new Yorumlar();
        
        return "index";
    }
     public void delete(Yorumlar y){
       this.getDao().delete(y);
    }
     public void update(){
        this.getDao().update(this.entity);
         this.entity = new Yorumlar();
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
        return dao;
    }

    public void setDao(YorumlarDAO dao) {
        this.dao = dao;
    }

    public List<Yorumlar> getList() {
        return list;
    }

    public void setList(List<Yorumlar> list) {
        this.list = list;
    }
    
    public YorumlarBean() {
        
    }
    
}
