package backing;

import entity.Zstatusdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zstatusdocController")
@ViewScoped
public class ZstatusdocController extends AbstractController<Zstatusdoc> {

    public ZstatusdocController() {
        // Inform the Abstract parent controller of the concrete Zstatusdoc Entity
        super(Zstatusdoc.class);
    }

    /**
     * Sets the "items" attribute with a collection of ZstatusdocZdoc entities
     * that are retrieved from Zstatusdoc?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for ZstatusdocZdoc page
     */
    public String navigateZstatusdocZdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZstatusdocZdoc_items", this.getSelected().getZstatusdocZdocCollection());
        }
        return "/zstatusdocZdoc/index";
    }

    /**
     * Sets the "items" attribute with a collection of ZdocZstatusdoc entities
     * that are retrieved from Zstatusdoc?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for ZdocZstatusdoc page
     */
    public String navigateZdocZstatusdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZdocZstatusdoc_items", this.getSelected().getZdocZstatusdocCollection());
        }
        return "/zdocZstatusdoc/index";
    }

}
