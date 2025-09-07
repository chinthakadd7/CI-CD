package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<String> tasks = new ArrayList<>();

    public String getGreeting() {
        return "Hello World!";
    }

    public boolean addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    public List<String> getTasks() {
        return tasks;
    }
  
}
