public class formatting {
    public static void main(String[] args) {
        int year = 20;
        int month = 12;
        int day = 12;
        System.out.println(format(year, month, day));
    }


    public static String format(int year, int day, int month) {
        String monthStr = null;
        if (month == 12) {
            monthStr = "December";
        }
        return String.format(" Current date: %s %02d , %04d", monthStr, day, year);
    }
}
