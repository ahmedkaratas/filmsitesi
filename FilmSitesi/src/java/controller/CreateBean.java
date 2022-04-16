/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Ahmed
 */
@Named(value = "createBean")
@SessionScoped
public class CreateBean implements Serializable {
    
    private int id;
    private String adi;

    public CreateBean() {
    }
    
    public String create(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/filmsitesi","postgres","323678");
            
            Statement st = c.createStatement();
            
            String q = "insert into kategori (adi) values ('"+adi+"')";
            st.executeUpdate(q);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "create";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    
    
}
