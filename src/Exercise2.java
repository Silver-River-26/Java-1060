import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter three numbers");
      int greatestNum = greatestNum(in.nextInt(), in.nextInt(), in.nextInt());
      System.out.println("the greatest number is "+ greatestNum);
    }

    public static int greatestNum(int one, int two, int three) {
        if (one > two && one > three) {
            return one;
        } else if (two > one && two > three) {
            return two;
        } else {
            return three;
        }
    }
    // test
}
