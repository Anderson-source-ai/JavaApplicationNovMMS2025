package school.repository;

import java.util.*;

public class Part15_Collections {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Hannah");
        studentList.add("Ian");

        Set<String> uniqueCourses = new HashSet<>();
        uniqueCourses.add("CS101");
        uniqueCourses.add("CS101");

        Map<String, Double> studentMap = new HashMap<>();
        studentMap.put("STU001", 3.9);

        Queue<String> serviceQueue = new LinkedList<>();
        serviceQueue.add("Hannah");

        Stack<String> history = new Stack<>();
        history.push("Registered Hannah");

        System.out.println("Students: " + studentList);
        System.out.println("Unique Courses Count: " + uniqueCourses.size());
        System.out.println("GPA for STU001: " + studentMap.get("STU001"));
    }
}