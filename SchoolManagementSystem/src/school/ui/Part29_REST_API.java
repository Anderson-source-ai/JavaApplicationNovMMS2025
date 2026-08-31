package school.ui;

public class Part29_REST_API {
    public static String getStudentAsJson(String id, String name) {
        return String.format("{\"id\": \"%s\", \"name\": \"%s\"}", id, name);
    }

    public static void main(String[] args) {
        System.out.println("JSON Endpoint Response: " + getStudentAsJson("STU01", "Quinn"));
    }
}