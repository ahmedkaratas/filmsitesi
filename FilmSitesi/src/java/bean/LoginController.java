/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import entity.UserManager;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author Ahmed
 */
@Named(value="lc")
@SessionScoped
public class LoginController implements Serializable{
    private UserManager user;

    public LoginController() {
    }
    
    public void login(){
        if ( user.getUsername().equals("test") && user.getPassword().equals("123") ){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("validUser", user);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Username or Password is Wrong!"));
        }
    }

    public UserManager getUser() {
        if ( user == null ){
            user = new UserManager();
        }
        return user;
    }

    public void setUser(UserManager user) {
        this.user = user;
    }
    
    
    
}
