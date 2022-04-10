
package dao;

import entity.Loglar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class LoglarDAO extends DBConnection {
    
    public void create(Loglar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "insert into loglar (kullaniciadi,hareket,ip,tarih) values ('"+s.getKullaniciadi+"','"+s.getHareket+"','"+s.getIp+"','"+s.getTarih+"')";
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    
    public void update(Loglar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "update loglar set hareket='"+s.getHareket()+"' where id="+s.getId();
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(Loglar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "delete from loglar where id="+s.getId();
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Loglar> getList(){
        List<Loglar> list = new ArrayList<>();
        try{
            Statement st = this.connect().createStatement();
            String query = "select * from loglar";
            
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                list.add(new Loglar(rs.getInt("id"), rs.getString("hareket"), rs.getString("ip"), rs.getString("tarih")));
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
