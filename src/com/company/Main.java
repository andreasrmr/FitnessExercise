package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Administration emp1 = new Administration("Andreas", "280487");
        System.out.println(emp1.toString());

        Instructor emp2 = new Instructor("Thomas", "250488", 20);
        System.out.println(emp2.toString());

        Member mem1 = new Member(false, "Jonas", "121289");
        System.out.println(mem1.toString());

        Member mem2 = new Member(true, "Mikael", "230854");
        System.out.println(mem2.toString());
    }
}
