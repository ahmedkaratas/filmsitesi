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
import entity.Kategori;

import util.DBConnection;



public class FilmDAO extends DBConnection {

    
    public void createFilm(Film f) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into film (ad,tur,vizyon,sure,ulke,puan,yassiniri,filmlinki,aciklama,gorsel) values ('" + f.getAd() + "','" + f.getTur() + "','" + f.getVizyon() + "','" + f.getSure() + "','" + f.getUlke() + "'," + f.getPuan() + ",'" + f.getYassiniri() + "','" + f.getFilmlinki() + "','" + f.getAciklama() + "','" + f.getGorsel() + "')";
            st.executeUpdate(q);
            
            ResultSet rs = st.executeQuery("select max(filmid) as mid from film");
            rs.next();
            
            int film_id = rs.getInt("mid");
            
            for ( Kategori cat : f.getCategories() ){
                q = "insert into filmkategori (film_id, kategori_id) values ("+film_id+","+cat.getId()+")";
                st.executeUpdate(q);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteFilm(Film f) {
        try {

            Statement st = this.getConnection().createStatement();
            st.executeUpdate("delete from filmkategori where film_id="+f.getFilmid());
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
            
            st.executeUpdate("delete from filmkategori where film_id="+f.getFilmid());
            
            for ( Kategori cat : f.getCategories() ){
                q = "insert into filmkategori (film_id, kategori_id) values ("+f.getFilmid()+","+cat.getId()+")";
                st.executeUpdate(q);
            }
            
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
                
                FilmList.add(new Film(rs.getInt("Filmid"), this.getPostCategories(rs.getInt("filmid")), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getDouble("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FilmList;
    }
    
    public List<Film> getFilmListFull() {
        List<Film> FilmList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from film";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                
                FilmList.add(new Film(rs.getInt("Filmid"), this.getPostCategories(rs.getInt("filmid")), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getDouble("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FilmList;
    }
    
    public List<Film> getListTekFilm(int filmid) {
        List<Film> FilmList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from film where filmid=" + filmid;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                
                FilmList.add(new Film(rs.getInt("Filmid"), this.getPostCategories(rs.getInt("filmid")), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getDouble("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return FilmList;
    }
    
    public List<Kategori> getPostCategories(int film_id){
        List<Kategori> KategoriList = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String q = "select * from kategori where id in (select kategori_id from filmkategori where film_id="+film_id+")";
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
                f = new Film(rs.getInt("filmid"), this.getPostCategories(rs.getInt("filmid")), rs.getString("ad"), rs.getString("tur"), rs.getString("vizyon"), rs.getString("sure"), rs.getString("ulke"), rs.getDouble("puan"), rs.getString("yassiniri"), rs.getString("filmlinki"), rs.getString("aciklama"), rs.getString("gorsel"));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return f;
    }

    

}
