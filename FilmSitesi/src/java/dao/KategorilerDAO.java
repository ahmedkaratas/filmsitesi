package dao;

import util.DBConnection;
import entity.Kategoriler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KategorilerDAO extends DBConnection {

    public void create(Kategoriler k) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();
            String q = "insert into Kategoriler (adı) values ('" + k.getAdı() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void delete(Kategoriler k) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from kategoriler where id=" + k.getKategori_id();

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Kategoriler k) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update kategoriler set adı='" + k.getAdı() + "' where id=" + k.getFilmid();

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Kategoriler> getList() {
        List<Kategoriler> list = new ArrayList<>();
        try {
            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "select * from Kategoriler";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new Kategoriler(rs.getInt("kategori_id"), rs.getInt("filmid"), rs.getString("adı")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
