class Outer {
    int l, b;

    Outer() {
        l = 50;
        b = 50;
    }

    void display() {
        System.out.println("Length = " + l + "Breadth = " + b);
    }

    class Inner {
        void area() {
            display();
            System.out.println("Area = " + (l * b));
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.area();
    }
}