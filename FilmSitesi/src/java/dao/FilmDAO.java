/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Film;

import util.DBConnection;



public class FilmDAO extends DBConnection {

    
    public void createFilm(Film f) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into film (ad,tur,vizyon,sure,ulke,puan,yassiniri,filmlinki,aciklama,gorsel) values ('" + f.getAd() + "','" + f.getTur() + "','" + f.getVizyon() + "','" + f.getSure() + "','" + f.getUlke() + "'," + f.getPuan() + ",'" + f.getYassiniri() + "','" + f.getFilmlinki() + "','" + f.getAciklama() + "','" + f.getGorsel() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteFilm(Film f) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from film  where filmid =" + f.getFilmid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateFilm(Film f) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update film set ad ='" + f.getAd() + "', tur='" + f.getTur() + "', vizyon='" + f.getVizyon() + "', sure='" + f.getSure() + "', ulke='" + f.getUlke() + "', puan='" + f.getPuan() + "', yassiniri='" + f.getYassiniri() + "', filmlinki='" + f.getFilmlinki() + "', aciklama='" + f.getAciklama() + "', gorsel='" + f.getGorsel() + "' where filmid =" + f.getFilmid();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Film> getFilmList(int page, int pageSize) {
        List<Film> FilmList = new ArrayList<>();
        
        int start = (page-1)*pageSize;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from film order by filmid asc limit '" + pageSize + "' offset '" + start + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                FilmList.add(new Film(rs.getInt("Filmid"), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getInt("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FilmList;
    }
    
    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(filmid) as film_count from film";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("film_count");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public Film findByID(int filmid) {

        Film f = null;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from film where filmid="+filmid;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                f = new Film(rs.getInt("filmid"), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getInt("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel"));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return f;
    }

    

}
