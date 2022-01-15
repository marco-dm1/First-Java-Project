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

    /* - Below are two examples of constructor overloading which allows
        the object to have different constructor functions depending
        on the constructor function's # of parameters.
     */
    public Person(String nameInput){
        this.name = nameInput;
        this.age = 0;
    }

    public Person(int ageInput){
        // Same as manually setting this.name/age variables.
        this("Random Name", ageInput);
    }

    public int getAge(){
        return this.age;
    }

    public static String staticMethodTest(){
        return "My return string!";
    }
}
