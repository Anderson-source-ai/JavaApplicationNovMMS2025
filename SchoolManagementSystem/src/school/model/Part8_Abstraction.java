package school.model;

abstract class AbstractPerson {
    protected String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    public abstract void displayRole();
}

public class Part8_Abstraction extends AbstractPerson {
    public Part8_Abstraction(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a registered Student.");
    }
}