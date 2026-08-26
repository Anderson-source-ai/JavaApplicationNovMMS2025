package school.service;

import java.util.logging.Logger;

public class Part31_Logging {
    private static final Logger logger = Logger.getLogger(Part31_Logging.class.getName());

    public void logAction(String message) {
        logger.info(message);
    }
}