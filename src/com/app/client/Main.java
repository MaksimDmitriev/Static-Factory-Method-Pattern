package com.app.client;

import com.app.tasks.Task;

class Main {

    public static void main(String[] args) {
        UserChecker.check(new User(1, "Sample"));

        Task task1 = Task.newTask(0L);
        Task task2 = Task.newPeriodicTask(10L, 20L);
        Task task3 = Task.tryCreate(15L);
        Task task4 = Task.tryCreattePeriodicTask(15L, 20L);
    }
}
