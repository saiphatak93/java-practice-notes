class Person{
    String name;
}

class Student2 extends Person{
    int rollno;
}
public class t3 {
    public static void main(String[] args) {
        Student2 s2=new Student2();
        s2.name="Sai";
        s2.rollno=20;

        System.out.println("Name is "+s2.name);
        System.out.println("Age is "+s2.rollno);

    }
}
