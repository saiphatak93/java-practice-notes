package practice.set5;

import java.util.ArrayList;

public class t1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(10);
        a1.add(12);
        a1.add(14);
        a1.add(16);
        a1.add(19);
        a1.add(122);
        a1.add(11);

        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
    }
}
