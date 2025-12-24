//sorting array
public class t9 {
    public static void main(String[] args) {
        int arr[]={34,45,67,87,45};
        int temp;//temparary variable
        for(int i=0;i<arr.length;i++){                           //from 34
            for(int j=i+1;j<arr.length;j++){                     //from 45
                if(arr[i]>arr[j]){                               //34>45
                    temp=arr[i];                                 // temp=87
                    arr[i]=arr[j];                               //arr[i]=45
                    arr[j]=temp;                                 //arr[j]=87 
                }
            }   
        }
        for(int i=0;i<arr.length;i++){
        System.out.println("Sorted array is : "+arr[i]);}
    }
}
