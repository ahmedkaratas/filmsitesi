package dao;

import entity.Fotograflar;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FotograflarDAO extends DBConnection {

    private Connection db;

    public void createFotograflar(Fotograflar k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into fotograflar (filmid,linki) values ('" + k.getFilmid() + "','" + k.getLinki() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteFotograflar(Fotograflar k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from fotograflar where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void updateFotograflar(Fotograflar k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update fotograflar set filmid ='" + k.getFilmid() + "', linki='" + k.getLinki() +  "' where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Fotograflar> getFotograflarList() {
        List<Fotograflar> FotograflarList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from fotograflar";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                FotograflarList.add(new Fotograflar(rs.getInt("id"), rs.getInt("filmid"), rs.getString("linki")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FotograflarList;
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