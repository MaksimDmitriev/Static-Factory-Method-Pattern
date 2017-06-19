package com.app.logger;

public class LoggerFactory {

    private static Logger sLogger;

    private LoggerFactory() {
        throw new AssertionError();
    }

    public static Logger getLogger() {
        if (sLogger == null) {
            sLogger = new FileLogger(FileLogger.LOG_FILE_NAME);
        }
        return sLogger;
    }
}
