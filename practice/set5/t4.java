package practice.set5;
import java.util.ArrayList;
import java.util.Collections;

public class t4 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(18);
        list.add(1);
        list.add(14);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
