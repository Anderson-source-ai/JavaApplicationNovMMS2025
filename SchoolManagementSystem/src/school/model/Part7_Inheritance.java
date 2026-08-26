package school.model;

class PersonParent {
    protected String id;
    protected String name;

    public PersonParent(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Part7_Inheritance extends PersonParent {
    private String level;

    public Part7_Inheritance(String id, String name, String level) {
        super(id, name);
        this.level = level;
    }

    public String getLevel() { return level; }
}