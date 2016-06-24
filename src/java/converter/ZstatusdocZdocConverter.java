package converter;

import entity.ZstatusdocZdoc;
import entity.ZstatusdocZdocFacade;
import backing.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "zstatusdocZdocConverter")
public class ZstatusdocZdocConverter implements Converter {

    @Inject
    private ZstatusdocZdocFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entity.ZstatusdocZdocPK getKey(String value) {
        entity.ZstatusdocZdocPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entity.ZstatusdocZdocPK();
        key.setZstatusdoccollectionZstatusdocid(Integer.parseInt(values[0]));
        key.setZdoccollectionZdocid(Long.parseLong(values[1]));
        return key;
    }

    String getStringKey(entity.ZstatusdocZdocPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getZstatusdoccollectionZstatusdocid());
        sb.append(SEPARATOR);
        sb.append(value.getZdoccollectionZdocid());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof ZstatusdocZdoc) {
            ZstatusdocZdoc o = (ZstatusdocZdoc) object;
            return getStringKey(o.getZstatusdocZdocPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ZstatusdocZdoc.class.getName()});
            return null;
        }
    }

}
