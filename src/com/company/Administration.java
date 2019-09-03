package com.company;

public class Administration extends Employee {

    public Administration(String name, String cpr) {
        super.vacation = 5;
        super.hours = 37;
        super.name = name;
        super.cpr = cpr;
        super.salary = 23000;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return name + "\t" +
                cpr + "\t" +
                hours + "\t\t" +
                salary + "\t" +
                vacation + "\t";
    }
}
