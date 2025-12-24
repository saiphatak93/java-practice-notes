//even or odd

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check even or odd : ");
        int res = sc.nextInt();
        if (res % 2 == 0) {
            System.out.println("It is even :" + res);
        } else {
            System.out.println("It is odd :" + res);
        }
    }
}
