//Max from Array
public class t5 {
    public static void main(String[] args) {
        int lar[]={12,3,45};
        int max=lar[0];
        for(int i=0;i<lar.length;i++){
            if(lar[i]>max){
                max=lar[i];
            }
        }
        System.out.println("Largset element is :"+max);
    }
}