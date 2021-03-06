package dao;

import entity.Film;
import entity.Kullanicilar;
import entity.SystemGroup;
import entity.Yorumlar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class YorumlarDAO extends DBConnection {

    
    private FilmDAO filmDao;

    public void createYorumlar(Yorumlar y) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into yorumlar (kullaniciid,filmid,yorum,tarih) values ('" + y.getKullaniciid() + "','" + y.getFilmid().getFilmid() + "','" + y.getYorum() + "','" + y.getTarih() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    

    public void deleteYorumlar(Yorumlar y) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from yorumlar where yorumid =" + y.getYorumid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateYorumlar(Yorumlar y) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update yorumlar set kullaniciid ='" + y.getKullaniciid() + "', filmid='" + y.getFilmid().getFilmid() + "', yorum='" + y.getYorum() + "', tarih='" + y.getTarih() + "'where yorumid =" + y.getYorumid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Yorumlar> getYorumlarList(int page, int pageSize) {
        List<Yorumlar> YorumlarList = new ArrayList<>();
        
        int start = (page-1)*pageSize;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from yorumlar order by yorumid asc limit '" + pageSize + "' offset '" + start + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Film f = this.getFilmDao().findByID(rs.getInt("filmid"));
                YorumlarList.add(new Yorumlar(rs.getInt("yorumid"),rs.getInt("kullaniciid"),f, rs.getString("yorum"),  rs.getDate("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return YorumlarList;
    }
    
    public List<Yorumlar> getFilmYorumlarList(int filmid) {
        List<Yorumlar> YorumlarList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from yorumlar where filmid=" + filmid;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Film f = this.getFilmDao().findByID(rs.getInt("filmid"));
                YorumlarList.add(new Yorumlar(rs.getInt("yorumid"),rs.getInt("kullaniciid"),f, rs.getString("yorum"),  rs.getDate("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return YorumlarList;
    }
    
    public List<Kullanicilar> getKullaniciAdi(int kid) {
        List<Kullanicilar> KullanicilarList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from kullanicilar where id="+ kid;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                KullanicilarList.add(new Kullanicilar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("sifre")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return KullanicilarList;
    }
    
    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(yorumid) as yorum_count from yorumlar";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("yorum_count");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

      public FilmDAO getFilmDao() {
        if (filmDao == null) {
            this.filmDao = new FilmDAO();
        }
        return filmDao;
    }

    public void setFilmDao(FilmDAO filmDao) {
        this.filmDao = filmDao;
    }
    

}
