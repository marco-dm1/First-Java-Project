package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String nameInput, int ageInput){
        this.name = nameInput;
        this.age = ageInput;
    }

    public int getAge(){
        return this.age;
    }

    public static String staticMethodTest(){
        return "My return string!";
    }
}
