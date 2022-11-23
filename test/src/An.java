import java.util.ArrayList;
import java.util.List;

public class An {
    public String specializare;
    List<Grupa> grupe = new ArrayList<Grupa>();

    public An(String specializare) {
        this.specializare = specializare;
    }

    public void add(Grupa grupa) {
        grupe.add(grupa);
    }
}
