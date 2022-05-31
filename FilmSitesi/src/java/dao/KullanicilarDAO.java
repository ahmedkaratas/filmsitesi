package dao;

import entity.Kullanicilar;
import entity.SystemGroup;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KullanicilarDAO extends DBConnection {

    private GroupDAO sdao;

    public Kullanicilar getUser(String eposta, String sifre) {
        Kullanicilar u = null;
        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanicilar where eposta='" + eposta + "' and sifre='" + sifre + "'");
            rs.next();
            SystemGroup g = this.getSdao().getByID(rs.getInt("ugroup"));
            u = new Kullanicilar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("sifre"), g);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return u;
    }

    public void createKullanicilar(Kullanicilar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into kullanicilar (kullaniciadi,ad,soyad,eposta,sifre,ugroup) values ('" + k.getKullaniciadi() + "','" + k.getAd() + "','" + k.getSoyad() + "','" + k.getEposta() + "','" + k.getSifre() + "','')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void createKullanicilar1(Kullanicilar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into kullanicilar (kullaniciadi,ad,soyad,eposta,sifre,ugroup) values ('" + k.getKullaniciadi() + "','" + k.getAd() + "','" + k.getSoyad() + "','" + k.getEposta() + "','" + k.getSifre() + "','" + k.getGroup().getId() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteKullanicilar(Kullanicilar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from kullanicilar where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateKullanicilar(Kullanicilar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update kullanicilar set kullaniciadi ='" + k.getKullaniciadi() + "', ad='" + k.getAd() + "', soyad='" + k.getSoyad() + "', eposta='" + k.getEposta() + "', sifre='" + k.getSifre() + "' where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateKullanicilar1(Kullanicilar k) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update kullanicilar set kullaniciadi ='" + k.getKullaniciadi() + "', ad='" + k.getAd() + "', soyad='" + k.getSoyad() + "', eposta='" + k.getEposta() + "', sifre='" + k.getSifre() + "', ugroup='" + k.getGroup().getId() + "'where id =" + k.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void updateKullanicilar2(Kullanicilar k, int id) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update kullanicilar set kullaniciadi ='" + k.getKullaniciadi() + "', ad='" + k.getAd() + "', soyad='" + k.getSoyad() + "', eposta='" + k.getEposta() + "', sifre='" + k.getSifre() + "', ugroup='" + k.getGroup().getId() + "'where id =" + id;
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Kullanicilar> getKullanicilarList(int page, int pageSize) {
        List<Kullanicilar> KullanicilarList = new ArrayList<>();

        int start = (page - 1) * pageSize;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from kullanicilar order by id asc limit '" + pageSize + "' offset '" + start + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                SystemGroup g = this.getSdao().getByID(rs.getInt("ugroup"));
                KullanicilarList.add(new Kullanicilar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("sifre"), g));

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
            String q = "select count(id) as kullanici_count from kullanicilar";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("kullanici_count");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public GroupDAO getSdao() {
        if (this.sdao == null) {
            this.sdao = new GroupDAO();
        }
        return sdao;
    }

    public void setSdao(GroupDAO sdao) {
        this.sdao = sdao;
    }


}
