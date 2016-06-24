package backing;

import entity.Zuser;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zuserController")
@ViewScoped
public class ZuserController extends AbstractController<Zuser> {

    public ZuserController() {
        // Inform the Abstract parent controller of the concrete Zuser Entity
        super(Zuser.class);
    }

    /**
     * Sets the "items" attribute with a collection of Zdocrencanadist entities
     * that are retrieved from Zuser?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Zdocrencanadist page
     */
    public String navigateZdocrencanadistCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdocrencanadist_items", this.getSelected().getZdocrencanadistCollection());
        }
        return "/zdocrencanadist/index";
    }

    /**
     * Sets the "items" attribute with a collection of Zdocdistribusi entities
     * that are retrieved from Zuser?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Zdocdistribusi page
     */
    public String navigateZdocdistribusiCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdocdistribusi_items", this.getSelected().getZdocdistribusiCollection());
        }
        return "/zdocdistribusi/index";
    }

    /**
     * Sets the "items" attribute with a collection of Zdoc entities that are
     * retrieved from Zuser?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zdoc page
     */
    public String navigateZdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdoc_items", this.getSelected().getZdocCollection());
        }
        return "/zdoc/index";
    }

    /**
     * Sets the "items" attribute with a collection of Zprivilage entities that
     * are retrieved from Zuser?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zprivilage page
     */
    public String navigateZprivilageCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zprivilage_items", this.getSelected().getZprivilageCollection());
        }
        return "/zprivilage/index";
    }

    /**
     * Sets the "items" attribute with a collection of Zprivilage entities that
     * are retrieved from Zuser?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zprivilage page
     */
    public String navigateZprivilageCollection1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zprivilage_items", this.getSelected().getZprivilageCollection1());
        }
        return "/zprivilage/index";
    }

    /**
     * Sets the "items" attribute with a collection of ZdoclineZuser entities
     * that are retrieved from Zuser?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for ZdoclineZuser page
     */
    public String navigateZdoclineZuserCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZdoclineZuser_items", this.getSelected().getZdoclineZuserCollection());
        }
        return "/zdoclineZuser/index";
    }

}
