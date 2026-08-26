package school.service;

import school.model.Part6_StudentOOP;
import java.util.List;
import java.util.stream.Collectors;

public class Part19_StreamAPI {
    public List<Part6_StudentOOP> filterHonorRoll(List<Part6_StudentOOP> students) {
        return students.stream()
                .filter(s -> s.getGpa() >= 3.5)
                .collect(Collectors.toList());
    }
}