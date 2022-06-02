/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.KullanicilarDAO;
import dao.LoglarDAO;
import entity.Kullanicilar;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Eren Can
 */
@Named
@SessionScoped
public class SessionBean implements Serializable {

    private Kullanicilar user;
    private KullanicilarDAO udao;
    private String eposta;
    private String sifre;
    LoglarDAO LoglarDAO = new LoglarDAO();
    
    Date tarih = new Date(System.currentTimeMillis());

    public SessionBean() {
    }

    public void  login(){
        Kullanicilar user = this.getUdao().getUser(this.eposta, this.sifre);
        if (user != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
            LoglarDAO.createLog(this.eposta + " hesabı oturum açarak sisteme giriş yaptı.","127.0.0.1",tarih.toString());
            
        } else {
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kullanıcı bilgileri geçersiz."));
            
        }
    }
    
    

    public Kullanicilar getUser() {
        return user;
    }
    
    public Kullanicilar updateUser() {
        return user;
    }

    public void setUser(Kullanicilar user) {
        this.user = user;
    }

    public KullanicilarDAO getUdao() {
        if (this.udao == null) {
            this.udao = new KullanicilarDAO();
        }
        return udao;
    }

    public void setUdao(KullanicilarDAO udao) {
        this.udao = udao;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
