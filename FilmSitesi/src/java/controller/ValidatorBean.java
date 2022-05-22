
package Validator;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.ValidatorException;
import java.io.IOException;
import javax.lang.model.SourceVersion;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

@FacesValidator
public class ValidatorBean extends Validator {

    public ValidatorBean() {
    }
    
    public boolean validateSifre(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        String v = (String) value;
        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Şifre alanı boş bırakılamaz !"));
        } else if (v.length() < 8) {
            throw new ValidatorException(new FacesMessage("Şifre alanı 8 karakterden kısa olamaz!"));

        }
        return true;

    }

    public boolean validateKullaniciAdi(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        String v = (String) value;
        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Kullanıcı Adı alanı boş olamaz!"));
        } else if (v.length() < 5) {
            throw new ValidatorException(new FacesMessage("Kullanıcı Adı  alanı 5 karakterden kısa olamaz!"));

        }
        return true;

    }
    public boolean validateAd(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        String v = (String) value;
        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Ad alanı boş bırakılamaz"));
        }
        return true;

    }

    public boolean validateSoyad(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        String v = (String) value;
        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Soyad alanı boş bırakılamaz"));

        }
        return true;

    }

    public boolean validateEposta(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        String v = (String) value;
        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("E-posta alanı boş bırkalımaz"));

        }
        return true;

    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void validate(Source source, Result result) throws SAXException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ErrorHandler getErrorHandler() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setResourceResolver(LSResourceResolver resourceResolver) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public LSResourceResolver getResourceResolver() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
