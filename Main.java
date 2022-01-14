package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int myInteger = 1;
        double myDouble = 3.14;
        String myString = "";
        boolean myBoolean = true;

        System.out.println("enter your input:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println("The user inputted: " + input);
        if(input == "red"){
            System.out.println("the input is red!");
        } else if(input == "blue"){
            System.out.println("the input is blue!");
        } else{
            System.out.println("the input is not blue or red!");
        }

        boolean status = true;
        int i = 0;
        while(status){
            i++;
            System.out.println("Status = true has made the while loop run.");
            status = false;
        }

        for(int a = 0; a < 5; a++){
            System.out.println("Print " + getAnswer());
        }

        System.out.println("ArrayGenerator result: " + ArrayGenerator());

        String[] pieces = "These words are split in the array by using the space as the key.".split(" ");
        System.out.println(pieces[(int)Math.floor(Math.random() * pieces.length)]);
        System.out.println("abcdefg".charAt(1) + " - " + "hijklmno".length());
    }

    public static String getAnswer(){
        String answer = "My answer!";
        ArrayList<String> list = new ArrayList<>();
        list.add("My answer 2.0!");

        answer = list.get(0); // Returns "My answer 2.0!"
        System.out.println("The size of the ArrayList is: " + list.size());
        list.remove(0); // Removes index 0 from the ArrayList
        System.out.println(list.contains("My answer 2.0!")); // Returns true/false if it exists in the ArrayList
        return answer;
    }

    public static double ArrayGenerator(){

        double[] myDoubleArray = new double[3];
        for(int i = 0; i < 3; i++){
            double input = Math.random();

            myDoubleArray[i] = Math.random();
        }
        double result =  myDoubleArray[(int)Math.floor(Math.random() * 3)];
        //double result = myDoubleArray[Math.floor(Math.random())];
        return result;
    }
}
