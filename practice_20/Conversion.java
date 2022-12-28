import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<E> {

    private final List<E> list = new ArrayList<>();

    public Conversion(E[] array) {
        list.addAll(Arrays.asList(array));
    }

    public void showList() {
        for (Object ls : list) {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(E element) {
        list.add(element);
    }
}