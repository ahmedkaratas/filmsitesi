package dao;


import entity.Yorumlar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class YorumlarDAO extends DBConnection {

    private Connection db;

    public void createYorumlar(Yorumlar y) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into yorumlar (kullaniciid,filmid,yorum,tarih) values ('" + y.getKullaniciid() + "','" + y.getFilmid() + "','" + y.getYorum() + "','" + y.getTarih() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteYorumlar(Yorumlar y) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from yorumlar where yorumid =" + y.getYorumid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateYorumlar(Yorumlar y) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update yorumlar set kullaniciid ='" + y.getKullaniciid() + "', filmid='" + y.getFilmid() + "', yorum='" + y.getYorum() + "', tarih='" + y.getTarih() + "'where yorumid =" + y.getYorumid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Yorumlar> getYorumlarList() {
        List<Yorumlar> YorumlarList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from yorumlar";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                YorumlarList.add(new Yorumlar(rs.getInt("yorumid"),rs.getInt("kullaniciid"), rs.getInt("filmid"), rs.getString("yorum"),  rs.getDate("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return YorumlarList;
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
