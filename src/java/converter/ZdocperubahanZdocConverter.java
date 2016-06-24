package converter;

import entity.ZdocperubahanZdoc;
import entity.ZdocperubahanZdocFacade;
import backing.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "zdocperubahanZdocConverter")
public class ZdocperubahanZdocConverter implements Converter {

    @Inject
    private ZdocperubahanZdocFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entity.ZdocperubahanZdocPK getKey(String value) {
        entity.ZdocperubahanZdocPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entity.ZdocperubahanZdocPK();
        key.setZdoccollectionZdocid(Long.parseLong(values[0]));
        key.setZdocperubahancollectionZdocperubahanid(Long.parseLong(values[1]));
        return key;
    }

    String getStringKey(entity.ZdocperubahanZdocPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getZdoccollectionZdocid());
        sb.append(SEPARATOR);
        sb.append(value.getZdocperubahancollectionZdocperubahanid());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof ZdocperubahanZdoc) {
            ZdocperubahanZdoc o = (ZdocperubahanZdoc) object;
            return getStringKey(o.getZdocperubahanZdocPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ZdocperubahanZdoc.class.getName()});
            return null;
        }
    }

}
