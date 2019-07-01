package com.stackroute.exercise2;

public class MemberVariable {
    public static void main(String[] args) {
        Member obj = new Member();
        obj.setName("Harry");
        obj.setAge(30);
        obj.setSalary(2500.3);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
