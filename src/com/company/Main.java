package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Worker", "ivan@.com",
                "+7-904-432-23-45", 55000, 42);
        employee[1] = new Employee("Smirnov Ivan", "Manager", "smirnov@.com",
                "+7-904-234-32-54", 65000, 37);
        employee[2] = new Employee("Zaycev Sergey", "Designer", "sergey@.com",
                "+7-903-431-43-65", 32000, 25);
        employee[3] = new Employee("Sidorov Anton", "Builder", "anton@.com",
                "+7-921-412-29-41", 60000, 51);
        employee[4] = new Employee("Nikitin Andrey", "Developer", "andrey@.com",
                "+7-905-742-12-86", 61000, 45);

        for (Employee value : employee) {
            if (value.age > 40) {
                System.out.println(value);
            }
        }
    }
}