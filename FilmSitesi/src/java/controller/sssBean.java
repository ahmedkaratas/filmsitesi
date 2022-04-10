/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.sssDAO;
import entity.sss;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author celal
 */
@Named(value = "sssBean")
@SessionScoped
public class sssBean implements Serializable {
    
   private sss entity;
   private sssDAO dao;
     private List<sss> list;
    public sssBean() {
        
        
    }
    public String create() {
        this.getDao().create(entity);
        entity = new sss();
        
        return "index";
    }
    public void delete(sss s){
       this.getDao().delete(s);
    }
    public void update(){
        this.getDao().update(this.entity);
         this.entity = new sss();
    }

    public sss getEntity() {
        if (this.entity == null) {
            this.entity = new sss();
        }
        return entity;
    }

    public void setEntity(sss entity) {
        this.entity = entity;
    }

    public sssDAO getDao() {
        if (this.dao == null) {
            this.dao = new sssDAO();
        }
        return dao;
    }

    public void setDao(sssDAO dao) {
        this.dao = dao;
    }

    public void setList(List<sss> list) {
        this.list = list;
    }

    public List<sss> getList() {
        this.list = this.getDao().getList();
        return list;
    }
     

    
     
    
}
