//Roisin Mitchell
//21193762

public class Exercise6_13 {
    public static int getRandom(int... numbers) {
        int rand = (int) (Math.random() * 54) + 1;

        for (int i = 0; i < numbers.length; i++) {
            if (rand == numbers[i]) {
                rand = (int) (Math.random() * 54) + 1;
                i = 0;
            }
        }
        return rand;
    }
    //Testing getRandom() method
    public static void main(String[] args){
        int[] nums= {1,2,5,7,8,11,};
        System.out.print(getRandom(nums));
    }
}
