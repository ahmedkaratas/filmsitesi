/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.KullanicilarDAO;
import entity.Kullanicilar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


@Named(value = "kullanicilar")
@SessionScoped
public class KullanicilarBean implements Serializable {
    private Kullanicilar entity;
    private KullanicilarDAO dao;
    private List<Kullanicilar> list;

    public KullanicilarBean() {
    }
    
    public void create(){
        
        this.getDao().create(entity);
    }

    public Kullanicilar getEntity() {
        if (this.entity == null){
            this.entity = new Kullanicilar();
        }
        return entity;
        
    }

    public void setEntity(Kullanicilar entity) {
        this.entity = entity;
    }

    public KullanicilarDAO getDao() {
        if (this.dao == null){
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
