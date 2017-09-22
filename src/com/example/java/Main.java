package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                       //Initialize input
        int count=0;
        int correct = 0;
        //Answers
        String answer1 = "swift";
        String answer2 = "java";
        String answer3 = "python";
        String answer4 = "c";
        String answer5 = "c++";
        do{
            //counts the number of questions there is
            for( int i = 0; i < 5; i++) {
                count += 1;
            }
            //First Question---------------------
            System.out.println("What is the newest programming language that is mainly used for IOS development?");
            String input1 = scanner.next();
            //compare the strings
            if(input1.equalsIgnoreCase(answer1)){
                System.out.println("Correct!");
                correct+=1;                         //increment the number of questions they get right
            } else{
                System.out.println("Wrong!");
            }
            //Second Question--------------------
            System.out.println("What is the newest programming language that is mainly used for Android development?");
            String input2 = scanner.next();
            if(input2.equalsIgnoreCase(answer2)){
                System.out.println("Correct!");
                correct+=1;
            } else{
                System.out.println("Wrong!");
            }
            //Third Question----------------------
            System.out.println("What language was first released in 1991?");
            String input3 = scanner.next();
            if(input3.equalsIgnoreCase(answer3)){
                System.out.println("Correct!");
                correct+=1;
            } else{
                System.out.println("Wrong!");
            }
            //Fourth Question-------------------
            System.out.println("What language was developed between 1969 and 1973 at Bell Labs?");
            String input4 = scanner.next();
            if(input4.equalsIgnoreCase(answer4)){
                System.out.println("Correct!");
                correct+=1;
            } else{
                System.out.println("Wrong!");
            }
            //Fifth Question
            System.out.println("What language was created by Bjarne Stroustrup?");
            String input5 = scanner.next();
            if(input5.equalsIgnoreCase(answer5)){
                System.out.println("Correct!");
                correct+=1;
            } else{
                System.out.println("Wrong!");
            }

        }while(count !=5);
        System.out.println("You have completed the quiz!");
        System.out.println("You got: " + correct + " correct!");
    }

}
