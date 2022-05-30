package controller;

import dao.GroupDAO;
import entity.SystemGroup;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "systemgroupBean")
@SessionScoped
public class GroupBean implements Serializable {

    private SystemGroup entity;
    private GroupDAO dao;
    private List<SystemGroup> list;

    public GroupBean() {
    }

    public void clear() {
        this.entity = new SystemGroup();
    }

    public void create() {
        this.getDao().createSystemGroup(entity);
        this.entity = new SystemGroup();
    }

    public void update() {
        this.getDao().updateSystemGroup(entity);
        this.entity = new SystemGroup();

    }

    public void delete(SystemGroup g) {
        this.getDao().deleteSystemGroup(g);
    }

    public SystemGroup getEntity() {
        if (this.entity == null) {
            this.entity = new SystemGroup();
        }
        return entity;
    }

    public void setEntity(SystemGroup entity) {
        this.entity = entity;
    }

    public GroupDAO getDao() {
        if (this.dao == null) {
            this.dao = new GroupDAO();
        }
        return dao;
    }

    public void setDao(GroupDAO dao) {
        this.dao = dao;
    }

    public List<SystemGroup> getList() {
        this.list = this.getDao().getSystemGroupList();
        return list;
    }

    public void setList(List<SystemGroup> list) {
        this.list = list;
    }

}
