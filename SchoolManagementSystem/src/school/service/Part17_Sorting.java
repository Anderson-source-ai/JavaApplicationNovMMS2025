package school.service;

import school.model.Part6_StudentOOP;
import java.util.Comparator;

public class Part17_Sorting implements Comparator<Part6_StudentOOP> {
    @Override
    public int compare(Part6_StudentOOP s1, Part6_StudentOOP s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}