//sum of digit
public class t1 {
    public static void main(String[] args) {
        int n=13456;
        int sum = 0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.print(sum);
    }
}
