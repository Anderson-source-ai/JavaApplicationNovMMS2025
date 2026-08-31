package school.service;

class ReportTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Asynchronous background report generation complete.");
    }
}

public class Part27_Multithreading {
    public static void main(String[] args) {
        Thread thread = new Thread(new ReportTask());
        thread.start();
    }
}