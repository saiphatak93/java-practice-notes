//print 2d array
public class t10 {
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},{5,6,7},{8,9,1}};

        System.out.println("2D Array is:");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
