//count numbers 
public class t9 {
    public static void main(String[] args) {
        int n=1234578941;
        int count=0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
