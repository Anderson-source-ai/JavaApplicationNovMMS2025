package school.model;

interface Payable {
    double calculatePayment();
}

interface Printable {
    void printDetails();
}

public class Part9_Interfaces implements Payable, Printable {
    private String studentName;
    private double tuitionFee;

    public Part9_Interfaces(String studentName, double tuitionFee) {
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double calculatePayment() {
        return tuitionFee;
    }

    @Override
    public void printDetails() {
        System.out.println("Receipt for " + studentName + ": $" + calculatePayment());
    }

    public static void main(String[] args) {
        Part9_Interfaces student = new Part9_Interfaces("Eva Green", 1250.00);
        student.printDetails();
    }
}