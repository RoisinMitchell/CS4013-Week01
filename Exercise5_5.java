//Roisin Mitchell
//21193762

public class Exercise5_5 {

    public static void displayLargestNumber(double num1, double num2, double num3){
        double largest = 0;
        if(num1>num2 && num1>num3){
            largest = num1;
        }else if(num2>num3){
            largest = num2;
        }else{
            largest = num3;
        }
        System.out.print(largest);
    }
    public static void main(String[] args){
        displayLargestNumber(5,7,8);
    }
}
