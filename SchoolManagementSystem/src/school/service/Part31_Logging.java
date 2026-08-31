package school.service;

import java.util.logging.Logger;

public class Part31_Logging {
    private static final Logger logger = Logger.getLogger(Part31_Logging.class.getName());

    public static void main(String[] args) {
        logger.info("Application starting up...");
        logger.warning("Unusual login attempt detected.");
    }
}