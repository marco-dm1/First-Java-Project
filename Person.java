package com.company;

public class Person {
    /*
        - The state of an object is the object's variables.
        - The behavior of an object are the object's methods.
        - Encapsulation refers to the private variables below that are only accessible
        by non-static methods inside this class.
    */
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
