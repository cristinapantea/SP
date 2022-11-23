import java.util.ArrayList;
import java.util.List;

public class Semigrupa {
    public String semigrupa;
    List<Student> studenti;

    public Semigrupa(String semigrupa) {
        this.semigrupa = semigrupa;
        this.studenti = new ArrayList<>();
    }

    public void add(Student student) {
        studenti.add(student);
    }
}
