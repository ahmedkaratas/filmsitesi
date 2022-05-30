/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Eren Can
 */
public class Privileges {

    private int id;
    private SystemGroup pgroup;
    private String mname;
    private boolean icreate;
    private boolean iupdate;
    private boolean idelete;
    private boolean ilist;
    private boolean ishow;
    private boolean iread;

    public Privileges() {
    }

    public Privileges(int id, SystemGroup pgroup, String mname, boolean icreate, boolean iupdate, boolean idelete, boolean ilist, boolean ishow, boolean iread) {
        this.id = id;
        this.pgroup = pgroup;
        this.mname = mname;
        this.icreate = icreate;
        this.iupdate = iupdate;
        this.idelete = idelete;
        this.ilist = ilist;
        this.ishow = ishow;
        this.iread = iread;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SystemGroup getPgroup() {
        return pgroup;
    }

    public void setPgroup(SystemGroup pgroup) {
        this.pgroup = pgroup;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public boolean isIcreate() {
        return icreate;
    }

    public void setIcreate(boolean icreate) {
        this.icreate = icreate;
    }

    public boolean isIupdate() {
        return iupdate;
    }

    public void setIupdate(boolean iupdate) {
        this.iupdate = iupdate;
    }

    public boolean isIdelete() {
        return idelete;
    }

    public void setIdelete(boolean idelete) {
        this.idelete = idelete;
    }

    public boolean isIlist() {
        return ilist;
    }

    public void setIlist(boolean ilist) {
        this.ilist = ilist;
    }

    public boolean isIshow() {
        return ishow;
    }

    public void setIshow(boolean ishow) {
        this.ishow = ishow;
    }

    public boolean isIread() {
        return iread;
    }

    public void setIread(boolean iread) {
        this.iread = iread;
    }

}
