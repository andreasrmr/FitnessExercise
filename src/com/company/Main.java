package com.company;


import java.util.ArrayList;

public class Main {
    static ArrayList<Person> Employees = new ArrayList<>();
    static ArrayList<Person> Members = new ArrayList<>();

    public static void main(String[] args) {

        //add mock data to lists
        addData();

        //print lists
        printEmployees();
        System.out.println();
        printMembers();
        System.out.println();
        printAll();

        FileHandling fileHandling = new FileHandling();
        fileHandling.readString();

    }
    public static void printEmployees(){
        System.out.println("FITNESS EMPLOYEES\n");
        System.out.println("Name\t\tCpr\t\t\tHours\tSalary\tVacation");
        System.out.println("*************************************************");
        for(Person p : Employees){
            System.out.println(p.toString());
        }
    }
    public static void printMembers(){
        System.out.println("FITNESS MEMBERS\n");
        System.out.println("Name\t\tCpr\t\t\tMember Type\tFee");
        System.out.println("*************************************************");
        for(Person p : Members){
            System.out.println(p.toString());
        }
    }
    public static void printAll(){
        System.out.println("EMPLOYEES & MEMBERS");
        System.out.println("Name\t\tCpr");
        System.out.println("*************************************************");
        ArrayList<Person> all = new ArrayList<>();
        for(Person employees : Employees){
            System.out.println(employees.getName()+"\t\t"+employees.getCpr());
        }
        for(Person members  : Members){
            System.out.println(members.getName()+"\t\t"+members.getCpr());
        }
    }
    public static void addData(){
        //fitness employees (add data)
        Employees.add(new Administration("Claus", "221175-1011"));
        Employees.add(new Instructor("Tove", "011080-1014", 20));
        Employees.add(new Administration("Anna", "011080-1012"));
        Employees.add(new Instructor("Henning", "011080-1014", 15));

        //fitness members (add data)
        Members.add(new Member(false, "Morten", "130195-1303"));
        Members.add(new Member(true, "Martin", "221175-1011"));
        Members.add(new Member(false, "Martina", "050970-1409"));
        Members.add(new Member(true, "Marcel", "221175-1011"));
    }
}
