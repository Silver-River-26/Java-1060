import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many bottles of beer on the wall?");
        int numBottles = in.nextInt();
        for (int i = numBottles; i >= 0; i -= 1) {
            if (i == 0) {
                System.out.println("0 bottles of beer on the wall, 0 bottles of beer. \n" +
                        "Go to the store and buy some more, " + numBottles + " bottles of beer on the wall.\n");
            } else if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take one down and pass it around, 0 bottles of beer on the wall.\n");

            } else if (i == 2) {
                System.out.println("2 bottles of beer on the wall, 2 bottles of beer. \n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n");

            } else {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
            }
        }

    }
}
