package school.model;

interface Payable {
    double calculatePayment();
}

public class Part9_Interfaces implements Payable {
    private double tuitionFee;

    public Part9_Interfaces(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double calculatePayment() {
        return tuitionFee;
    }
}