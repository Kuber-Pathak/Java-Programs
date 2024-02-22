

abstract class Shape {
    public void display() {
        System.out.println("Abstract class");
    }

    public abstract void area(double x, double y);
}

class Tirangle extends Shape {

    public void area(double breadth, double height) {
        super.display();
        System.out.println("Area triangle = " + (0.5 * breadth * height));
    }

}

class Rectangle extends Shape {

    public void area(double length, double height) {
        super.display();
        System.out.println("Area Rectangle = " + (length * height));
    }

}

public class Abstraction_Keyword {
    public static void main(String[] args) {
        Tirangle t = new Tirangle();
        Rectangle r = new Rectangle();
        t.area(5, 5);
        r.area(10, 10);
    }
}
