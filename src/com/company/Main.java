package com.company;



public class Main {

    public static void main(String[] args) {
        Person emp1 = new Administration("Andreas", "280487");
        System.out.println(emp1.toString());

        Person emp2 = new Instructor("Thomas", "250488", 20);
        System.out.println(emp2.toString());

        Person mem1 = new Member(false, "Jonas", "121289");
        System.out.println(mem1.toString());

        Person mem2 = new Member(true, "Mikael", "230854");
        System.out.println(mem2.toString());
    }
}
