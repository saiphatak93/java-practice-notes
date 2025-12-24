//tables

import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for table : ");
        int n=sc.nextInt();
        for (int i = 1; i <=10; i++) {
            int table=i*n;
            System.out.println(n+"*"+i+"="+table);
        }
    }
}
     