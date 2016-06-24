package backing;

import entity.Zdoctabel;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zdoctabelController")
@ViewScoped
public class ZdoctabelController extends AbstractController<Zdoctabel> {

    public ZdoctabelController() {
        // Inform the Abstract parent controller of the concrete Zdoctabel Entity
        super(Zdoctabel.class);
    }

    /**
     * Sets the "items" attribute with a collection of Zdoc entities that are
     * retrieved from Zdoctabel?cap_first and returns the navigation outcome.
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
     * are retrieved from Zdoctabel?cap_first and returns the navigation
     * outcome.
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
     * are retrieved from Zdoctabel?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Zprivilage page
     */
    public String navigateZprivilageCollection1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zprivilage_items", this.getSelected().getZprivilageCollection1());
        }
        return "/zprivilage/index";
    }

}
