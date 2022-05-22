/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Iletisim;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Eren Can
 */
public class IletisimDAO extends DBConnection {

    

    public void createIletisim(Iletisim i) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into iletisim (ad,soyad,eposta,baslik,mesaj) values ('" + i.getAd() + "','" + i.getSoyad() + "','" + i.getEposta() + "','" + i.getBaslik() + "','" + i.getMesaj() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteIletisim(Iletisim i) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from iletisim where id =" + i.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateIletisim(Iletisim i) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update iletisim set ad='" + i.getAd() + "', soyad='" + i.getSoyad() + "', eposta='" + i.getEposta() + "', baslik='" + i.getBaslik() + "' where id =" + i.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Iletisim> getIletisimList() {
        List<Iletisim> IletisimList = new ArrayList<>();

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from iletisim";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                IletisimList.add(new Iletisim(rs.getInt("id"),rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("baslik"),rs.getString("mesaj")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return IletisimList;
    }

    

}
