public class numBox {
    public static void main(String[] args) {
        int userInH = 7;
        int userInL = 5;

        for (int h = 1; h <= userInH; h += 1) {
            System.out.println();
            System.out.print("#");
            for (int l = 1; l <= userInL; l += 1) {
                System.out.print("#");
            }
        }
    }
}
