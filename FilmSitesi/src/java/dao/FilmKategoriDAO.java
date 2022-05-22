package dao;

import entity.FilmKategori;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FilmKategoriDAO extends DBConnection {

    private Connection db;

    public void createFilmKategori(FilmKategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into filmkategori (kategoriid) values ('" + k.getKategoriid() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteFilmKategori(FilmKategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from filmkategori where filmid =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void updateKategori(FilmKategori k) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update filmkategori set kategoriid ='" + k.getKategoriid() +  "' where filmid =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<FilmKategori> getFilmKategoriList() {
        List<FilmKategori> FilmKategoriList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from filmkategori";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                FilmKategoriList.add(new FilmKategori(rs.getInt("filmid"), rs.getInt("kategoriid")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FilmKategoriList;
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