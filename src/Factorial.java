public class Factorial {
    public static void main(String[] args){
        int userIn = 6;
        int sum = 1;
        for (int i = 1 ; i <= userIn ; i += 1){
            System.out.print(i + " * ");
            sum = sum * i;
        }
        System.out.print(" = " + sum);
    }
}
