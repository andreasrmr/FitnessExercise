package com.company;

public class Employee extends Person {

    int hours;
    int salary;

    public Employee() {
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
