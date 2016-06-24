package backing;

import entity.ZuserLevelSys;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "zuserLevelSysController")
@ViewScoped
public class ZuserLevelSysController extends AbstractController<ZuserLevelSys> {

    public ZuserLevelSysController() {
        // Inform the Abstract parent controller of the concrete ZuserLevelSys Entity
        super(ZuserLevelSys.class);
    }

}
