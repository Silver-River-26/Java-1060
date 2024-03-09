import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = in.next();
        System.out.println("To pick an option enter a number:\n" +
                "1. Add content\n" +
                "2. Check if string contains substring\n" +
                "3. Output length\n" +
                "4. Output substring after prefix\n" +
                "5. Output substring before suffix\n" +
                "6. Output substring between prefix and suffix\n" +
                "7. Exit");
        int method = in.nextInt();
        while (method != 7) {
            if (method == 1) {
                phrase = AddContent(phrase);
            } else if (method == 2) {
                Contains(phrase);
            } else if (method == 3) {
                Length(phrase);
            } else if (method == 4) {
                SubAfter(phrase);
            } else if (method == 5) {
                SubBefore(phrase);
            } else if (method == 6) {
                SubInBetween(phrase);
            }
            System.out.println("What would you like to do next? Enter a number:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains substring\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit");
            method = in.nextInt();

        }

    }

    public static String AddContent(String phrase) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something to add to the end of your phrase:");
        String add = in.next();
        phrase = phrase + add;
        System.out.println("your new phrase is " + phrase);
        return phrase;
    }

    public static void Contains(String phrase) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the substring you would like to search for:");
        String hasSub = in.next();
        boolean contains = phrase.contains(hasSub);
        if (contains) {
            System.out.println("The phrase has that substring!");

        } else {
            System.out.println("The phrase does not have that substring.");
        }
    }

    public static void Length(String phrase) {
        System.out.println("Your phrase is " + phrase.length() + " characters long!");

    }

    public static void SubAfter(String phrase) {
        System.out.print("Enter a prefix: ");
        Scanner in = new Scanner(System.in);
        String prefix = in.next();
        int index = phrase.indexOf(prefix);
        int prefixLength = prefix.length();
        String substring = phrase.substring((index + prefixLength));
        System.out.println("Your substring is " + substring);

    }

    public static void SubBefore(String phrase) {
        System.out.print("Enter a suffix: ");
        Scanner in = new Scanner(System.in);
        String suffix = in.next();
        int index = phrase.indexOf(suffix);
        String substring = phrase.substring(0, index);
        System.out.println("Your substring is " + substring);

    }

    public static void SubInBetween(String phrase) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a prefix: ");
        String prefix = in.next();
        System.out.print("Enter a suffix: ");
        String suffix = in.next();
        int prefixIndex = phrase.indexOf(prefix);
        int prefixLength = prefix.length();
        int suffixIndex = phrase.indexOf(suffix);
        String substring = phrase.substring((prefixIndex + prefixLength), suffixIndex);
        System.out.println("Your substring is " + substring);

    }
}
