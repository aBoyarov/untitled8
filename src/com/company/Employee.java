package com.company;

public class Employee {
    String fullName;
    String positionAtWork;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String fullName, String positionAtWork, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.positionAtWork = positionAtWork;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", positionAtWork='" + positionAtWork + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void printInfoAboutEmployee(Employee employee){
        System.out.println(employee);
    }
}
