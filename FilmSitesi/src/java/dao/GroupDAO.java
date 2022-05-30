/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Eren Can
 */
import entity.SystemGroup;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GroupDAO extends DBConnection {

    public SystemGroup getByID(int id) {
        SystemGroup sg = null;
        try {
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from systemgroup where id= " + id);
            rs.next();
            sg = new SystemGroup(rs.getInt("id"), rs.getString("gname"), rs.getDate("created"), rs.getDate("updated"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sg;
    }

    public void createSystemGroup(SystemGroup g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into systemgroup (gname) values ('" + g.getGname() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteSystemGroup(SystemGroup g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from systemgroup where id =" + g.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateSystemGroup(SystemGroup g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update systemgroup set gname ='" + g.getGname() + "' where id =" + g.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<SystemGroup> getSystemGroupList() {
        List<SystemGroup> SystemGroupList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from systemgroup");
            while (rs.next()) {
                SystemGroupList.add(new SystemGroup(rs.getInt("id"), rs.getString("gname"), rs.getDate("created"), rs.getDate("updated")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return SystemGroupList;

    }

}
