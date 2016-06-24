package backing;

import entity.Zdocperubahan;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zdocperubahanController")
@ViewScoped
public class ZdocperubahanController extends AbstractController<Zdocperubahan> {

    public ZdocperubahanController() {
        // Inform the Abstract parent controller of the concrete Zdocperubahan Entity
        super(Zdocperubahan.class);
    }

    /**
     * Sets the "items" attribute with a collection of ZdocperubahanZdoc
     * entities that are retrieved from Zdocperubahan?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for ZdocperubahanZdoc page
     */
    public String navigateZdocperubahanZdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZdocperubahanZdoc_items", this.getSelected().getZdocperubahanZdocCollection());
        }
        return "/zdocperubahanZdoc/index";
    }

}
