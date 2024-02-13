public class SumInt {
    public static void main(String[] args) {
        int userIn = 5;
        int sum = 0;
        for (int t = 1; t <= userIn; t += 1) {
            System.out.print(t + " + ");
            sum = sum + t;
        }
        System.out.print(" = " + sum);
    }

}
