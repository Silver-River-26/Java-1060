import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindValue {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int num = 5;
        values.add(5);
        values.add(6);
        values.add(2);
        boolean isHere = search(values, num);
        System.out.println(isHere);


    }

    public static boolean search(ArrayList<Integer> values,int num) {
        return values.contains(num);
    }
}
