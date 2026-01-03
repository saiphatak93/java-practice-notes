package practice.set5;

import java.util.ArrayList;

public class t2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(22);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);

    }
}
