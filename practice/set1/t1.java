//positive or negative

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a variable");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("not pos");

        }else{
            System.out.println("pos");
        }
    }
}
