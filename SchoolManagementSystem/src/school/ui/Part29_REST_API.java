package school.ui;

public class Part29_REST_API {
    public String getStudentJsonResponse(String id, String name) {
        return String.format("{\"id\": \"%s\", \"name\": \"%s\"}", id, name);
    }
}