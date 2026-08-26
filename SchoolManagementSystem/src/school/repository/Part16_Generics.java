package school.repository;

import java.util.ArrayList;
import java.util.List;

public class Part16_Generics<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}