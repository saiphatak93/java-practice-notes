//sum of 2d array
public class t11 {
    public static void main(String[] args) {
        int arr[][]={{2,3,4},{3,4,5},{4,5,6}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of 2d array is "+sum);
    }
}
