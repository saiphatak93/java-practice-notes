public class t8 {
    public static void main(String[] args) {
        String name="JAVAPROGRAME";
        String newstr="";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if(newstr.indexOf(ch) == -1) {
                newstr = newstr + ch;
            }
        }
        System.out.println(newstr);
    }
}
