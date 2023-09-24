//Roisin Mitchell
//21193762

import java.util.Scanner;

public class Exercise4_16 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = userInput.nextInt();
        System.out.println("The factors of " + num + " are ");

        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + ", ");
                num = num/i;
            }
        }
        if(num > 2){
            System.out.println(num);
        }
    }
}
