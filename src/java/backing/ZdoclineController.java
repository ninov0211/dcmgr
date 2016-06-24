package backing;

import entity.Zdocline;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdoclineController")
@ViewScoped
public class ZdoclineController extends AbstractController<Zdocline> {

    @Inject
    private ZdocController zdocidController;

    public ZdoclineController() {
        // Inform the Abstract parent controller of the concrete Zdocline Entity
        super(Zdocline.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdocidController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Zstatus entities that are
     * retrieved from Zdocline?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zstatus page
     */
    public String navigateZstatusCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zstatus_items", this.getSelected().getZstatusCollection());
        }
        return "/zstatus/index";
    }

    /**
     * Sets the "selected" attribute of the Zdoc controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdocid(ActionEvent event) {
        if (this.getSelected() != null && zdocidController.getSelected() == null) {
            zdocidController.setSelected(this.getSelected().getZdocid());
        }
    }

    /**
     * Sets the "items" attribute with a collection of ZdoclineZdoc entities
     * that are retrieved from Zdocline?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for ZdoclineZdoc page
     */
    public String navigateZdoclineZdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZdoclineZdoc_items", this.getSelected().getZdoclineZdocCollection());
        }
        return "/zdoclineZdoc/index";
    }

}
