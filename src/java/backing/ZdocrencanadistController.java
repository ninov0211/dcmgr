package backing;

import entity.Zdocrencanadist;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocrencanadistController")
@ViewScoped
public class ZdocrencanadistController extends AbstractController<Zdocrencanadist> {

    @Inject
    private ZuserController zuserIdController;

    public ZdocrencanadistController() {
        // Inform the Abstract parent controller of the concrete Zdocrencanadist Entity
        super(Zdocrencanadist.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zuserIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZuserId(ActionEvent event) {
        if (this.getSelected() != null && zuserIdController.getSelected() == null) {
            zuserIdController.setSelected(this.getSelected().getZuserId());
        }
    }
}
