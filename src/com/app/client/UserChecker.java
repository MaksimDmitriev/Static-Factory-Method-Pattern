package com.app.client;

import com.app.logger.Logger;
import com.app.logger.LoggerFactory;
import com.sun.istack.internal.NotNull;

class UserChecker {

    private UserChecker() {
        throw new AssertionError();
    }

    public static boolean check(@NotNull User user) {
        Logger logger = LoggerFactory.getLogger();
        logger.write("checking " + user);
        // do something
        logger.write("returning true");
        return true;
    }
}
