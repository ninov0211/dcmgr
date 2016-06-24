package backing;

import entity.ZdoclineZdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdoclineZdocController")
@ViewScoped
public class ZdoclineZdocController extends AbstractController<ZdoclineZdoc> {

    @Inject
    private ZdoclineController zdoclineController;

    public ZdoclineZdocController() {
        // Inform the Abstract parent controller of the concrete ZdoclineZdoc Entity
        super(ZdoclineZdoc.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getZdoclineZdocPK().setZdoclinecollectionZdocLineId(this.getSelected().getZdocline().getZdocLineId());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setZdoclineZdocPK(new entity.ZdoclineZdocPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdoclineController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zdocline controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdocline(ActionEvent event) {
        if (this.getSelected() != null && zdoclineController.getSelected() == null) {
            zdoclineController.setSelected(this.getSelected().getZdocline());
        }
    }
}
