//Roisin Mitchell
//21193762

import java.util.*;
public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter monthly savings: ");

        double monthlySaving = Double.valueOf(userInput.next());

        double interest = 1 + 0.00417;
        double savings = monthlySaving  * interest;
        for (int i = 0; i < 5; i++) {
            savings = (monthlySaving + savings) * interest;
        }

        System.out.println(savings);
    }
}

