package school.service;

public class Part32_DesignPatterns {
    private static Part32_DesignPatterns instance;

    private Part32_DesignPatterns() {}

    public static synchronized Part32_DesignPatterns getInstance() {
        if (instance == null) {
            instance = new Part32_DesignPatterns();
        }
        return instance;
    }

    public void logPatternAction() {
        System.out.println("Singleton Design Pattern active.");
    }

    public static void main(String[] args) {
        Part32_DesignPatterns.getInstance().logPatternAction();
    }
}