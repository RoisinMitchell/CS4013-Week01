//Roisin Mitchell
//21193762

import java.util.Scanner;
import java.util.Random;

public class Exercise6_21{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();


        String[] paths = new String[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            paths[i] = simulatedPath(numberOfSlots);
        }

        // Display the paths of each ball
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(paths[i]);
        }
        display(paths, numberOfSlots);
        input.close();
    }

    public static String simulatedPath(int numberOfSlots) {
        Random random = new Random();
        StringBuilder path = new StringBuilder();

        for (int i = 0; i < numberOfSlots - 1; i++) {
            // Generate a random 0 or 1 for left or right
            int direction = random.nextInt(2);
            if (direction == 0) {
                path.append("L");
            } else {
                path.append("R");
            }
        }
        return path.toString();
    }

    public static void display(String[] paths, int numberOfSlots) {
        int[] slotCount = new int[numberOfSlots];

        for (String path : paths) {
            int position = 0;
            for (int i = 0; i < path.length(); i++) {
                if (path.charAt(i) == 'R') {
                    position++;
                }
            }
            slotCount[position]++;
        }

        //Display
        for (int i = numberOfSlots - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < slotCount[i]; j++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
