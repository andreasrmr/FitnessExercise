package com.company;


import java.util.ArrayList;

public class Main {
    static ArrayList<ArrayList<Person> allPersons = new ArrayList<>()>;
    static ArrayList<Person> Employees = new ArrayList<>();
    static ArrayList<Person> Members = new ArrayList<>();
    public static void main(String[] args) {

        //fitness employees
        Employees.add(new Administration("Claus", "221175-1011"));
        Employees.add(new Instructor("Tove", "011080-1014", 20));
        Employees.add(new Administration("Anna", "011080-1012"));
        Employees.add(new Instructor("Henning", "011080-1014", 15));
        printEmployees();
        System.out.println();
        //fitness members
        Members.add(new Member(false, "Morten", "130195-1303"));
        Members.add(new Member(true, "Martin", "221175-1011"));
        Members.add(new Member(false, "Martina", "050970-1409"));
        Members.add(new Member(true, "Marcel", "221175-1011"));
        printMembers();

    }
    public static void printEmployees(){
        System.out.println("FITNESS EMPLOYEES\n");
        System.out.println("Name\tCpr\t\t\tHours\tSalary\tVacation");
        System.out.println("*************************************************");
        for(Person p : Employees){
            System.out.println(p.toString());
        }
    }
    public static void printMembers(){
        System.out.println("FITNESS MEMBERS\n");
        System.out.println("Name\tCpr\t\t\tMember Type\tFee");
        System.out.println("*************************************************");
        for(Person p : Members){
            System.out.println(p.toString());
        }
    }
}
