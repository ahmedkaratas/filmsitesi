package dao;

import entity.Film;
import entity.Fotograflar;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FotograflarDAO extends DBConnection {

    

    private FilmDAO filmDao;

    public void createFotograflar(Fotograflar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into fotograflar (filmid,linki) values ('" + k.getFilm_id().getFilmid() + "','" + k.getLinki() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteFotograflar(Fotograflar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from fotograflar where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateFotograflar(Fotograflar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update fotograflar set filmid ='" + k.getFilm_id().getFilmid() + "', linki='" + k.getLinki() + "' where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Fotograflar> getFotograflarList() {
        List<Fotograflar> FotograflarList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from fotograflar";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Film f = this.getFilmDao().findByID(rs.getInt("filmid"));
                FotograflarList.add(new Fotograflar(rs.getInt("id"),f, rs.getString("linki")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FotograflarList;
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
