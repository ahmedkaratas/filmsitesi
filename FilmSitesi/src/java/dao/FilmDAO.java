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
            String q = "insert into film (adı,türü,vizyontarihi,filmsüresi,ülkesi,puanı,yassınırı,link,açılama,görsel) values ('" + f.getAdı() + ","+f.getTürü()+""+f.getVizyontarihi()+""+f.getFilmsüresi()+""+f.getÜlkesi()+""+f.getPuanı()+""+f.getYassınırı()+""+f.getLink()+""+f.getAçıklama()+""+f.getGörsel()+"')";
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
            String query = "update film set adı='" + f.getAdı() + "' where id=" + f.getFilmid();

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

            String q = "select * from Kategoriler";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new Film(rs.getInt("filmid"), rs.getString("adı"), rs.getString("türü"),rs.getString("vizyontarihi"), rs.getString("filmsüresi"), rs.getString("ülkesi"), rs.getDouble("puanı"), rs.getString("yassınırı"), rs.getString("link"), rs.getString("açıklama"), rs.getString("görsel")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
