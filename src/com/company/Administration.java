package com.company;

public class Administration extends Employee {
    int vacation;

    public Administration(String name, String cpr) {
        this.vacation = 5;
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
        return "Administration{" +
                "vacation=" + vacation +
                ", hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
