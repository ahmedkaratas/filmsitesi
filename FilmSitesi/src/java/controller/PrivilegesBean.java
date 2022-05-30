package controller;

import dao.PrivilegesDAO;
import entity.Privileges;
import entity.SystemGroup;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "privilegesBean")
@SessionScoped
public class PrivilegesBean implements Serializable {

    private Privileges entity;
    private PrivilegesDAO dao;
    private List<Privileges> list;
    
    public Privileges getPrivilege(SystemGroup sg, String module) {
        return this.getDao().getGroupPrivileges(sg,module);
    }

    private int page = 1;
    private int pageSize = 10;
    private int pageCount;

    public void next() {
        if (this.page == this.getPageCount()) {
            this.page = 1;
        } else {
            this.page++;
        }
    }

    public void previous() {
        if (this.page == 1) {
            this.page = this.getPageCount();
        } else {
            this.page--;
        }
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
        this.pageCount = (int) Math.ceil(this.getDao().count() / (double) pageSize);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public PrivilegesBean() {
    }

    public void clear() {
        this.entity = new Privileges();
    }

    public void create() {
        this.getDao().createPrivileges(entity);
        this.entity = new Privileges();
    }

    public void update() {
        this.getDao().updatePrivileges(entity);
        this.entity = new Privileges();

    }

    public void delete(Privileges k) {
        this.getDao().deletePrivileges(k);
    }

    public Privileges getEntity() {
        if (this.entity == null) {
            this.entity = new Privileges();
        }
        return entity;
    }

    public void setEntity(Privileges entity) {
        this.entity = entity;
    }

    public PrivilegesDAO getDao() {
        if (this.dao == null) {
            this.dao = new PrivilegesDAO();
        }
        return dao;
    }

    public void setDao(PrivilegesDAO dao) {
        this.dao = dao;
    }

    public List<Privileges> getList() {
        this.list = this.getDao().getPrivilegesList(page, pageSize);
        return list;
    }

    public void setList(List<Privileges> list) {
        this.list = list;
    }

}
