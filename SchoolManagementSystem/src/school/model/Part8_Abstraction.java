package school.model;

abstract class AbstractPerson {
    protected String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    public abstract void displayRole();
    public abstract double calculatePayment();

    public void showName() {
        System.out.println("Name: " + name);
    }
}

public class Part8_Abstraction extends AbstractPerson {
    private double tuitionFee;

    public Part8_Abstraction(String name, double tuitionFee) {
        super(name);
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a registered Student.");
    }

    @Override
    public double calculatePayment() {
        return tuitionFee;
    }

    public static void main(String[] args) {
        Part8_Abstraction student = new Part8_Abstraction("David Miller", 1500.00);
        student.showName();
        student.displayRole();
        System.out.println("Tuition Payable: $" + student.calculatePayment());
    }
}