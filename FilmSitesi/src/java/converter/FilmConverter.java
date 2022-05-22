/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.FilmDAO;
import entity.Film;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Eren Can
 */
@FacesConverter("filmConverter")
public class FilmConverter implements Converter {

    private FilmDAO filmDao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int filmid = Integer.valueOf(string);
        Film f = this.getFilmDao().findByID(filmid);
        return f;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        Film f =(Film)t;
        return String.valueOf(f.getFilmid());
    }

    public FilmDAO getFilmDao() {
        if (filmDao == null) {
            this.filmDao = new FilmDAO();
        }
        return filmDao;
    }

    public void setFilmDao(FilmDAO filmDao) {
        this.filmDao = filmDao;
    }

}
