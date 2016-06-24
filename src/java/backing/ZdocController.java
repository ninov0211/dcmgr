package backing;

import entity.Zdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocController")
@ViewScoped
public class ZdocController extends AbstractController<Zdoc> {

    @Inject
    private ZdoctabelController zdoctabelidController;
    @Inject
    private ZuserController zuseridController;

    public ZdocController() {
        // Inform the Abstract parent controller of the concrete Zdoc Entity
        super(Zdoc.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdoctabelidController.setSelected(null);
        zuseridController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Zdocline entities that
     * are retrieved from Zdoc?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zdocline page
     */
    public String navigateZdoclineCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdocline_items", this.getSelected().getZdoclineCollection());
        }
        return "/zdocline/index";
    }

    /**
     * Sets the "selected" attribute of the Zdoctabel controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdoctabelid(ActionEvent event) {
        if (this.getSelected() != null && zdoctabelidController.getSelected() == null) {
            zdoctabelidController.setSelected(this.getSelected().getZdoctabelid());
        }
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZuserid(ActionEvent event) {
        if (this.getSelected() != null && zuseridController.getSelected() == null) {
            zuseridController.setSelected(this.getSelected().getZuserid());
        }
    }
}
