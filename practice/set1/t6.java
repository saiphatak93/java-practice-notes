//prime or not

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is prime or not : ");
        int n= sc.nextInt();
        if(n<=1){
            System.out.println(n+" It is not prime");
        }else if(n%2==0){
            System.out.println(n+" It is not prime ");
        }else{
            System.out.println(n+" It is Prime");
        }
    }
}
