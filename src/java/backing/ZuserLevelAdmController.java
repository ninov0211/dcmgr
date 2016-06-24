package backing;

import entity.ZuserLevelAdm;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "zuserLevelAdmController")
@ViewScoped
public class ZuserLevelAdmController extends AbstractController<ZuserLevelAdm> {

    public ZuserLevelAdmController() {
        // Inform the Abstract parent controller of the concrete ZuserLevelAdm Entity
        super(ZuserLevelAdm.class);
    }

}
