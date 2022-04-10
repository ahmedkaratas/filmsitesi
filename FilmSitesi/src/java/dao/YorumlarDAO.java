
package dao;

import entity.Yorumlar;
import entity.sss;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class YorumlarDAO extends DBConnection{
    public void create(Yorumlar y) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "insert into Yorumlar (yorum,tarih) values ('" + y.getYorum() + "','" + y.getTarih() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
     public void delete(Yorumlar y) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "delete from Yorumlar where id = " + y.getKullanici_id();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void update(Yorumlar y) {                
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "update Yorumlar set yorum = '" + y.getYorum()  + "',tarih= '" + y.getTarih() + "' where id =" +y.getKullanici_id() ;
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     public List<Yorumlar> getList() {
        List<Yorumlar> list = new ArrayList<>();
        try {
            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "select * from Yorumlar";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new Yorumlar(rs.getInt("kullanici_id"), rs.getInt("film_id"), rs.getString("yorum"),rs.getString("tarih")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
     
}
