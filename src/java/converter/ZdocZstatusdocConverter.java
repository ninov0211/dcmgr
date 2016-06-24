package converter;

import entity.ZdocZstatusdoc;
import entity.ZdocZstatusdocFacade;
import backing.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "zdocZstatusdocConverter")
public class ZdocZstatusdocConverter implements Converter {

    @Inject
    private ZdocZstatusdocFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entity.ZdocZstatusdocPK getKey(String value) {
        entity.ZdocZstatusdocPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entity.ZdocZstatusdocPK();
        key.setZstatusdocsZstatusdocid(Integer.parseInt(values[0]));
        key.setZdocZdocid(Long.parseLong(values[1]));
        return key;
    }

    String getStringKey(entity.ZdocZstatusdocPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getZstatusdocsZstatusdocid());
        sb.append(SEPARATOR);
        sb.append(value.getZdocZdocid());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof ZdocZstatusdoc) {
            ZdocZstatusdoc o = (ZdocZstatusdoc) object;
            return getStringKey(o.getZdocZstatusdocPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ZdocZstatusdoc.class.getName()});
            return null;
        }
    }

}
