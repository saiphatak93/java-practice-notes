//Check it is palindrome or not
public class t4 {
    public static void main(String[] args) {
        String name="121";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i); 
        }    
        if(name.equals(rev)){
            System.out.println(rev+ " Yes its Palindrome");
        }else{
            System.out.println(rev+" is Not Palindrom ");    

        }
    }
}
