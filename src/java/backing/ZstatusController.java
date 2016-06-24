package backing;

import entity.Zstatus;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zstatusController")
@ViewScoped
public class ZstatusController extends AbstractController<Zstatus> {

    public ZstatusController() {
        // Inform the Abstract parent controller of the concrete Zstatus Entity
        super(Zstatus.class);
    }

    /**
     * Sets the "items" attribute with a collection of Zdocline entities that
     * are retrieved from Zstatus?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zdocline page
     */
    public String navigateZdoclineCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdocline_items", this.getSelected().getZdoclineCollection());
        }
        return "/zdocline/index";
    }

}
