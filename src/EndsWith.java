public class EndsWith {
    public static void main(String[] args) {
        String example = "Blah blah";
        Boolean isTrue = endsWith(example, "h");
        System.out.println(isTrue);
    }

    public static boolean endsWith(String string, String maybeEnd) {
       return string.substring(string.length() - maybeEnd.length()).equals(maybeEnd);
       // or return string.endsWith(maybeEnd);
    }
}
