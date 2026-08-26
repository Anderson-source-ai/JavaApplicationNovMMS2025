package school.ui;

import school.service.Part32_DesignPatterns;
import school.service.Part31_Logging;

public class Part33_FinalIntegration {
    public static void main(String[] args) {
        Part31_Logging logger = new Part31_Logging();
        logger.logAction("Initializing integrated System...");

        Part32_DesignPatterns service = Part32_DesignPatterns.getInstance();
        System.out.println("Integrated System ready: " + service);
    }
}