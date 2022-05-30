/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.GroupDAO;
import entity.SystemGroup;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Eren Can
 */
@FacesConverter("groupConverter")
public class GroupConverter implements Converter {

    private GroupDAO sdao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);

        return this.getSdao().getByID(id);

    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        SystemGroup sg = (SystemGroup) t;
        return String.valueOf(sg.getId());
    }

    public GroupDAO getSdao() {
        if (this.sdao == null) {
            this.sdao = new GroupDAO();
        }
        return sdao;
    }

    public void setSdao(GroupDAO sdao) {
        this.sdao = sdao;
    }

}
