class animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Bow Bow");
    }
}

public class t4 {
    public static void main(String[] args) {
        animal d= new dog();
        d.sound();
    }
}
