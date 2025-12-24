public class t6{
    public static void main(String[] args) {
        int small[]={23,43,54,1,2,3};
        int min=small[0];
        for(int i=0;i<small.length;i++){
            if(small[i]<min){
                min=small[i];
            }
        }
        System.out.println("Smallest element is : "+min);
    }
}