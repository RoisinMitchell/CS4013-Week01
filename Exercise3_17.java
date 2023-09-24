
//Roisin Mitchell
//21193762


import java.util.Scanner;
public class Exercise3_17{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Scissors (0);  Rock (1);  Paper (2): ");
        int user = userInput.nextInt();
        int comp = (int) (Math.random() * 2);


        //User choice String format
        String userString = "";
        if(user == 0) {
            userString = "Scissors";
        }else if(user == 1) {
            userString = "Rock";
        }else {
            userString = "Paper";
        }

        //Computer choice String format
        String compString = "";
        if(comp == 0) {
            compString = "Scissors";
        }else if(comp == 1) {
            compString = "Rock";
        }else {
            compString = "Paper";
        }

        String outcome = "";

        if(user == comp) {
            outcome = "It's a draw!";
        }else if(user == 0 && comp == 1){
            outcome = "You lost!";
        }else if(user == 0 && comp == 2) {
            outcome = "You win!";
        }else if(user == 1 && comp == 0) {
            outcome = "You win!";
        }else if(user == 1 && comp == 2){
            outcome = "You lost!";
        }else if(user == 2 && comp == 0){
            outcome = "You lost!";
        }else if(user == 2 && comp == 1){
            outcome = "You win!";
        }

        System.out.println("The computer is " + compString + ". You are " + userString +". "+ outcome );
    }
}
