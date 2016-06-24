package backing;

import entity.Zdocdistribusi;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocdistribusiController")
@ViewScoped
public class ZdocdistribusiController extends AbstractController<Zdocdistribusi> {

    @Inject
    private ZuserController zuseridController;

    public ZdocdistribusiController() {
        // Inform the Abstract parent controller of the concrete Zdocdistribusi Entity
        super(Zdocdistribusi.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zuseridController.setSelected(null);
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
