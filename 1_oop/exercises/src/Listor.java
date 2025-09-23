import java.util.ArrayList;
import java.util.List;

public class Listor {


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(3);
        lista.add(1);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
System.out.println("----");

        lista.remove(2);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
