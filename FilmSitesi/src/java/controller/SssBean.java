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
        this.list = this.getDao().getSssList(page, pageSize);
        return list;
    }

    public void setList(List<Sss> list) {
        this.list = list;
    }

}
