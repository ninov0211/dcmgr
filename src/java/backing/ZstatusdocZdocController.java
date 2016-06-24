package backing;

import entity.ZstatusdocZdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zstatusdocZdocController")
@ViewScoped
public class ZstatusdocZdocController extends AbstractController<ZstatusdocZdoc> {

    @Inject
    private ZstatusdocController zstatusdocController;

    public ZstatusdocZdocController() {
        // Inform the Abstract parent controller of the concrete ZstatusdocZdoc Entity
        super(ZstatusdocZdoc.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getZstatusdocZdocPK().setZstatusdoccollectionZstatusdocid(this.getSelected().getZstatusdoc().getZstatusdocid());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setZstatusdocZdocPK(new entity.ZstatusdocZdocPK());
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
