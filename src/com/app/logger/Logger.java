package com.app.logger;

import com.sun.istack.internal.NotNull;

public interface Logger {

    default void write(@NotNull String message) {

    }
}
