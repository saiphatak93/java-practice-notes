package practice.set5;
import java.util.ArrayList;
import java.util.Collections;
public class t5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(2);
        list.add(5);
        list.add(250);
        list.add(55);
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}
