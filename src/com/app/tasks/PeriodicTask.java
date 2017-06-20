package com.app.tasks;

class PeriodicTask extends Task {

    private final long mPeriod;

    PeriodicTask(long delay, long period) {
        super(delay);
        if (period <= 0) {
            throw new IllegalArgumentException("period must be positive");
        }
        mPeriod = period;
    }
}
