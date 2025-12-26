public class t7 {
    public static void main(String[] args) {
        String freq="this is for find frequency";
        int count=0;
        char ch='s';
        for(int i=0;i<freq.length();i++){
            if(ch==freq.charAt(i)){
                count++;
            }

        }
        System.out.println(count);
    }
}
