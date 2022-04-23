/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Sss;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Eren Can
 */
public class SssDAO extends DBConnection {

    private Connection db;

    public void createSss(Sss s) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into sss (soru,cevap) values ('" + s.getSoru() + "','" + s.getCevap() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteSss(Sss s) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from sss where soruid =" + s.getSoruid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateSss(Sss s) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update sss set soru ='" + s.getSoru() + "', cevap='" + s.getCevap() + "' where soruid =" + s.getSoruid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Sss> getSssList() {
        List<Sss> SssList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from sss";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                SssList.add(new Sss(rs.getInt("soruid"), rs.getString("soru"), rs.getString("cevap")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return SssList;
    }

    public Connection getDb() {
        if (this.db == null) {
            this.db = this.connect();
        }

        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

}
