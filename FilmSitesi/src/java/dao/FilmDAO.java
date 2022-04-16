package dao;

import util.DBConnection;
import entity.Film;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO extends DBConnection {

    public void create(Film f) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();
            String q = "insert into film (ad,tur,vizyon,sure,ulke,puan,yassiniri,filmlinki,aciklama,gorsel) values ('" + f.getAd() + ","+f.getTur()+""+f.getVizyon()+""+f.getSure()+""+f.getUlke()+""+f.getPuan()+""+f.getYassiniri()+""+f.getFilmlinki()+""+f.getAciklama()+""+f.getGorsel()+"')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void delete(Film f) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from film where id=" + f.getFilmid();

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Film f) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update film set ad='" + f.getAd() + "' where id=" + f.getFilmid();

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Film> getList() {
        List<Film> list = new ArrayList<>();
        try {
            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "select * from film";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new Film(rs.getInt("filmid"), rs.getString("ad"), rs.getString("tur"),rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getDouble("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
