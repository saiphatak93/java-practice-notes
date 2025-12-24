//reverse number
public class t7 {
    public static void main(String[] args) {
        int n=12341654;
        
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
