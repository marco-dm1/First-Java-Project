package com.company;

public class OOP {
    public static void main(String[] args){
        System.out.println("test");
        Person bob = new Person("Bob", 24);
        System.out.println(bob.getAge());

        // Constructor overloading in use, only the single argument is needed.
        Person john = new Person("John");
        Person twenty = new Person(20);

        // Static method does not rely on a new instance of the Person class being created.
        System.out.println(Person.staticMethodTest());

        // .equals can be used to compare two objects and see if they are equal.
        System.out.println("Is \"john\" the same as \"twenty\"?: " + john.equals(twenty));
    }
}
