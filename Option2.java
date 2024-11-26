//Write a program that will provide important statistics for the grades in a class. 
//The program will utilize a for-loop to read ten floating-point grades from user input. 
//Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:
//Average
//Maximum
//Minimum

//pseudocode
//We know we need to read ten floating points for user input 
//We'll use a for loop to repeat Enter your grade?
// for i = to 9  which is the 10 repeats.
// however if they dont input valid floating input 
//we'll print out Invailid input enter a vlid floating point grade.
//each input is added to the an array of grade which will be empty 
//grade [i]
// in this array we can also determine the max and min when we are adding it to the array
// if grade[i]> max then set max = grades[i]
//as well for min if grade[i]< min then set min = grades[i]
// finall step would be caculating the average
// set average = sum /10
//after calculations are dont we will print out
//Grade statistics
//average grade 
//Higher grade
//loweset grade

import java.util.Scanner;

public class Option2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        System.out.println("Enter 10 grades only floating point values");

        for (int i = 0; i < grades.length ;i++){
            System.out.print("Enter grade" + (i+1)+":");
            
            
            while (!scanner.hasNextDouble()) {
                System.out.println("INVAILD INPUT Enter a valid floating point grade");
                scanner.nextDouble();
            }

            grades[i]=scanner.nextDouble();
            sum+= grades[i];

            if (grades[i]>max){
                max = grades[i];
                
            }

            if (grades[i]<min){
                min = grades[i];
             }
         }
        
        double average = sum/grades.length;

        System.out.println("\nGrade Stastistics:");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.printf("Highest Grade %.2f\n",max);
        System.out.printf("Lowest grade: %.2f\n", min);

        scanner.close();
        
    }
}