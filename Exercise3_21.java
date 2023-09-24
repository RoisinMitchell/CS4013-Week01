//Roisin Mitchell
//21193762

import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter year (e.g. 2015): ");
        int year = userInput.nextInt();

        System.out.print("\nEnter month (1-12): ");
        int month = userInput.nextInt();

        System.out.print("\nEnter day of month (1-31): ");
        int day = userInput.nextInt();


        int y = year; //year
        int q = day; //day of month
        int m = month; //month


        //Cases for Jan & Feb counted as 13 & 14 in Formula
        if(m == 1){
            m = 13;
            y -= 1;
        }
        if(m == 2){
            m = 14;
            y -= 1;
        }

        int j = y/100; //century
        int k = y % 100; //year of century


        //Zellers Equation
        int h = (q + (26*(m+1))/10 + k + (k/4) + (j/4) + (5*j) ) % 7;

        String dayOfWeek = "";

        if(h == 0){
            dayOfWeek = "Saturday";
        }else if(h == 1){
            dayOfWeek = "Sunday";
        }else if(h == 2){
            dayOfWeek = "Monday";
        }else if(h == 3){
            dayOfWeek = "Tuesday";
        }else if(h == 4){
            dayOfWeek = "Wednesday";
        }else if(h == 5){
            dayOfWeek = "Thursday";
        }else if(h == 6){
            dayOfWeek = "Friday";
        }
        System.out.println("Day of the week is " + dayOfWeek);


    }
}
