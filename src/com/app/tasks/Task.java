package com.app.tasks;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

// TODO: OK, what about unit testing the static factory methods?
public class Task {

    private final long mDelay;

    Task(long delay) {
        mDelay = delay;
    }

    @Nullable
    public static Task tryCreate(long delay) {
        /*
        if (condition) {
            return new Task(delay);
        } else {
            return null;
        }
         */
        return null;
    }

    @NotNull
    public static Task newTask(long delay) {
        return new Task(delay);
    }

    // Actually, just syntactic sugar
    @Nullable
    public static Task tryCreattePeriodicTask(long delay, long period) {
        /*
        if (condition) {
            return new PeriodicTask(delay, period);
        } else {
            return null;
        }
         */
        return null;
    }

    @NotNull
    public static Task newPeriodicTask(long delay, long period) {
        return new PeriodicTask(delay, period);
    }
}
