// ArmsStrong Number
public class t2 {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int leng=0;
        while (original !=0){
            leng=leng+1;
            original=original/10;
        }
        int t2=n;
        int arm=0;
        int rem;
        while(t2!=0){
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==n){
            System.out.println("Its a armstrong number : ");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
// 1(3) 5(3) 3(3)
// 1  + 125 +27
//153

// 370 = 
// 3(3) 7(3) 0(3)
// 27 + 343 = 370