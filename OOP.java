package com.company;

public class OOP {
    public static void main(String[] args){
        System.out.println("test");
        Person bob = new Person("Bob", 24);
        System.out.println(bob.getAge());

        // Static method does not rely on a new instance of the Person class being created.
        System.out.println(Person.staticMethodTest());
    }
}
