
package dao;

import entity.Kullanıcılar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class KullanıcılarDAO extends DBConnection {
    
    public void create(Kullanıcılar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "insert into kullanıcılar (kullaniciadi,ad,soyad,eposta,sifre) values ('"+s.getKullaniciadi+"','"+s.getAd+"','"+s.getSoyad+"','"+s.getEposta+"','"+s.getSifre+"')";
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    
    public void update(Kullanıcılar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "update kullanıcılar set kullaniciadi='"+s.getKullaniciadi()+"' where id="+s.getId();
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(Kullanıcılar s){
        try{
            Statement st = this.connect().createStatement();
            String query = "delete from kullanıcılar where id="+s.getId();
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Kullanıcılar> getList(){
        List<Kullanıcılar> list = new ArrayList<>();
        try{
            Statement st = this.connect().createStatement();
            String query = "select * from kullanıcılar";
            
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                list.add(new Kullanıcılar(rs.getInt("id"), rs.getString("kullaniciadi"), rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("sifre")));
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
