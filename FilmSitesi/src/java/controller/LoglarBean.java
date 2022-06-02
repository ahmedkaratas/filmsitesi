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

    private int page=1;
    private int pageSize=10;
    private int pageCount;

    public void next(){
        if ( this.page == this.getPageCount())
            this.page = 1;
        else
            this.page++;
    }
    
    public void previous(){
        if ( this.page == 1 )
            this.page = this.getPageCount();
        else
            this.page--;
    }
    
     public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        this.pageCount = (int) Math.ceil(this.getDao().count()/(double)pageSize);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LoglarBean() {

    }

    public void create(String hareket, String ip, String tarih) {
        this.getDao().createLoglar(hareket,ip,tarih);
        this.entity = new Loglar();
    }

    public void update() {
        this.getDao().updateLoglar(entity);
        this.entity = new Loglar();

    }

    public void delete(Loglar l) {
        this.getDao().deleteLoglar(l);
    }
    
    public void clear() {
        this.entity = new Loglar();
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
        this.list = this.getDao().getLoglarList(page, pageSize);
        return list;
    }

    public void setList(List<Loglar> list) {
        this.list = list;
    }

}
