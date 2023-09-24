//Roisin Mitchell
//21193762

public class Exercise7_1 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum = sum + m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args){
        double[][] matrix = {
                {1, 5, 2, 8},
                {3, 4, 8, 6},
                {2, 0, 1, 4}
        };
        for(int i = 0; i < matrix.length+1; i++){
            System.out.println("Sum of elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }
}
