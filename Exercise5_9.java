public class Exercise5_9 {
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-----------------------------");

        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5.0) {
            double metersToFeet = meterToFoot(meters);
            System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f%n", feet, footToMeter(feet), meters, metersToFeet);
        }
    }
}
