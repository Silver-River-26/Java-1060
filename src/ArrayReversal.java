import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value or -1");
        int value = in.nextInt();
        int size = 0;
        int[] array = new int [100];
        while (value != -1) {
            array[size] = value;
            System.out.println("Enter a value or -1");
            value = in.nextInt();
            size++;


        }
        System.out.println("Your array reversed:");
        for (int i = size-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
