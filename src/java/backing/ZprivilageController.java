package backing;

import entity.Zprivilage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zprivilageController")
@ViewScoped
public class ZprivilageController extends AbstractController<Zprivilage> {

    @Inject
    private ZdoctabelController zdoctabelid1Controller;
    @Inject
    private ZdoctabelController zdoctabelZdoctabelidController;
    @Inject
    private ZuserController zuserid1Controller;
    @Inject
    private ZuserController zuserZuseridController;

    public ZprivilageController() {
        // Inform the Abstract parent controller of the concrete Zprivilage Entity
        super(Zprivilage.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdoctabelid1Controller.setSelected(null);
        zdoctabelZdoctabelidController.setSelected(null);
        zuserid1Controller.setSelected(null);
        zuserZuseridController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zdoctabel controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdoctabelid1(ActionEvent event) {
        if (this.getSelected() != null && zdoctabelid1Controller.getSelected() == null) {
            zdoctabelid1Controller.setSelected(this.getSelected().getZdoctabelid1());
        }
    }

    /**
     * Sets the "selected" attribute of the Zdoctabel controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdoctabelZdoctabelid(ActionEvent event) {
        if (this.getSelected() != null && zdoctabelZdoctabelidController.getSelected() == null) {
            zdoctabelZdoctabelidController.setSelected(this.getSelected().getZdoctabelZdoctabelid());
        }
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZuserid1(ActionEvent event) {
        if (this.getSelected() != null && zuserid1Controller.getSelected() == null) {
            zuserid1Controller.setSelected(this.getSelected().getZuserid1());
        }
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZuserZuserid(ActionEvent event) {
        if (this.getSelected() != null && zuserZuseridController.getSelected() == null) {
            zuserZuseridController.setSelected(this.getSelected().getZuserZuserid());
        }
    }
}
