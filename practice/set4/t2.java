class Student1{
    String name;
    int age;

    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void get(){
        System.out.println("Name is :"+name+"\nAge is : "+age);
    }
    
}
public class t2 {
    public static void main(String[] args) {
        Student1 s1=new Student1("Sai",64);
        s1.get();
    }
}
