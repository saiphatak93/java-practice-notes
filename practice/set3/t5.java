public class t5 {
    public static void main(String[] args) {
        String vow="i am the special";
        int count=0;
        String vowel="aeiouAEIOU";
        for (int i = 0; i < vow.length(); i++) {
            if(vowel.indexOf(vow.charAt(i))!= -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
