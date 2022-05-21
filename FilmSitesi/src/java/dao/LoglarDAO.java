package dao;


import entity.Loglar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class LoglarDAO extends DBConnection {

    private Connection db;

    public void createLoglar(Loglar l) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "insert into loglar (kullaniciadi,hareket,ip,tarih) values ('" + l.getKullaniciadi() + "','" + l.getHareket() + "','" + l.getIp() + "','" + l.getTarih() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteLoglar(Loglar l) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "delete from loglar where id =" + l.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateLoglar(Loglar l) {
        try {

            Statement st = this.getDb().createStatement();
            String q = "update loglar set kullaniciadi ='" + l.getKullaniciadi() + "', hareket='" + l.getHareket() + "', ip='" + l.getIp() + "', tarih='" + l.getTarih() + "'where id =" + l.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Loglar> getLoglarList() {
        List<Loglar> LoglarList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();
            String q = "select * from loglar";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                LoglarList.add(new Loglar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("hareket"), rs.getString("ip"), rs.getDate("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return LoglarList;
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
