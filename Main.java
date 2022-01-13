package com.company;
import java.util.Scanner;

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

    }

    public static String getAnswer(){
        String answer = "My answer!";
        return answer;
    }
}
