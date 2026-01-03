package practice.set6;

import java.util.HashMap;

public class t3 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp= new HashMap<>();
        mp.put(1, "Boss");
        mp.put(2, "Thunder");
        mp.put(3, "Hulk");
        mp.put(4,"IronMan");
        System.out.println(mp);
        System.out.println(mp.containsKey(3));
    }
}
