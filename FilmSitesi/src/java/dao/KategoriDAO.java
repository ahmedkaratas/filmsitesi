package dao;

import entity.Kategori;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KategoriDAO extends DBConnection {

    private Connection db;

    public void createKategori(Kategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into kategori (adi) values ('" + k.getAdi() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteKategori(Kategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from kategori where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void updateKategori(Kategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update kategori set adi ='" + k.getAdi() +  "' where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Kategori> getKategoriList() {
        List<Kategori> KategoriList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from kategori";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                KategoriList.add(new Kategori(rs.getInt("id"), rs.getString("adi")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return KategoriList;
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