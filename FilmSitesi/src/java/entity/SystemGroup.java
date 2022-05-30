/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eren Can
 */
public class SystemGroup implements Serializable {

    private int id;
    private String gname;
    private Date created;
    private Date updated;

    public SystemGroup() {
    }

    public SystemGroup(int id, String gname, Date created, Date updated) {
        this.id = id;
        this.gname = gname;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SystemGroup other = (SystemGroup) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "SystemGroup{" + "id=" + id + ", gname=" + gname + ", created=" + created + ", updated=" + updated + '}';
    }

}
