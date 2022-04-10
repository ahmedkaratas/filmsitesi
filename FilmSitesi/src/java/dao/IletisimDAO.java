
package dao;

import entity.Iletisim;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class IletisimDAO extends DBConnection {
    
    public void create(Iletisim s){
        try{
            Statement st = this.connect().createStatement();
            String query = "insert into iletisim (ad,soyad,eposta,baslik,mesaj) values ('"+s.getAd+"','"+s.getSoyad+"','"+s.getEposta+"','"+s.getBaslik+"','"+s.getMesaj+"')";
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    
    public void delete(Iletisim s){
        try{
            Statement st = this.connect().createStatement();
            String query = "delete from iletisim where id="+s.getId();
            
            st.executeUpdate(query);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Iletisim> getList(){
        List<Iletisim> list = new ArrayList<>();
        try{
            Statement st = this.connect().createStatement();
            String query = "select * from iletisim";
            
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                list.add(new Iletisim(rs.getInt("id"), rs.getString("ad"), rs.getString("soyad"), rs.getString("eposta"), rs.getString("baslik"), rs.getString("mesaj")));
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
