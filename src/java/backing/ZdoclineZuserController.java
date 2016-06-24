package backing;

import entity.ZdoclineZuser;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdoclineZuserController")
@ViewScoped
public class ZdoclineZuserController extends AbstractController<ZdoclineZuser> {

    @Inject
    private ZuserController zusersZuseridController;

    public ZdoclineZuserController() {
        // Inform the Abstract parent controller of the concrete ZdoclineZuser Entity
        super(ZdoclineZuser.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zusersZuseridController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZusersZuserid(ActionEvent event) {
        if (this.getSelected() != null && zusersZuseridController.getSelected() == null) {
            zusersZuseridController.setSelected(this.getSelected().getZusersZuserid());
        }
    }
}
