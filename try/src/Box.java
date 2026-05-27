
import java.util.ArrayList;

public class Box<T> {              // Generic class Box
    private ArrayList<T> items;    // Array list in Box class for holding the items

    public Box() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

}
