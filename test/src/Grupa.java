import java.util.ArrayList;
import java.util.List;

public class Grupa {
    public String grupa;
    List<Semigrupa> semigrupe;

    public Grupa(String grupa) {
        this.grupa = grupa;
        this.semigrupe = new ArrayList<>();
    }

    public void add(Semigrupa semigrupa) {
        semigrupe.add(semigrupa);
    }
}
