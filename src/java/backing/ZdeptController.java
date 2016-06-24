package backing;

import entity.Zdept;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "zdeptController")
@ViewScoped
public class ZdeptController extends AbstractController<Zdept> {

    public ZdeptController() {
        // Inform the Abstract parent controller of the concrete Zdept Entity
        super(Zdept.class);
    }

}
