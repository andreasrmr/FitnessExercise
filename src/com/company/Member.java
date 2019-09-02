package com.company;

public class Member extends Person {
    boolean isBasic;


    public Member() {}

    public Member(boolean isBasic, String name, String cpr) {
        this.isBasic = isBasic;
        super.name = name;
        super.cpr = cpr;
    }

    public String getMemberType() {
        if(isBasic){
            return "Basic";
        }
        return "Full";
    }

    public int getMonthlyFee(){
        if(isBasic){
            return 199;
        }
        return 299;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Member Type=" + getMemberType() +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                ", Fee='" + getMonthlyFee() + '\'' +
                '}';
    }
}
