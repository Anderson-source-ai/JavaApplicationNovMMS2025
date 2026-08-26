package school.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part15_Collections {
    private List<String> studentList = new ArrayList<>();
    private Map<String, Double> studentScores = new HashMap<>();

    public void addStudent(String id, String name, double score) {
        studentList.add(name);
        studentScores.put(id, score);
    }
}