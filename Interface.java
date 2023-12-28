interface Area {
    public abstract void findArea();
}

interface Perimeter {
    public abstract void findPerimeter();
}

class Triangle implements Area, Perimeter {
    double base, height, length;

    Triangle(double b, double h, double l) {
        base = b;
        height = h;
        length = l;
    }

    public void findArea() {
        System.out.println("The area is :" + (0.5 * base * height));
    }

    public void findPerimeter() {
        System.out.println("The Perimeter is :" + (length + base + height));
    }
}

public class Interface {
    public static void main(String[] args) {
        Triangle t = new Triangle(2, 3, 4);
        t.findArea();
        t.findPerimeter();
    }
}
