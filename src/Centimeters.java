import java.util.Scanner;

public class Centimeters {
    public static void main(String[] args) {
        final double CM_PER_INCH =2.54;
        Scanner in =new Scanner(System.in);

        System.out.println("Give me a number of inches");

        int inches = in.nextInt();

        System.out.println(inches * CM_PER_INCH);
    }
}