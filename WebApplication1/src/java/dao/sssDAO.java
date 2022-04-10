
package dao;

import util.DBConnection;
import entity.sss;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class sssDAO extends DBConnection{
    public void create(sss s) {
        try {

            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "insert into post (title,context) values ('" + s.getSoru() + "','" + s.getCevap() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
     public List<sss> getList() {
        List<sss> list = new ArrayList<>();
        try {
            Connection c = this.connect();
            Statement st = c.createStatement();

            String q = "select * from sss";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                list.add(new sss(rs.getInt("sss_id"), rs.getString("soru"), rs.getString("cevap")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    
}
