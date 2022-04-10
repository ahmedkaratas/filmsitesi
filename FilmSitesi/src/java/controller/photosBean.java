/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.photosDAO;
import entity.Yorumlar;
import entity.photos;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author celal
 */
@Named(value = "photosBean")
@SessionScoped
public class photosBean implements Serializable {

    private photos entity;
    private photosDAO dao;
    private List<photos> list;

    public String create() {
        this.getDao().create(entity);
        entity = new photos();

        return "index";
    }
     public void delete(photos p){
       this.getDao().delete(p);
    }
     public void update(){
        this.getDao().update(this.entity);
         this.entity = new photos();
    }

    public photos getEntity() {
        if (this.entity == null) {
            this.entity = new photos();
        }
        return entity;
    }

    public void setEntity(photos entity) {
        this.entity = entity;
    }

    public photosDAO getDao() {
        if (this.dao == null) {
            this.dao = new photosDAO();
        }
        return dao;
    }

    public void setDao(photosDAO dao) {
        this.dao = dao;
    }

    public List<photos> getList() {
        return list;
    }

    public void setList(List<photos> list) {
        this.list = list;
    }

    public photosBean() {
    }

}
