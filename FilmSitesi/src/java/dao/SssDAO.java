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

    

    public void createSss(Sss s) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into sss (soru,cevap) values ('" + s.getSoru() + "','" + s.getCevap() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteSss(Sss s) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from sss where soruid =" + s.getSoruid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateSss(Sss s) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update sss set soru ='" + s.getSoru() + "', cevap='" + s.getCevap() + "' where soruid =" + s.getSoruid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Sss> getSssList(int page, int pageSize) {
        List<Sss> SssList = new ArrayList<>();
        
        int start = (page-1)*pageSize;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from sss order by soruid asc limit '" + pageSize + "' offset '" + start + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                SssList.add(new Sss(rs.getInt("soruid"), rs.getString("soru"), rs.getString("cevap")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return SssList;
    }
    
    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(soruid) as soru_count from sss";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("soru_count");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    

}
