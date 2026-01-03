package practice.set6;

import java.util.HashSet;

public class t1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10);
        hs.add(50);
        hs.add(20);
        hs.add(60);
        hs.add(60);
        hs.add(50);
        System.out.println(hs);
    }
}
