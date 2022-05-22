package dao;

import entity.Loglar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class LoglarDAO extends DBConnection {

    public void createLoglar(Loglar l) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into loglar (kullaniciadi,hareket,ip,tarih) values ('" + l.getKullaniciadi() + "','" + l.getHareket() + "','" + l.getIp() + "','" + l.getTarih() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteLoglar(Loglar l) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from loglar where id =" + l.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateLoglar(Loglar l) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update loglar set kullaniciadi ='" + l.getKullaniciadi() + "', hareket='" + l.getHareket() + "', ip='" + l.getIp() + "', tarih='" + l.getTarih() + "'where id =" + l.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Loglar> getLoglarList(int page, int pageSize) {
        List<Loglar> LoglarList = new ArrayList<>();

        try {
            
            int start = (page-1)*pageSize;

            Statement st = this.getConnection().createStatement();
            String q = "select * from loglar order by id asc limit '" + pageSize + "' offset '" + start + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                LoglarList.add(new Loglar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("hareket"), rs.getString("ip"), rs.getDate("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return LoglarList;
    }

    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(id) as log_count from loglar";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("log_count");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

}
