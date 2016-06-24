package backing;

import entity.ZdocZstatusdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocZstatusdocController")
@ViewScoped
public class ZdocZstatusdocController extends AbstractController<ZdocZstatusdoc> {

    @Inject
    private ZstatusdocController zstatusdocController;

    public ZdocZstatusdocController() {
        // Inform the Abstract parent controller of the concrete ZdocZstatusdoc Entity
        super(ZdocZstatusdoc.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getZdocZstatusdocPK().setZstatusdocsZstatusdocid(this.getSelected().getZstatusdoc().getZstatusdocid());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setZdocZstatusdocPK(new entity.ZdocZstatusdocPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zstatusdocController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zstatusdoc controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZstatusdoc(ActionEvent event) {
        if (this.getSelected() != null && zstatusdocController.getSelected() == null) {
            zstatusdocController.setSelected(this.getSelected().getZstatusdoc());
        }
    }
}
