package dao;

import entity.Kategori;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KategoriDAO extends DBConnection {

    public void createKategori(Kategori k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into kategori (adi) values ('" + k.getAdi() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteKategori(Kategori k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from kategori where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateKategori(Kategori k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update kategori set adi ='" + k.getAdi() + "' where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Kategori> getKategoriList(int page, int pageSize) {
        List<Kategori> KategoriList = new ArrayList<>();
        
         int start = (page-1)*pageSize;
        
        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from kategori order by id asc limit '" + pageSize + "' offset '" + start + "'";;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                KategoriList.add(new Kategori(rs.getInt("id"), rs.getString("adi")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return KategoriList;

    }

    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(id) as id_count from kategori";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("id_count");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

}
