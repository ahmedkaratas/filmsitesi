
package dao;


import entity.photos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class photosDAO extends DBConnection {
    public void create(photos p) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "insert into photos (plink.filmid) values ('" + p.getPlink() + "','" +  p.getFilm_id() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void delete(photos p) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "delete from photos where id = " + p.getPhotos_id();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      public void update(photos p) {                
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "update photos set plink = '" + p.getPlink()  + "',filmid= '" + p.getFilm_id()+ "' where id =" +p.getPhotos_id() ;
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      public List<photos> getList() {
        List<photos> list = new ArrayList<>();
        try {
            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "select * from photos";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new photos(rs.getInt("photos_id"), rs.getInt("plink"), rs.getString("tarih")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}
