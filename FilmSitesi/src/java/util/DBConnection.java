
package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    
     private Connection connection;

    public Connection getConnection() {
        if(this.connection==null){
           try{
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbs:postgresql://localhost:5432/blog", "postgres", "12345");
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
}
