package com.company;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours) {
        super.hours = hours;
        super.salary = getSalary();
        super.name = name;
        super.cpr = cpr;
    }

    @Override
    public int getSalary() {
        return super.getHours() * 456;
    }

    @Override
    public String toString() {
        return getName() + "\t\t" +
                getCpr() + "\t" +
                getHours() + "\t\t" +
                this.getSalary() + "\t";
    }

}
