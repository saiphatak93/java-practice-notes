//sum of numbers

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number for sum of n numbers : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
