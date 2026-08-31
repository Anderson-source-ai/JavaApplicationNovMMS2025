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

    public static void main(String[] args) {
        Part16_Generics<String> nameRepo = new Part16_Generics<>();
        nameRepo.add("Jack");
        nameRepo.add("Karen");

        System.out.println("Generic List Output: " + nameRepo.getAll());
    }
}