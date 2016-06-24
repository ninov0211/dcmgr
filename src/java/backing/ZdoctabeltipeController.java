package backing;

import entity.Zdoctabeltipe;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "zdoctabeltipeController")
@ViewScoped
public class ZdoctabeltipeController extends AbstractController<Zdoctabeltipe> {

    public ZdoctabeltipeController() {
        // Inform the Abstract parent controller of the concrete Zdoctabeltipe Entity
        super(Zdoctabeltipe.class);
    }

}
