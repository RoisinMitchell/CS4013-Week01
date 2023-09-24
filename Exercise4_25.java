import java.util.Scanner;
public class Exercise4_25 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter n:");
        int num = userInput.nextInt();
        int sum = 1;

        while(num > 0){
            sum = sum + (sum+1);
            num--;
        }
        System.out.println("Answer = " + sum);

    }
}
