abstract class Shape{
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }


public double area(){
    return Math.PI*radius*radius;

}
public double perimeter(){
    return 2*Math.PI*radius;
}
}

public class t6 {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

    }
}
