package backing;

import entity.ZdocperubahanZdoc;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocperubahanZdocController")
@ViewScoped
public class ZdocperubahanZdocController extends AbstractController<ZdocperubahanZdoc> {

    @Inject
    private ZdocperubahanController zdocperubahanController;

    public ZdocperubahanZdocController() {
        // Inform the Abstract parent controller of the concrete ZdocperubahanZdoc Entity
        super(ZdocperubahanZdoc.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getZdocperubahanZdocPK().setZdocperubahancollectionZdocperubahanid(this.getSelected().getZdocperubahan().getZdocperubahanid());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setZdocperubahanZdocPK(new entity.ZdocperubahanZdocPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdocperubahanController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zdocperubahan controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdocperubahan(ActionEvent event) {
        if (this.getSelected() != null && zdocperubahanController.getSelected() == null) {
            zdocperubahanController.setSelected(this.getSelected().getZdocperubahan());
        }
    }
}
