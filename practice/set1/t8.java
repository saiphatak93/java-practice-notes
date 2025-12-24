//palindrome number
public class t8 {
    public static void main(String[] args) {
        int n=1211213;
        int original=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.print("It is Palindrome number : "+rev);
        }else{
            System.out.print("It is false : "+rev);
        }
    }
}
