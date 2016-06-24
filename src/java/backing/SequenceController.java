package backing;

import entity.Sequence;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "sequenceController")
@ViewScoped
public class SequenceController extends AbstractController<Sequence> {

    public SequenceController() {
        // Inform the Abstract parent controller of the concrete Sequence Entity
        super(Sequence.class);
    }

}
